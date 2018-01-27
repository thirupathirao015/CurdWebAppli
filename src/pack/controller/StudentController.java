package pack.controller;
 
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.Student;
import pack.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping(value ="/addform", method = RequestMethod.GET)
	public ModelAndView addArticle(@ModelAttribute("student") Student student,
			BindingResult result) {
		System.out.println("hi thirupathi");
		return new ModelAndView("addstudent");
	}
	@RequestMapping(value ="/savestudent", method = RequestMethod.POST)
	public ModelAndView saveArticle(@ModelAttribute("student") Student  student,
			BindingResult result) {
		
		studentservice.add(student);
		
		return new ModelAndView("redirect:/listform");
	}
	@RequestMapping(value ="/listform", method = RequestMethod.GET)
	public ModelAndView liststudent() 
	{
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("student",  studentservice.getAllStudent());
        
		return new ModelAndView("studentlist", model);
		
	}
	
	@RequestMapping(value = "/Editform", method = RequestMethod.GET)
	public ModelAndView edit(@ModelAttribute("student")Student student ,
	        HttpServletRequest request,HttpServletResponse response){
		
	   Map<String, Object> model = new HashMap<String, Object>();
		model.put("student",  studentservice.getAllStudent());
		 		
	    return new ModelAndView("studentedit", model);	
	}
	
	@RequestMapping(value = "/Editsave", method = RequestMethod.POST)
	public ModelAndView editform(@ModelAttribute("student")Student student ,
	        HttpServletRequest request,HttpServletResponse response){
		
		studentservice.edit(student);
		
	    return new ModelAndView("redirect:/listform");
	    	    
	
	}
	
	@RequestMapping(value ="/deleteform", method = RequestMethod.GET)
	public ModelAndView delete(@ModelAttribute("student") Student student,
			BindingResult result) {
		
		return new ModelAndView("delete");
	}
	@RequestMapping(value ="/delete", method = RequestMethod.POST)
	public ModelAndView deleteArticle(@ModelAttribute("student") Student  student,
			BindingResult result) {
	    		 
		studentservice.delete(student.getStudentid());
				
		return new ModelAndView("redirect:/listform");
	}
	 
	/*@RequestMapping("/index")
	public String setupForm(Map<String,Object>map){
		Student student = new Student();
		map.put("student", student);
		map.put("studentList", studentservice.getAllStudent());
		return "student";
		
	}
	@RequestMapping(value="/student.do",method=RequestMethod.POST)
	public String doActons(@ModelAttribute Student student,BindingResult result,@RequestParam String action,Map<String,Object>map){
		Student studentResult=new Student();
		switch(action.toLowerCase()){
		case "add":
			studentservice.add(student);
			studentResult=student;
			break;
		case "edit":
			studentservice.edit(student);
			studentResult=student;
			break;
		case "delete":
			studentservice.delete(student.getStudentId());
			studentResult=new Student();
			break;
		case "search":
			Student searchedstudent=studentservice.getStudent(student.getStudentId());
			studentResult=searchedstudent!=null ? searchedstudent : new Student();
			break;
		}
		map.put("student", studentResult);
		map.put("studentList", studentservice.getAllStudent());
		return "student";
	}*/

}
