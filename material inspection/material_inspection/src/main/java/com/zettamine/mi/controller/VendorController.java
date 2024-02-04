package com.zettamine.mi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zettamine.mi.entities.Vendor;
import com.zettamine.mi.service.VendorService;

@Controller
@RequestMapping("/material-inspection/vendor")
public class VendorController {
	
	private VendorService vendorService;
	
	public VendorController(VendorService vendorService) {
		super();
		this.vendorService = vendorService;
	}

	@GetMapping("/new")
	public String getNewVendor(Model model)
	{
		model.addAttribute("vendor", new Vendor());
		
		return "add-vendor";
	}
	
	@PostMapping({"/add-vendor","/edit/add-vendor"})
	public String addVendor(Vendor vendor,Model model)
	{
		System.out.println(vendor);
		
		vendorService.save(vendor);
		
		return "vendor";
	}
	
	@GetMapping("/search")
	public String getShowAll(Model model)
	{
		
		List<Vendor> allVendors = vendorService.getAll();
		
		model.addAttribute("allVendors", allVendors);
		
		return "show-vendor";
	}
	
	@GetMapping("/edit/id={id}")
	public String editVendor(@PathVariable("id") int id, Model model)
	{
		Vendor vendorById = vendorService.getById(id);
		
		model.addAttribute("vendorById", vendorById);
		
		return "add-vendor";
	}

}
