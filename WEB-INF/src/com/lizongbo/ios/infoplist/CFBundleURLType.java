package com.lizongbo.ios.infoplist;

import java.io.Serializable;
import java.util.List;

public class CFBundleURLType implements Serializable
{
	private String cfBundleTypeRole;
	private String cfBundleURLIconFile;
	private String cfBundleURLName;
	private List<String> cfBundleURLSchemes;

	public String getCfBundleTypeRole()
	{
		return cfBundleTypeRole = (cfBundleTypeRole == null) ? "" : cfBundleTypeRole.trim();
	}

	public void setCfBundleTypeRole(String cfBundleTypeRole)
	{
		this.cfBundleTypeRole = cfBundleTypeRole;
	}

	public String getCfBundleURLIconFile()
	{
		return cfBundleURLIconFile = (cfBundleURLIconFile == null) ? "" : cfBundleURLIconFile
				.trim();
	}

	public void setCfBundleURLIconFile(String cfBundleURLIconFile)
	{
		this.cfBundleURLIconFile = cfBundleURLIconFile;
	}

	public String getCfBundleURLName()
	{
		return cfBundleURLName = (cfBundleURLName == null) ? "" : cfBundleURLName.trim();
	}

	public void setCfBundleURLName(String cfBundleURLName)
	{
		this.cfBundleURLName = cfBundleURLName;
	}

	public List<String> getCfBundleURLSchemes()
	{
		return cfBundleURLSchemes;
	}

	public void setCfBundleURLSchemes(List<String> cfBundleURLSchemes)
	{
		this.cfBundleURLSchemes = cfBundleURLSchemes;
	}

	@Override
	public String toString()
	{
		return "CFBundleURLType [cfBundleTypeRole=" + cfBundleTypeRole + ", cfBundleURLIconFile="
				+ cfBundleURLIconFile + ", cfBundleURLName=" + cfBundleURLName
				+ ", cfBundleURLSchemes=" + cfBundleURLSchemes + "]";
	}

}
