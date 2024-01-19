package com.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymeleaf.model.User;

@Controller
public class UserController {

	@GetMapping("/variable-expression")
	public String variableExpression(Model model) {

		User user = new User("Ruchi", "Ruchi@gmail.com", "Admin", "female");

		model.addAttribute("user", user);

		return "variable-expression";
	}

	@GetMapping("/selection-expression")
	public String selectionExpression(Model model) {

		User user = new User("Ruchi", "Ruchi@gmail.com", "Admin", "female");

		model.addAttribute("user", user);

		return "selection-expression";
	}
	
	@GetMapping("/message-expression")
	public String messageExpression() {
	
		return "message-expression";
	}
	
	@GetMapping("/link-expression")
	public String linkExpression(Model model){
		
		model.addAttribute("id", 1);
		return "link-expression";
	}

	@GetMapping("/fragment-expression")
	public String fragmentExpression() {
	
		return "fragment-expression";
	}
	
	@GetMapping("/users")
	public String users(Model model) {
		
		User admin = new User("Admin","admin@gmail.com","ADMIN","MALE");
		User sam = new User("Sam","sam@gmail.com","USER","MALE");
		User jay = new User("Jay","jam@gmail.com","USER","FEMALE");
		
		List<User> users = new ArrayList<>();
		users.add(admin);
		users.add(sam);
		users.add(jay);
		
		model.addAttribute("users",users);
		
		return "users";
				
	}
	
	 
	@GetMapping("/if-unless")
	public String ifUnless(Model model) {
		
		User admin = new User("Admin","admin@gmail.com","ADMIN","MALE");
		User sam = new User("Sam","sam@gmail.com","USER","MALE");
		User jay = new User("Jay","jam@gmail.com","USER","FEMALE");
		
		List<User> users = new ArrayList<>();
		users.add(admin);
		users.add(sam);
		users.add(jay);
		
		model.addAttribute("users",users);
		
		return "if-unless";
		
	}
	
	@GetMapping("/switch-case")
	public String switchCase(Model model) {
	
		User sam = new User("Sam","sam@gmail.com","GUEST","MALE");
	
		model.addAttribute("user", sam);
		
		return "switch-case";
	}
	
	
}
