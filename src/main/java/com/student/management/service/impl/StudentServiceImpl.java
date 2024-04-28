package com.student.management.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.entity.Student;
import com.student.management.repository.StudentRepository;
import com.student.management.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {     
		List<Student> studentList = studentRepository.findAll();
		return studentList;
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);	
	}

	@Override
	public Student getStudentById(Long id) {
		Student studentById = studentRepository.findById(id).get();
		return studentById;
	}

	@Override
	public Student updateStudent(Student student) {	
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);	
	}
}
