package com.lizongbo.ios.infoplist;

import java.io.Serializable;
import java.util.List;

/**
 * ipa内Info.plist的属性信息
 * 
 * @author lizongbo
 * @see http://developer.apple.com/library/ios/#documentation/general/Reference/
 *      InfoPlistKeyReference/Articles/AboutInformationPropertyListFiles.html
 * @todo 基于反射将Info.plist里的信息读出来赋值给对象
 */
public class InformationPropertyList implements Serializable
{
	private String cfAppleHelpAnchor;
	private String cfBundleAllowMixedLocalizations;
	private String cfBundleDevelopmentRegion;
	private String cfBundleDisplayName;
	private String cfBundleDocumentTypes;
	private String cfBundleExecutable;
	private String cfBundleHelpBookFolder;
	private String cfBundleHelpBookName;
	private String cfBundleIconFile;
	private List<String> cfBundleIconFiles;
	private String cfBundleIcons;
	private String cfBundleIdentifier;
	private String cfBundleInfoDictionaryVersion;
	private String cfBundleLocalizations;
	private String cfBundleName;
	private String cfBundlePackageType;
	private String cfBundleShortVersionString;
	private String cfBundleSignature;
	private List<CFBundleURLType> cfBundleURLTypes;
	private String cfBundleVersion;
	private String cfPlugInDynamicRegistration;
	private String cfPlugInDynamicRegistrationFunction;
	private String cfPlugInFactories;
	private String cfPlugInTypes;
	private String cfPlugInUnloadFunction;
	private String lsApplicationCategoryType;
	private String lsArchitecturePriority;
	private String lsBackgroundOnly;
	private String lsEnvironment;
	private String lsFileQuarantineEnabled;
	private String lsFileQuarantineExcludedPathPatterns;
	private String lsGetAppDiedEvents;
	private String lsMinimumSystemVersion;
	private String lsMinimumSystemVersionByArchitecture;
	private String lsMultipleInstancesProhibited;
	private boolean lsRequiresIPhoneOS;
	private String lsRequiresNativeExecution;
	private String lsUIElement;
	private String lsUIPresentationMode;
	private String lsVisibleInClassic;
	private String minimumOSVersion;
	private String nsAppleScriptEnabled;
	private String nsCalendarsUsageDescription;
	private String nsContactsUsageDescription;
	private String nsDockTilePlugIn;
	private String nsHumanReadableCopyright;
	private String nsJavaNeeded;
	private String nsJavaPath;
	private String nsJavaRoot;
	private String nsLocationUsageDescription;
	private String nsMainNibFile;
	private String nsPersistentStoreTypeKey;
	private String nsPhotoLibraryUsageDescription;
	private String nsPrefPaneIconFile;
	private String nsPrefPaneIconLabel;
	private String nsPrincipalClass;
	private String nsRemindersUsageDescription;
	private String nsServices;
	private String nsSupportsAutomaticTermination;
	private String nsSupportsSuddenTermination;
	private String nsUbiquitousDisplaySet;
	private String nsUserNotificationAlertStyle;
	private String utExportedTypeDeclarations;
	private String utImportedTypeDeclarations;
	private String apInstallerURL;
	private String apFiles;
	private String atSApplicationFontsPath;
	private String csResourcesFileMapped;
	private String qlSandboxUnsupported;
	private String quartzGLEnable;
	private String mkDirectionsApplicationSupportedModes;
	private String uiAppFonts;
	private String uiApplicationExitsOnSuspend;
	private String uiBackgroundModes;
	private List<String> uiDeviceFamily;
	private String uiFileSharingEnabled;
	private String uiInterfaceOrientation;
	private String uiLaunchImageFile;
	private String uiMainStoryboardFile;
	private String uiNewsstandApp;
	private boolean uiPrerenderedIcon;
	private String uiRequiredDeviceCapabilities;
	private String uiRequiresPersistentWiFi;
	private boolean uiStatusBarHidden;
	private String uiStatusBarStyle;
	private String uiSupportedExternalAccessoryProtocols;
	private List<String> uiSupportedInterfaceOrientations;
	private String uiViewEdgeAntialiasing;
	private String uiViewGroupOpacity;
	private String dtXcode;
	private String dtXcodeBuild;
	private String dtCompiler;
	private String dtPlatformBuild;
	private String dtPlatformVersion;
	private String dtSDKBuild;
	private String dtSDKName;

	private String buildMachineOSBuild;
	private List<String> cfBundleSupportedPlatforms;
	private String dtPlatformName;
	private String cfBundleResourceSpecification;

	public String getCfAppleHelpAnchor()
	{
		return this.cfAppleHelpAnchor;
	}

	public void setCfAppleHelpAnchor(String cfAppleHelpAnchor)
	{
		this.cfAppleHelpAnchor = cfAppleHelpAnchor;
	}

	public String getCfBundleAllowMixedLocalizations()
	{
		return this.cfBundleAllowMixedLocalizations;
	}

