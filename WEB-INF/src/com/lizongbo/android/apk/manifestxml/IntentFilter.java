package com.lizongbo.android.apk.manifestxml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Element;

/**
 * 
 * @see http://developer.android.com/guide/topics/manifest/intent-filter-element.html
 */
public class IntentFilter extends AbstractXmlAble implements Serializable, XmlAble
{
	private String icon;
	private String label;
	private int priority = 0;
	private Action action = new Action();
	private List<Category> categoryList = new ArrayList<Category>();

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

	public int getPriority()
	{
		return this.priority;
	}

	public void setPriority(int priority)
	{
		this.priority = priority;
	}

	public Action getAction()
	{
		return this.action;
	}

	public void setAction(Action action)
	{
		this.action = action;
	}

	public List<Category> getCategoryList()
	{
		return this.categoryList;
	}

	public void setCategoryList(List<Category> categoryList)
	{
		this.categoryList = categoryList;
	}

	@Override
	public String toString()
	{
		return "IntentFilter [icon=" + this.icon + ", label=" + this.label + ", priority="
				+ this.priority
				+ ", action=" + this.action + ", categoryList=" + this.categoryList + "]";
	}

	@Override
	protected boolean formElementInternal(Element root)
	{
		List<Element> el = root.getChildren();
		for (Element se : el)
		{
			if ("action".equals(se.getName()))
			{
				this.getAction().setApkFilesDir(this.getApkFilesDir());
				this.getAction().formElement(se);
			}
			if ("category".equals(se.getName()))
			{
				Category category = new Category();
				category.setApkFilesDir(this.getApkFilesDir());
				category.formElement(se);
				this.categoryList.add(category);
			}
		}
		return false;
	}

}
