package mum.edu.cs.cs425.demowebapps.eregistrar.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Student;
import mum.edu.cs.cs425.demowebapps.eregistrar.repositories.IStudentRepository;
import mum.edu.cs.cs425.demowebapps.eregistrar.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private IStudentRepository studentRepo;

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Optional<Student> get(long studentId) {
		// TODO Auto-generated method stub
		return studentRepo.findById(studentId);
	}

	@Override
	public void delete(long studentId) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(studentId);
	}

	@Override
	public Student saveStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepo.save(s);
	}

	@Override
	public List<Student> search(String search) {
		search = "%"+search+"%";
		return studentRepo.findAllByLastNameLikeOrFirstNameLikeOrMiddleNameLikeOrStudentNumberLike(search, search,search, search);
	}

}
