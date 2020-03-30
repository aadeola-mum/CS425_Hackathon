package mum.edu.cs.cs425.demowebapps.eregistrar.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Supplier;
import mum.edu.cs.cs425.demowebapps.eregistrar.repositories.SupplierRepository;
import mum.edu.cs.cs425.demowebapps.eregistrar.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	private SupplierRepository supplierRepo;

	@Override
	public List<Supplier> getAll() {
		// TODO Auto-generated method stub
		return supplierRepo.findAll();
	}

	@Override
	public Optional<Supplier> get(long supplierId) {
		// TODO Auto-generated method stub
		return supplierRepo.findById(supplierId);
	}

	@Override
	public void delete(long supplierId) {
		// TODO Auto-generated method stub
		supplierRepo.deleteById(supplierId);
	}

	@Override
	public Supplier saveSupplier(Supplier s) {
		// TODO Auto-generated method stub
		return supplierRepo.save(s);
	}

	@Override
	public List<Supplier> search(String search) {
		search = "%"+search+"%";
		return null;// supplierRepo.findAllByLastNameLikeOrFirstNameLikeOrMiddleNameLikeOrSupplierNumberLike(search, search,search, search);
	}

}
