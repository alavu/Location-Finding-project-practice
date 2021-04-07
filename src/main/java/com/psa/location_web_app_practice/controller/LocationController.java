package com.psa.location_web_app_practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psa.location_web_app_practice.entities.Location;
import com.psa.location_web_app_practice.repositories.LocationRepository;

@Controller
public class LocationController {
	@Autowired
	private LocationRepository locationRepo;
	@RequestMapping("/showLocation")
	public String showLocation() {
		return "showLocation";
	}
	@RequestMapping("/saveLoc")
	public String saveLoc(@ModelAttribute("location")Location location,ModelMap modelMap) {
		locationRepo.save(location);
		modelMap.addAttribute("msg", "Location Saved!!");
		return "showLocation";	
	}
	@RequestMapping("/getLocations")
	public String getLocation(ModelMap modelMap) {
		List<Location> locations = locationRepo.findAll();
		modelMap.addAttribute("locations",locations);
		return "getLocations";
		
	}
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> locations = locationRepo.findAll();
		modelMap.addAttribute("locations",locations);
		return "getLocations";
	}
	

}
