package capg.SpringBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import capg.SpringBoot.entity.Greeting;
import capg.SpringBoot.entity.User;
import capg.SpringBoot.service.UserService;

@Controller
public class GreetingController {
	@Autowired
	private UserService service;
	
	@GetMapping("/greeting")
	  public String greetingForm(Model model) {
	    model.addAttribute("users", new User());
	    return "greeting";
	  }

	  @PostMapping("/greeting")
	  public String greetingSubmit(@ModelAttribute User user, Model model) {
	    model.addAttribute("greeting", user);
	    service.inserUser(user);
	    return "result";
	  }
}
