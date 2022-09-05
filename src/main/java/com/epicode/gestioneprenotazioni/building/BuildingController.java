package com.epicode.gestioneprenotazioni.building;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buildings")
public class BuildingController {

	@Autowired
	private BuildingService buildingService;
	
	@GetMapping
	public List<Building> findAll() {
		return buildingService.findAll();
	}

	@GetMapping("/{id}")
	public Building findById(@PathVariable Integer id) {
		return buildingService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		buildingService.delete(id);
	}

	@PostMapping
	public void create(@RequestBody Building building) {
		buildingService.create(building);
	}

	@PutMapping
	public void modify(@RequestBody Building building) {
		buildingService.modify(building);
	}
}
