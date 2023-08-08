package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;
@Component
public class StudentService {
	@Autowired
	StudentDao dao;
	public Student saveStudent(Student student) {
		return dao.saveStudent(student);
	}
	public Student updateStudent(Student student) {
		return dao.updateStudent(student);
	}
	public Student deleteStudent(int id) {
		return dao.deleteStudent(id);
	}
	public Student getStudentById(int id) {
		return dao.getStudentById(id);
	}
	public List<Student> getAllStudent(){
		return dao.getAllStudent();
	}
}