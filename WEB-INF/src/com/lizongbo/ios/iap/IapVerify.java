package com.lizongbo.ios.iap;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

import org.bouncycastle.util.encoders.Hex;
import org.json.JSONException;
import org.json.JSONObject;

import sun.misc.BASE64Encoder;

/**
 * 
 * <b>功能：</b><br>
 * <br>
 * <b>完整路径：</b> com.lizongbo.ios.iap.IapVerify <br>
 * <b>创建日期：</b> 2013-4-9 下午2:45:42 <br>
 * 
 * @see http://xiaominghimi.blog.51cto.com/2614927/829760
 * @see http 
 *      ://developer.apple.com/library/ios/#documentation/NetworkingInternet/Conceptual/StoreKitGuide
 *      /VerifyingStoreReceipts/VerifyingStoreReceipts.html
 * @see http 
 *      ://developer.apple.com/library/ios/documentation/NetworkingInternet/Conceptual/StoreKitGuide
 *      /RenewableSubscriptions/RenewableSubscriptions.html
 * @see http://iphone.myzaker.com/l.php?l=516529e87f52e9102a000000
 * @author lizongbo
 */
public class IapVerify
{
	public static final String URL = "https://buy.itunes.apple.com/verifyReceipt";
	public static final String URL_SANDBOX = "https://sandbox.itunes.apple.com/verifyReceipt";

	public static void main(String[] args) throws JSONException, IOException
	{
		JSONObject json = verifyAppleReceiptData(recp);
		System.out.println(json.toString(4));
	}

