/**
 * 
 */
package goshen.education.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import goshen.education.domain.Student;
import goshen.education.repository.StudentRepository;

/**
 * @author cunli
 * 2016年8月26日 下午3:25:24
 */
@Transactional
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	/* (non-Javadoc)
	 * @see goshen.education.service.StudentService#studentSave(goshen.education.domain.Student)
	 */
	@Override
	public boolean studentSave(Student student) {
		student = studentRepository.save(student);
		boolean saved = false;
		if (student != null) {
			saved = true;
		}
		return saved;
	}

}
