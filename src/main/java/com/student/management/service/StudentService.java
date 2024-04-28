package com.student.management.service;

import java.util.List;

import com.student.management.entity.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student saveStudent(Student student);
	
	public Student getStudentById(Long id);
	
	public Student updateStudent(Student student);
	
	public void deleteStudentById(Long id);
}
