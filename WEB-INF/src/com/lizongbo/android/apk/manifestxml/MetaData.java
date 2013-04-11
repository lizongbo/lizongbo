package com.lizongbo.android.apk.manifestxml;

import java.io.Serializable;

import org.jdom2.Element;

/**
 * 
 * @see http://developer.android.com/guide/topics/manifest/meta-data-element.html
 */
public class MetaData extends AbstractXmlAble implements Serializable, XmlAble
{
	private String name = "";
	private String resource = "";
	private String value = "";

	public String getName()
	{
		return this.name = (this.name == null) ? "" : this.name.trim();
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getResource()
	{
		return this.resource = (this.resource == null) ? "" : this.resource.trim();
	}

	public void setResource(String resource)
	{
		this.resource = resource;
	}

	public String getValue()
	{
		return this.value = (this.value == null) ? "" : this.value.trim();
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		return "MetaData [name=" + this.name + ", resource=" + this.resource + ", value="
				+ this.value + "]";
	}

	@Override
	public boolean formElementInternal(Element e)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
