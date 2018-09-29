
package com.act.JsonToObJ;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "awt.toolkit",
    "java.specification.version",
    "sun.cpu.isalist",
    "sun.jnu.encoding",
    "sun.arch.data.model",
    "jline.nobell",
    "java.vendor.url",
    "org.omg.CORBA.ORBSingletonClass",
    "org.apache.servicemix.specs.timeout",
    "sun.boot.library.path",
    "sun.java.command",
    "java.specification.vendor",
    "java.naming.factory.url.pkgs",
    "karaf.restart.jvm",
    "java.home",
    "zookeeper.password",
    "org.osgi.framework.startlevel.beginning",
    "file.separator",
    "org.jboss.gravia.repository.storage.dir",
    "line.separator",
    "java.vm.specification.vendor",
    "java.specification.name",
    "javax.rmi.CORBA.UtilClass",
    "jolokia.agent",
    "sun.boot.class.path",
    "java.util.logging.config.file",
    "sun.management.compiler",
    "karaf.home",
    "java.runtime.version",
    "user.name",
    "file.encoding",
    "org.objectweb.howl./app/esb/jboss-fuse-6.2.1.redhat-084/instances/c_container/data/txlog/transaction_1.log.locked",
    "karaf.local.roles",
    "zookeeper.url",
    "org.apache.aries.proxy.weaving.enabled",
    "zookeeper.password.encode",
    "io.fabric8.datastore.felix.fileinstall.filename",
    "karaf.clean.all",
    "java.io.tmpdir",
    "java.version",
    "org.objectweb.howl./app/esb/jboss-fuse-6.2.1.redhat-084/instances/c_container/data/txlog/transaction_2.log.locked",
    "java.vm.specification.name",
    "java.awt.printerjob",
    "sun.os.patch.level",
    "karaf.shell.init.script",
    "java.library.path",
    "java.vendor",
    "karaf.startRemoteShell",
    "java.rmi.server.randomIDs",
    "karaf.delay.console",
    "sun.io.unicode.encoding",
    "karaf.base",
    "karaf.exec.init.script",
    "file.encoding.pkg",
    "karaf.version",
    "org.ops4j.pax.logging.DefaultServiceLog.level",
    "karaf.startLocalConsole",
    "java.class.path",
    "karaf.etc",
    "java.vm.vendor",
    "io.fabric8.datastore.importDir",
    "runtime.home",
    "org.apache.servicemix.specs.debug",
    "user.timezone",
    "os.name",
    "java.vm.specification.version",
    "runtime.id",
    "sun.java.launcher",
    "user.country",
    "karaf.data",
    "environment.prefix",
    "com.sun.management.jmxremote",
    "karaf.instances",
    "sun.cpu.endian",
    "runtime.data",
    "user.home",
    "user.language",
    "javax.rmi.CORBA.PortableRemoteObjectClass",
    "karaf.name",
    "org.apache.aries.proxy.weaving.disabled",
    "java.awt.graphicsenv",
    "org.omg.CORBA.ORBClass",
    "io.fabric8.datastore.service.pid",
    "karaf.restart",
    "karaf.secured.services",
    "path.separator",
    "xml.catalog.files",
    "io.fabric8.datastore.gitRemotePollInterval",
    "os.version",
    "java.endorsed.dirs",
    "java.runtime.name",
    "java.vm.name",
    "io.fabric8.datastore.component.name",
    "karaf.clean.cache",
    "runtime.conf",
    "java.vendor.url.bug",
    "user.dir",
    "os.arch",
    "javax.management.builder.initial",
    "java.vm.info",
    "java.vm.version",
    "karaf.default.repository",
    "java.rmi.server.hostname",
    "java.ext.dirs",
    "java.class.version"
})
public class SystemProperties {

