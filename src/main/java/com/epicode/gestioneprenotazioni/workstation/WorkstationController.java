package com.epicode.gestioneprenotazioni.workstation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workstations")
public class WorkstationController {

	@Autowired
	private WorkstationService workstationService;
	
	@GetMapping("/stationsForCityAndType")
	public List<Workstation> findByCityAndType(@RequestParam String city, @RequestParam WorkstationTypes type){
		return workstationService.findByCityAndType(city, type);
	}
	
	@GetMapping
	public List<Workstation> findAll(){
		return workstationService.findAll();
	}
	
	@GetMapping("/{id}")
	public Workstation findById(@PathVariable Integer id) {
		return workstationService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		workstationService.delete(id);
	}

	@PostMapping
	public void crea(@RequestBody Workstation station) {
		workstationService.create(station);
	}

	@PutMapping
	public void modifica(@RequestBody Workstation station) {
		workstationService.modify(station);
	}
}