	public void setCfBundleAllowMixedLocalizations(
			String cfBundleAllowMixedLocalizations)
	{
		this.cfBundleAllowMixedLocalizations = cfBundleAllowMixedLocalizations;
	}

	public String getCfBundleDevelopmentRegion()
	{
		return this.cfBundleDevelopmentRegion;
	}

	public void setCfBundleDevelopmentRegion(String cfBundleDevelopmentRegion)
	{
		this.cfBundleDevelopmentRegion = cfBundleDevelopmentRegion;
	}

	public String getCfBundleDisplayName()
	{
		return this.cfBundleDisplayName;
	}

	public void setCfBundleDisplayName(String cfBundleDisplayName)
	{
		this.cfBundleDisplayName = cfBundleDisplayName;
	}

	public String getCfBundleDocumentTypes()
	{
		return this.cfBundleDocumentTypes;
	}

	public void setCfBundleDocumentTypes(String cfBundleDocumentTypes)
	{
		this.cfBundleDocumentTypes = cfBundleDocumentTypes;
	}

	public String getCfBundleExecutable()
	{
		return this.cfBundleExecutable;
	}

	public void setCfBundleExecutable(String cfBundleExecutable)
	{
		this.cfBundleExecutable = cfBundleExecutable;
	}

	public String getCfBundleHelpBookFolder()
	{
		return this.cfBundleHelpBookFolder;
	}

	public void setCfBundleHelpBookFolder(String cfBundleHelpBookFolder)
	{
		this.cfBundleHelpBookFolder = cfBundleHelpBookFolder;
	}

	public String getCfBundleHelpBookName()
	{
		return this.cfBundleHelpBookName;
	}

	public void setCfBundleHelpBookName(String cfBundleHelpBookName)
	{
		this.cfBundleHelpBookName = cfBundleHelpBookName;
	}

	public String getCfBundleIconFile()
	{
		return this.cfBundleIconFile;
	}

	public void setCfBundleIconFile(String cfBundleIconFile)
	{
		this.cfBundleIconFile = cfBundleIconFile;
	}

	public String getCfBundleIcons()
	{
		return this.cfBundleIcons;
	}

	public void setCfBundleIcons(String cfBundleIcons)
	{
		this.cfBundleIcons = cfBundleIcons;
	}

	public String getCfBundleIdentifier()
	{
		return this.cfBundleIdentifier;
	}

	public void setCfBundleIdentifier(String cfBundleIdentifier)
	{
		this.cfBundleIdentifier = cfBundleIdentifier;
	}

	public String getCfBundleInfoDictionaryVersion()
	{
		return this.cfBundleInfoDictionaryVersion;
	}

	public void setCfBundleInfoDictionaryVersion(
			String cfBundleInfoDictionaryVersion)
	{
		this.cfBundleInfoDictionaryVersion = cfBundleInfoDictionaryVersion;
	}

	public String getCfBundleLocalizations()
	{
		return this.cfBundleLocalizations;
	}

	public void setCfBundleLocalizations(String cfBundleLocalizations)
	{
		this.cfBundleLocalizations = cfBundleLocalizations;
	}

	public String getCfBundleName()
	{
		return this.cfBundleName;
	}

	public void setCfBundleName(String cfBundleName)
	{
		this.cfBundleName = cfBundleName;
	}

	public String getCfBundlePackageType()
	{
		return this.cfBundlePackageType;
	}

	public void setCfBundlePackageType(String cfBundlePackageType)
	{
		this.cfBundlePackageType = cfBundlePackageType;
	}

	public String getCfBundleShortVersionString()
	{
		return this.cfBundleShortVersionString;
	}

	public void setCfBundleShortVersionString(String cfBundleShortVersionString)
	{
		this.cfBundleShortVersionString = cfBundleShortVersionString;
	}

	public String getCfBundleSignature()
	{
		return this.cfBundleSignature;
	}

	public void setCfBundleSignature(String cfBundleSignature)
	{
		this.cfBundleSignature = cfBundleSignature;
	}

	public String getCfBundleVersion()
	{
		return this.cfBundleVersion;
	}

	public void setCfBundleVersion(String cfBundleVersion)
	{
		this.cfBundleVersion = cfBundleVersion;
	}

	public String getCfPlugInDynamicRegistration()
	{
		return this.cfPlugInDynamicRegistration;
	}

	public void setCfPlugInDynamicRegistration(
			String cfPlugInDynamicRegistration)
	{
		this.cfPlugInDynamicRegistration = cfPlugInDynamicRegistration;
	}

	public String getCfPlugInDynamicRegistrationFunction()
	{
		return this.cfPlugInDynamicRegistrationFunction;
	}

	public void setCfPlugInDynamicRegistrationFunction(
			String cfPlugInDynamicRegistrationFunction)
	{
		this.cfPlugInDynamicRegistrationFunction = cfPlugInDynamicRegistrationFunction;
	}

	public String getCfPlugInFactories()
	{
		return this.cfPlugInFactories;
	}

