package com.lizongbo.android.apk.manifestxml;

import java.io.Serializable;

import org.jdom2.Element;

/**
 * 
 * @see http://developer.android.com/guide/topics/manifest/supports-screens-element.html
 */
public class SupportsScreens extends AbstractXmlAble implements Serializable, XmlAble
{
	private boolean resizeable;
	private boolean smallScreens;
	private boolean normalScreens;
	private boolean largeScreens;
	private boolean xlargeScreens;
	private boolean anyDensity;
	private int requiresSmallestWidthDp = -1;
	private int compatibleWidthLimitDp = -1;
	private int largestWidthLimitDp = -1;

	public boolean isResizeable()
	{
		return this.resizeable;
	}

	public void setResizeable(boolean resizeable)
	{
		this.resizeable = resizeable;
	}

	public boolean isSmallScreens()
	{
		return this.smallScreens;
	}

	public void setSmallScreens(boolean smallScreens)
	{
		this.smallScreens = smallScreens;
	}

	public boolean isNormalScreens()
	{
		return this.normalScreens;
	}

	public void setNormalScreens(boolean normalScreens)
	{
		this.normalScreens = normalScreens;
	}

	public boolean isLargeScreens()
	{
		return this.largeScreens;
	}

	public void setLargeScreens(boolean largeScreens)
	{
		this.largeScreens = largeScreens;
	}

	public boolean isXlargeScreens()
	{
		return this.xlargeScreens;
	}

	public void setXlargeScreens(boolean xlargeScreens)
	{
		this.xlargeScreens = xlargeScreens;
	}

	public boolean isAnyDensity()
	{
		return this.anyDensity;
	}

	public void setAnyDensity(boolean anyDensity)
	{
		this.anyDensity = anyDensity;
	}

	public int getRequiresSmallestWidthDp()
	{
		return this.requiresSmallestWidthDp;
	}

	public void setRequiresSmallestWidthDp(int requiresSmallestWidthDp)
	{
		this.requiresSmallestWidthDp = requiresSmallestWidthDp;
	}

	public int getCompatibleWidthLimitDp()
	{
		return this.compatibleWidthLimitDp;
	}

	public void setCompatibleWidthLimitDp(int compatibleWidthLimitDp)
	{
		this.compatibleWidthLimitDp = compatibleWidthLimitDp;
	}

	public int getLargestWidthLimitDp()
	{
		return this.largestWidthLimitDp;
	}

	public void setLargestWidthLimitDp(int largestWidthLimitDp)
	{
		this.largestWidthLimitDp = largestWidthLimitDp;
	}

	@Override
	public String toString()
	{
		return "SupportsScreens [resizeable=" + this.resizeable + ", smallScreens="
				+ this.smallScreens
				+ ", normalScreens=" + this.normalScreens + ", largeScreens=" + this.largeScreens
				+ ", xlargeScreens=" + this.xlargeScreens + ", anyDensity=" + this.anyDensity
				+ ", requiresSmallestWidthDp=" + this.requiresSmallestWidthDp
				+ ", compatibleWidthLimitDp=" + this.compatibleWidthLimitDp
				+ ", largestWidthLimitDp="
				+ this.largestWidthLimitDp + "]";
	}

	@Override
	public boolean formElementInternal(Element e)
	{
		return false;
	}

}
