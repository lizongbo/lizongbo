package com.lizongbo.android.apk.manifestxml;

import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;

/**
 * 
 * @see http://developer.android.com/guide/topics/manifest/manifest-element.html
 */
public class Manifest extends AbstractXmlAble implements Serializable, XmlAble
{
	private String packageName = "";
	private String sharedUserId = "";
	private String sharedUserLabel = "";
	private int versionCode = Integer.MIN_VALUE;
	private String versionName = "";
	private String installLocation = "";
	private Application application = new Application();
	private List<UsesPermission> usesPermissionList = new ArrayList<UsesPermission>();
	private SupportsScreens supportsScreens = new SupportsScreens();
	private UseSdk useSdk = new UseSdk();
	/**
	 * manifest.xml的原始内容
	 */
	private String manifestXml = null;

	public String getPackageName()
	{
		return this.packageName = (this.packageName == null) ? "" : this.packageName.trim();
	}

	public UseSdk getUseSdk()
	{
		return this.useSdk;
	}

	public void setPackageName(String packageName)
	{
		this.packageName = packageName;
	}

	public String getSharedUserId()
	{
		return this.sharedUserId = (this.sharedUserId == null) ? "" : this.sharedUserId.trim();
	}

	public void setSharedUserId(String sharedUserId)
	{
		this.sharedUserId = sharedUserId;
	}

	public String getSharedUserLabel()
	{
		return this.sharedUserLabel = (this.sharedUserLabel == null) ? "" : this.sharedUserLabel
				.trim();
	}

	public void setSharedUserLabel(String sharedUserLabel)
	{
		this.sharedUserLabel = sharedUserLabel;
	}

	public int getVersionCode()
	{
		return this.versionCode;
	}

	public void setVersionCode(int versionCode)
	{
		this.versionCode = versionCode;
	}

	public String getVersionName()
	{
		return this.versionName = (this.versionName == null) ? "" : this.versionName.trim();
	}

	public void setVersionName(String versionName)
	{
		this.versionName = versionName;
	}

	public String getInstallLocation()
	{
		return this.installLocation = (this.installLocation == null) ? "" : this.installLocation
				.trim();
	}

	public void setInstallLocation(String installLocation)
	{
		this.installLocation = installLocation;
	}

	public Application getApplication()
	{
		return this.application;
	}

	public void setApplication(Application application)
	{
		this.application = application;
	}

	public List<UsesPermission> getUsesPermissionList()
	{
		return this.usesPermissionList;
	}

	public void setUsesPermissionList(List<UsesPermission> usesPermissionList)
	{
		this.usesPermissionList = usesPermissionList;
	}

	public SupportsScreens getSupportsScreens()
	{
		return this.supportsScreens;
	}

	public void setSupportsScreens(SupportsScreens supportsScreens)
	{
		this.supportsScreens = supportsScreens;
	}

	@Override
	public String getApkFilesDir()
	{
		return this.apkFilesDir = (this.apkFilesDir == null) ? "" : this.apkFilesDir.trim();
	}

	@Override
	public void setApkFilesDir(String apkFilesDir)
	{
		this.apkFilesDir = apkFilesDir;
	}

	public String getManifestXml()
	{
		return this.manifestXml = (this.manifestXml == null) ? "" : this.manifestXml.trim();
	}

	public void setManifestXml(String manifestXml)
	{
		this.manifestXml = manifestXml;
	}

	public void setUseSdk(UseSdk useSdk)
	{
		this.useSdk = useSdk;
	}

	@Override
	public String toString()
	{
		return "Manifest [packageName=" + this.packageName + ", sharedUserId=" + this.sharedUserId
				+ ", sharedUserLabel=" + this.sharedUserLabel + ", versionCode=" + this.versionCode
				+ ", versionName=" + this.versionName + ", installLocation=" + this.installLocation
				+ ", application=" + this.application + ", usesPermissionList="
				+ this.usesPermissionList
				+ ", supportsScreens=" + this.supportsScreens + ", useSdk=" + this.useSdk + "]";
	}

	public static void setAttributeValue(Object obj, Element e, String apkFilesDir)
	{
		List<Attribute> attributeList = e.getAttributes();
		for (Attribute attr : attributeList)
		{
			setAttributeValue(obj, attr, apkFilesDir);
		}
	}