    @JsonProperty("awt.toolkit")
    private String awtToolkit;
    @JsonProperty("java.specification.version")
    private String javaSpecificationVersion;
    @JsonProperty("sun.cpu.isalist")
    private String sunCpuIsalist;
    @JsonProperty("sun.jnu.encoding")
    private String sunJnuEncoding;
    @JsonProperty("sun.arch.data.model")
    private String sunArchDataModel;
    @JsonProperty("jline.nobell")
    private String jlineNobell;
    @JsonProperty("java.vendor.url")
    private String javaVendorUrl;
    @JsonProperty("org.omg.CORBA.ORBSingletonClass")
    private String orgOmgCORBAORBSingletonClass;
    @JsonProperty("org.apache.servicemix.specs.timeout")
    private String orgApacheServicemixSpecsTimeout;
    @JsonProperty("sun.boot.library.path")
    private String sunBootLibraryPath;
    @JsonProperty("sun.java.command")
    private String sunJavaCommand;
    @JsonProperty("java.specification.vendor")
    private String javaSpecificationVendor;
    @JsonProperty("java.naming.factory.url.pkgs")
    private String javaNamingFactoryUrlPkgs;
    @JsonProperty("karaf.restart.jvm")
    private String karafRestartJvm;
    @JsonProperty("java.home")
    private String javaHome;
    @JsonProperty("zookeeper.password")
    private String zookeeperPassword;
    @JsonProperty("org.osgi.framework.startlevel.beginning")
    private String orgOsgiFrameworkStartlevelBeginning;
    @JsonProperty("file.separator")
    private String fileSeparator;
    @JsonProperty("org.jboss.gravia.repository.storage.dir")
    private String orgJbossGraviaRepositoryStorageDir;
    @JsonProperty("line.separator")
    private String lineSeparator;
    @JsonProperty("java.vm.specification.vendor")
    private String javaVmSpecificationVendor;
    @JsonProperty("java.specification.name")
    private String javaSpecificationName;
    @JsonProperty("javax.rmi.CORBA.UtilClass")
    private String javaxRmiCORBAUtilClass;
    @JsonProperty("jolokia.agent")
    private String jolokiaAgent;
    @JsonProperty("sun.boot.class.path")
    private String sunBootClassPath;
    @JsonProperty("java.util.logging.config.file")
    private String javaUtilLoggingConfigFile;
    @JsonProperty("sun.management.compiler")
    private String sunManagementCompiler;
    @JsonProperty("karaf.home")
    private String karafHome;
    @JsonProperty("java.runtime.version")
    private String javaRuntimeVersion;
    @JsonProperty("user.name")
    private String userName;
    @JsonProperty("file.encoding")
    private String fileEncoding;
    @JsonProperty("org.objectweb.howl./app/esb/jboss-fuse-6.2.1.redhat-084/instances/c_container/data/txlog/transaction_1.log.locked")
    private String orgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction1LogLocked;
    @JsonProperty("karaf.local.roles")
    private String karafLocalRoles;
    @JsonProperty("zookeeper.url")
    private String zookeeperUrl;
    @JsonProperty("org.apache.aries.proxy.weaving.enabled")
    private String orgApacheAriesProxyWeavingEnabled;
    @JsonProperty("zookeeper.password.encode")
    private String zookeeperPasswordEncode;
    @JsonProperty("io.fabric8.datastore.felix.fileinstall.filename")
    private String ioFabric8DatastoreFelixFileinstallFilename;
    @JsonProperty("karaf.clean.all")
    private String karafCleanAll;
    @JsonProperty("java.io.tmpdir")
    private String javaIoTmpdir;
    @JsonProperty("java.version")
    private String javaVersion;
    @JsonProperty("org.objectweb.howl./app/esb/jboss-fuse-6.2.1.redhat-084/instances/c_container/data/txlog/transaction_2.log.locked")
    private String orgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction2LogLocked;
    @JsonProperty("java.vm.specification.name")
    private String javaVmSpecificationName;
    @JsonProperty("java.awt.printerjob")
    private String javaAwtPrinterjob;
    @JsonProperty("sun.os.patch.level")
    private String sunOsPatchLevel;
    @JsonProperty("karaf.shell.init.script")
    private String karafShellInitScript;
    @JsonProperty("java.library.path")
    private String javaLibraryPath;
    @JsonProperty("java.vendor")
    private String javaVendor;
    @JsonProperty("karaf.startRemoteShell")
    private String karafStartRemoteShell;
    @JsonProperty("java.rmi.server.randomIDs")
    private String javaRmiServerRandomIDs;
    @JsonProperty("karaf.delay.console")
    private String karafDelayConsole;
    @JsonProperty("sun.io.unicode.encoding")
    private String sunIoUnicodeEncoding;
    @JsonProperty("karaf.base")
    private String karafBase;
    @JsonProperty("karaf.exec.init.script")
    private String karafExecInitScript;
    @JsonProperty("file.encoding.pkg")
    private String fileEncodingPkg;
    @JsonProperty("karaf.version")
    private String karafVersion;
    @JsonProperty("org.ops4j.pax.logging.DefaultServiceLog.level")
    private String orgOps4jPaxLoggingDefaultServiceLogLevel;
    @JsonProperty("karaf.startLocalConsole")
    private String karafStartLocalConsole;
    @JsonProperty("java.class.path")
    private String javaClassPath;
    @JsonProperty("karaf.etc")
    private String karafEtc;
    @JsonProperty("java.vm.vendor")
    private String javaVmVendor;
    @JsonProperty("io.fabric8.datastore.importDir")
    private String ioFabric8DatastoreImportDir;
    @JsonProperty("runtime.home")
    private String runtimeHome;
    @JsonProperty("org.apache.servicemix.specs.debug")
    private String orgApacheServicemixSpecsDebug;
    @JsonProperty("user.timezone")
    private String userTimezone;
    @JsonProperty("os.name")
    private String osName;
    @JsonProperty("java.vm.specification.version")
    private String javaVmSpecificationVersion;
    @JsonProperty("runtime.id")
    private String runtimeId;
    @JsonProperty("sun.java.launcher")
    private String sunJavaLauncher;
    @JsonProperty("user.country")
    private String userCountry;
    @JsonProperty("karaf.data")
    private String karafData;
    @JsonProperty("environment.prefix")
    private String environmentPrefix;
    @JsonProperty("com.sun.management.jmxremote")
    private String comSunManagementJmxremote;
    @JsonProperty("karaf.instances")
    private String karafInstances;
    @JsonProperty("sun.cpu.endian")
    private String sunCpuEndian;
    @JsonProperty("runtime.data")
    private String runtimeData;
    @JsonProperty("user.home")
    private String userHome;
    @JsonProperty("user.language")
    private String userLanguage;
    @JsonProperty("javax.rmi.CORBA.PortableRemoteObjectClass")
    private String javaxRmiCORBAPortableRemoteObjectClass;
    @JsonProperty("karaf.name")
    private String karafName;
    @JsonProperty("org.apache.aries.proxy.weaving.disabled")
    private String orgApacheAriesProxyWeavingDisabled;
    @JsonProperty("java.awt.graphicsenv")
    private String javaAwtGraphicsenv;
    @JsonProperty("org.omg.CORBA.ORBClass")
    private String orgOmgCORBAORBClass;
    @JsonProperty("io.fabric8.datastore.service.pid")
    private String ioFabric8DatastoreServicePid;
    @JsonProperty("karaf.restart")
    private String karafRestart;
    @JsonProperty("karaf.secured.services")
    private String karafSecuredServices;
    @JsonProperty("path.separator")
    private String pathSeparator;
    @JsonProperty("xml.catalog.files")
    private String xmlCatalogFiles;
    @JsonProperty("io.fabric8.datastore.gitRemotePollInterval")
    private String ioFabric8DatastoreGitRemotePollInterval;
    @JsonProperty("os.version")
    private String osVersion;
    @JsonProperty("java.endorsed.dirs")
    private String javaEndorsedDirs;
    @JsonProperty("java.runtime.name")
    private String javaRuntimeName;
    @JsonProperty("java.vm.name")
    private String javaVmName;
    @JsonProperty("io.fabric8.datastore.component.name")
    private String ioFabric8DatastoreComponentName;
    @JsonProperty("karaf.clean.cache")
    private String karafCleanCache;
    @JsonProperty("runtime.conf")
    private String runtimeConf;
    @JsonProperty("java.vendor.url.bug")
    private String javaVendorUrlBug;
    @JsonProperty("user.dir")
    private String userDir;
    @JsonProperty("os.arch")
    private String osArch;
    @JsonProperty("javax.management.builder.initial")
    private String javaxManagementBuilderInitial;
    @JsonProperty("java.vm.info")
    private String javaVmInfo;
    @JsonProperty("java.vm.version")
    private String javaVmVersion;
    @JsonProperty("karaf.default.repository")
    private String karafDefaultRepository;
    @JsonProperty("java.rmi.server.hostname")
    private String javaRmiServerHostname;
    @JsonProperty("java.ext.dirs")
    private String javaExtDirs;
    @JsonProperty("java.class.version")
    private String javaClassVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("awt.toolkit")
    public String getAwtToolkit() {
        return awtToolkit;
    }