	public void setCfPlugInFactories(String cfPlugInFactories)
	{
		this.cfPlugInFactories = cfPlugInFactories;
	}

	public String getCfPlugInTypes()
	{
		return this.cfPlugInTypes;
	}

	public void setCfPlugInTypes(String cfPlugInTypes)
	{
		this.cfPlugInTypes = cfPlugInTypes;
	}

	public String getCfPlugInUnloadFunction()
	{
		return this.cfPlugInUnloadFunction;
	}

	public void setCfPlugInUnloadFunction(String cfPlugInUnloadFunction)
	{
		this.cfPlugInUnloadFunction = cfPlugInUnloadFunction;
	}

	public String getLsApplicationCategoryType()
	{
		return this.lsApplicationCategoryType;
	}

	public void setLsApplicationCategoryType(String lsApplicationCategoryType)
	{
		this.lsApplicationCategoryType = lsApplicationCategoryType;
	}

	public String getLsArchitecturePriority()
	{
		return this.lsArchitecturePriority;
	}

	public void setLsArchitecturePriority(String lsArchitecturePriority)
	{
		this.lsArchitecturePriority = lsArchitecturePriority;
	}

	public String getLsBackgroundOnly()
	{
		return this.lsBackgroundOnly;
	}

	public void setLsBackgroundOnly(String lsBackgroundOnly)
	{
		this.lsBackgroundOnly = lsBackgroundOnly;
	}

	public String getLsEnvironment()
	{
		return this.lsEnvironment;
	}

	public void setLsEnvironment(String lsEnvironment)
	{
		this.lsEnvironment = lsEnvironment;
	}

	public String getLsFileQuarantineEnabled()
	{
		return this.lsFileQuarantineEnabled;
	}

	public void setLsFileQuarantineEnabled(String lsFileQuarantineEnabled)
	{
		this.lsFileQuarantineEnabled = lsFileQuarantineEnabled;
	}

	public String getLsFileQuarantineExcludedPathPatterns()
	{
		return this.lsFileQuarantineExcludedPathPatterns;
	}

	public void setLsFileQuarantineExcludedPathPatterns(
			String lsFileQuarantineExcludedPathPatterns)
	{
		this.lsFileQuarantineExcludedPathPatterns = lsFileQuarantineExcludedPathPatterns;
	}

	public String getLsGetAppDiedEvents()
	{
		return this.lsGetAppDiedEvents;
	}

	public void setLsGetAppDiedEvents(String lsGetAppDiedEvents)
	{
		this.lsGetAppDiedEvents = lsGetAppDiedEvents;
	}

	public String getLsMinimumSystemVersion()
	{
		return this.lsMinimumSystemVersion;
	}

	public void setLsMinimumSystemVersion(String lsMinimumSystemVersion)
	{
		this.lsMinimumSystemVersion = lsMinimumSystemVersion;
	}

	public String getLsMinimumSystemVersionByArchitecture()
	{
		return this.lsMinimumSystemVersionByArchitecture;
	}

	public void setLsMinimumSystemVersionByArchitecture(
			String lsMinimumSystemVersionByArchitecture)
	{
		this.lsMinimumSystemVersionByArchitecture = lsMinimumSystemVersionByArchitecture;
	}

	public String getLsMultipleInstancesProhibited()
	{
		return this.lsMultipleInstancesProhibited;
	}

	public void setLsMultipleInstancesProhibited(
			String lsMultipleInstancesProhibited)
	{
		this.lsMultipleInstancesProhibited = lsMultipleInstancesProhibited;
	}

	public String getLsRequiresNativeExecution()
	{
		return this.lsRequiresNativeExecution;
	}

	public void setLsRequiresNativeExecution(String lsRequiresNativeExecution)
	{
		this.lsRequiresNativeExecution = lsRequiresNativeExecution;
	}

	public String getLsUIElement()
	{
		return this.lsUIElement;
	}

	public void setLsUIElement(String lsUIElement)
	{
		this.lsUIElement = lsUIElement;
	}

	public String getLsUIPresentationMode()
	{
		return this.lsUIPresentationMode;
	}

	public void setLsUIPresentationMode(String lsUIPresentationMode)
	{
		this.lsUIPresentationMode = lsUIPresentationMode;
	}

	public String getLsVisibleInClassic()
	{
		return this.lsVisibleInClassic;
	}

	public void setLsVisibleInClassic(String lsVisibleInClassic)
	{
		this.lsVisibleInClassic = lsVisibleInClassic;
	}

	public String getNsAppleScriptEnabled()
	{
		return this.nsAppleScriptEnabled;
	}

	public void setNsAppleScriptEnabled(String nsAppleScriptEnabled)
	{
		this.nsAppleScriptEnabled = nsAppleScriptEnabled;
	}

	public String getNsCalendarsUsageDescription()
	{
		return this.nsCalendarsUsageDescription;
	}

	public void setNsCalendarsUsageDescription(
			String nsCalendarsUsageDescription)
	{
		this.nsCalendarsUsageDescription = nsCalendarsUsageDescription;
	}

