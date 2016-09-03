/**
 * 
 */
package goshen.education.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.bridge.MessageUtil;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import goshen.education.weichat.Weichat;

/**
 * @author cunli 2016年8月23日 下午2:38:17
 */
@RestController
public class WeichatController extends Weichat {

	private static final Logger log = LoggerFactory.getLogger(WeichatController.class);

	private String accessToken = "5RKYCIu7ouNKKFJbn_ShXJa8OglWLOR0qebQls0ZjaqZvuUP1s3V5V2c21mluXcKVEYoeaYsWVQQags0hnRYSb4pTu7FmeKPQlgIgYVV08-INsaPO331Q9yxzTZsldMlWNOfAAARIJ";

	public static void main100(String[] args) {
		WeichatController weichatController = new WeichatController();
		// weichatController.myQRcode();

		Weichat weichat = new Weichat();
		//
		// System.out.println("************accessToken=
		// "+weichat.accessToken());
	}

	@RequestMapping("/showMyQrCode")
	public ModelAndView showMyQrCode() {
		String projectUrl = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=gQH98DoAAAAAAAAAASxodHRwOi8vd2VpeGluLnFxLmNvbS9xL2NEcWNJZnZrUXRVNzhmQUVRUklsAAIElQvBVwMEAAAAAA==";
		return new ModelAndView("redirect:" + projectUrl);
	}

	/**
	 * @param model
	 * @return 我的二维码
	 */
	@RequestMapping("/myQrcode")
	public ModelAndView myQrcode() {

		// String scene_str = "123";
		//
		// Qrcode qrcode = new Qrcode();
		// ActionInfo action_info = new ActionInfo();
		// Scene scene = new Scene();
		// scene.setScene_str(scene_str);
		// action_info.setScene(scene);
		// qrcode.setAction_info(action_info);
		//
		// String qrcodeStr = Tools.toJson(qrcode);
		// System.out.println(qrcodeStr);
		//
		// String urlStr =
		// "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token="+accessToken();
		// Token token = SendURLPost(qrcodeStr,urlStr);
		//
		// String accessTokenIsInvaild = token.getErrcode();
		// log.info("WeichatController","-------------------------
		// "+accessTokenIsInvaild);
		// log.info("WeichatController","-------------------------
		// "+token.getTicket());

		String qrUrl = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=gQH98DoAAAAAAAAAASxodHRwOi8vd2VpeGluLnFxLmNvbS9xL2NEcWNJZnZrUXRVNzhmQUVRUklsAAIElQvBVwMEAAAAAA==";
		return new ModelAndView("redirect:" + qrUrl);
	}

	/**
	 * @param request
	 * @return 
	 */
	@RequestMapping("/chuangxinWeichat")
	public String chuangxinWeichat(HttpServletRequest request) {
		
//		------------------ 验证开发者  ------------------
		// String signature =
		// request.getParameter("signature");//微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
		// String timestamp = request.getParameter("timestamp");//时间戳
		// String nonce = request.getParameter("nonce");//随机数
		// String echostr = request.getParameter("echostr");//随机字符串
		//
		// return echostr;
//		------------------ 验证开发者  ------------------
		
		
		
		
		
		
		
		
		
		
		
		
//		------------------ 接收微信消息  ------------------
		// xml格式的消息数据
		String respXml = null;
		// 默认返回的文本消息内容
		String respContent = "未知的消息类型！";
		// 调用parseXml方法解析请求消息
		Map<String, String> requestMap = parseXml(request);
		// 发送方帐号
		String fromUserName = requestMap.get("FromUserName");
		// 开发者微信号
		String toUserName = requestMap.get("ToUserName");
		// 消息类型
		String msgType = requestMap.get("MsgType");
		
		
				String Ticket = requestMap.get("Ticket");
				String EventKey = requestMap.get("EventKey");
				String Event = requestMap.get("Event");
				String CreateTime = requestMap.get("CreateTime");
				
				
				System.out.println("---------------toUserName----------------- "+toUserName);
				System.out.println("-----------------fromUserName--------------- "+fromUserName);
				System.out.println("----------------CreateTime---------------- "+CreateTime);
				System.out.println("-----------------msgType--------------- "+msgType);
				
				System.out.println("--------------------Ticket------------ "+Ticket);
				System.out.println("************************************************* ");
				
				System.out.println("-----------------Event--------------- "+Event);
				System.out.println("-------------------EventKey------------- "+EventKey);
				if ("subscribe".equals(Event)) {
					System.out.println("-----------------没 关注--------------- ");
				}else if("SCAN".equals(Event)){
					System.out.println("-----------------已 关注--------------- ");
				}else {
					System.out.println("-----------------other--------------- ");
				}
				
				System.out.println("\n\n");
				System.out.println("-----------------requestMap--------------- "+requestMap.toString());
				System.out.println("\n\n");
				

		return respXml;

	}

	/**
	 * 解析微信发来的请求（XML）
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Map parseXml(HttpServletRequest request) {
		// 将解析结果存储在HashMap中
		Map<String, String> map = new HashMap();
		SAXReader reader = new SAXReader();
		Document document = null;
		InputStream inputStream = null;
		try {
			// 从request中取得输入流
			inputStream = request.getInputStream();
			// 读取输入流
			document = reader.read(inputStream);

			// 得到xml根元素
			Element root = document.getRootElement();
			// 得到根元素的所有子节点
			List<Element> elementList = root.elements();

			// 遍历所有子节点
			for (Element e : elementList) {
				map.put(e.getName(), e.getText());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// 释放资源
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			inputStream = null;
		}

		return map;
	}

}
