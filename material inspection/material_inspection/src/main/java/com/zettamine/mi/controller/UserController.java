package com.zettamine.mi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.zettamine.mi.entities.Users;
import com.zettamine.mi.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/material-inspection")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String showUserForm(Model model) {
		model.addAttribute("user", new Users());
		
		return "login";
	}

	@PostMapping("/login")
	public String processUser(@ModelAttribute("user") Users user, Model model, HttpSession session) {

		if (userService.validateUser(user)) {
			session.setAttribute("user", user);
			return "home-page";
		}
		model.addAttribute("message", "Please enter valid credentials");
		return "login";
	}
}
