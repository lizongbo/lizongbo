package com.lizongbo.ios.apns;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javapns.communication.exceptions.CommunicationException;
import javapns.communication.exceptions.KeystoreException;
import javapns.devices.implementations.basic.BasicDevice;
import javapns.notification.AppleNotificationServer;
import javapns.notification.AppleNotificationServerBasicImpl;
import javapns.notification.PushNotificationManager;
import javapns.notification.PushNotificationPayload;

public class IOSPushSendTest
{

	/**
	 * <b>功能：</b><br>
	 * <br>
	 * 
	 * @param args
	 *        void
	 */
	public static void main(String[] args) throws KeystoreException, CommunicationException,
			KeyStoreException, NoSuchAlgorithmException, CertificateException,
			FileNotFoundException, IOException
	{
		String p12file = "/apns_test.p12";
		String deviceToken = "31a5f770 1f5308af 21f3238e ad1735f9 3409ee05 c87c571d 25469f3b 6c9a7322";
		deviceToken = org.apache.commons.lang.StringUtils.deleteWhitespace(deviceToken);
		BasicDevice device = new BasicDevice();
		device.setToken(deviceToken);
		PushNotificationPayload payload = PushNotificationPayload.combined("test发个iOS push",
				3, "default");
		System.out.println(payload.toString());
		String keypath = IOSPushSendTest.class.getResource(p12file).getFile();
		System.out.println("keypath==" + keypath);
		AppleNotificationServer server = new AppleNotificationServerBasicImpl(
				keypath, null, false);
		// server.setProxy("web-proxy.lizongbo.com", 8080);
		PushNotificationManager pushNotificationManager = new PushNotificationManager();
		pushNotificationManager.initializeConnection(server);
		pushNotificationManager.setMapSizeLimit(10);
		pushNotificationManager.setRetryAttempts(10);
		pushNotificationManager.sendNotification(device, payload, true);
		System.out.println("keypath==" + keypath);

	}
}
