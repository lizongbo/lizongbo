package com.lizongbo.ios.infoplist;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import com.dd.plist.BinaryPropertyListParser;
import com.dd.plist.NSArray;
import com.dd.plist.NSDictionary;
import com.dd.plist.NSObject;

public class PlistDemo
{
	public static final String INFOPLIST_FILE_NAME = "Info.plist";

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception
	{
		String ipaFilePath = "d:\\temp\\lizongbo_test.ipa";
		InputStream is = getPlistFile(ipaFilePath);
		if (is != null)
		{
			com.dd.plist.NSDictionary nsd = (NSDictionary) BinaryPropertyListParser.parse(is);
			// nsd.objectForKey(key)
			System.out.println("toXMLPropertyList==" + nsd.toXMLPropertyList());
			System.out.println(Arrays.toString(nsd.allKeys()));
			InformationPropertyList info = toInfoPlist(nsd);
			System.out.println(info.toString().replace(',', '\n'));
		}

	}

	public static InputStream getPlistFile(String ipaFilePath)
			throws IOException
	{
		File ipaFile = new File(ipaFilePath);
		ZipFile zip = new ZipFile(ipaFile);
		Enumeration<? extends ZipEntry> entries = zip.entries();
		while (entries.hasMoreElements())
		{
			ZipEntry entry = entries.nextElement();
			String entryName = entry.getName();
			if (entryName.endsWith("/" + INFOPLIST_FILE_NAME))
			{
				System.out.println(entryName);
				return zip.getInputStream(entry);
			}
		}
		return null;
	}

	private static InformationPropertyList toInfoPlist(NSDictionary nsd)
	{
		InformationPropertyList info = new InformationPropertyList();
		if (nsd != null)
		{
			for (String key : nsd.allKeys())
			{
				String propName = key.substring(0, 2).toLowerCase() + key.substring(2);
				NSObject nso = nsd.objectForKey(key);
				if (!com.dd.plist.NSString.class.equals(nso.getClass()))
				{
					System.out.println(key + "||" + nso.getClass());
				}
				try
				{
					Field field = info.getClass().getDeclaredField(propName);
					if (field != null)
					{
						field.setAccessible(true);
						System.out.println(field + "||getType==" + field.getType());
						if (field.getType().equals(int.class)
								|| field.getType().equals(Integer.class))
						{
							field.setInt(info, Integer.parseInt(nso.toString().trim()));
						}
						if (field.getType().equals(String.class))
						{
							field.set(info, nso.toString().trim());
						}
						if (field.getType().equals(boolean.class)
								|| field.getType().equals(Boolean.class))
						{
							field.setBoolean(info, "true".equalsIgnoreCase(nso.toString().trim()));
						}
						if (field.getType().equals(List.class)
								&& (nso instanceof NSArray))
						{
							if ("cfBundleURLTypes".equals(field.getName()))
							{
								NSArray nsa = (NSArray) nso;
								List<CFBundleURLType> list = new ArrayList<CFBundleURLType>();
								for (NSObject n : nsa.getArray())
								{
									if (n instanceof NSDictionary)
									{
										NSDictionary d = (NSDictionary) n;
										CFBundleURLType cfBundleURLType = new CFBundleURLType();
										if (d.objectForKey(
												"CFBundleURLName") != null)
										{
											cfBundleURLType.setCfBundleTypeRole(d.objectForKey(
													"CFBundleURLName").toString());
										}
										if (d.objectForKey(
												"CFBundleURLIconFile") != null)
										{
											cfBundleURLType.setCfBundleURLIconFile(d.objectForKey(
													"CFBundleURLIconFile").toString());
										}
										if (d.objectForKey(
												"CFBundleURLName") != null)
										{
											cfBundleURLType.setCfBundleURLName(d.objectForKey(
													"CFBundleURLName").toString());
										}
										if ((d.objectForKey(
												"CFBundleURLSchemes") != null)
												&& d.objectForKey(
														"CFBundleURLSchemes").getClass()
														.equals(NSArray.class))
										{
											List<String> cfBundleURLSchemes = new ArrayList<String>();
											NSArray a = (NSArray) d.objectForKey(
													"CFBundleURLSchemes");
											for (NSObject ntmp : a.getArray())
											{
												cfBundleURLSchemes.add(ntmp.toString());
											}
											cfBundleURLType
													.setCfBundleURLSchemes(cfBundleURLSchemes);
										}
										list.add(cfBundleURLType);
									}
								}
								field.set(info, list);

							}
							else
							{
								NSArray nsa = (NSArray) nso;
								List<String> list = new ArrayList<String>();
								for (NSObject n : nsa.getArray())
								{
									list.add(n.toString());
								}
								field.set(info, list);
							}
						}
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		return info;

	}
}
