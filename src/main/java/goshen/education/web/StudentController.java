/**
 * 
 */
package goshen.education.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.org.apache.bcel.internal.generic.NEW;

import goshen.education.Application;
import goshen.education.domain.Student;
import goshen.education.service.StudentService;
import goshen.education.weichat.Weichat;
import goshen.education.weichat.WeichatReturnCodes;
import sun.net.www.content.audio.wav;

/**
 * @author cunli
 * 2016年8月26日 下午3:28:13
 * 学生注册
 */
@Controller
public class StudentController {
	
	private static final Logger log = LoggerFactory.getLogger(StudentController.class);
	Weichat weichat = new Weichat();
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/weichatLogin")
    public String weichatLogin(HttpServletRequest request) {
		String code = request.getParameter("code");
		log.info("-------------weichatLogin--------code= ----- "+code);
		String urlStr = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code="+code+"&grant_type=authorization_code";
		String context = "";
		WeichatReturnCodes weichatReturnCodes =weichat.SendURLPost(context, urlStr);
		log.info("-------------weichatReturnCodes-------------"+weichatReturnCodes.toString());
		return "weichatLogin";
   
    }
	
	@RequestMapping("/studentRegister")
    public String studentRegister(Student student) {
		log.info("-------------getMobileNumber-------------"+student.getMobileNumber());
		studentService.studentSave(student);
		
		return "ok";
   
    }
}
