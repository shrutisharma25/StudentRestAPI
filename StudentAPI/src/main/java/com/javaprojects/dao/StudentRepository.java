package com.javaprojects.dao;

import org.springframework.data.repository.CrudRepository;

import com.javaprojects.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	public Student findById(int id); 
	
}
