package sms.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sms.demo.entity.Student;

@Service
public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student updateStudent(Student student);
	Student getStudentById(Long id);
	
	void deleteStudentById(Long id);
}
