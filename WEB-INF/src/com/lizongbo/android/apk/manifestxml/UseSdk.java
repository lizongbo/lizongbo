package com.lizongbo.android.apk.manifestxml;

import java.io.Serializable;

import org.jdom2.Element;

/**
 * 
 * @see http://developer.android.com/guide/topics/manifest/uses-sdk-element.html
 */

public class UseSdk extends AbstractXmlAble implements Serializable, XmlAble
{
	private int minSdkVersion = -1;
	private int targetSdkVersion = -1;
	private int maxSdkVersion = -1;

	public int getMinSdkVersion()
	{
		return this.minSdkVersion;
	}

	public void setMinSdkVersion(int minSdkVersion)
	{
		this.minSdkVersion = minSdkVersion;
	}

	public int getTargetSdkVersion()
	{
		return this.targetSdkVersion;
	}

	public void setTargetSdkVersion(int targetSdkVersion)
	{
		this.targetSdkVersion = targetSdkVersion;
	}

	public int getMaxSdkVersion()
	{
		return this.maxSdkVersion;
	}

	public void setMaxSdkVersion(int maxSdkVersion)
	{
		this.maxSdkVersion = maxSdkVersion;
	}

	@Override
	public String toString()
	{
		return "UseSdk [minSdkVersion=" + this.minSdkVersion + ", targetSdkVersion="
				+ this.targetSdkVersion
				+ ", maxSdkVersion=" + this.maxSdkVersion + "]";
	}

	@Override
	public boolean formElementInternal(Element e)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