	public String getNsContactsUsageDescription()
	{
		return this.nsContactsUsageDescription;
	}

	public void setNsContactsUsageDescription(String nsContactsUsageDescription)
	{
		this.nsContactsUsageDescription = nsContactsUsageDescription;
	}

	public String getNsDockTilePlugIn()
	{
		return this.nsDockTilePlugIn;
	}

	public void setNsDockTilePlugIn(String nsDockTilePlugIn)
	{
		this.nsDockTilePlugIn = nsDockTilePlugIn;
	}

	public String getNsHumanReadableCopyright()
	{
		return this.nsHumanReadableCopyright;
	}

	public void setNsHumanReadableCopyright(String nsHumanReadableCopyright)
	{
		this.nsHumanReadableCopyright = nsHumanReadableCopyright;
	}

	public String getNsJavaNeeded()
	{
		return this.nsJavaNeeded;
	}

	public void setNsJavaNeeded(String nsJavaNeeded)
	{
		this.nsJavaNeeded = nsJavaNeeded;
	}

	public String getNsJavaPath()
	{
		return this.nsJavaPath;
	}

	public void setNsJavaPath(String nsJavaPath)
	{
		this.nsJavaPath = nsJavaPath;
	}

	public String getNsJavaRoot()
	{
		return this.nsJavaRoot;
	}

	public void setNsJavaRoot(String nsJavaRoot)
	{
		this.nsJavaRoot = nsJavaRoot;
	}

	public String getNsLocationUsageDescription()
	{
		return this.nsLocationUsageDescription;
	}

	public void setNsLocationUsageDescription(String nsLocationUsageDescription)
	{
		this.nsLocationUsageDescription = nsLocationUsageDescription;
	}

	public String getNsMainNibFile()
	{
		return this.nsMainNibFile;
	}

	public void setNsMainNibFile(String nsMainNibFile)
	{
		this.nsMainNibFile = nsMainNibFile;
	}

	public String getNsPersistentStoreTypeKey()
	{
		return this.nsPersistentStoreTypeKey;
	}

	public void setNsPersistentStoreTypeKey(String nsPersistentStoreTypeKey)
	{
		this.nsPersistentStoreTypeKey = nsPersistentStoreTypeKey;
	}

	public String getNsPhotoLibraryUsageDescription()
	{
		return this.nsPhotoLibraryUsageDescription;
	}

	public void setNsPhotoLibraryUsageDescription(
			String nsPhotoLibraryUsageDescription)
	{
		this.nsPhotoLibraryUsageDescription = nsPhotoLibraryUsageDescription;
	}

	public String getNsPrefPaneIconFile()
	{
		return this.nsPrefPaneIconFile;
	}

	public void setNsPrefPaneIconFile(String nsPrefPaneIconFile)
	{
		this.nsPrefPaneIconFile = nsPrefPaneIconFile;
	}

	public String getNsPrefPaneIconLabel()
	{
		return this.nsPrefPaneIconLabel;
	}

	public void setNsPrefPaneIconLabel(String nsPrefPaneIconLabel)
	{
		this.nsPrefPaneIconLabel = nsPrefPaneIconLabel;
	}

	public String getNsPrincipalClass()
	{
		return this.nsPrincipalClass;
	}

	public void setNsPrincipalClass(String nsPrincipalClass)
	{
		this.nsPrincipalClass = nsPrincipalClass;
	}

	public String getNsRemindersUsageDescription()
	{
		return this.nsRemindersUsageDescription;
	}

	public void setNsRemindersUsageDescription(
			String nsRemindersUsageDescription)
	{
		this.nsRemindersUsageDescription = nsRemindersUsageDescription;
	}

	public String getNsServices()
	{
		return this.nsServices;
	}

	public void setNsServices(String nsServices)
	{
		this.nsServices = nsServices;
	}

	public String getNsSupportsAutomaticTermination()
	{
		return this.nsSupportsAutomaticTermination;
	}

	public void setNsSupportsAutomaticTermination(
			String nsSupportsAutomaticTermination)
	{
		this.nsSupportsAutomaticTermination = nsSupportsAutomaticTermination;
	}

	public String getNsSupportsSuddenTermination()
	{
		return this.nsSupportsSuddenTermination;
	}

	public void setNsSupportsSuddenTermination(
			String nsSupportsSuddenTermination)
	{
		this.nsSupportsSuddenTermination = nsSupportsSuddenTermination;
	}

	public String getNsUbiquitousDisplaySet()
	{
		return this.nsUbiquitousDisplaySet;
	}

	public void setNsUbiquitousDisplaySet(String nsUbiquitousDisplaySet)
	{
		this.nsUbiquitousDisplaySet = nsUbiquitousDisplaySet;
	}

	public String getNsUserNotificationAlertStyle()
	{
		return this.nsUserNotificationAlertStyle;
	}

	public void setNsUserNotificationAlertStyle(
			String nsUserNotificationAlertStyle)
	{
		this.nsUserNotificationAlertStyle = nsUserNotificationAlertStyle;
	}

