package pack.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pack.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory session;
	@Override
	public void add(Student student) {
		
		session.getCurrentSession().save(student);
		 
	}

	@Override
	public void edit(Student student) {
		
		 session.getCurrentSession().update(student);

	}

	@Override
	public void delete(int studentId) {
		 System.out.println("delete dao");
		session.getCurrentSession().delete(getStudent(studentId));

	}

	@Override
	public Student getStudent(int studentId) {
		 
		return (Student) session.getCurrentSession().get(Student.class, studentId);
	}

	@Override
	public List getAllStudent() {
		 
		return session.getCurrentSession().createQuery("from Student").list();
	}

}
