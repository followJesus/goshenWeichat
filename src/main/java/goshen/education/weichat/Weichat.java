package goshen.education.weichat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import goshen.education.utils.Tools;


/**
 * @author cunli
 * 2016年8月23日 下午8:05:09
 * 微信
 */
public class Weichat {
private String accessToken = "oGUPkr0XC3s7JI0VnfspEXuPqWRIvgKDU--tkXac9LfCj9sp6DKKfb1rDuCsevKwa_44bcHFY4x1fstTavv_r56CsffuC5WDyecRfjLs6AkeBvZHLOP7lW_B3w2_mzOLDHIcAAAIMN";
	private  URL url;
	private  HttpURLConnection httpURLConnection;
	
//	RNJm9LTbpazPD8Swd00eExw8i58nhHXz8vzFtxuYXGQ  消息加密密钥
	
	
	/** 
	 * @return the url
	 */
	public URL getUrl() {
		return url;
	}


	/**
	 * @param url the url to set
	 */
	public void setUrl(URL url) {
		this.url = url;
	}


	/** 
	 * @return the httpURLConnection
	 */
	public HttpURLConnection getHttpURLConnection() {
		return httpURLConnection;
	}


	/**
	 * @param httpURLConnection the httpURLConnection to set
	 */
	public void setHttpURLConnection(HttpURLConnection httpURLConnection) {
		this.httpURLConnection = httpURLConnection;
	}


	
	public static void main100(String[] args) {
		
		Weichat weichat = new Weichat();
		weichat.menus();
		
//		whoareyou("oI3PGt6tW328DGa8sK_gJPsrr8Pw");
		

//		System.out.println("************accessToken= "+weichat.accessToken());
		
//		
//		System.out.println(customers(accessToken));
//		
//		String[] ids = customers(accessToken).split(",");
//		String lastIds = "";
//		for (int i = 0; i < ids.length; i++) {
//			lastIds+=ids[i].trim()+"\",\"";
//		}
//		
//		System.out.println(lastIds);
		
//		String openid = "oI3PGt5GXN1Hrt5C5nM33AXRCVew";
//		whoareyou(openid);
		
//		String mediaId = "I5EAtAGd2ge-aq5OWlsRR0zhWEeNhJwmNKtwNNl_cEBZwfe01tFyVED3-bbCaUFu";
//		String openIds = "oI3PGt6VbRrYsvGqAD-8t2qJzS0Y,oI3PGtx_NcIucQpJNw0qO5gT-An4";
//		String[] ids = openIds.split(",");
//		String lastIds = "";
//		for (int i = 0; i < ids.length; i++) {
//			lastIds+=ids[i].trim()+"\",\"";
//		}
//		String lastOpenIds = lastIds.substring(0,lastIds.length()-3);
//		
//		System.out.println(lastOpenIds);
//		
//		sendImgText(mediaId,lastIds,accessToken);
	}
	
	
	
