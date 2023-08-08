package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.protobuf.Service;
import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService service;

	@RequestMapping("/load")
	public ModelAndView load() {
		ModelAndView andView = new ModelAndView("registerstudent.jsp");
		andView.addObject("student", new Student());
		return andView;
	}

	@RequestMapping("/savestu")
	public ModelAndView save(@ModelAttribute("student") Student student) {
		Student student2 = service.saveStudent(student);
		if (student2 != null) {
			ModelAndView andView = new ModelAndView("studenthome.jsp");
			andView.addObject("student", "data saved");
			return andView;
		} else {
			ModelAndView andView = new ModelAndView("/load");
			andView.addObject("msg", "datanot saved");
			return andView;
		}
	}
	@RequestMapping("/displaystu")
	public ModelAndView displayStudent() {
		List<Student> list=service.getAllStudent();
		if(list.size()>0) {
			ModelAndView andView=new ModelAndView("displaystudent.jsp");
			andView.addObject("list",list);
			return andView;
		}
else {
	ModelAndView andView=new ModelAndView("studenthome.jsp");
	andView.addObject("msg","no data is available in DataBase ");
	return andView;

}
	}
	@RequestMapping("/editstu")
	public ModelAndView editStudent(@RequestParam("id") int id) {
		Student student=service.getStudentById(id);
		ModelAndView andView =new ModelAndView("update.jsp");
		andView.addObject("student",student);
		return andView;
	}
	
	@RequestMapping("/updatestu")
	public ModelAndView updateStudent(@ModelAttribute("student") Student student) {
		service.updateStudent(student);
		ModelAndView andView= new ModelAndView("/displaystu");
		return andView;
	}
	
	@RequestMapping("/deletestu")
	public ModelAndView  deleteStudet(@RequestParam int id) {
		service.deleteStudent(id);
		ModelAndView andView=new ModelAndView("/displaystu");
		return andView;
	}

}