    @JsonProperty("awt.toolkit")
    public void setAwtToolkit(String awtToolkit) {
        this.awtToolkit = awtToolkit;
    }

    @JsonProperty("java.specification.version")
    public String getJavaSpecificationVersion() {
        return javaSpecificationVersion;
    }

    @JsonProperty("java.specification.version")
    public void setJavaSpecificationVersion(String javaSpecificationVersion) {
        this.javaSpecificationVersion = javaSpecificationVersion;
    }

    @JsonProperty("sun.cpu.isalist")
    public String getSunCpuIsalist() {
        return sunCpuIsalist;
    }

    @JsonProperty("sun.cpu.isalist")
    public void setSunCpuIsalist(String sunCpuIsalist) {
        this.sunCpuIsalist = sunCpuIsalist;
    }

    @JsonProperty("sun.jnu.encoding")
    public String getSunJnuEncoding() {
        return sunJnuEncoding;
    }

    @JsonProperty("sun.jnu.encoding")
    public void setSunJnuEncoding(String sunJnuEncoding) {
        this.sunJnuEncoding = sunJnuEncoding;
    }

    @JsonProperty("sun.arch.data.model")
    public String getSunArchDataModel() {
        return sunArchDataModel;
    }

    @JsonProperty("sun.arch.data.model")
    public void setSunArchDataModel(String sunArchDataModel) {
        this.sunArchDataModel = sunArchDataModel;
    }

    @JsonProperty("jline.nobell")
    public String getJlineNobell() {
        return jlineNobell;
    }

    @JsonProperty("jline.nobell")
    public void setJlineNobell(String jlineNobell) {
        this.jlineNobell = jlineNobell;
    }

    @JsonProperty("java.vendor.url")
    public String getJavaVendorUrl() {
        return javaVendorUrl;
    }

    @JsonProperty("java.vendor.url")
    public void setJavaVendorUrl(String javaVendorUrl) {
        this.javaVendorUrl = javaVendorUrl;
    }

    @JsonProperty("org.omg.CORBA.ORBSingletonClass")
    public String getOrgOmgCORBAORBSingletonClass() {
        return orgOmgCORBAORBSingletonClass;
    }

    @JsonProperty("org.omg.CORBA.ORBSingletonClass")
    public void setOrgOmgCORBAORBSingletonClass(String orgOmgCORBAORBSingletonClass) {
        this.orgOmgCORBAORBSingletonClass = orgOmgCORBAORBSingletonClass;
    }

    @JsonProperty("org.apache.servicemix.specs.timeout")
    public String getOrgApacheServicemixSpecsTimeout() {
        return orgApacheServicemixSpecsTimeout;
    }

    @JsonProperty("org.apache.servicemix.specs.timeout")
    public void setOrgApacheServicemixSpecsTimeout(String orgApacheServicemixSpecsTimeout) {
        this.orgApacheServicemixSpecsTimeout = orgApacheServicemixSpecsTimeout;
    }

    @JsonProperty("sun.boot.library.path")
    public String getSunBootLibraryPath() {
        return sunBootLibraryPath;
    }

    @JsonProperty("sun.boot.library.path")
    public void setSunBootLibraryPath(String sunBootLibraryPath) {
        this.sunBootLibraryPath = sunBootLibraryPath;
    }

    @JsonProperty("sun.java.command")
    public String getSunJavaCommand() {
        return sunJavaCommand;
    }

    @JsonProperty("sun.java.command")
    public void setSunJavaCommand(String sunJavaCommand) {
        this.sunJavaCommand = sunJavaCommand;
    }

    @JsonProperty("java.specification.vendor")
    public String getJavaSpecificationVendor() {
        return javaSpecificationVendor;
    }

    @JsonProperty("java.specification.vendor")
    public void setJavaSpecificationVendor(String javaSpecificationVendor) {
        this.javaSpecificationVendor = javaSpecificationVendor;
    }

    @JsonProperty("java.naming.factory.url.pkgs")
    public String getJavaNamingFactoryUrlPkgs() {
        return javaNamingFactoryUrlPkgs;
    }

    @JsonProperty("java.naming.factory.url.pkgs")
    public void setJavaNamingFactoryUrlPkgs(String javaNamingFactoryUrlPkgs) {
        this.javaNamingFactoryUrlPkgs = javaNamingFactoryUrlPkgs;
    }

    @JsonProperty("karaf.restart.jvm")
    public String getKarafRestartJvm() {
        return karafRestartJvm;
    }

