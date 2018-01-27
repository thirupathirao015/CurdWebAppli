package pack.service;

import java.util.List;

import pack.model.Student;

public interface StudentService {
	
	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentId);
	public Student getStudent(int studentId);
	public List getAllStudent();

}
