package com.psa.location_web_app_practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psa.location_web_app_practice.entities.Location;
import com.psa.location_web_app_practice.repositories.LocationRepository;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/locations")
public class LocationRestController {
	@Autowired
	private LocationRepository locationRepo;
@GetMapping
public List<Location> getAllLocations() {
	return locationRepo.findAll();
}
@PostMapping
public Location saveLocation(@RequestBody Location location) {
	return locationRepo.save(location);
}
@DeleteMapping("/{id}")
public void deleteLocation(@PathVariable ("id") Long id) {
	locationRepo.deleteById(id);
}
@PutMapping
public Location updateLocation(@RequestBody Location location) {
	return locationRepo.save(location);
}
@GetMapping("/{id}")
public Location getLocationById(@PathVariable("id")Long id) {
	Optional<Location> findById = locationRepo.findById(id);
	Location location=findById.get();
	return location;
}
}
