/**
 * 
 */
package goshen.education.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import goshen.education.Application;
import goshen.education.domain.Student;
import goshen.education.service.StudentService;

/**
 * @author cunli
 * 2016年8月26日 下午3:28:13
 * 学生注册
 */
@Controller
public class StudentController {
	
	private static final Logger log = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/weichatLogin")
    public String weichatLogin() {
		
		log.info("-------------weichatLogin-------------");
		
		return "weichatLogin";
   
    }
	
	@RequestMapping("/studentRegister")
    public String studentRegister(Student student) {
		log.info("-------------getMobileNumber-------------"+student.getMobileNumber());
		studentService.studentSave(student);
		
		return "ok";
   
    }
}
