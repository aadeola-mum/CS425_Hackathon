package mum.edu.cs.cs425.demowebapps.eregistrar.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long>{
	Optional<Student> findStudentByStudentNumber(String studentNumber);
	List<Student> findAllByLastNameLikeOrFirstNameLikeOrMiddleNameLikeOrStudentNumberLike(String lastName, String firstName, String middleName, String studentNumber);
}
