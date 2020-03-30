package mum.edu.cs.cs425.demowebapps.eregistrar.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Product;
import mum.edu.cs.cs425.demowebapps.eregistrar.service.ProductService;
import mum.edu.cs.cs425.demowebapps.eregistrar.service.SupplierService;

@Controller
@RequestMapping(value = "/products")
public class ProductController {
	
	private ProductService productService;
	
	@Autowired
	private SupplierService supplierService;
	
	/**
	 * @param productService
	 */
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	
	
	@GetMapping(value= {"/", "/list"})
	public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        List<Product> studs = productService.getAll();
       // System.err.println(studs);
        modelAndView.addObject("products", studs);
        modelAndView.addObject("productCount", studs.size());
        modelAndView.setViewName("products/list");
        return modelAndView;
    }
	
	@GetMapping(value= {"/new"})
	public ModelAndView add() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("suppliers", supplierService.getAll());
        modelAndView.setViewName("products/new");
        return modelAndView;
    }
	
	@GetMapping(value= {"/edit/{productId}"})
	public ModelAndView edit(@PathVariable("productId") long productId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("suppliers", supplierService.getAll());
        modelAndView.addObject("product", productService.get(productId).orElse(new Product()));
        modelAndView.setViewName("products/new");
        return modelAndView;
    }
	
	@PostMapping(value= {"/save"})
	public String saveProduct(@Valid @ModelAttribute("product") Product product,
            BindingResult bindingResult, Model model) throws Exception {
		System.err.println(product);
		if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "products/new";
        }
		
        Product savedProduct = productService.saveProduct(product);
        if(savedProduct != null) {
        	return "redirect:/products/list";
        }
        return "products/new";
    }
	
	@GetMapping(value= {"/del/{productId}"})
	public String delete(@PathVariable("productId") long productId) {
		System.err.println("del entered productId: "+productId);
		productService.delete(productId);
		return "redirect:/products/list";
	}
}