	public String getUtExportedTypeDeclarations()
	{
		return this.utExportedTypeDeclarations;
	}

	public void setUtExportedTypeDeclarations(String utExportedTypeDeclarations)
	{
		this.utExportedTypeDeclarations = utExportedTypeDeclarations;
	}

	public String getUtImportedTypeDeclarations()
	{
		return this.utImportedTypeDeclarations;
	}

	public void setUtImportedTypeDeclarations(String utImportedTypeDeclarations)
	{
		this.utImportedTypeDeclarations = utImportedTypeDeclarations;
	}

	public String getApInstallerURL()
	{
		return this.apInstallerURL;
	}

	public void setApInstallerURL(String apInstallerURL)
	{
		this.apInstallerURL = apInstallerURL;
	}

	public String getApFiles()
	{
		return this.apFiles;
	}

	public void setApFiles(String apFiles)
	{
		this.apFiles = apFiles;
	}

	public String getAtSApplicationFontsPath()
	{
		return this.atSApplicationFontsPath;
	}

	public void setAtSApplicationFontsPath(String atSApplicationFontsPath)
	{
		this.atSApplicationFontsPath = atSApplicationFontsPath;
	}

	public String getCsResourcesFileMapped()
	{
		return this.csResourcesFileMapped;
	}

	public void setCsResourcesFileMapped(String csResourcesFileMapped)
	{
		this.csResourcesFileMapped = csResourcesFileMapped;
	}

	public String getQlSandboxUnsupported()
	{
		return this.qlSandboxUnsupported;
	}

	public void setQlSandboxUnsupported(String qlSandboxUnsupported)
	{
		this.qlSandboxUnsupported = qlSandboxUnsupported;
	}

	public String getQuartzGLEnable()
	{
		return this.quartzGLEnable;
	}

	public void setQuartzGLEnable(String quartzGLEnable)
	{
		this.quartzGLEnable = quartzGLEnable;
	}

	public String getMkDirectionsApplicationSupportedModes()
	{
		return this.mkDirectionsApplicationSupportedModes;
	}

	public void setMkDirectionsApplicationSupportedModes(
			String mkDirectionsApplicationSupportedModes)
	{
		this.mkDirectionsApplicationSupportedModes = mkDirectionsApplicationSupportedModes;
	}

	public String getUiAppFonts()
	{
		return this.uiAppFonts;
	}

	public void setUiAppFonts(String uiAppFonts)
	{
		this.uiAppFonts = uiAppFonts;
	}

	public String getUiApplicationExitsOnSuspend()
	{
		return this.uiApplicationExitsOnSuspend;
	}

	public void setUiApplicationExitsOnSuspend(
			String uiApplicationExitsOnSuspend)
	{
		this.uiApplicationExitsOnSuspend = uiApplicationExitsOnSuspend;
	}

	public String getUiBackgroundModes()
	{
		return this.uiBackgroundModes;
	}

	public void setUiBackgroundModes(String uiBackgroundModes)
	{
		this.uiBackgroundModes = uiBackgroundModes;
	}

	public String getUiFileSharingEnabled()
	{
		return this.uiFileSharingEnabled;
	}

	public void setUiFileSharingEnabled(String uiFileSharingEnabled)
	{
		this.uiFileSharingEnabled = uiFileSharingEnabled;
	}

	public String getUiInterfaceOrientation()
	{
		return this.uiInterfaceOrientation;
	}

	public void setUiInterfaceOrientation(String uiInterfaceOrientation)
	{
		this.uiInterfaceOrientation = uiInterfaceOrientation;
	}

	public String getUiLaunchImageFile()
	{
		return this.uiLaunchImageFile;
	}

	public void setUiLaunchImageFile(String uiLaunchImageFile)
	{
		this.uiLaunchImageFile = uiLaunchImageFile;
	}

	public String getUiMainStoryboardFile()
	{
		return this.uiMainStoryboardFile;
	}

	public void setUiMainStoryboardFile(String uiMainStoryboardFile)
	{
		this.uiMainStoryboardFile = uiMainStoryboardFile;
	}

	public String getUiNewsstandApp()
	{
		return this.uiNewsstandApp;
	}

	public void setUiNewsstandApp(String uiNewsstandApp)
	{
		this.uiNewsstandApp = uiNewsstandApp;
	}

	public String getUiRequiredDeviceCapabilities()
	{
		return this.uiRequiredDeviceCapabilities;
	}

	public void setUiRequiredDeviceCapabilities(
			String uiRequiredDeviceCapabilities)
	{
		this.uiRequiredDeviceCapabilities = uiRequiredDeviceCapabilities;
	}

	public String getUiRequiresPersistentWiFi()
	{
		return this.uiRequiresPersistentWiFi;
	}

	public void setUiRequiresPersistentWiFi(String uiRequiresPersistentWiFi)
	{
		this.uiRequiresPersistentWiFi = uiRequiresPersistentWiFi;
	}

