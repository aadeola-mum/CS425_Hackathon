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

import mum.edu.cs.cs425.demowebapps.eregistrar.model.Student;
import mum.edu.cs.cs425.demowebapps.eregistrar.service.StudentService;

/**
 * @author Adeola Adeleke
 *
 */

@Controller
@RequestMapping(value = "/students")
public class StudentController {
	
	private StudentService studentService;
	
	/**
	 * @param studentService
	 */
	@Autowired
	public StudentController(StudentService studentService) {
		//super();
		this.studentService = studentService;
	}

	@GetMapping(value= {"/", "/list"})
	public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        List<Student> studs = studentService.getAll();
       // System.err.println(studs);
        modelAndView.addObject("students", studs);
        modelAndView.addObject("studentCount", studs.size());
        modelAndView.setViewName("students/list");
        return modelAndView;
    }
	
	@GetMapping(value= {"/new"})
	public ModelAndView add() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("student", new Student());
        modelAndView.setViewName("students/new");
        return modelAndView;
    }
	
	@GetMapping(value= {"/edit/{studentId}"})
	public ModelAndView edit(@PathVariable("studentId") long studentId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("student", studentService.get(studentId).orElse(new Student()));
        modelAndView.setViewName("students/new");
        return modelAndView;
    }
	
	@PostMapping(value= {"/save"})
	public String saveStudent(@Valid @ModelAttribute("student") Student student,
            BindingResult bindingResult, Model model) throws Exception {
		System.err.println(student);
		if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "students/new";
        }
		
        Student savedStudent = studentService.saveStudent(student);
        if(savedStudent != null) {
        	return "redirect:/students/list";
        }
        return "students/new";
    }
	
	@GetMapping(value= {"/del/{studentId}"})
	public String delete(@PathVariable("studentId") long studentId) {
		System.err.println("del entered studentId: "+studentId);
		studentService.delete(studentId);
		return "redirect:/students/list";
	}
	
	@PostMapping(value= {"/search"})
	public ModelAndView searchlist(@NotEmpty @NotNull @NotBlank @RequestParam("searchText") String searchText) {
        ModelAndView modelAndView = new ModelAndView();
        List<Student> studs = studentService.search(searchText);
       // System.err.println(studs);
        modelAndView.addObject("searchText", searchText);
        modelAndView.addObject("students", studs);
        modelAndView.addObject("studentCount", studs.size());
        modelAndView.setViewName("students/list");
        return modelAndView;
    }
}
