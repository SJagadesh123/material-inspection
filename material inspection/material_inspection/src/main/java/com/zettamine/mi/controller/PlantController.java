package com.zettamine.mi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zettamine.mi.entities.Plant;
import com.zettamine.mi.entities.Vendor;
import com.zettamine.mi.service.PlantService;
import com.zettamine.mi.service.VendorService;

@Controller
@RequestMapping("/material-inspection/plant")
public class PlantController {
	
	private PlantService plantService;
	
	public PlantController(PlantService plantService) {
		super();
		this.plantService = plantService;
	}

	@GetMapping("/new")
	public String getNewPlant(Model model)
	{
		model.addAttribute("plant", new Plant());
		
		return "add-plant";
	}
	
	@PostMapping({"/add-plant","/edit/add-plant"})
	public String addPlant(Plant plant,Model model)
	{
		System.out.println(plant);
		
		plantService.save(plant);
		
		return "plant";
	}
	
	@GetMapping("/search")
	public String getShowAll(Model model)
	{
		
		List<Plant> allPlants = plantService.getAll();
		
		model.addAttribute("allPlants", allPlants);
		
		return "show-plant";
	}
	
	@GetMapping("/edit/id={id}")
	public String editPlant(@PathVariable("id") String id, Model model)
	{
		Plant plantById = plantService.getByPlantId(id);
		
		model.addAttribute("plantById", plantById);
		
		return "add-plant";
	}
	
	@GetMapping("/delete/id={id}")
	public String deletePlant(@PathVariable("id") String id, Model model)
	{
		Plant plantById = plantService.getByPlantId(id);
		
		plantById.setStatus("inactive");
		
		plantService.save(plantById);
		
		
		return "redirect:/material-inspection/plant/search";
	}

}