	public String getUiStatusBarStyle()
	{
		return this.uiStatusBarStyle;
	}

	public void setUiStatusBarStyle(String uiStatusBarStyle)
	{
		this.uiStatusBarStyle = uiStatusBarStyle;
	}

	public String getUiSupportedExternalAccessoryProtocols()
	{
		return this.uiSupportedExternalAccessoryProtocols;
	}

	public void setUiSupportedExternalAccessoryProtocols(
			String uiSupportedExternalAccessoryProtocols)
	{
		this.uiSupportedExternalAccessoryProtocols = uiSupportedExternalAccessoryProtocols;
	}

	public String getUiViewEdgeAntialiasing()
	{
		return this.uiViewEdgeAntialiasing;
	}

	public void setUiViewEdgeAntialiasing(String uiViewEdgeAntialiasing)
	{
		this.uiViewEdgeAntialiasing = uiViewEdgeAntialiasing;
	}

	public String getUiViewGroupOpacity()
	{
		return this.uiViewGroupOpacity;
	}

	public void setUiViewGroupOpacity(String uiViewGroupOpacity)
	{
		this.uiViewGroupOpacity = uiViewGroupOpacity;
	}

	public String getDtXcode()
	{
		return this.dtXcode = (this.dtXcode == null) ? "" : this.dtXcode.trim();
	}

	public void setDtXcode(String dtXcode)
	{
		this.dtXcode = dtXcode;
	}

	public String getDtXcodeBuild()
	{
		return this.dtXcodeBuild = (this.dtXcodeBuild == null) ? "" : this.dtXcodeBuild.trim();
	}

	public void setDtXcodeBuild(String dtXcodeBuild)
	{
		this.dtXcodeBuild = dtXcodeBuild;
	}

	public String getDtCompiler()
	{
		return this.dtCompiler = (this.dtCompiler == null) ? "" : this.dtCompiler.trim();
	}

	public void setDtCompiler(String dtCompiler)
	{
		this.dtCompiler = dtCompiler;
	}

	public String getDtPlatformBuild()
	{
		return this.dtPlatformBuild = (this.dtPlatformBuild == null) ? "" : this.dtPlatformBuild
				.trim();
	}

	public void setDtPlatformBuild(String dtPlatformBuild)
	{
		this.dtPlatformBuild = dtPlatformBuild;
	}

	public String getDtPlatformVersion()
	{
		return this.dtPlatformVersion = (this.dtPlatformVersion == null) ? ""
				: this.dtPlatformVersion.trim();
	}

	public void setDtPlatformVersion(String dtPlatformVersion)
	{
		this.dtPlatformVersion = dtPlatformVersion;
	}

	public String getDtSDKBuild()
	{
		return this.dtSDKBuild = (this.dtSDKBuild == null) ? "" : this.dtSDKBuild.trim();
	}

	public void setDtSDKBuild(String dtSDKBuild)
	{
		this.dtSDKBuild = dtSDKBuild;
	}

	public String getDtSDKName()
	{
		return this.dtSDKName = (this.dtSDKName == null) ? "" : this.dtSDKName.trim();
	}

	public void setDtSDKName(String dtSDKName)
	{
		this.dtSDKName = dtSDKName;
	}

	public List<String> getCfBundleIconFiles()
	{
		return this.cfBundleIconFiles;
	}

	public void setCfBundleIconFiles(List<String> cfBundleIconFiles)
	{
		this.cfBundleIconFiles = cfBundleIconFiles;
	}

	public List<CFBundleURLType> getCfBundleURLTypes()
	{
		return this.cfBundleURLTypes;
	}

	public void setCfBundleURLTypes(List<CFBundleURLType> cfBundleURLTypes)
	{
		this.cfBundleURLTypes = cfBundleURLTypes;
	}

	public boolean isLsRequiresIPhoneOS()
	{
		return this.lsRequiresIPhoneOS;
	}

	public void setLsRequiresIPhoneOS(boolean lsRequiresIPhoneOS)
	{
		this.lsRequiresIPhoneOS = lsRequiresIPhoneOS;
	}

	public String getMinimumOSVersion()
	{
		return this.minimumOSVersion = (this.minimumOSVersion == null) ? "" : this.minimumOSVersion
				.trim();
	}

	public void setMinimumOSVersion(String minimumOSVersion)
	{
		this.minimumOSVersion = minimumOSVersion;
	}

	public List<String> getUiDeviceFamily()
	{
		return this.uiDeviceFamily;
	}

	public void setUiDeviceFamily(List<String> uiDeviceFamily)
	{
		this.uiDeviceFamily = uiDeviceFamily;
	}

	public boolean isUiPrerenderedIcon()
	{
		return this.uiPrerenderedIcon;
	}

	public void setUiPrerenderedIcon(boolean uiPrerenderedIcon)
	{
		this.uiPrerenderedIcon = uiPrerenderedIcon;
	}

	public boolean isUiStatusBarHidden()
	{
		return this.uiStatusBarHidden;
	}

