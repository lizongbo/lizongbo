package com.lizongbo.android.apk.manifestxml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Element;

/**
 * 
 * @see http://developer.android.com/guide/topics/manifest/application-element.html
 */
public class Application extends AbstractXmlAble implements Serializable, XmlAble
{
	private boolean allowTaskReparenting = false;
	private String backupAgent = "";
	private boolean debuggable = false;
	private String description = "";
	private boolean enabled = false;
	private boolean hasCode = false;
	private boolean hardwareAccelerated = false;
	private String icon = "";
	private boolean killAfterRestore = false;
	private boolean largeHeap = false;
	private String label = "";
	private String logo = "";
	private String manageSpaceActivity = "";
	private String name = "";
	private String permission = "";
	private boolean persistent = false;
	private String process = "";
	private boolean restoreAnyVersion = false;
	private boolean supportsRtl = false;
	private String taskAffinity = "";
	private String theme = "";
	private String uiOptions = "none";
	private List<Activity> activityList = new ArrayList<Activity>();
	private List<MetaData> metaDataList = new ArrayList<MetaData>();

	public boolean isAllowTaskReparenting()
	{
		return this.allowTaskReparenting;
	}

	public void setAllowTaskReparenting(boolean allowTaskReparenting)
	{
		this.allowTaskReparenting = allowTaskReparenting;
	}

	public String getBackupAgent()
	{
		return this.backupAgent = (this.backupAgent == null) ? "" : this.backupAgent.trim();
	}

	public void setBackupAgent(String backupAgent)
	{
		this.backupAgent = backupAgent;
	}

	public boolean isDebuggable()
	{
		return this.debuggable;
	}

	public void setDebuggable(boolean debuggable)
	{
		this.debuggable = debuggable;
	}

