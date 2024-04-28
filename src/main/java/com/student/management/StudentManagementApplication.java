package com.student.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.management.entity.Student;
import com.student.management.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
//        Student student1 = new Student("Nishat", "Alam", "nishat@gmail.com");
//        repo.save(student1);
//        Student student2 = new Student("Umar", "Khattab", "umar@gmail.com");
//        repo.save(student2);
//        Student student3 = new Student("Bilal", "RA", "bilal@gmail.com");
//        repo.save(student3);
		
	}

}
