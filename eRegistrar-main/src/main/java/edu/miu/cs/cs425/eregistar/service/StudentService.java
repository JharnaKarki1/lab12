package edu.miu.cs.cs425.eregistar.service;

import edu.miu.cs.cs425.eregistar.model.Student;

import java.util.List;

public interface StudentService {
	 
    abstract List<Student> getAllStudents();
    abstract Student saveStudent(Student student);
   
   // List<Student> findByFirstNameContainingIgnoreCase(String name);


}
