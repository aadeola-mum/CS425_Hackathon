package mum.edu.cs.cs425.demowebapps.eregistrar.repositories;

import org.springframework.data.repository.CrudRepository;

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Transcript;


public interface ITranscriptRepository extends CrudRepository<Transcript, Long> {

}
