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
		
	 @RequestMapping(value="/Editform", method=RequestMethod.GET)
	     public ModelAndView edit(@ModelAttribute("student")Student student ,
	 	        HttpServletRequest request,HttpServletResponse response)
	 {	
		 int studentid=Integer.parseInt(request.getParameter("studentid"));
	         Student student1= studentservice.getStudent(studentid);  
	         Map<String, Object> model = new HashMap<String, Object>();
	 		model.put("student", student1);
	 	return new ModelAndView("studentedit", model);
	 	
	 }

	@RequestMapping(value = "/Editsave", method = RequestMethod.GET)
	public ModelAndView editform(@ModelAttribute("student")Student student ,
	        HttpServletRequest request,HttpServletResponse response)
	{
		
		studentservice.edit(student);
		
	    return new ModelAndView("redirect:/listform");
	    	    
	}
	
	@RequestMapping(value ="/delete", method = RequestMethod.GET)
	public ModelAndView deleteArticle(@ModelAttribute("student") Student  student,
			BindingResult result) {
		
		studentservice.delete(student.getStudentid());
				
		return new ModelAndView("redirect:/listform");
	}
		 

}
