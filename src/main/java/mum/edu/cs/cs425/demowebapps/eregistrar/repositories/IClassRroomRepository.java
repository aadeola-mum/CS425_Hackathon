package mum.edu.cs.cs425.demowebapps.eregistrar.repositories;

import org.springframework.data.repository.CrudRepository;

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Classroom;

public interface IClassRroomRepository extends CrudRepository<Classroom, Long> {

}
