package pack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
private int studentid;
	@Column
private String firstname;
	@Column
private String lastname;
	@Column
private int yearlevel;
public Student(){}
public Student(int studentid, String firstname, String lastname, int yearlevel) {
	//super();
	this.studentid = studentid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.yearlevel = yearlevel;
}
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getYearlevel() {
	return yearlevel;
}
public void setYearlevel(int yearlevel) {
	this.yearlevel = yearlevel;
}

}
