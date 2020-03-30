package mum.edu.cs.cs425.demowebapps.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value= {"/","/gdm", "/home"})
	public String displayHomePage() {
		return "home/index";
	}
}
