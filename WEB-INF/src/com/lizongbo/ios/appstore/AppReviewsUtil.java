package com.lizongbo.ios.appstore;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 拉取appStore评论，参考了网上相关代码
 * 
 * @see https://gist.github.com/1878352
 * @see https://github.com/ewangke/CustomersAlsoReviewed-AppStore
 * @see https 
 *      ://github.com/futuretap/iTunesFeaturedCheck/blob/master/iTunesFeatured
 *      .pl
 * @see http 
 *      ://www.apple.com/itunes/affiliates/resources/documentation/linking-to
 *      -the-itunes-music-store.html
 * @see http://tellini.info/2011/05/scraping-mac-app-store-reviews/
 * @author lizongbo
 * 
 */
public class AppReviewsUtil {
	private static String UA = "iTunes/10.7 (Windows; Microsoft Windows 7 x64 Ultimate Edition Service Pack 1 (Build 7601)) AppleWebKit/536.26.9";
	private static String ENC = "UTF-8";
	private static Map<String, String> map = new HashMap<String, String>();

	private static String[] products[] = null;

	private static String[][] storeFrontInfo = null;

	static {
		// map.put("China", 143465);
		// map.put("Hong Kong", 143463);
		// map.put("Singapore", 143464);
		// map.put("Taiwan", 143470);
		// map.put("United States", 143441);
		// map.put("Macau", 143515);
		map.put("China", "143465-19,12");
		map.put("Hong Kong", "143463,12");
		map.put("Singapore", "143464,12");
		map.put("Taiwan", "143470,12");
		map.put("United States", "143441-1,12");
		map.put("Macau", "143462-1,12");
		map.put("Japan", "143515,12");
		map.put("Korea", "143466,12");

		/***
		 * bengin 以下是根据php提取的
		 */
		map.put("Canada", "143455-6,12");
		map.put("United States", "143441-1,12");
		map.put("Belarus", "143565,12");
		map.put("Belgium", "143446-2,12");
		map.put("Bulgaria", "143526,12");
		map.put("Croatia", "143494,12");
		map.put("Cyprus", "143557-2,12");
		map.put("Czech Republic", "143489,12");
		map.put("Denmark", "143458-2,12");
		map.put("Deutschland", "143443,12");
		map.put("Spain", "143454-8,12");
		map.put("Estonia", "143518,12");
		map.put("Finland", "143447-2,12");
		map.put("France", "143442,12");
		map.put("Greece", "143448,12");
		map.put("Hungary", "143482,12");
		map.put("Iceland", "143558,12");
		map.put("Ireland", "143449,12");
		map.put("Italia", "143450,12");
		map.put("Latvia", "143519,12");
		map.put("Lithuania", "143520,12");
		map.put("Luxembourg", "143451-2,12");
		map.put("Macedonia", "143530,12");
		map.put("Malta", "143521,12");
		map.put("Moldova", "143523,12");
		map.put("Nederland", "143452,12");
		map.put("Norway", "143457-2,12");
		map.put("sterreich", "143445,12");
		map.put("Poland", "143478,12");
		map.put("Portugal", "143453,12");
		map.put("Romania", "143487,12");
		map.put("Slovakia", "143496,12");
		map.put("Slovenia", "143499,12");
		map.put("Sverige", "143456,12");
		map.put("Switzerland", "143459-2,12");
		map.put("Turkey", "143480,12");
		map.put("United Kingdom", "143444,12");
		map.put("Россия", "143469,12");
		map.put("Algeria", "143563,12");
		map.put("Angola", "143564,12");
		map.put("Armenia", "143524,12");
		map.put("Azerbaijan", "143568,12");
		map.put("Bahrain", "143559,12");
		map.put("Botswana", "143525,12");
		map.put("Egypt", "143516,12");
		map.put("Ghana", "143573,12");
		map.put("India", "143467,12");
		map.put("Israel", "143491,12");
		map.put("Jordan", "143528,12");
		map.put("Kenya", "143529,12");
		map.put("Kuwait", "143493,12");
		map.put("Lebanon", "143497,12");
		map.put("Madagascar", "143531,12");
		map.put("Mali", "143532,12");
		map.put("Mauritius", "143533,12");
		map.put("Niger", "143534,12");
		map.put("Nigeria", "143561,12");
		map.put("Oman", "143562,12");
		map.put("Qatar", "143498,12");
		map.put("Saudi Arabia", "143479,12");
		map.put("Senegal", "143535,12");
		map.put("South Africa", "143472,12");
		map.put("Tanzania", "143572,12");
		map.put("Tunisia", "143536,12");
		map.put("UAE", "143481,12");
		map.put("Uganda", "143537,12");
		map.put("Yemen", "143571,12");
		map.put("Australia", "143460,12");
		map.put("Brunei Darussalam", "143560,12");
		map.put("China", "143465-2,12");
		map.put("Hong Kong", "143463,12");
		map.put("Indonesia", "143476,12");
		map.put("Japan", "143462-1,12");
		map.put("Kazakhstan", "143517,12");
		map.put("Macau", "143515,12");
		map.put("Malaysia", "143473,12");
		map.put("New Zealand", "143461,12");
		map.put("Pakistan", "143477,12");
		map.put("Philippines", "143474,12");
		map.put("Singapore", "143464,12");
		map.put("Sri Lanka", "143486,12");
		map.put("Taiwan", "143470,12");
		map.put("Thailand", "143475,12");
		map.put("Uzbekistan", "143566,12");
		map.put("Vietnam", "143471,12");
		map.put("Korea", "143466,12");
		map.put("Anguilla", "143538,12");
		map.put("Antigua and Barbuda", "143540,12");
		map.put("Argentina", "143505-2,12");
		map.put("Bahamas", "143539,12");
		map.put("Barbados", "143541,12");
		map.put("Belize", "143555-2,12");
		map.put("Bermuda", "143542,12");
		map.put("Bolivia", "143556-2,12");
		map.put("Brasil", "143503,12");
		map.put("British Virgin Islands", "143543,12");
		map.put("Cayman Islands", "143544,12");
		map.put("Chile", "143483-2,12");
		map.put("Colombia", "143501-2,12");
		map.put("Costa Rica", "143495-2,12");
		map.put("Dominica", "143545,12");
		map.put("Dominican Republic", "143508-2,12");
		map.put("Ecuador", "143509-2,12");
		map.put("El Salvador", "143506-2,12");
		map.put("Grenada", "143546,12");
		map.put("Guatemala", "143504-2,12");
		map.put("Guyana", "143553,12");
		map.put("Honduras", "143510-2,12");
		map.put("Jamaica", "143511,12");
		map.put("Mexico", "143468,12");
		map.put("Montserrat", "143547,12");
		map.put("Nicaragua", "143512-2,12");
		map.put("Panama", "143485-2,12");
		map.put("Paraguay", "143513-2,12");
		map.put("Peru", "143507-2,12");
		map.put("St. Kitts and Nevis", "143548,12");
		map.put("St. Lucia", "143549,12");
		map.put("St. Vincent & The Grenadines", "143550,12");
		map.put("Suriname", "143554-2,12");
		map.put("Trinidad and Tobago", "143551,12");
		map.put("Turks & Caicos", "143552,12");
		map.put("Uruguay", "143514-2,12");
		map.put("Venezuela", "143502-2,12");
		/**
		 * end
		 */

		storeFrontInfo = new String[][] { { "Algeria", "DZ", "143563" },
				{ "Angola", "AO", "143564" }, { "Anguilla", "AI", "143538" },
				{ "Antigua & Barbuda", "AG", "143540" },
				{ "Argentina", "AR", "143505" }, { "Armenia", "AM", "143524" },
				{ "Australia", "AU", "143460" }, { "Austria", "AT", "143445" },
				{ "Azerbaijan", "AZ", "143568" },
				{ "Bahrain", "BH", "143559" },
				{ "Bangladesh", "BD", "143490" },
				{ "Barbados", "BB", "143541" }, { "Belarus", "BY", "143565" },
				{ "Belgium", "BE", "143446" }, { "Belize", "BZ", "143555" },
				{ "Bermuda", "BM", "143542" }, { "Bolivia", "BO", "143556" },
				{ "Botswana", "BW", "143525" }, { "Brazil", "BR", "143503" },
				{ "British Virgin Islands", "VG", "143543" },
				{ "Brunei", "BN", "143560" }, { "Bulgaria", "BG", "143526" },
				{ "Canada", "CA", "143455" },
				{ "Cayman Islands", "KY", "143544" },
				{ "Chile", "CL", "143483" }, { "China", "CN", "143465" },
				{ "Colombia", "CO", "143501" },
				{ "Costa Rica", "CR", "143495" },
				{ "Cote D'Ivoire", "CI", "143527" },
				{ "Croatia", "HR", "143494" }, { "Cyprus", "CY", "143557" },
				{ "Czech Republic", "CZ", "143489" },
				{ "Denmark", "DK", "143458" }, { "Dominica", "DM", "143545" },
				{ "Dominican Rep.", "DO", "143508" },
				{ "Ecuador", "EC", "143509" }, { "Egypt", "EG", "143516" },
				{ "El Salvador", "SV", "143506" },
				{ "Estonia", "EE", "143518" }, { "Finland", "FI", "143447" },
				{ "France", "FR", "143442" }, { "Germany", "DE", "143443" },
				{ "Ghana", "GH", "143573" }, { "Greece", "GR", "143448" },
				{ "Grenada", "GD", "143546" }, { "Guatemala", "GT", "143504" },
				{ "Guyana", "GY", "143553" }, { "Honduras", "HN", "143510" },
				{ "Hong Kong", "HK", "143463" }, { "Hungary", "HU", "143482" },
				{ "Iceland", "IS", "143558" }, { "India", "IN", "143467" },
				{ "Indonesia", "ID", "143476" }, { "Ireland", "IE", "143449" },
				{ "Israel", "IL", "143491" }, { "Italy", "IT", "143450" },
				{ "Jamaica", "JM", "143511" }, { "Japan", "JP", "143462" },
				{ "Jordan", "JO", "143528" }, { "Kazakstan", "KZ", "143517" },
				{ "Kenya", "KE", "143529" },
				{ "Korea, Republic Of", "KR", "143466" },
				{ "Kuwait", "KW", "143493" }, { "Latvia", "LV", "143519" },
				{ "Lebanon", "LB", "143497" },
				{ "Liechtenstein", "LI", "143522" },
				{ "Lithuania", "LT", "143520" },
				{ "Luxembourg", "LU", "143451" }, { "Macau", "MO", "143515" },
				{ "Macedonia", "MK", "143530" },
				{ "Madagascar", "MG", "143531" },
				{ "Malaysia", "MY", "143473" }, { "Maldives", "MV", "143488" },
				{ "Mali", "ML", "143532" }, { "Malta", "MT", "143521" },
				{ "Mauritius", "MU", "143533" }, { "Mexico", "MX", "143468" },
				{ "Moldova, Republic Of", "MD", "143523" },
				{ "Montserrat", "MS", "143547" }, { "Nepal", "NP", "143484" },
				{ "Netherlands", "NL", "143452" },
				{ "New Zealand", "NZ", "143461" },
				{ "Nicaragua", "NI", "143512" }, { "Niger", "NE", "143534" },
				{ "Nigeria", "NG", "143561" }, { "Norway", "NO", "143457" },
				{ "Oman", "OM", "143562" }, { "Pakistan", "PK", "143477" },
				{ "Panama", "PA", "143485" }, { "Paraguay", "PY", "143513" },
				{ "Peru", "PE", "143507" }, { "Philippines", "PH", "143474" },
				{ "Poland", "PL", "143478" }, { "Portugal", "PT", "143453" },
				{ "Qatar", "QA", "143498" }, { "Romania", "RO", "143487" },
				{ "Russia", "RU", "143469" },
				{ "Saudi Arabia", "SA", "143479" },
				{ "Senegal", "SN", "143535" }, { "Serbia", "RS", "143500" },
				{ "Singapore", "SG", "143464" },
				{ "Slovakia", "SK", "143496" }, { "Slovenia", "SI", "143499" },
				{ "South Africa", "ZA", "143472" },
				{ "Spain", "ES", "143454" }, { "Sri Lanka", "LK", "143486" },
				{ "St. Kitts & Nevis", "KN", "143548" },
				{ "St. Lucia", "LC", "143549" },
				{ "St. Vincent & The Grenadines", "VC", "143550" },
				{ "Suriname", "SR", "143554" }, { "Sweden", "SE", "143456" },
				{ "Switzerland", "CH", "143459" },
				{ "Taiwan", "TW", "143470" }, { "Tanzania", "TZ", "143572" },
				{ "Thailand", "TH", "143475" },
				{ "The Bahamas", "BS", "143539" },
				{ "Trinidad & Tobago", "TT", "143551" },
				{ "Tunisia", "TN", "143536" }, { "Turkey", "TR", "143480" },
				{ "Turks & Caicos", "TC", "143552" },
				{ "Uganda", "UG", "143537" }, { "UK", "GB", "143444" },
				{ "Ukraine", "UA", "143492" },
				{ "United Arab Emirates", "AE", "143481" },
				{ "Uruguay", "UY", "143514" }, { "USA", "US", "143441" },
				{ "Uzbekistan", "UZ", "143566" },
				{ "Venezuela", "VE", "143502" }, { "Vietnam", "VN", "143471" },
				{ "Yemen", "YE", "143571" }, };

		products = new String[][] {
				// QQ 2012
				new String[] {
						"444934666",
						"https://itunes.apple.com/cn/app/qq-2012/id444934666?mt=8",
						"qq-2012" },
				// 微信
				new String[] {
						"414478124",
						"https://itunes.apple.com/cn/app/wei-xin/id414478124?mt=8",
						"wei-xin" },

				// QQ HD
				new String[] {
						"453718989",
						"https://itunes.apple.com/cn/app/qq-hd-2011/id453718989?mt=8",
						"qq-hd-2011" },
				// chrome for iPhone and iPad
				/**
				 * curl -k -v -H
				 * "Referer: https://itunes.apple.com/cn/app/chrome/id535886823?mt=8"
				 * -H "X-Apple-Store-Front: 143465-19,12" -H "X-Apple-Tz: 28800"
				 * -H
				 * "User-Agent: iTunes/10.7 (Windows; Microsoft Windows 7 x64 Ultimate Edition Service Pack 1 (Build 7601)) AppleWebKit/536.26.9"
				 * "https://itunes.apple.com/customer-reviews?displayable-kind=11&id=535886823&l=zh&update=1&appVersion=current&page=1&sort=1"
				 */
				new String[] {
						"535886823",
						"https://itunes.apple.com/cn/app/chrome/id535886823?mt=8",
						"chrome" },

		//
		};
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		System.out.println("itunes.apple.com==="
				+ InetAddress.getByName("itunes.apple.com"));
		String product[] = products[1];// qq-2012
		// String html = FileUtil.readFile("D:\\temp\\qq2012new\\China.html");
		System.out.println(storeFrontInfo.length);
		String userId = "159633516";
		String store_frontTmp = "143441" + "-1,12";
		String txtTmp = getUsersUserReviews(userId, store_frontTmp, null);
		System.out.println(store_frontTmp + "|||txtTmp=" + txtTmp);
		store_frontTmp = "143465" + "-1,12";
		txtTmp = getUsersUserReviews(userId, store_frontTmp, null);
		System.out.println(store_frontTmp + "|||txtTmp=" + txtTmp);
		if (System.currentTimeMillis() > 1) {

			for (String[] storefront : storeFrontInfo) {
				String store_front = storefront[2] + "-1,12";

				for (int pageNo = 1; pageNo < 20; pageNo++) {
					String txt = getCustomerReviews(product[0], store_front,
							pageNo, null);
					System.out.println(storefront[0] + " === " + txt);
					if (txt.length() < 1024) {// 说明已经没有评论 了，该跳出循环了
						System.out.println("no cmt for:" + product[0] + "|"
								+ storefront[0]);
						break;
					}
					String path = "D:\\temp\\" + product[2] + ".txt";
					System.out.println("path=" + path);
					parseOpinion(txt, path, storefront[0]);
					appendFile("D:\\temp\\" + product[2] + "\\"
							+ storefront[0].replaceAll(" ", "") + "_"
							+ storefront[1] + "_page_" + pageNo + ".html", ENC,
							txt);
				}

			}
			/**
			 * for (Map.Entry<String, String> e : map.entrySet()) { String
			 * store_front = e.getValue(); String txt =
			 * getCustomerReviews(product_id, store_front, 1, null);
			 * System.out.println(e.getKey() + " === " + txt);
			 * FileUtil.appendFile("D:\\temp\\" + products[0][0] + "\\" +
			 * e.getKey().replaceAll(" ", "") + ".html", ENC, txt);
			 * 
			 * }
			 */
		}
	}

