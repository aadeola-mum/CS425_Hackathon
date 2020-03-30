package mum.edu.cs.cs425.demowebapps.eregistrar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
