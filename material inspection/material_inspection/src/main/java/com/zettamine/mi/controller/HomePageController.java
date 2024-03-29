package com.zettamine.mi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/material-inspection")
public class HomePageController {

	@GetMapping("/home-page")
	public String forwardToHome(Model model) {
		return "home-page";
	}

	@GetMapping("/vendor")
	public String forwardToVendor(Model model) {
		return "vendor";
	}

	@GetMapping("/plant")
	public String forwardToPlant(Model model) {
		return "plant";
	}

	@GetMapping("/material")
	public String forwardToVendorMaterial(Model model) {
		return "material";
	}

	@GetMapping("/inspection")
	public String forwardInspection(Model model) {
		return "inspection";
	}

}