	/**
	 * 
	 * @param html
	 *            评论内容
	 * @param path
	 *            路径
	 * @param country
	 *            国家名称
	 */
	private static void parseOpinion(String html, String path, String country) {
		String[] reviewStrs = html.split("<h5>");
		for (int i = 0; i < reviewStrs.length; i++) {
			String reviewStr = reviewStrs[i];
			if (!reviewStr.contains("customerReviewTitle")) {
				continue;
			}
			// System.out.println("reviewStr==" + reviewStr);
			// System.out.println("html2txt==" + html2txt(reviewStr));

			String title = getStringBetween(reviewStr,
					"customerReviewTitle\">", "</span>").replaceAll("\n", " ")
					.replaceAll("\t", " ");
			// System.out.println("cmt=" + title);
			String star = getStringBetween(reviewStr, "aria-label='", "star")
					.trim();
			// System.out.println("star=" + star);
			String msgId = getStringBetween(reviewStr, "userReviewId=", "'");
			// System.out.println("msgId=" + msgId);
			String userId = getStringBetween(reviewStr, "userProfileId=", "'");
			// System.out.println("userId=" + userId);
			String content = getStringBetween(reviewStr, "<p ", "</p>")
					.replaceAll("\n", " ").replaceAll("\t", " ") + "</p>";
			content = getStringBetween(content, ">", "</p>");
			// System.out.println("content=" + content);
			String userNick = getStringBetween(reviewStr, "reviewer\">", "</a>")
					.replaceAll("\n", " ").replaceAll("\t", " ").trim();
			// System.out.println("userNick=" + userNick);
			String versionandDay = getStringBetween(reviewStr, "reviewer\">",
					"</span>").trim();
			// System.out.println("versionandDay=" + versionandDay);
			String version = getStringBetween(versionandDay, "Version", "-")
					.trim();
			// System.out.println("version=" + version);
			String day = getStringLastBetween(versionandDay + "</span>", "- ",
					"</span>").trim();
			// System.out.println("day=" + day);
			String opinion = country
					+ "\t"
					+ (day + "\t" + version + "\t" + star + "\t" + userNick
							+ "(" + userId + ")" + "\t" + msgId + "\t" + title
							+ "\t" + content);
			System.out.println("opinion=" + opinion);
			appendFile(path, ENC, opinion);
		}
	}

