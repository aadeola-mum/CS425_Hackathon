package mum.edu.cs.cs425.demowebapps.eregistrar.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long>{
	Optional<Supplier> findBySupplierNumber(String supplierNumber);
	//List<Supplier> findAllByLastNameLikeOrFirstNameLikeOrMiddleNameLikeOrStudentNumberLike(String lastName, String firstName, String middleName, String studentNumber);
}