	public void setUiStatusBarHidden(boolean uiStatusBarHidden)
	{
		this.uiStatusBarHidden = uiStatusBarHidden;
	}

	public List<String> getUiSupportedInterfaceOrientations()
	{
		return this.uiSupportedInterfaceOrientations;
	}

	public void setUiSupportedInterfaceOrientations(List<String> uiSupportedInterfaceOrientations)
	{
		this.uiSupportedInterfaceOrientations = uiSupportedInterfaceOrientations;
	}

	public String getBuildMachineOSBuild()
	{
		return this.buildMachineOSBuild = (this.buildMachineOSBuild == null) ? ""
				: this.buildMachineOSBuild
						.trim();
	}

	public void setBuildMachineOSBuild(String buildMachineOSBuild)
	{
		this.buildMachineOSBuild = buildMachineOSBuild;
	}

	public List<String> getCfBundleSupportedPlatforms()
	{
		return this.cfBundleSupportedPlatforms;
	}

	public void setCfBundleSupportedPlatforms(List<String> cfBundleSupportedPlatforms)
	{
		this.cfBundleSupportedPlatforms = cfBundleSupportedPlatforms;
	}

	public String getDtPlatformName()
	{
		return this.dtPlatformName = (this.dtPlatformName == null) ? "" : this.dtPlatformName
				.trim();
	}

	public void setDtPlatformName(String dtPlatformName)
	{
		this.dtPlatformName = dtPlatformName;
	}

	public String getCfBundleResourceSpecification()
	{
		return this.cfBundleResourceSpecification = (this.cfBundleResourceSpecification == null) ? ""
				: this.cfBundleResourceSpecification.trim();
	}

	public void setCfBundleResourceSpecification(String cfBundleResourceSpecification)
	{
		this.cfBundleResourceSpecification = cfBundleResourceSpecification;
	}

