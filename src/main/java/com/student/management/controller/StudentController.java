package com.student.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.student.management.entity.Student;
import com.student.management.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public String getAllStudents(Model model){
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	@GetMapping("/students/add")
	public String addStudent(Model model){
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student){
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("students/edit/{id}")
	public String editStudent(@PathVariable("id") Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";	
	}
	
	@PostMapping("/students/{id}")
	public String upateStudent(@PathVariable("id") Long id, 
			@ModelAttribute("student") Student student, Model model) {
		
		//get student from database by Id
		Student studentById = studentService.getStudentById(id); 
		studentById.setFirstName(student.getFirstName());
		studentById.setLastName(student.getLastName());
		studentById.setEmail(student.getEmail());
		
		//save updated student
		studentService.updateStudent(studentById);
		return "redirect:/students";
	}
	
	@GetMapping("/{id}")
	public String deleteStudentById(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
	
}
