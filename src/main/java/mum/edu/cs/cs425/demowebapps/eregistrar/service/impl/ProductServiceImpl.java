package mum.edu.cs.cs425.demowebapps.eregistrar.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Product;
import mum.edu.cs.cs425.demowebapps.eregistrar.repositories.ProductRepository;
import mum.edu.cs.cs425.demowebapps.eregistrar.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Optional<Product> get(long productId) {
		// TODO Auto-generated method stub
		return productRepo.findById(productId);
	}

	@Override
	public void delete(long productId) {
		// TODO Auto-generated method stub
		productRepo.deleteById(productId);
	}

	@Override
	public Product saveProduct(Product s) {
		// TODO Auto-generated method stub
		return productRepo.save(s);
	}

	@Override
	public List<Product> search(String search) {
		search = "%"+search+"%";
		return null;// productRepo.findAllByLastNameLikeOrFirstNameLikeOrMiddleNameLikeOrProductNumberLike(search, search,search, search);
	}

}
