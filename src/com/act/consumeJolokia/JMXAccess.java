package com.act.consumeJolokia;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.act.Customize.AbstractInfo;
import com.act.JsonToObJ.HeapMemoryUsage;
import com.act.JsonToObJ.JavaLangTypeMemory;
import com.act.JsonToObJ.JavaLangTypeOperatingSystem;
import com.act.JsonToObJ.JavaLangTypeRuntime;
import com.act.JsonToObJ.JavaLangTypeThreading;
import com.act.JsonToObJ.NonHeapMemoryUsage;
import com.act.JsonToObJ.ObjConverter;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JMXAccess {
	public static void main(String args[]) {
		Long startTime=System.currentTimeMillis();
		System.out.println("Started Executing....");
		if(args.length<4){
			System.out.println("Please execute as java -jar xxxx.jar properties_file_name output_file_name username password");
			System.exit(1);
		}
		try{
		String propertiesFilePath=args[0];
		String outputPath=args[1];;
		String userName=args[2];
		String password=args[3];
		Properties prop=new Properties();
		System.out.println("Reading Properties...");
		InputStream inputStream=new FileInputStream(propertiesFilePath);
		prop.load(inputStream);
		int threadPoolSize=3;
		int j=0;
		ExecutorService tpes =Executors.newFixedThreadPool(threadPoolSize);
		List<Future<AbstractInfo>> resultList = new ArrayList<>();
		for(Object s:prop.keySet()){
			//System.out.println((String)s);
			Future<AbstractInfo> result=tpes.submit(new GetContainerInfo((String)s, (String)prop.get(s),userName,password));
			resultList.add(result);
		}
		tpes.shutdown();
		
		//Thread.sleep(300);
		FileWriter fw=new FileWriter(outputPath);
		for(Future<AbstractInfo> g:resultList){
			fw.write(g.get().toString()+"\n");
			//System.out.println(g.get().toString());
		}
		fw.close();
		Long finshedTime=System.currentTimeMillis();
		System.out.println("Finished Exection ");
		System.out.println("Total Time Taken in MilliSeconds: " +(finshedTime-startTime));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}		
	}
}

class GetContainerInfo implements Callable<AbstractInfo>{
	private String containerName;
	private String url;
	private String userName;
	private String password;
	AbstractInfo ab=new AbstractInfo();;
	public GetContainerInfo(String containerName,String url,String userName,String password){
		this.containerName=containerName;
		this.url=url;
		this.userName=userName;
		this.password=password;
	}
	public AbstractInfo call() {
		CredentialsProvider provider = new BasicCredentialsProvider();
		UsernamePasswordCredentials credentials
		 = new UsernamePasswordCredentials(userName, password);
		provider.setCredentials(AuthScope.ANY, credentials);
		  
		HttpClient client = HttpClientBuilder.create().setDefaultCredentialsProvider(provider).build(); 

	//HttpClient client=new DefaultHttpClient();
	HttpGet request = new HttpGet(url);
	//request.setHeader("Authorization","Basic YWRtaW46YWRtaW4=");	
	try{
	HttpResponse response = client.execute(request);
	Thread.sleep(50);
	//System.out.println("hello");
	HttpEntity entity = response.getEntity();
	String responseString = EntityUtils.toString(entity, "UTF-8");
	//System.out.println(responseString);
	//System.out.println(response.getStatusLine());
	
	ObjectMapper objectMapper = new ObjectMapper();
	ObjConverter requestObj = objectMapper.readValue(responseString, ObjConverter.class);
	
	
	JavaLangTypeMemory memory=requestObj.getValue().getJavaLangTypeMemory();
	
	HeapMemoryUsage heapMemoryUsage=memory.getHeapMemoryUsage();
	NonHeapMemoryUsage nonHeapMemoryUsage=memory.getNonHeapMemoryUsage();
	
	JavaLangTypeRuntime runtime=requestObj.getValue().getJavaLangTypeRuntime();
	
	JavaLangTypeThreading threading=requestObj.getValue().getJavaLangTypeThreading();
	
	JavaLangTypeOperatingSystem os=requestObj.getValue().getJavaLangTypeOperatingSystem();
	
	ab.setContainerName(containerName);
	ab.setContainerStatus(1);
	ab.setHeapGivenByOS(heapMemoryUsage.getCommitted()/(1024*1024)+"MB");
	ab.setHeapUsed(heapMemoryUsage.getUsed()/(1024*1024)+"MB");
	ab.setHeapMax(heapMemoryUsage.getMax()/(1024*1024)+"MB");
	ab.setNonHeapGivenByOS(nonHeapMemoryUsage.getCommitted()/(1024*1024)+"MB");
	String nonHeapMax=(nonHeapMemoryUsage.getMax()==-1)?"Unknown":nonHeapMemoryUsage.getUsed()/(1024*1024)+"MB";
	ab.setNonHeapMax(nonHeapMax);
	ab.setNonHeapUsed(nonHeapMemoryUsage.getUsed()/(1024*1024)+"MB");
	ab.setJavaVersion(runtime.getSystemProperties().getJavaSpecificationVersion());
	ab.setVmName(runtime.getVmName());
	ab.setOs(os.getName());
	ab.setThreadsTotal(threading.getThreadCount());
	ab.setThreadsDeamon(threading.getDaemonThreadCount());
	ab.setOpenFiles(os.getOpenFileDescriptorCount());
	ab.setVirtualMemoryGivenByOS(os.getCommittedVirtualMemorySize()/(1024*1024)+"MB");
	ab.setProcessCpuLoad(os.getProcessCpuLoad());
	//System.out.println(ab.toString());
	//System.out.println(runtime.getStartTime()+" "+memory.getHeapMemoryUsage().getUsed());
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	return ab;
	}
	
}