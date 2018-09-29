package com.act.Customize;

public class AbstractInfo {
	private String containerName;
	private int containerStatus=0;
	private String heapUsed;
	private String heapGivenByOS;
	private String heapMax;
	private String nonHeapUsed;
	private String nonHeapMax;
	private String nonHeapGivenByOS;
	private String vmName;
	private String os;
	private String javaVersion;
	private Long threadsTotal;
	private Long threadsDeamon;
	private Long openFiles;
	private String virtualMemoryGivenByOS;
	private double processCpuLoad;
	public String getContainerName() {
		return containerName;
	}
	public void setContainerName(String containerName) {
		this.containerName = containerName;
	}
	public int getContainerStatus() {
		return containerStatus;
	}
	public void setContainerStatus(int containerStatus) {
		this.containerStatus = containerStatus;
	}
	public String getHeapUsed() {
		return heapUsed;
	}
	public void setHeapUsed(String heapUsed) {
		this.heapUsed = heapUsed;
	}
	public String getHeapGivenByOS() {
		return heapGivenByOS;
	}
	public void setHeapGivenByOS(String heapGivenByOS) {
		this.heapGivenByOS = heapGivenByOS;
	}
	public String getHeapMax() {
		return heapMax;
	}
	public void setHeapMax(String heapMax) {
		this.heapMax = heapMax;
	}
	public String getNonHeapUsed() {
		return nonHeapUsed;
	}
	public void setNonHeapUsed(String nonHeapUsed) {
		this.nonHeapUsed = nonHeapUsed;
	}
	public String getNonHeapMax() {
		return nonHeapMax;
	}
	public void setNonHeapMax(String nonHeapMax) {
		this.nonHeapMax = nonHeapMax;
	}
	public String getNonHeapGivenByOS() {
		return nonHeapGivenByOS;
	}
	public void setNonHeapGivenByOS(String nonHeapGivenByOS) {
		this.nonHeapGivenByOS = nonHeapGivenByOS;
	}
	public String getVmName() {
		return vmName;
	}
	public void setVmName(String vmName) {
		this.vmName = vmName;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getJavaVersion() {
		return javaVersion;
	}
	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}
	public Long getThreadsTotal() {
		return threadsTotal;
	}
	public void setThreadsTotal(Long threadsTotal) {
		this.threadsTotal = threadsTotal;
	}
	public Long getThreadsDeamon() {
		return threadsDeamon;
	}
	public void setThreadsDeamon(Long threadsDeamon) {
		this.threadsDeamon = threadsDeamon;
	}
	public Long getOpenFiles() {
		return openFiles;
	}
	public void setOpenFiles(Long openFiles) {
		this.openFiles = openFiles;
	}
	public String getVirtualMemoryGivenByOS() {
		return virtualMemoryGivenByOS;
	}
	public void setVirtualMemoryGivenByOS(String virtualMemoryGivenByOS) {
		this.virtualMemoryGivenByOS = virtualMemoryGivenByOS;
	}
	public double getProcessCpuLoad() {
		return processCpuLoad;
	}
	public void setProcessCpuLoad(double processCpuLoad) {
		this.processCpuLoad = processCpuLoad;
	}
	@Override
	public String toString() {
		return "containerName=" + containerName + ", containerStatus=" + containerStatus + ", heapUsed="
				+ heapUsed + ", heapGivenByOS=" + heapGivenByOS + ", heapMax=" + heapMax + ", nonHeapUsed="
				+ nonHeapUsed + ", nonHeapMax=" + nonHeapMax + ", nonHeapGivenByOS=" + nonHeapGivenByOS + ", vmName="
				+ vmName + ", os=" + os + ", javaVersion=" + javaVersion + ", threadsTotal=" + threadsTotal
				+ ", threadsDeamon=" + threadsDeamon + ", openFiles=" + openFiles + ", virtualMemoryGivenByOS="
				+ virtualMemoryGivenByOS + ", processCpuLoad=" + processCpuLoad + "";
	}
	
}
