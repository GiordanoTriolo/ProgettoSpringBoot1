package com.epicode.gestioneprenotazioni.building;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingService {

	@Autowired
	BuildingRepository repo;
	
	
	public List<Building> findAll() {
		return (List<Building>) repo.findAll();
	}

	public Building findById(Integer id) {
		return repo.findById(id).get();
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

	public void create(Building building) {
		repo.save(building);
	}

	public void modify(Building building) {
		repo.save(building);
	}
}