	@Override
	public String toString()
	{
		return "InformationPropertyList [cfAppleHelpAnchor=" + this.cfAppleHelpAnchor
				+ ", cfBundleAllowMixedLocalizations=" + this.cfBundleAllowMixedLocalizations
				+ ", cfBundleDevelopmentRegion=" + this.cfBundleDevelopmentRegion
				+ ", cfBundleDisplayName=" + this.cfBundleDisplayName + ", cfBundleDocumentTypes="
				+ this.cfBundleDocumentTypes + ", cfBundleExecutable=" + this.cfBundleExecutable
				+ ", cfBundleHelpBookFolder=" + this.cfBundleHelpBookFolder
				+ ", cfBundleHelpBookName="
				+ this.cfBundleHelpBookName + ", cfBundleIconFile=" + this.cfBundleIconFile
				+ ", cfBundleIconFiles=" + this.cfBundleIconFiles + ", cfBundleIcons="
				+ this.cfBundleIcons
				+ ", cfBundleIdentifier=" + this.cfBundleIdentifier
				+ ", cfBundleInfoDictionaryVersion="
				+ this.cfBundleInfoDictionaryVersion + ", cfBundleLocalizations="
				+ this.cfBundleLocalizations + ", cfBundleName=" + this.cfBundleName
				+ ", cfBundlePackageType=" + this.cfBundlePackageType
				+ ", cfBundleShortVersionString="
				+ this.cfBundleShortVersionString + ", cfBundleSignature=" + this.cfBundleSignature
				+ ", cfBundleURLTypes=" + this.cfBundleURLTypes + ", cfBundleVersion="
				+ this.cfBundleVersion
				+ ", cfPlugInDynamicRegistration=" + this.cfPlugInDynamicRegistration
				+ ", cfPlugInDynamicRegistrationFunction="
				+ this.cfPlugInDynamicRegistrationFunction
				+ ", cfPlugInFactories=" + this.cfPlugInFactories + ", cfPlugInTypes="
				+ this.cfPlugInTypes
				+ ", cfPlugInUnloadFunction=" + this.cfPlugInUnloadFunction
				+ ", lsApplicationCategoryType=" + this.lsApplicationCategoryType
				+ ", lsArchitecturePriority=" + this.lsArchitecturePriority + ", lsBackgroundOnly="
				+ this.lsBackgroundOnly + ", lsEnvironment=" + this.lsEnvironment
				+ ", lsFileQuarantineEnabled=" + this.lsFileQuarantineEnabled
				+ ", lsFileQuarantineExcludedPathPatterns="
				+ this.lsFileQuarantineExcludedPathPatterns
				+ ", lsGetAppDiedEvents=" + this.lsGetAppDiedEvents + ", lsMinimumSystemVersion="
				+ this.lsMinimumSystemVersion + ", lsMinimumSystemVersionByArchitecture="
				+ this.lsMinimumSystemVersionByArchitecture + ", lsMultipleInstancesProhibited="
				+ this.lsMultipleInstancesProhibited + ", lsRequiresIPhoneOS="
				+ this.lsRequiresIPhoneOS
				+ ", lsRequiresNativeExecution=" + this.lsRequiresNativeExecution
				+ ", lsUIElement="
				+ this.lsUIElement + ", lsUIPresentationMode=" + this.lsUIPresentationMode
				+ ", lsVisibleInClassic=" + this.lsVisibleInClassic + ", minimumOSVersion="
				+ this.minimumOSVersion + ", nsAppleScriptEnabled=" + this.nsAppleScriptEnabled
				+ ", nsCalendarsUsageDescription=" + this.nsCalendarsUsageDescription
				+ ", nsContactsUsageDescription=" + this.nsContactsUsageDescription
				+ ", nsDockTilePlugIn=" + this.nsDockTilePlugIn + ", nsHumanReadableCopyright="
				+ this.nsHumanReadableCopyright + ", nsJavaNeeded=" + this.nsJavaNeeded
				+ ", nsJavaPath="
				+ this.nsJavaPath + ", nsJavaRoot=" + this.nsJavaRoot
				+ ", nsLocationUsageDescription="
				+ this.nsLocationUsageDescription + ", nsMainNibFile=" + this.nsMainNibFile
				+ ", nsPersistentStoreTypeKey=" + this.nsPersistentStoreTypeKey
				+ ", nsPhotoLibraryUsageDescription=" + this.nsPhotoLibraryUsageDescription
				+ ", nsPrefPaneIconFile=" + this.nsPrefPaneIconFile + ", nsPrefPaneIconLabel="
				+ this.nsPrefPaneIconLabel + ", nsPrincipalClass=" + this.nsPrincipalClass
				+ ", nsRemindersUsageDescription=" + this.nsRemindersUsageDescription
				+ ", nsServices="
				+ this.nsServices + ", nsSupportsAutomaticTermination="
				+ this.nsSupportsAutomaticTermination
				+ ", nsSupportsSuddenTermination=" + this.nsSupportsSuddenTermination
				+ ", nsUbiquitousDisplaySet=" + this.nsUbiquitousDisplaySet
				+ ", nsUserNotificationAlertStyle=" + this.nsUserNotificationAlertStyle
				+ ", utExportedTypeDeclarations=" + this.utExportedTypeDeclarations
				+ ", utImportedTypeDeclarations=" + this.utImportedTypeDeclarations
				+ ", apInstallerURL=" + this.apInstallerURL + ", apFiles=" + this.apFiles
				+ ", atSApplicationFontsPath=" + this.atSApplicationFontsPath
				+ ", csResourcesFileMapped=" + this.csResourcesFileMapped
				+ ", qlSandboxUnsupported="
				+ this.qlSandboxUnsupported + ", quartzGLEnable=" + this.quartzGLEnable
				+ ", mkDirectionsApplicationSupportedModes="
				+ this.mkDirectionsApplicationSupportedModes + ", uiAppFonts=" + this.uiAppFonts
				+ ", uiApplicationExitsOnSuspend=" + this.uiApplicationExitsOnSuspend
				+ ", uiBackgroundModes=" + this.uiBackgroundModes + ", uiDeviceFamily="
				+ this.uiDeviceFamily
				+ ", uiFileSharingEnabled=" + this.uiFileSharingEnabled
				+ ", uiInterfaceOrientation="
				+ this.uiInterfaceOrientation + ", uiLaunchImageFile=" + this.uiLaunchImageFile
				+ ", uiMainStoryboardFile=" + this.uiMainStoryboardFile + ", uiNewsstandApp="
				+ this.uiNewsstandApp + ", uiPrerenderedIcon=" + this.uiPrerenderedIcon
				+ ", uiRequiredDeviceCapabilities=" + this.uiRequiredDeviceCapabilities
				+ ", uiRequiresPersistentWiFi=" + this.uiRequiresPersistentWiFi
				+ ", uiStatusBarHidden="
				+ this.uiStatusBarHidden + ", uiStatusBarStyle=" + this.uiStatusBarStyle
				+ ", uiSupportedExternalAccessoryProtocols="
				+ this.uiSupportedExternalAccessoryProtocols
				+ ", uiSupportedInterfaceOrientations="
				+ this.uiSupportedInterfaceOrientations + ", uiViewEdgeAntialiasing="
				+ this.uiViewEdgeAntialiasing + ", uiViewGroupOpacity=" + this.uiViewGroupOpacity
				+ ", dtXcode=" + this.dtXcode + ", dtXcodeBuild=" + this.dtXcodeBuild
				+ ", dtCompiler="
				+ this.dtCompiler + ", dtPlatformBuild=" + this.dtPlatformBuild
				+ ", dtPlatformVersion="
				+ this.dtPlatformVersion + ", dtSDKBuild=" + this.dtSDKBuild + ", dtSDKName="
				+ this.dtSDKName
				+ ", buildMachineOSBuild=" + this.buildMachineOSBuild
				+ ", cfBundleSupportedPlatforms="
				+ this.cfBundleSupportedPlatforms + ", dtPlatformName=" + this.dtPlatformName
				+ ", cfBundleResourceSpecification=" + this.cfBundleResourceSpecification + "]";
	}

}
