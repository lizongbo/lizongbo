package com.lizongbo.android.apk.manifestxml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Element;

/**
 * 
 * @see http://developer.android.com/guide/topics/manifest/activity-element.html
 */
public class Activity extends AbstractXmlAble implements Serializable, XmlAble
{
	private boolean allowTaskReparenting;
	private boolean alwaysRetainTaskState;
	private boolean clearTaskOnLaunch;
	private String configChanges = "";
	private boolean enabled;
	private String excludeFromRecents;
	private boolean exported;
	private boolean finishOnTaskLaunch;
	private boolean hardwareAccelerated;
	private String icon = "";
	private String label = "";
	private String launchMode = "";
	private boolean multiprocess;
	private String name;
	private boolean noHistory;
	private String parentActivityName;
	private String permission;
	private String process;
	private String screenOrientation = "";
	private boolean stateNotNeeded;
	private String taskAffinity;
	private String theme = null;
	private String uiOptions = "";
	private String windowSoftInputMode = "";
	private List<IntentFilter> intentFilterList = new ArrayList<IntentFilter>();

	public boolean isAllowTaskReparenting()
	{
		return this.allowTaskReparenting;
	}

	public void setAllowTaskReparenting(boolean allowTaskReparenting)
	{
		this.allowTaskReparenting = allowTaskReparenting;
	}

	public boolean isAlwaysRetainTaskState()
	{
		return this.alwaysRetainTaskState;
	}

	public void setAlwaysRetainTaskState(boolean alwaysRetainTaskState)
	{
		this.alwaysRetainTaskState = alwaysRetainTaskState;
	}

	public boolean isClearTaskOnLaunch()
	{
		return this.clearTaskOnLaunch;
	}

	public void setClearTaskOnLaunch(boolean clearTaskOnLaunch)
	{
		this.clearTaskOnLaunch = clearTaskOnLaunch;
	}

	public String getConfigChanges()
	{
		return this.configChanges = (this.configChanges == null) ? "" : this.configChanges.trim();
	}

	public void setConfigChanges(String configChanges)
	{
		this.configChanges = configChanges;
	}

	public boolean isEnabled()
	{
		return this.enabled;
	}

	public void setEnabled(boolean enabled)
	{
		this.enabled = enabled;
	}

	public String getExcludeFromRecents()
	{
		return this.excludeFromRecents = (this.excludeFromRecents == null) ? ""
				: this.excludeFromRecents.trim();
	}

	public void setExcludeFromRecents(String excludeFromRecents)
	{
		this.excludeFromRecents = excludeFromRecents;
	}

	public boolean isExported()
	{
		return this.exported;
	}

	public void setExported(boolean exported)
	{
		this.exported = exported;
	}

	public boolean isFinishOnTaskLaunch()
	{
		return this.finishOnTaskLaunch;
	}

	public void setFinishOnTaskLaunch(boolean finishOnTaskLaunch)
	{
		this.finishOnTaskLaunch = finishOnTaskLaunch;
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

	public String getLabel()
	{
		return this.label = (this.label == null) ? "" : this.label.trim();
	}

	public void setLabel(String label)
	{
		this.label = label;
	}

	public String getLaunchMode()
	{
		return this.launchMode = (this.launchMode == null) ? "" : this.launchMode.trim();
	}

	public void setLaunchMode(String launchMode)
	{
		this.launchMode = launchMode;
	}

	public boolean isMultiprocess()
	{
		return this.multiprocess;
	}

	public void setMultiprocess(boolean multiprocess)
	{
		this.multiprocess = multiprocess;
	}

	public String getName()
	{
		return this.name = (this.name == null) ? "" : this.name.trim();
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public boolean isNoHistory()
	{
		return this.noHistory;
	}

	public void setNoHistory(boolean noHistory)
	{
		this.noHistory = noHistory;
	}

	public String getParentActivityName()
	{
		return this.parentActivityName = (this.parentActivityName == null) ? ""
				: this.parentActivityName.trim();
	}

	public void setParentActivityName(String parentActivityName)
	{
		this.parentActivityName = parentActivityName;
	}

	public String getPermission()
	{
		return this.permission = (this.permission == null) ? "" : this.permission.trim();
	}

	public void setPermission(String permission)
	{
		this.permission = permission;
	}

	public String getProcess()
	{
		return this.process = (this.process == null) ? "" : this.process.trim();
	}

	public void setProcess(String process)
	{
		this.process = process;
	}

	public String getScreenOrientation()
	{
		return this.screenOrientation = (this.screenOrientation == null) ? ""
				: this.screenOrientation.trim();
	}

	public void setScreenOrientation(String screenOrientation)
	{
		this.screenOrientation = screenOrientation;
	}

	public boolean isStateNotNeeded()
	{
		return this.stateNotNeeded;
	}

	public void setStateNotNeeded(boolean stateNotNeeded)
	{
		this.stateNotNeeded = stateNotNeeded;
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

	public String getWindowSoftInputMode()
	{
		return this.windowSoftInputMode = (this.windowSoftInputMode == null) ? ""
				: this.windowSoftInputMode
						.trim();
	}

	public void setWindowSoftInputMode(String windowSoftInputMode)
	{
		this.windowSoftInputMode = windowSoftInputMode;
	}

	public List<IntentFilter> getIntentFilterList()
	{
		return this.intentFilterList;
	}

	public void setIntentFilterList(List<IntentFilter> intentFilterList)
	{
		this.intentFilterList = intentFilterList;
	}

	@Override
	public String toString()
	{
		return "Activity [allowTaskReparenting=" + this.allowTaskReparenting
				+ ", alwaysRetainTaskState=" + this.alwaysRetainTaskState + ", clearTaskOnLaunch="
				+ this.clearTaskOnLaunch + ", configChanges=" + this.configChanges + ", enabled="
				+ this.enabled
				+ ", excludeFromRecents=" + this.excludeFromRecents + ", exported=" + this.exported
				+ ", finishOnTaskLaunch=" + this.finishOnTaskLaunch + ", hardwareAccelerated="
				+ this.hardwareAccelerated + ", icon=" + this.icon + ", label=" + this.label
				+ ", launchMode="
				+ this.launchMode + ", multiprocess=" + this.multiprocess + ", name=" + this.name
				+ ", noHistory="
				+ this.noHistory + ", parentActivityName=" + this.parentActivityName
				+ ", permission="
				+ this.permission + ", process=" + this.process + ", screenOrientation="
				+ this.screenOrientation
				+ ", stateNotNeeded=" + this.stateNotNeeded + ", taskAffinity=" + this.taskAffinity
				+ ", theme=" + this.theme + ", uiOptions=" + this.uiOptions
				+ ", windowSoftInputMode="
				+ this.windowSoftInputMode + ", intentFilterList=" + this.intentFilterList + "]";
	}

	@Override
	public boolean formElementInternal(Element root)
	{
		List<Element> el = root.getChildren();
		for (Element se : el)
		{
			if ("intent-filter".equals(se.getName()))
			{
				IntentFilter intentFilter = new IntentFilter();
				intentFilter.setApkFilesDir(this.getApkFilesDir());
				intentFilter.formElement(se);
				this.intentFilterList.add(intentFilter);
			}
		}
		return false;
	}

}
