/**
 * 
 */
package goshen.education.repository;

import org.springframework.data.repository.CrudRepository;

import goshen.education.domain.Student;

/**
 * @author cunli
 * 2016年8月26日 下午3:22:53
 */
public interface StudentRepository extends CrudRepository<Student, Long> {

}