    @JsonProperty("karaf.restart.jvm")
    public void setKarafRestartJvm(String karafRestartJvm) {
        this.karafRestartJvm = karafRestartJvm;
    }

    @JsonProperty("java.home")
    public String getJavaHome() {
        return javaHome;
    }

    @JsonProperty("java.home")
    public void setJavaHome(String javaHome) {
        this.javaHome = javaHome;
    }

    @JsonProperty("zookeeper.password")
    public String getZookeeperPassword() {
        return zookeeperPassword;
    }

    @JsonProperty("zookeeper.password")
    public void setZookeeperPassword(String zookeeperPassword) {
        this.zookeeperPassword = zookeeperPassword;
    }

    @JsonProperty("org.osgi.framework.startlevel.beginning")
    public String getOrgOsgiFrameworkStartlevelBeginning() {
        return orgOsgiFrameworkStartlevelBeginning;
    }

    @JsonProperty("org.osgi.framework.startlevel.beginning")
    public void setOrgOsgiFrameworkStartlevelBeginning(String orgOsgiFrameworkStartlevelBeginning) {
        this.orgOsgiFrameworkStartlevelBeginning = orgOsgiFrameworkStartlevelBeginning;
    }

    @JsonProperty("file.separator")
    public String getFileSeparator() {
        return fileSeparator;
    }

    @JsonProperty("file.separator")
    public void setFileSeparator(String fileSeparator) {
        this.fileSeparator = fileSeparator;
    }

    @JsonProperty("org.jboss.gravia.repository.storage.dir")
    public String getOrgJbossGraviaRepositoryStorageDir() {
        return orgJbossGraviaRepositoryStorageDir;
    }

    @JsonProperty("org.jboss.gravia.repository.storage.dir")
    public void setOrgJbossGraviaRepositoryStorageDir(String orgJbossGraviaRepositoryStorageDir) {
        this.orgJbossGraviaRepositoryStorageDir = orgJbossGraviaRepositoryStorageDir;
    }

    @JsonProperty("line.separator")
    public String getLineSeparator() {
        return lineSeparator;
    }

    @JsonProperty("line.separator")
    public void setLineSeparator(String lineSeparator) {
        this.lineSeparator = lineSeparator;
    }

    @JsonProperty("java.vm.specification.vendor")
    public String getJavaVmSpecificationVendor() {
        return javaVmSpecificationVendor;
    }

    @JsonProperty("java.vm.specification.vendor")
    public void setJavaVmSpecificationVendor(String javaVmSpecificationVendor) {
        this.javaVmSpecificationVendor = javaVmSpecificationVendor;
    }

    @JsonProperty("java.specification.name")
    public String getJavaSpecificationName() {
        return javaSpecificationName;
    }

    @JsonProperty("java.specification.name")
    public void setJavaSpecificationName(String javaSpecificationName) {
        this.javaSpecificationName = javaSpecificationName;
    }

    @JsonProperty("javax.rmi.CORBA.UtilClass")
    public String getJavaxRmiCORBAUtilClass() {
        return javaxRmiCORBAUtilClass;
    }

    @JsonProperty("javax.rmi.CORBA.UtilClass")
    public void setJavaxRmiCORBAUtilClass(String javaxRmiCORBAUtilClass) {
        this.javaxRmiCORBAUtilClass = javaxRmiCORBAUtilClass;
    }

    @JsonProperty("jolokia.agent")
    public String getJolokiaAgent() {
        return jolokiaAgent;
    }

    @JsonProperty("jolokia.agent")
    public void setJolokiaAgent(String jolokiaAgent) {
        this.jolokiaAgent = jolokiaAgent;
    }

    @JsonProperty("sun.boot.class.path")
    public String getSunBootClassPath() {
        return sunBootClassPath;
    }

    @JsonProperty("sun.boot.class.path")
    public void setSunBootClassPath(String sunBootClassPath) {
        this.sunBootClassPath = sunBootClassPath;
    }

    @JsonProperty("java.util.logging.config.file")
    public String getJavaUtilLoggingConfigFile() {
        return javaUtilLoggingConfigFile;
    }

    @JsonProperty("java.util.logging.config.file")
    public void setJavaUtilLoggingConfigFile(String javaUtilLoggingConfigFile) {
        this.javaUtilLoggingConfigFile = javaUtilLoggingConfigFile;
    }

    @JsonProperty("sun.management.compiler")
    public String getSunManagementCompiler() {
        return sunManagementCompiler;
    }

    @JsonProperty("sun.management.compiler")
    public void setSunManagementCompiler(String sunManagementCompiler) {
        this.sunManagementCompiler = sunManagementCompiler;
    }

    @JsonProperty("karaf.home")
    public String getKarafHome() {
        return karafHome;
    }

    @JsonProperty("karaf.home")
    public void setKarafHome(String karafHome) {
        this.karafHome = karafHome;
    }

    @JsonProperty("java.runtime.version")
    public String getJavaRuntimeVersion() {
        return javaRuntimeVersion;
    }

    @JsonProperty("java.runtime.version")
    public void setJavaRuntimeVersion(String javaRuntimeVersion) {
        this.javaRuntimeVersion = javaRuntimeVersion;
    }

