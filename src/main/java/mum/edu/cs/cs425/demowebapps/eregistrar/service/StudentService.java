package mum.edu.cs.cs425.demowebapps.eregistrar.service;

import java.util.List;
import java.util.Optional;

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Student;

public interface StudentService {
	public List<Student> getAll();
	public Optional<Student> get(long studentId); 
	public void delete(long studentId);
	public Student saveStudent(Student s);
	public List<Student> search(String search);
}