	public static void setAttributeValue(Object obj, Attribute attr, String apkFilesDir)
	{
		if ((attr != null) && (obj != null))
		{
			String attrName = attr.getName();
			String propName = attrName;
			int idx = propName.indexOf("-");
			while (idx >= 0)
			{
				propName = propName.substring(0, idx)
						+ Character.toUpperCase(propName.charAt(idx + 2))
						+ propName.substring(idx + 2);

			}
			if (propName.equalsIgnoreCase("package") || propName.equalsIgnoreCase("class")
					|| propName.equalsIgnoreCase("new"))
			{// 需要绕开java的关键词
				propName = propName + "Name";
			}
			System.out.println("attrName=" + attrName + ",propName=" + propName);
			try
			{
				Field field = obj.getClass().getDeclaredField(propName);
				if (field != null)
				{
					field.setAccessible(true);
					if (field.getType().equals(int.class) || field.getType().equals(Integer.class))
					{
						field.setInt(obj, Integer.parseInt(attr.getValue().trim()));
					}
					if (field.getType().equals(String.class))
					{
						field.set(obj, getValueFromResource(attr.getValue().trim(), apkFilesDir));
					}
					if (field.getType().equals(boolean.class)
							|| field.getType().equals(Boolean.class))
					{
						field.setBoolean(obj, "true".equalsIgnoreCase(attr.getValue().trim()));
					}
				}

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		return;
	}

	@Override
	public boolean formElementInternal(Element root)
	{
		List<Element> el = root.getChildren();
		for (Element se : el)
		{
			if ("application".equals(se.getName()))
			{
				this.getApplication().setApkFilesDir(this.getApkFilesDir());
				this.getApplication().formElement(se);
			}
			if ("uses-permission".equals(se.getName()))
			{
				UsesPermission usesPermission = new UsesPermission();
				usesPermission.setApkFilesDir(this.getApkFilesDir());
				usesPermission.formElement(se);
				this.usesPermissionList.add(usesPermission);
			}
			if ("supports-screens".equals(se.getName()))
			{
				this.getSupportsScreens().setApkFilesDir(this.getApkFilesDir());
				this.getSupportsScreens().formElement(se);
			}
			if ("uses-sdk".equals(se.getName()))
			{
				this.getUseSdk().setApkFilesDir(this.getApkFilesDir());
				this.getUseSdk().formElement(se);
			}

		}
		return false;
	}

	/**
	 * 
	 * <b>功能：从资源文件里读取变量的值得</b><br>
	 * <br>
	 * <b>实现步骤：</b><br>
	 * <b>1.</b> <br>
	 * <b>2.</b> <br>
	 * 
	 * @param key
	 * @param apkFilesDir
	 * @return String
	 */
	public static String getValueFromResource(String key, String apkFilesDir)
	{
		if ((key == null) || !key.startsWith("@"))
		{
			return key;
		}
		File valuesFileDir = new File(apkFilesDir + File.separatorChar + "res"
				+ File.separatorChar + "values");
		String fileName = "strings.xml";// = key.substring(1, key.indexOf("/")) + ".xml";
		String keyName = key.substring(key.indexOf("/") + 1);
		File xmlFile = new File(valuesFileDir, fileName);
		System.out.println(xmlFile.getAbsolutePath() + ",keyName==" + keyName);
		// @string/app_name
		org.jdom2.input.SAXBuilder sb = new SAXBuilder();
		try
		{

			org.jdom2.Document doc = sb.build(xmlFile);
			org.jdom2.Element root = doc.getRootElement();
			List<Element> el = root.getChildren();
			for (Element se : el)
			{
				if ("string".equals(se.getName()) && keyName.equals(se.getAttributeValue("name")))
				{
					return se.getValue();
				}

			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return key;
	}

	public static void main(String[] args)
	{
		String apkFilePath = "E:\\apktool\\apktool1.5.1\\lizongbo_test.apk";
		String apkFilesDir = apkFilePath;
		apkFilesDir = apkFilesDir.substring(0, apkFilesDir.length() - 4);
		File manifestXmlfile = new File(apkFilesDir, "AndroidManifest.xml");
		org.jdom2.input.SAXBuilder sb = new SAXBuilder();
		try
		{

			org.jdom2.Document doc = sb.build(manifestXmlfile);
			org.jdom2.Element root = doc.getRootElement();
			Namespace ns = Namespace.getNamespace("android",
					"http://schemas.android.com/apk/res/android");// new
			// NameSpace("android","http://www.android.com/");
			String versionCode = root.getAttributeValue("versionCode", ns);
			Manifest manifest = new Manifest();
			manifest.setApkFilesDir(apkFilesDir);
			// Manifest.apkFilesDir = apkFilesDir;
			manifest.formElement(root);
			System.out.println("versionCode==" + versionCode);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