    @JsonProperty("user.name")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("user.name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonProperty("file.encoding")
    public String getFileEncoding() {
        return fileEncoding;
    }

    @JsonProperty("file.encoding")
    public void setFileEncoding(String fileEncoding) {
        this.fileEncoding = fileEncoding;
    }

    @JsonProperty("org.objectweb.howl./app/esb/jboss-fuse-6.2.1.redhat-084/instances/c_container/data/txlog/transaction_1.log.locked")
    public String getOrgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction1LogLocked() {
        return orgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction1LogLocked;
    }

    @JsonProperty("org.objectweb.howl./app/esb/jboss-fuse-6.2.1.redhat-084/instances/c_container/data/txlog/transaction_1.log.locked")
    public void setOrgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction1LogLocked(String orgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction1LogLocked) {
        this.orgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction1LogLocked = orgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction1LogLocked;
    }

    @JsonProperty("karaf.local.roles")
    public String getKarafLocalRoles() {
        return karafLocalRoles;
    }

    @JsonProperty("karaf.local.roles")
    public void setKarafLocalRoles(String karafLocalRoles) {
        this.karafLocalRoles = karafLocalRoles;
    }

    @JsonProperty("zookeeper.url")
    public String getZookeeperUrl() {
        return zookeeperUrl;
    }

    @JsonProperty("zookeeper.url")
    public void setZookeeperUrl(String zookeeperUrl) {
        this.zookeeperUrl = zookeeperUrl;
    }

    @JsonProperty("org.apache.aries.proxy.weaving.enabled")
    public String getOrgApacheAriesProxyWeavingEnabled() {
        return orgApacheAriesProxyWeavingEnabled;
    }

    @JsonProperty("org.apache.aries.proxy.weaving.enabled")
    public void setOrgApacheAriesProxyWeavingEnabled(String orgApacheAriesProxyWeavingEnabled) {
        this.orgApacheAriesProxyWeavingEnabled = orgApacheAriesProxyWeavingEnabled;
    }

    @JsonProperty("zookeeper.password.encode")
    public String getZookeeperPasswordEncode() {
        return zookeeperPasswordEncode;
    }

    @JsonProperty("zookeeper.password.encode")
    public void setZookeeperPasswordEncode(String zookeeperPasswordEncode) {
        this.zookeeperPasswordEncode = zookeeperPasswordEncode;
    }

    @JsonProperty("io.fabric8.datastore.felix.fileinstall.filename")
    public String getIoFabric8DatastoreFelixFileinstallFilename() {
        return ioFabric8DatastoreFelixFileinstallFilename;
    }

    @JsonProperty("io.fabric8.datastore.felix.fileinstall.filename")
    public void setIoFabric8DatastoreFelixFileinstallFilename(String ioFabric8DatastoreFelixFileinstallFilename) {
        this.ioFabric8DatastoreFelixFileinstallFilename = ioFabric8DatastoreFelixFileinstallFilename;
    }

    @JsonProperty("karaf.clean.all")
    public String getKarafCleanAll() {
        return karafCleanAll;
    }

    @JsonProperty("karaf.clean.all")
    public void setKarafCleanAll(String karafCleanAll) {
        this.karafCleanAll = karafCleanAll;
    }

    @JsonProperty("java.io.tmpdir")
    public String getJavaIoTmpdir() {
        return javaIoTmpdir;
    }

    @JsonProperty("java.io.tmpdir")
    public void setJavaIoTmpdir(String javaIoTmpdir) {
        this.javaIoTmpdir = javaIoTmpdir;
    }

    @JsonProperty("java.version")
    public String getJavaVersion() {
        return javaVersion;
    }

    @JsonProperty("java.version")
    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    @JsonProperty("org.objectweb.howl./app/esb/jboss-fuse-6.2.1.redhat-084/instances/c_container/data/txlog/transaction_2.log.locked")
    public String getOrgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction2LogLocked() {
        return orgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction2LogLocked;
    }

    @JsonProperty("org.objectweb.howl./app/esb/jboss-fuse-6.2.1.redhat-084/instances/c_container/data/txlog/transaction_2.log.locked")
    public void setOrgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction2LogLocked(String orgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction2LogLocked) {
        this.orgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction2LogLocked = orgObjectwebHowlAppEsbJbossFuse621Redhat084InstancesCContainerDataTxlogTransaction2LogLocked;
    }

    @JsonProperty("java.vm.specification.name")
    public String getJavaVmSpecificationName() {
        return javaVmSpecificationName;
    }

    @JsonProperty("java.vm.specification.name")
    public void setJavaVmSpecificationName(String javaVmSpecificationName) {
        this.javaVmSpecificationName = javaVmSpecificationName;
    }

    @JsonProperty("java.awt.printerjob")
    public String getJavaAwtPrinterjob() {
        return javaAwtPrinterjob;
    }

    @JsonProperty("java.awt.printerjob")
    public void setJavaAwtPrinterjob(String javaAwtPrinterjob) {
        this.javaAwtPrinterjob = javaAwtPrinterjob;
    }

    @JsonProperty("sun.os.patch.level")
    public String getSunOsPatchLevel() {
        return sunOsPatchLevel;
    }

    @JsonProperty("sun.os.patch.level")
    public void setSunOsPatchLevel(String sunOsPatchLevel) {
        this.sunOsPatchLevel = sunOsPatchLevel;
    }

    @JsonProperty("karaf.shell.init.script")
    public String getKarafShellInitScript() {
        return karafShellInitScript;
    }

    @JsonProperty("karaf.shell.init.script")
    public void setKarafShellInitScript(String karafShellInitScript) {
        this.karafShellInitScript = karafShellInitScript;
    }

    @JsonProperty("java.library.path")
    public String getJavaLibraryPath() {
        return javaLibraryPath;
    }

    @JsonProperty("java.library.path")
    public void setJavaLibraryPath(String javaLibraryPath) {
        this.javaLibraryPath = javaLibraryPath;
    }

    @JsonProperty("java.vendor")
    public String getJavaVendor() {
        return javaVendor;
    }

    @JsonProperty("java.vendor")
    public void setJavaVendor(String javaVendor) {
        this.javaVendor = javaVendor;
    }

    @JsonProperty("karaf.startRemoteShell")
    public String getKarafStartRemoteShell() {
        return karafStartRemoteShell;
    }

    @JsonProperty("karaf.startRemoteShell")
    public void setKarafStartRemoteShell(String karafStartRemoteShell) {
        this.karafStartRemoteShell = karafStartRemoteShell;
    }

    @JsonProperty("java.rmi.server.randomIDs")
    public String getJavaRmiServerRandomIDs() {
        return javaRmiServerRandomIDs;
    }

    @JsonProperty("java.rmi.server.randomIDs")
    public void setJavaRmiServerRandomIDs(String javaRmiServerRandomIDs) {
        this.javaRmiServerRandomIDs = javaRmiServerRandomIDs;
    }

    @JsonProperty("karaf.delay.console")
    public String getKarafDelayConsole() {
        return karafDelayConsole;
    }

    @JsonProperty("karaf.delay.console")
    public void setKarafDelayConsole(String karafDelayConsole) {
        this.karafDelayConsole = karafDelayConsole;
    }

    @JsonProperty("sun.io.unicode.encoding")
    public String getSunIoUnicodeEncoding() {
        return sunIoUnicodeEncoding;
    }

    @JsonProperty("sun.io.unicode.encoding")
    public void setSunIoUnicodeEncoding(String sunIoUnicodeEncoding) {
        this.sunIoUnicodeEncoding = sunIoUnicodeEncoding;
    }

    @JsonProperty("karaf.base")
    public String getKarafBase() {
        return karafBase;
    }

    @JsonProperty("karaf.base")
    public void setKarafBase(String karafBase) {
        this.karafBase = karafBase;
    }

    @JsonProperty("karaf.exec.init.script")
    public String getKarafExecInitScript() {
        return karafExecInitScript;
    }

    @JsonProperty("karaf.exec.init.script")
    public void setKarafExecInitScript(String karafExecInitScript) {
        this.karafExecInitScript = karafExecInitScript;
    }

    @JsonProperty("file.encoding.pkg")
    public String getFileEncodingPkg() {
        return fileEncodingPkg;
    }

    @JsonProperty("file.encoding.pkg")
    public void setFileEncodingPkg(String fileEncodingPkg) {
        this.fileEncodingPkg = fileEncodingPkg;
    }

    @JsonProperty("karaf.version")
    public String getKarafVersion() {
        return karafVersion;
    }

    @JsonProperty("karaf.version")
    public void setKarafVersion(String karafVersion) {
        this.karafVersion = karafVersion;
    }

    @JsonProperty("org.ops4j.pax.logging.DefaultServiceLog.level")
    public String getOrgOps4jPaxLoggingDefaultServiceLogLevel() {
        return orgOps4jPaxLoggingDefaultServiceLogLevel;
    }

    @JsonProperty("org.ops4j.pax.logging.DefaultServiceLog.level")
    public void setOrgOps4jPaxLoggingDefaultServiceLogLevel(String orgOps4jPaxLoggingDefaultServiceLogLevel) {
        this.orgOps4jPaxLoggingDefaultServiceLogLevel = orgOps4jPaxLoggingDefaultServiceLogLevel;
    }

    @JsonProperty("karaf.startLocalConsole")
    public String getKarafStartLocalConsole() {
        return karafStartLocalConsole;
    }

    @JsonProperty("karaf.startLocalConsole")
    public void setKarafStartLocalConsole(String karafStartLocalConsole) {
        this.karafStartLocalConsole = karafStartLocalConsole;
    }

    @JsonProperty("java.class.path")
    public String getJavaClassPath() {
        return javaClassPath;
    }

    @JsonProperty("java.class.path")
    public void setJavaClassPath(String javaClassPath) {
        this.javaClassPath = javaClassPath;
    }

    @JsonProperty("karaf.etc")
    public String getKarafEtc() {
        return karafEtc;
    }

    @JsonProperty("karaf.etc")
    public void setKarafEtc(String karafEtc) {
        this.karafEtc = karafEtc;
    }

    @JsonProperty("java.vm.vendor")
    public String getJavaVmVendor() {
        return javaVmVendor;
    }

    @JsonProperty("java.vm.vendor")
    public void setJavaVmVendor(String javaVmVendor) {
        this.javaVmVendor = javaVmVendor;
    }

    @JsonProperty("io.fabric8.datastore.importDir")
    public String getIoFabric8DatastoreImportDir() {
        return ioFabric8DatastoreImportDir;
    }

    @JsonProperty("io.fabric8.datastore.importDir")
    public void setIoFabric8DatastoreImportDir(String ioFabric8DatastoreImportDir) {
        this.ioFabric8DatastoreImportDir = ioFabric8DatastoreImportDir;
    }

    @JsonProperty("runtime.home")
    public String getRuntimeHome() {
        return runtimeHome;
    }

    @JsonProperty("runtime.home")
    public void setRuntimeHome(String runtimeHome) {
        this.runtimeHome = runtimeHome;
    }

    @JsonProperty("org.apache.servicemix.specs.debug")
    public String getOrgApacheServicemixSpecsDebug() {
        return orgApacheServicemixSpecsDebug;
    }

    @JsonProperty("org.apache.servicemix.specs.debug")
    public void setOrgApacheServicemixSpecsDebug(String orgApacheServicemixSpecsDebug) {
        this.orgApacheServicemixSpecsDebug = orgApacheServicemixSpecsDebug;
    }

    @JsonProperty("user.timezone")
    public String getUserTimezone() {
        return userTimezone;
    }

    @JsonProperty("user.timezone")
    public void setUserTimezone(String userTimezone) {
        this.userTimezone = userTimezone;
    }

    @JsonProperty("os.name")
    public String getOsName() {
        return osName;
    }

    @JsonProperty("os.name")
    public void setOsName(String osName) {
        this.osName = osName;
    }

    @JsonProperty("java.vm.specification.version")
    public String getJavaVmSpecificationVersion() {
        return javaVmSpecificationVersion;
    }

    @JsonProperty("java.vm.specification.version")
    public void setJavaVmSpecificationVersion(String javaVmSpecificationVersion) {
        this.javaVmSpecificationVersion = javaVmSpecificationVersion;
    }

    @JsonProperty("runtime.id")
    public String getRuntimeId() {
        return runtimeId;
    }

    @JsonProperty("runtime.id")
    public void setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
    }

