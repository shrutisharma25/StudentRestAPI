package com.javaprojects.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaprojects.dao.StudentRepository;
import com.javaprojects.entity.Student;

@Component
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	//GET ALL STUDENTS
	public List<Student> getAllStudents(){
		List<Student> list = (List<Student>)this.studentRepository.findAll();
		return list;
	}

	//ADD THE STUDENT DETAIL
	public Student addStudent(Student b) {
		Student student = studentRepository.save(b);
		return student;
	}

	//GET STUDENT DETAILS OF PARTICULAR ID
	public Student getStudentById(int id){
		Student student =null;
		try {
			this.studentRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	//FOR DELEING STUDENT DETAILS
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}

	//FOR UPDATING THE STUDENT DETAIL
	public void updateStudent(Student student, int studentId) {
		student.setSId(studentId);
		studentRepository.save(student);
	}

}
