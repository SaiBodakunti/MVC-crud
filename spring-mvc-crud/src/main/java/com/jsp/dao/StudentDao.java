package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Student;
@Component
public class StudentDao {
	@Autowired
	EntityManagerFactory entityManagerFactory;
	public Student saveStudent(Student student) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		if(student !=null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
		}
		return student;
	}
	public Student updateStudent(Student student) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student2 = entityManager.find(Student.class, student.getId());

		if (student2 != null) {
			entityTransaction.begin();
			entityManager.merge(student2);
			entityTransaction.commit();
		}

		return student2;

	}

	public Student deleteStudent(int id) {
		EntityManager  entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		Student student=entityManager.find(Student.class, id);
		if(student !=null) {
			eTransaction.begin();
			entityManager.remove(student);
			eTransaction.commit();
		}
		return student;
	}
	public Student getStudentById(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager.find(Student.class, id);
	}
	public List<Student> getAllStudent(){
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select a from Student a");
		return query.getResultList();
	}
}