    @JsonProperty("sun.java.launcher")
    public String getSunJavaLauncher() {
        return sunJavaLauncher;
    }

    @JsonProperty("sun.java.launcher")
    public void setSunJavaLauncher(String sunJavaLauncher) {
        this.sunJavaLauncher = sunJavaLauncher;
    }

    @JsonProperty("user.country")
    public String getUserCountry() {
        return userCountry;
    }

    @JsonProperty("user.country")
    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    @JsonProperty("karaf.data")
    public String getKarafData() {
        return karafData;
    }

    @JsonProperty("karaf.data")
    public void setKarafData(String karafData) {
        this.karafData = karafData;
    }

    @JsonProperty("environment.prefix")
    public String getEnvironmentPrefix() {
        return environmentPrefix;
    }

    @JsonProperty("environment.prefix")
    public void setEnvironmentPrefix(String environmentPrefix) {
        this.environmentPrefix = environmentPrefix;
    }

    @JsonProperty("com.sun.management.jmxremote")
    public String getComSunManagementJmxremote() {
        return comSunManagementJmxremote;
    }

    @JsonProperty("com.sun.management.jmxremote")
    public void setComSunManagementJmxremote(String comSunManagementJmxremote) {
        this.comSunManagementJmxremote = comSunManagementJmxremote;
    }