	public static JSONObject verifyAppleReceiptData(String data)
	{
		try
		{
			JSONObject json = new JSONObject();
			data = data.replaceAll(" ", "");
			byte[] ba = Hex.decode(data);
			json.put("receipt-data", new BASE64Encoder().encode(ba));
			String rs = new String(verifyAppleReceiptData(URL, json.toString()));
			System.out.println("rs=" + rs);
			if (rs.contains("21007"))
			{// 说明该票据是沙盒环境生成的，需要到沙盒环境再校验一次。
				rs = new String(verifyAppleReceiptData(URL_SANDBOX, json.toString()));
				System.out.println("rs=" + rs);
			}
			JSONObject jsonRs = new JSONObject(rs);
			return jsonRs;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	private static byte[] verifyAppleReceiptData(String urlStr, String data)
			throws IOException
	{
		HttpURLConnection httpConn = null;
		try
		{
			URL url = new URL(urlStr);
			Proxy proxy = new Proxy(Proxy.Type.HTTP,
					new InetSocketAddress("web-proxy.lizongbo.com", 8080));
			proxy = Proxy.NO_PROXY;
			httpConn = (HttpURLConnection) url.openConnection(proxy);
			httpConn.setRequestMethod("POST");
			httpConn.setDoInput(true);
			httpConn.setDoOutput(true);
			httpConn.setAllowUserInteraction(false);
			httpConn.setUseCaches(false);
			httpConn.setConnectTimeout(10000);
			System.out.println("data=" + data);
			httpConn.getOutputStream().write(data.getBytes());
			httpConn.getOutputStream().flush();
			httpConn.getOutputStream().close();
			System.out.println(httpConn.getResponseCode());
			InputStream in = httpConn.getInputStream();
			java.io.BufferedInputStream bi = new BufferedInputStream(in);
			ByteArrayOutputStream baos = new ByteArrayOutputStream(100);
			byte[] b = new byte[8192 * 16];
			int i;
			while ((i = bi.read(b)) != -1)
			{
				baos.write(b, 0, i);
			}
			return baos.toByteArray();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{

			try
			{
				if (httpConn != null)
				{
					httpConn.disconnect();
				}
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return null;
	}

	private static String recp = "7b0a0922 7369676e 61747572 6522203d 2022416d 5863572f 75387a6f 46323833 63343478 47534453 6e554a4d 31504d41 68323757 4a726547 4b313461 775a3350 30704c36 564c6572 4a704d66 68476861 5a447367 78493933 79386b6a 4e38414f 5a564532 6b656139 32453773 47446b4d 70614469 426a7630 65326b68 4f453263 794e6b79 47595a49 52705438 516b6743 4c6f4b66 6b617672 46574274 4f595467 72417438 5043335a 75427837 386b6146 6c77417a 56363347 35555449 74774141 4144567a 43434131 4d776767 49376f41 4d434151 49434347 55556b55 335a5741 53314d41 30474353 71475349 62334451 45424251 55414d48 3878437a 414a4267 4e564241 5954416c 56544d52 4d774551 59445651 514b4441 70426348 42735a53 424a626d 4d754d53 59774a41 59445651 514c4442 31426348 42735a53 42445a58 4a306157 5a705932 46306157 39754945 46316447 6876636d 6c306554 457a4d44 45474131 55454177 77715158 42776247 55676156 5231626d 567a4946 4e306233 4a6c4945 4e6c636e 52705a6d 6c6a5958 52706232 34675158 56306147 39796158 52354d42 34584454 41354d44 59784e54 49794d44 55314e6c 6f584454 45304d44 59784e44 49794d44 55314e6c 6f775a44 456a4d43 45474131 55454177 77615548 56795932 68686332 56535a57 4e6c6158 42305132 56796447 6c6d6157 4e686447 5578477a 415a4267 4e564241 734d456b 46776347 786c4947 6c556457 356c6379 42546447 39795a54 45544d42 45474131 55454367 774b5158 42776247 55675357 356a4c6a 454c4d41 6b474131 55454268 4d435656 4d77675a 38774451 594a4b6f 5a496876 634e4151 45424251 41446759 30414d49 474a416f 4742414d 72526a46 32637434 49725364 69544368 61493067 38707776 2f636d48 7338702f 5277562f 72742f39 31584b56 684e6c34 58494269 6d4b6a51 514e6667 48734473 36796a75 2b2b4472 4b4a4537 754b7370 684d6464 4b596646 45357247 58734164 42456a42 77524978 65785465 76783348 4c454647 4174316d 6f4b7835 30396468 78746949 6444674a 76325961 56733439 4230754a 764e6479 36534d71 4e4e4c48 73444c7a 4453396f 5a484167 4d424141 476a636a 42774d41 77474131 55644577 45422f77 51434d41 41774877 59445652 306a4242 6777466f 41554e68 336f3470 32433067 45597454 4a724474 64444335 4659517a 6f774467 59445652 30504151 482f4241 51444167 65414d42 30474131 55644467 51574242 53706734 50794755 6a465068 4a584342 544d7a61 4e2b6d56 386b3954 41514267 6f71686b 69473932 4e6b4267 55424241 49464144 414e4267 6b71686b 69473977 30424151 55464141 4f434151 45414561 5362506a 746d4e34 432f4942 33514570 4b333252 78616343 44586456 58416556 52655335 46615a78 632b7438 38705150 39334269 41787664 572f3365 54534d47 59354662 6541594c 33657471 5035676d 38777246 6f6a5830 696b7956 52537451 2b2f4151 304b456a 74714230 376b4c73 39515565 38637a52 38554766 644d3145 756d562f 55677644 64344e77 4e59784c 514d6734 57545166 676b5151 56793847 585a7756 48676245 2f554336 59373035 33704758 426b3531 4e504d33 776f7868 64336753 524c7658 6a2b6c6f 48735374 63544571 65397042 44706d47 352b736b 3474772b 474b3347 4d65454e 352f2b65 31515439 6e702f4b 6c316e6a 2b614277 37433078 73793062 466e6141 64316353 53367864 6f72792f 4355764d 3667744b 736d6e4f 4f647154 65736270 30627338 736e3657 71733043 39646763 78524875 4f4d5a32 746d386e 704c556d 37617267 4f537a51 3d3d223b 0a092270 75726368 6173652d 696e666f 22203d20 2265776f 4a496d39 79615764 70626d46 734c5842 31636d4e 6f59584e 6c4c5752 68644755 7463484e 30496941 39494349 794d4445 7a4c5441 304c5441 34494445 354f6a51 794f6a55 33494546 745a584a 70593245 76544739 7a583046 755a3256 735a584d 694f776f 4a496e56 75615846 315a5331 705a4756 7564476c 6d615756 79496941 39494349 35595459 77596d45 314e6d51 78596a42 6c4e6a42 6959546c 6d596a52 694f4464 6c4e6d49 7a4e5455 774e6a67 344d7a5a 6c4f4449 79496a73 4b43534a 76636d6c"
			+
			"6e615735 68624331 30636d46 75633246 6a64476c 76626931 705a4349 67505341 694d5441 774d4441 774d4441 334d4451 7a4e6a45 304d5349 3743676b 69596e5a 79637949 67505341 694d5334 77496a73 4b43534a 30636d46 75633246 6a64476c 76626931 705a4349 67505341 694d5441 774d4441 774d4441 334d4451 7a4e6a45 304d5349 3743676b 69635856 68626e52 7064486b 69494430 67496a45 694f776f 4a496d39 79615764 70626d46 734c5842 31636d4e 6f59584e 6c4c5752 68644755 7462584d 69494430 67496a45 7a4e6a55 304e7a55 7a4e7a63 794d6a59 694f776f 4a496e56 75615846 315a5331 325a5735 6b623349 74615752 6c626e52 705a6d6c 6c636949 67505341 694d6a63 7952554a 45525549 744d7a41 33515330 304f5449 7a4c554a 47517a49 74526a55 314f5446 474d5546 474f454e 45496a73 4b43534a 77636d39 6b64574e 304c576c 6b496941 3949434a 7a614756 75633268 70587a59 774d4349 3743676b 69615852 6c625331 705a4349 67505341 694e6a49 344d7a59 774d7a59 32496a73 4b43534a 69615751 69494430 67496d4e 76625335 305a5735 6a5a5735 304c6d70 33654335 305a584e 30496a73 4b43534a 7764584a 6a614746 7a5a5331 6b595852 6c4c5731 7a496941 39494349 784d7a59 314e4463 314d7a63 334d6a49 32496a73 4b43534a 7764584a 6a614746 7a5a5331 6b595852 6c496941 39494349 794d4445 7a4c5441 304c5441 35494441 794f6a51 794f6a55 33494556 30597939 48545651 694f776f 4a496e42 31636d4e 6f59584e 6c4c5752 68644755 7463484e 30496941 39494349 794d4445 7a4c5441 304c5441 34494445 354f6a51 794f6a55 33494546 745a584a 70593245 76544739 7a583046 755a3256 735a584d 694f776f 4a496d39 79615764 70626d46 734c5842 31636d4e 6f59584e 6c4c5752 68644755 69494430 67496a49 774d544d 744d4451 744d446b 674d4449 364e4449 364e5463 67525852 6a4c3064 4e564349 37436e30 3d223b0a 0922656e 7669726f 6e6d656e 7422203d 20225361 6e64626f 78223b0a 0922706f 6422203d 20223130 30223b0a 09227369 676e696e 672d7374 61747573 22203d20 2230223b 0a7d";
}