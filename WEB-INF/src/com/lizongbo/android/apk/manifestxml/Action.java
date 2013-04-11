package com.lizongbo.android.apk.manifestxml;

import java.io.Serializable;

import org.jdom2.Element;

/**
 * @see http://developer.android.com/guide/topics/manifest/action-element.html
 */
public class Action extends AbstractXmlAble implements Serializable, XmlAble
{
	private String name = null;

	public String getName()
	{
		return this.name = (this.name == null) ? "" : this.name.trim();
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Action [name=" + this.name + "]";
	}

	@Override
	protected boolean formElementInternal(Element root)
	{
		return false;
	}

}
