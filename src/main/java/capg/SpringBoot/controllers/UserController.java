package capg.SpringBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import capg.SpringBoot.entity.User;
import capg.SpringBoot.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/registration")
	public String getRegistrationPage(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}
	
	@PostMapping("/submitForm")
	public String register(@ModelAttribute User user, Model model) {
		service.inserUser(user);
		model.addAttribute("result", "Success");
		return "success";
	}
}
