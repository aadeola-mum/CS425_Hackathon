package mum.edu.cs.cs425.demowebapps.eregistrar.service;

import java.util.List;
import java.util.Optional;

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Product;

public interface ProductService {
	public List<Product> getAll();
	public Optional<Product> get(long studentId); 
	public void delete(long studentId);
	public Product saveProduct(Product s);
	public List<Product> search(String search);
}
