package com.zettamine.mi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.zettamine.mi.entities.Material;
import com.zettamine.mi.entities.MaterialCharacteristic;
import com.zettamine.mi.service.MaterialService;

@Controller
@RequestMapping("/material-inspection/material")
public class MaterialController {
	
	private MaterialService materialService;
	
	

	public MaterialController(MaterialService materialService) {
		super();
		this.materialService = materialService;
	}

	@GetMapping("/new")
	public String getNewMaterial(Model model) {
		model.addAttribute("material", new Material());

		return "add-material";
	}

	@PostMapping({ "/add-material", "/edit/add-material" })
	public String addMaterial(Material material, RedirectAttributes redirectAttributes) {
		System.out.println(material);
		
		redirectAttributes.addFlashAttribute("material", material);

		return "redirect:/material-inspection/material/addChar";
	}

	@GetMapping("/addChar")
	public String showCharacteristicForm() {
		return "add-Characteristic";
	}

	@PostMapping("/add-Characteristic")
	public String addCharacteristic(@ModelAttribute("material") Material material) {
		
		
		System.out.println(material);
		
		List<MaterialCharacteristic> list = material.getCharacteristics();
		
		for(MaterialCharacteristic matCh : list)
		{
			matCh.setMaterial(material);
		}
		
		System.out.println(material);

		materialService.save(material);

		return "material"; 
	}

	@GetMapping("/search")
	public String getShowAll(Model model) {

		List<Material> allMaterial = materialService.getAll();
		
		model.addAttribute("allMaterial", allMaterial);

		return "show-material";
	}
}
