package pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pack.dao.StudentDao;
import pack.model.Student;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
   private StudentDao studentDao;
	@Transactional
	public void add(Student student) {
		
		 studentDao.add(student);

	}

	@Transactional
	public void edit(Student student) {
		
		 studentDao.edit(student);

	}

	@Transactional
	public void delete(int studentId) {
		 System.out.println("delete service");
		studentDao.delete(studentId);

	}

	@Transactional
	public Student getStudent(int studentId) {
		 
		return studentDao.getStudent(studentId);
	}

	@Transactional
	public List getAllStudent() {
		 
		return studentDao.getAllStudent();
	}

}