	public String getDescription()
	{
		return this.description = (this.description == null) ? "" : this.description.trim();
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public boolean isEnabled()
	{
		return this.enabled;
	}

	public void setEnabled(boolean enabled)
	{
		this.enabled = enabled;
	}

	public boolean isHasCode()
	{
		return this.hasCode;
	}

	public void setHasCode(boolean hasCode)
	{
		this.hasCode = hasCode;
	}

	public boolean isHardwareAccelerated()
	{
		return this.hardwareAccelerated;
	}

	public void setHardwareAccelerated(boolean hardwareAccelerated)
	{
		this.hardwareAccelerated = hardwareAccelerated;
	}

	public String getIcon()
	{
		return this.icon = (this.icon == null) ? "" : this.icon.trim();
	}

	public void setIcon(String icon)
	{
		this.icon = icon;
	}

	public boolean isKillAfterRestore()
	{
		return this.killAfterRestore;
	}

	public void setKillAfterRestore(boolean killAfterRestore)
	{
		this.killAfterRestore = killAfterRestore;
	}

	public boolean isLargeHeap()
	{
		return this.largeHeap;
	}

	public void setLargeHeap(boolean largeHeap)
	{
		this.largeHeap = largeHeap;
	}

	public String getLabel()
	{
		return this.label = (this.label == null) ? "" : this.label.trim();
	}

	public void setLabel(String label)
	{
		this.label = label;
	}

	public String getLogo()
	{
		return this.logo = (this.logo == null) ? "" : this.logo.trim();
	}

	public void setLogo(String logo)
	{
		this.logo = logo;
	}

	public String getManageSpaceActivity()
	{
		return this.manageSpaceActivity = (this.manageSpaceActivity == null) ? ""
				: this.manageSpaceActivity
						.trim();
	}

	public void setManageSpaceActivity(String manageSpaceActivity)
	{
		this.manageSpaceActivity = manageSpaceActivity;
	}

	public String getName()
	{
		return this.name = (this.name == null) ? "" : this.name.trim();
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPermission()
	{
		return this.permission = (this.permission == null) ? "" : this.permission.trim();
	}

	public void setPermission(String permission)
	{
		this.permission = permission;
	}

	public boolean isPersistent()
	{
		return this.persistent;
	}

	public void setPersistent(boolean persistent)
	{
		this.persistent = persistent;
	}

	public String getProcess()
	{
		return this.process = (this.process == null) ? "" : this.process.trim();
	}

	public void setProcess(String process)
	{
		this.process = process;
	}

	public boolean isRestoreAnyVersion()
	{
		return this.restoreAnyVersion;
	}

	public void setRestoreAnyVersion(boolean restoreAnyVersion)
	{
		this.restoreAnyVersion = restoreAnyVersion;
	}

	public boolean isSupportsRtl()
	{
		return this.supportsRtl;
	}

	public void setSupportsRtl(boolean supportsRtl)
	{
		this.supportsRtl = supportsRtl;
	}

	public String getTaskAffinity()
	{
		return this.taskAffinity = (this.taskAffinity == null) ? "" : this.taskAffinity.trim();
	}

	public void setTaskAffinity(String taskAffinity)
	{
		this.taskAffinity = taskAffinity;
	}

	public String getTheme()
	{
		return this.theme = (this.theme == null) ? "" : this.theme.trim();
	}

	public void setTheme(String theme)
	{
		this.theme = theme;
	}

	public String getUiOptions()
	{
		return this.uiOptions = (this.uiOptions == null) ? "" : this.uiOptions.trim();
	}

	public void setUiOptions(String uiOptions)
	{
		this.uiOptions = uiOptions;
	}

	public List<Activity> getActivityList()
	{
		return this.activityList;
	}

	public void setActivityList(List<Activity> activityList)
	{
		this.activityList = activityList;
	}

	public List<MetaData> getMetaDataList()
	{
		return this.metaDataList;
	}

	public void setMetaDataList(List<MetaData> metaDataList)
	{
		this.metaDataList = metaDataList;
	}

	@Override
	public String toString()
	{
		return "Application [allowTaskReparenting=" + this.allowTaskReparenting + ", backupAgent="
				+ this.backupAgent + ", debuggable=" + this.debuggable + ", description="
				+ this.description
				+ ", enabled=" + this.enabled + ", hasCode=" + this.hasCode
				+ ", hardwareAccelerated="
				+ this.hardwareAccelerated + ", icon=" + this.icon + ", killAfterRestore="
				+ this.killAfterRestore
				+ ", largeHeap=" + this.largeHeap + ", label=" + this.label + ", logo=" + this.logo
				+ ", manageSpaceActivity=" + this.manageSpaceActivity + ", name=" + this.name
				+ ", permission=" + this.permission + ", persistent=" + this.persistent
				+ ", process="
				+ this.process + ", restoreAnyVersion=" + this.restoreAnyVersion + ", supportsRtl="
				+ this.supportsRtl + ", taskAffinity=" + this.taskAffinity + ", theme="
				+ this.theme
				+ ", uiOptions=" + this.uiOptions + ", activityList=" + this.activityList
				+ ", metaDataList="
				+ this.metaDataList + "]";
	}

	@Override
	public boolean formElementInternal(Element root)
	{
		List<Element> el = root.getChildren();
		for (Element se : el)
		{
			if ("meta-data".equals(se.getName()))
			{
				MetaData metaData = new MetaData();
				metaData.setApkFilesDir(this.getApkFilesDir());
				metaData.formElement(se);
				this.metaDataList.add(metaData);
			}
			if ("activity".equals(se.getName()))
			{
				Activity activity = new Activity();
				activity.setApkFilesDir(this.getApkFilesDir());
				activity.formElement(se);
				this.activityList.add(activity);
			}
		}
		return false;
	}

	/**
	 * 
	 * <b>功能：根据MetaData的名字来获取metadata信息</b><br>
	 * <br>
	 * 
	 * @param name
	 * @return MetaData
	 */
	public MetaData getMetaData(String name)
	{
		if (name == null)
		{
			return null;
		}
		for (MetaData metaData : this.getMetaDataList())
		{
			if ((metaData != null) && name.equals(metaData.getName()))
			{
				return metaData;
			}
		}
		return null;
	}
}