	/**
	 * 微信菜单
	 */
	public void menus() {
		WeichatMenu weichatMenu = new WeichatMenu();//主菜单
		
//		-------------------------主菜单 1-----------------------------------
		
		WeiMenu weiMenu = new WeiMenu();//主菜单 1
		weiMenu.setName("Goshen观");
		weiMenu.setType("click");
		
		SubMenu subMenu11 = new SubMenu();//子菜单 1.1
		subMenu11.setName("创新学院介绍");
		subMenu11.setType("view");
		subMenu11.setUrl("http://mp.weixin.qq.com/s?__biz=MzI0MzQzOTg0MQ==&mid=100000003&idx=1&sn=753f18a0d4db6d50a6661a6ad33aa28d&scene=0#wechat_redirect");
		
		SubMenu subMenu12 = new SubMenu();//子菜单 1.2
		subMenu12.setName("关于高盛教育");
		subMenu12.setType("view");
		subMenu12.setUrl("http://mp.weixin.qq.com/s?__biz=MzI0MzQzOTg0MQ==&mid=100000029&idx=1&sn=772b3e381e134527b9e119ad9fb2ded9&scene=0#wechat_redirect");
		
		SubMenu subMenu13 = new SubMenu();//子菜单 1.3
		subMenu13.setName("Goshen观点");
		subMenu13.setType("view");
		subMenu13.setUrl("http://wx.goshencn.com/");
		
		SubMenu subMenu14 = new SubMenu();//子菜单 1.4
		subMenu14.setName("Goshen咨询");
		subMenu14.setType("view");
		subMenu14.setUrl("http://wx.goshencn.com/");
		
SubMenu[] subMenus1 = {subMenu11,subMenu12,subMenu13,subMenu14};
		
		weiMenu.setSub_button(subMenus1);//子菜单 1,2,3,4
		
//		-------------------------主菜单 1-----------------------------------
		
//		-------------------------主菜单 2-----------------------------------
		
		WeiMenu weiMenu2 = new WeiMenu();//主菜单 2
		weiMenu2.setName("Goshen圈");
		
		
		SubMenu subMenu21 = new SubMenu();//子菜单 2.1
		subMenu21.setName("Goshen公开课");
		subMenu21.setType("view");
		subMenu21.setUrl("http://wx.goshencn.com/");
		
		SubMenu subMenu22 = new SubMenu();//子菜单 2.2
		subMenu22.setName("Goshen学子圈");
		subMenu22.setType("view");
		subMenu22.setUrl("http://wx.goshencn.com/");
		
		SubMenu subMenu23 = new SubMenu();//子菜单 2.3
		subMenu23.setName("Goshen家长圈");
		subMenu23.setType("view");
		subMenu23.setUrl("http://v.qq.com/");
		
		SubMenu subMenu24 = new SubMenu();//子菜单 2.4
		subMenu24.setName("交友 - 学习");
		subMenu24.setType("view");
		subMenu24.setUrl("http://v.qq.com/");
		
		SubMenu[] subMenus = {subMenu21,subMenu22,subMenu23,subMenu24};
		
		weiMenu2.setSub_button(subMenus);//子菜单 1,2,3,4
		
//		-------------------------主菜单 2-----------------------------------
		
//		-------------------------主菜单 3-----------------------------------
		WeiMenu weiMenu3 = new WeiMenu();//主菜单 3
		weiMenu3.setName("Goshen人");
		weiMenu3.setType("click");
		
		SubMenu subMenu31 = new SubMenu();//子菜单 3.1
		subMenu31.setName("注册 - 加入");
		subMenu31.setType("view");
		subMenu31.setUrl("http://wx.goshencn.com/weichatLogin");
		
		SubMenu subMenu32 = new SubMenu();//子菜单 3.2
		subMenu32.setName("我的账户");
		subMenu32.setType("view");
		subMenu32.setUrl("http://wx.goshencn.com/");
		
		SubMenu subMenu33 = new SubMenu();//子菜单 3.3
		subMenu33.setName("我的二维码");
		subMenu33.setType("view");
		subMenu33.setUrl("http://wx.goshencn.com/myQrcode");
		
		SubMenu subMenu34 = new SubMenu();//子菜单 3.4
		subMenu34.setName("联系我们");
		subMenu34.setType("view");
		subMenu34.setUrl("http://mp.weixin.qq.com/s?__biz=MzI0MzQzOTg0MQ==&mid=100000029&idx=5&sn=78888945558437e44d3d1abf07b361f1&scene=0#wechat_redirect");
		
SubMenu[] subMenus3 = {subMenu31,subMenu32,subMenu33,subMenu34};
		
		weiMenu3.setSub_button(subMenus3);//子菜单 1,2,3,4
		
//		-------------------------主菜单 3-----------------------------------
		
		WeiMenu[] weiMenus = {weiMenu,weiMenu2,weiMenu3};
		weichatMenu.setButton(weiMenus);//主菜单 1，2,3
		
		
		String context = Tools.urlToJson(weichatMenu);
//		String context = Tools.toJson(weichatMenu);
		
		System.out.println("------------ "+context);
		
//		accessToken = accessToken()；//获取accessToken
		
		String urlStr=" https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+accessToken;
		
		Token token = SendURLPost(context,urlStr);
		
		String accessTokenIsInvaild = token.getErrcode();
		if ("42001".equals(accessTokenIsInvaild)) {//如果accessToken无效，重新获取
			accessToken = accessToken();
		}
		
		System.out.println("-----------微信菜单--------getErrcode---------- "+accessTokenIsInvaild);
		System.out.println("-----------微信菜单--------getErrmsg---------- "+token.getErrmsg());
	}
	
	
	
	/**
	 * 获取accessToken
	 */
	public  String accessToken(){
		String appid ="wxc1dac85ae7496586";
		String secret="87ad859bf5237b1da89399453aefa2ae";
		
		String urlStr="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+secret;	

		Token token = SendURLPost(appid,urlStr);
			
	System.out.println("--------获取token时的错误码-----7200 正常------getExpires_in------ "+token.getExpires_in());
	
		return token.getAccess_token();

	}
	
	/**
	 * @param articleId
	 * 发送信息
	 */
	public  Token SendURLPost(String context,String urlStr)  {
		 StringBuilder sb = null;
//		 String content = "";
	  try {
		url = new URL(urlStr);
		 httpURLConnection = (HttpURLConnection) url.openConnection(); // 获取连接
		  httpURLConnection.setRequestMethod("POST"); // 设置请求方法为POST, 也可以为GET
		  httpURLConnection.setDoOutput(true);

		  OutputStream os = httpURLConnection.getOutputStream();
		  os.write(context.toString().getBytes("UTF-8"));
		  os.flush();
		  os.close();

		  InputStream is = httpURLConnection.getInputStream(
				  );
		  BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
		   sb = new StringBuilder();
		  int b;
		  while ((b=br.read()) != -1) {
		   sb.append((char)b);
		  }

//		  content = new String(sb.toString().getBytes("ISO8859-1"), "utf-8");
//		  System.out.println(sb.toString());
//		sb.toString() =  {"access_token":"SpnkZdGB7Qy-cc8g1zmPiMj0eviJY72ZLimLLejeH8RGEhE8P8LQO5wayp0ehbL1VwrFtLi-Ex4u6YZPuRorsJ5pwpALY75oVrXqsd_NjedB5AHR-T8niG7uCRwTgWJ3JDRhABAWQE","expires_in":7200}
		  br.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
	  return Tools.fromJson(sb.toString(), Token.class);
	 	 }
	
	
}