    @JsonProperty("karaf.instances")
    public String getKarafInstances() {
        return karafInstances;
    }

    @JsonProperty("karaf.instances")
    public void setKarafInstances(String karafInstances) {
        this.karafInstances = karafInstances;
    }

    @JsonProperty("sun.cpu.endian")
    public String getSunCpuEndian() {
        return sunCpuEndian;
    }

    @JsonProperty("sun.cpu.endian")
    public void setSunCpuEndian(String sunCpuEndian) {
        this.sunCpuEndian = sunCpuEndian;
    }

    @JsonProperty("runtime.data")
    public String getRuntimeData() {
        return runtimeData;
    }

    @JsonProperty("runtime.data")
    public void setRuntimeData(String runtimeData) {
        this.runtimeData = runtimeData;
    }

    @JsonProperty("user.home")
    public String getUserHome() {
        return userHome;
    }

    @JsonProperty("user.home")
    public void setUserHome(String userHome) {
        this.userHome = userHome;
    }

    @JsonProperty("user.language")
    public String getUserLanguage() {
        return userLanguage;
    }

    @JsonProperty("user.language")
    public void setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
    }

    @JsonProperty("javax.rmi.CORBA.PortableRemoteObjectClass")
    public String getJavaxRmiCORBAPortableRemoteObjectClass() {
        return javaxRmiCORBAPortableRemoteObjectClass;
    }

    @JsonProperty("javax.rmi.CORBA.PortableRemoteObjectClass")
    public void setJavaxRmiCORBAPortableRemoteObjectClass(String javaxRmiCORBAPortableRemoteObjectClass) {
        this.javaxRmiCORBAPortableRemoteObjectClass = javaxRmiCORBAPortableRemoteObjectClass;
    }

    @JsonProperty("karaf.name")
    public String getKarafName() {
        return karafName;
    }

    @JsonProperty("karaf.name")
    public void setKarafName(String karafName) {
        this.karafName = karafName;
    }

    @JsonProperty("org.apache.aries.proxy.weaving.disabled")
    public String getOrgApacheAriesProxyWeavingDisabled() {
        return orgApacheAriesProxyWeavingDisabled;
    }

    @JsonProperty("org.apache.aries.proxy.weaving.disabled")
    public void setOrgApacheAriesProxyWeavingDisabled(String orgApacheAriesProxyWeavingDisabled) {
        this.orgApacheAriesProxyWeavingDisabled = orgApacheAriesProxyWeavingDisabled;
    }

    @JsonProperty("java.awt.graphicsenv")
    public String getJavaAwtGraphicsenv() {
        return javaAwtGraphicsenv;
    }

    @JsonProperty("java.awt.graphicsenv")
    public void setJavaAwtGraphicsenv(String javaAwtGraphicsenv) {
        this.javaAwtGraphicsenv = javaAwtGraphicsenv;
    }

    @JsonProperty("org.omg.CORBA.ORBClass")
    public String getOrgOmgCORBAORBClass() {
        return orgOmgCORBAORBClass;
    }

    @JsonProperty("org.omg.CORBA.ORBClass")
    public void setOrgOmgCORBAORBClass(String orgOmgCORBAORBClass) {
        this.orgOmgCORBAORBClass = orgOmgCORBAORBClass;
    }

    @JsonProperty("io.fabric8.datastore.service.pid")
    public String getIoFabric8DatastoreServicePid() {
        return ioFabric8DatastoreServicePid;
    }

    @JsonProperty("io.fabric8.datastore.service.pid")
    public void setIoFabric8DatastoreServicePid(String ioFabric8DatastoreServicePid) {
        this.ioFabric8DatastoreServicePid = ioFabric8DatastoreServicePid;
    }

    @JsonProperty("karaf.restart")
    public String getKarafRestart() {
        return karafRestart;
    }

    @JsonProperty("karaf.restart")
    public void setKarafRestart(String karafRestart) {
        this.karafRestart = karafRestart;
    }

    @JsonProperty("karaf.secured.services")
    public String getKarafSecuredServices() {
        return karafSecuredServices;
    }

    @JsonProperty("karaf.secured.services")
    public void setKarafSecuredServices(String karafSecuredServices) {
        this.karafSecuredServices = karafSecuredServices;
    }

    @JsonProperty("path.separator")
    public String getPathSeparator() {
        return pathSeparator;
    }

    @JsonProperty("path.separator")
    public void setPathSeparator(String pathSeparator) {
        this.pathSeparator = pathSeparator;
    }

    @JsonProperty("xml.catalog.files")
    public String getXmlCatalogFiles() {
        return xmlCatalogFiles;
    }

    @JsonProperty("xml.catalog.files")
    public void setXmlCatalogFiles(String xmlCatalogFiles) {
        this.xmlCatalogFiles = xmlCatalogFiles;
    }

    @JsonProperty("io.fabric8.datastore.gitRemotePollInterval")
    public String getIoFabric8DatastoreGitRemotePollInterval() {
        return ioFabric8DatastoreGitRemotePollInterval;
    }

    @JsonProperty("io.fabric8.datastore.gitRemotePollInterval")
    public void setIoFabric8DatastoreGitRemotePollInterval(String ioFabric8DatastoreGitRemotePollInterval) {
        this.ioFabric8DatastoreGitRemotePollInterval = ioFabric8DatastoreGitRemotePollInterval;
    }

    @JsonProperty("os.version")
    public String getOsVersion() {
        return osVersion;
    }

    @JsonProperty("os.version")
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @JsonProperty("java.endorsed.dirs")
    public String getJavaEndorsedDirs() {
        return javaEndorsedDirs;
    }

    @JsonProperty("java.endorsed.dirs")
    public void setJavaEndorsedDirs(String javaEndorsedDirs) {
        this.javaEndorsedDirs = javaEndorsedDirs;
    }

    @JsonProperty("java.runtime.name")
    public String getJavaRuntimeName() {
        return javaRuntimeName;
    }

    @JsonProperty("java.runtime.name")
    public void setJavaRuntimeName(String javaRuntimeName) {
        this.javaRuntimeName = javaRuntimeName;
    }

    @JsonProperty("java.vm.name")
    public String getJavaVmName() {
        return javaVmName;
    }

    @JsonProperty("java.vm.name")
    public void setJavaVmName(String javaVmName) {
        this.javaVmName = javaVmName;
    }

    @JsonProperty("io.fabric8.datastore.component.name")
    public String getIoFabric8DatastoreComponentName() {
        return ioFabric8DatastoreComponentName;
    }

    @JsonProperty("io.fabric8.datastore.component.name")
    public void setIoFabric8DatastoreComponentName(String ioFabric8DatastoreComponentName) {
        this.ioFabric8DatastoreComponentName = ioFabric8DatastoreComponentName;
    }

    @JsonProperty("karaf.clean.cache")
    public String getKarafCleanCache() {
        return karafCleanCache;
    }

    @JsonProperty("karaf.clean.cache")
    public void setKarafCleanCache(String karafCleanCache) {
        this.karafCleanCache = karafCleanCache;
    }

    @JsonProperty("runtime.conf")
    public String getRuntimeConf() {
        return runtimeConf;
    }

    @JsonProperty("runtime.conf")
    public void setRuntimeConf(String runtimeConf) {
        this.runtimeConf = runtimeConf;
    }

    @JsonProperty("java.vendor.url.bug")
    public String getJavaVendorUrlBug() {
        return javaVendorUrlBug;
    }

    @JsonProperty("java.vendor.url.bug")
    public void setJavaVendorUrlBug(String javaVendorUrlBug) {
        this.javaVendorUrlBug = javaVendorUrlBug;
    }

    @JsonProperty("user.dir")
    public String getUserDir() {
        return userDir;
    }

    @JsonProperty("user.dir")
    public void setUserDir(String userDir) {
        this.userDir = userDir;
    }

    @JsonProperty("os.arch")
    public String getOsArch() {
        return osArch;
    }

    @JsonProperty("os.arch")
    public void setOsArch(String osArch) {
        this.osArch = osArch;
    }

    @JsonProperty("javax.management.builder.initial")
    public String getJavaxManagementBuilderInitial() {
        return javaxManagementBuilderInitial;
    }

    @JsonProperty("javax.management.builder.initial")
    public void setJavaxManagementBuilderInitial(String javaxManagementBuilderInitial) {
        this.javaxManagementBuilderInitial = javaxManagementBuilderInitial;
    }

    @JsonProperty("java.vm.info")
    public String getJavaVmInfo() {
        return javaVmInfo;
    }

    @JsonProperty("java.vm.info")
    public void setJavaVmInfo(String javaVmInfo) {
        this.javaVmInfo = javaVmInfo;
    }

    @JsonProperty("java.vm.version")
    public String getJavaVmVersion() {
        return javaVmVersion;
    }

    @JsonProperty("java.vm.version")
    public void setJavaVmVersion(String javaVmVersion) {
        this.javaVmVersion = javaVmVersion;
    }

    @JsonProperty("karaf.default.repository")
    public String getKarafDefaultRepository() {
        return karafDefaultRepository;
    }

    @JsonProperty("karaf.default.repository")
    public void setKarafDefaultRepository(String karafDefaultRepository) {
        this.karafDefaultRepository = karafDefaultRepository;
    }

    @JsonProperty("java.rmi.server.hostname")
    public String getJavaRmiServerHostname() {
        return javaRmiServerHostname;
    }

    @JsonProperty("java.rmi.server.hostname")
    public void setJavaRmiServerHostname(String javaRmiServerHostname) {
        this.javaRmiServerHostname = javaRmiServerHostname;
    }

    @JsonProperty("java.ext.dirs")
    public String getJavaExtDirs() {
        return javaExtDirs;
    }

    @JsonProperty("java.ext.dirs")
    public void setJavaExtDirs(String javaExtDirs) {
        this.javaExtDirs = javaExtDirs;
    }

    @JsonProperty("java.class.version")
    public String getJavaClassVersion() {
        return javaClassVersion;
    }

    @JsonProperty("java.class.version")
    public void setJavaClassVersion(String javaClassVersion) {
        this.javaClassVersion = javaClassVersion;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
