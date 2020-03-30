/**
 * 
 */
package mum.edu.cs.cs425.demowebapps.eregistrar.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Supplier;
import mum.edu.cs.cs425.demowebapps.eregistrar.service.SupplierService;


/**
 * @author Adeola Adeleke
 *
 */

@Controller
@RequestMapping(value = "/suppliers")
public class SupplierController {
	
	private SupplierService supplierService;
	
	/**
	 * @param supplierService
	 */
	@Autowired
	public SupplierController(SupplierService supplierService) {
		//super();
		this.supplierService = supplierService;
	}

	@GetMapping(value= { "/list"})
	public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        List<Supplier> studs = supplierService.getAll();
       // System.err.println(studs);
        modelAndView.addObject("suppliers", studs);
        modelAndView.addObject("supplierCount", studs.size());
        modelAndView.setViewName("suppliers/list");
        return modelAndView;
    }
	
	@GetMapping(value= {"/new"})
	public ModelAndView add() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("supplier", new Supplier());
        modelAndView.setViewName("suppliers/new");
        return modelAndView;
    }
	
	@GetMapping(value= {"/edit/{supplierId}"})
	public ModelAndView edit(@PathVariable("supplierId") long supplierId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("supplier", supplierService.get(supplierId).orElse(new Supplier()));
        modelAndView.setViewName("suppliers/new");
        return modelAndView;
    }
	
	@PostMapping(value= {"/save"})
	public String saveSupplier(@Valid @ModelAttribute("supplier") Supplier supplier,
            BindingResult bindingResult, Model model) throws Exception {
		System.err.println(supplier);
		if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "suppliers/new";
        }
		
        Supplier savedSupplier = supplierService.saveSupplier(supplier);
        if(savedSupplier != null) {
        	return "redirect:/suppliers/list";
        }
        return "suppliers/new";
    }
	
	@GetMapping(value= {"/del/{supplierId}"})
	public String delete(@PathVariable("supplierId") long supplierId) {
		System.err.println("del entered supplierId: "+supplierId);
		supplierService.delete(supplierId);
		return "redirect:/suppliers/list";
	}
	
	@PostMapping(value= {"/search"})
	public ModelAndView searchlist(@NotEmpty @NotNull @NotBlank @RequestParam("searchText") String searchText) {
        ModelAndView modelAndView = new ModelAndView();
        List<Supplier> studs = supplierService.search(searchText);
       // System.err.println(studs);
        modelAndView.addObject("searchText", searchText);
        modelAndView.addObject("suppliers", studs);
        modelAndView.addObject("supplierCount", studs.size());
        modelAndView.setViewName("suppliers/list");
        return modelAndView;
    }
}