	/**
	 * 和下面这个curl命令的效果一样 curl -k -v -H
	 * "Referer: https://itunes.apple.com/cn/app/qq-2012/id444934666?mt=8" -H
	 * "X-Apple-Store-Front: 143465-19,12" -H "X-Apple-Tz: 28800" -H
	 * "User-Agent: iTunes/10.7 (Windows; Microsoft Windows 7 x64 Ultimate Edition Service Pack 1 (Build 7601)) AppleWebKit/536.26.9"
	 * "https://itunes.apple.com/customer-reviews?displayable-kind=11&id=444934666&l=zh&update=1&appVersion=current&page=1&sort=1"
	 * 
	 * 
	 * @param product_id
	 * @param store_front
	 * @return
	 * @throws Exception
	 *             @
	 */
	public static String getCustomerReviews(String product_id,
			String store_front, int pageNo, String referer) throws Exception {
		pageNo = pageNo < 1 || pageNo > 500 ? 1 : pageNo;
		// GET
		// /customer-reviews?displayable-kind=11&id=444934666&update=1&page=2&sort=1
		// HTTP/1.1
		// GET
		// /customer-reviews?displayable-kind=11&id=444934666&update=1&appVersion=current&page=2&sort=1
		// HTTP/1.1
		String url = "https://itunes.apple.com/customer-reviews?displayable-kind=11&id="
				+ product_id
				// appVersion=current 有该参数则取当前版本的评论，没有该参数则取所有版本的评论
				+ "&l=zh&update=1&appVersion=current&page="
				+ pageNo
				+ "&sort=4";// sort=2是最好的评论(最高分);
							// sort=3是最重要的(最低分),sort=4是最新评论,sort=1是最有帮助的
		// https://itunes.apple.com/WebObjects/MZStore.woa/wa/customerReviews?s=143465&id=qq-2012&displayable-kind=11&sort=4
		return downloadUrl(url, store_front, UA, referer, ENC);
	}

