package mum.edu.cs.cs425.demowebapps.eregistrar.service;

import java.util.List;
import java.util.Optional;

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Supplier;

public interface SupplierService {
	public List<Supplier> getAll();
	public Optional<Supplier> get(long studentId); 
	public void delete(long studentId);
	public Supplier saveSupplier(Supplier s);
	public List<Supplier> search(String search);
}
