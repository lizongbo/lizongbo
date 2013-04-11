package com.lizongbo.android.apk.manifestxml;

import org.jdom2.Element;

public abstract class AbstractXmlAble implements XmlAble
{
	protected String apkFilesDir = null;

	public String getApkFilesDir()
	{
		return apkFilesDir = (apkFilesDir == null) ? "" : apkFilesDir.trim();
	}

	public void setApkFilesDir(String apkFilesDir)
	{
		this.apkFilesDir = apkFilesDir;
	}

	@Override
	public boolean formElement(Element e)
	{
		Manifest.setAttributeValue(this, e, apkFilesDir);
		return formElementInternal(e);
	}

	protected abstract boolean formElementInternal(Element root);
}
