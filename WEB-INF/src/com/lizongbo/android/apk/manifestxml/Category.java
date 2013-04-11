package com.lizongbo.android.apk.manifestxml;

import java.io.Serializable;

import org.jdom2.Element;

/**
 * 
 * @see http://developer.android.com/guide/topics/manifest/category-element.html
 */
public class Category extends AbstractXmlAble implements Serializable, XmlAble
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
		return "Category [name=" + this.name + "]";
	}

	@Override
	protected boolean formElementInternal(Element e)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
