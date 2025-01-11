package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;

@SpringBootTest
class DemoStartApplicationTests {
	@Autowired
	private StudentRepository repository;

	@Test
	void saveStudent() {
//		System.out.println(repository);
		Student s = new Student();
		s.setId(1L);
		s.setName("mike");
		s.setEmail("ajay@gmail.com");
		s.setMobile("8577871550");
		repository.save(s);
	}
	
	@Test
	void deleteStudent() {
		repository.deleteById(1L);
	}
	@Test
	void updateRecord() {
		Student s = new Student();
		s.setId(2L);
		s.setName("ajay");
		s.setEmail("ajay@gmail.com");
		s.setMobile("8577871550");
		repository.save(s);
	}

}