	public static String getUsersUserReviews(String userid, String store_front,
			String referer) throws Exception {
		// 106563385
		String url = "https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewUsersUserReviews?userProfileId="
				+ userid;
		return downloadUrl(url, store_front, UA, referer, ENC);
	}

	public static String downloadUrl(String urlStr, String store_front,
			String userAgent, String referer, String encoding) throws Exception {
		System.out.println("downloadUrl for:" + urlStr + "|" + store_front
				+ "|" + userAgent + "|" + referer + "|" + encoding);
		String line = "";
		StringBuilder sb = new StringBuilder();
		HttpURLConnection httpConn = null;
		try {
			URL url = new URL(urlStr);
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(
					"proxy.lizongbo.com", 8080));
			proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(
					"127.0.0.1", 7070));
			proxy = Proxy.NO_PROXY;
			httpConn = (HttpURLConnection) url.openConnection(proxy);
			httpConn.setRequestProperty("X-Apple-Store-Front", store_front);
			if (userAgent != null) {
				httpConn.setRequestProperty("User-Agent", userAgent);
			}
			httpConn.setRequestProperty("X-Apple-Tz", "28800");
			if (referer != null) {
				httpConn.setRequestProperty("Referer", referer);
			}
			httpConn.setConnectTimeout(5000);
			httpConn.connect();
			BufferedReader in = null;
			if (httpConn.getResponseCode() != 200) {
				System.err.println("error:" + httpConn.getResponseMessage()
						+ "|" + httpConn.getResponseCode() + "|"
						+ httpConn.getHeaderFields());
				in = new BufferedReader(new InputStreamReader(
						httpConn.getErrorStream(), "UTF-8"));
			} else {
				in = new BufferedReader(new InputStreamReader(
						httpConn.getInputStream(), "UTF-8"));
			}
			while ((line = in.readLine()) != null) {
				sb.append(line);// .append('\n');
			}
			// 关闭连接
			httpConn.disconnect();
			return sb.toString();
		} catch (Exception e) {
			// 关闭连接
			httpConn.disconnect();
			System.out.println(e.getMessage());
			throw e;
		}
	}

	public static String html2txt(String s) {
		if (s != null) {
			return s.replaceAll("<.*?>", "");
		}
		return "";
	}

	public static String getStringBetween(String src, String startText,
			String endText) {
		return getStringBetween(src, startText, endText, 0);

	}

	public static String getStringBetween(String srcTxt, String startText,
			String endText, int fromIndex) {
		if (srcTxt != null && srcTxt.contains(startText)) {
			String substr = srcTxt.substring(fromIndex);
			int startIndex = substr.indexOf(startText);
			int endIndex = substr.indexOf(endText,
					startIndex + startText.length());
			if (endIndex > startIndex) {
				return substr.substring(startIndex + startText.length(),
						endIndex);

			}
		} else {
			System.out.println("getStringBetween for:fromIndex=" + fromIndex
					+ "srcTxt==null or  not contains " + startText);
		}
		return "";

	}

	public static String getStringLastBetween(String src, String startText,
			String endText) {
		if (src != null && src.contains(startText)) {
			int startIndex = src.lastIndexOf(startText);
			int endIndex = src
					.indexOf(endText, startIndex + startText.length());
			if (endIndex > startIndex) {
				return src.substring(startIndex + startText.length(), endIndex);

			}
		}
		return "";

	}
	public static boolean appendFile(String path, String encoding, String text) {
		try {
			new java.io.File(path).getParentFile().mkdirs();
			FileOutputStream fos = new FileOutputStream(path, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, encoding);
			osw.append(text).append("\r\n");
			osw.flush();
			osw.close();
			return true;
		} catch (Exception e) {
			System.err.println("error for:" + path + ",err:" + e);
		}
		return false;

	}
}
