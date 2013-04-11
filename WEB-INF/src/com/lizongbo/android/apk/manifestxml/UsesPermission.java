package com.lizongbo.android.apk.manifestxml;

import java.io.Serializable;

import org.jdom2.Element;

/**
 * 
 * @see http://developer.android.com/guide/topics/manifest/uses-permission-element.html
 */
public class UsesPermission extends AbstractXmlAble implements Serializable, XmlAble
{
	private String name = "";

	public String getName()
	{
		return this.name = (this.name == null) ? "" : this.name.trim();
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public boolean formElementInternal(Element e)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString()
	{
		return "UsesPermission [name=" + this.name + "]";
	}

}
