package com.epicode.gestioneprenotazioni.workstation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkstationService {
	
	@Autowired
	WorkstationRepository repo;
	
	public List<Workstation> findByCityAndType (String city, WorkstationTypes type){
		return repo.findByCityAndType(city, type);
	}
	
	public List<Workstation> findAll (){
		return (List<Workstation>) repo.findAll();
	}
	
	public Workstation findById(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	public void create(Workstation station) {
		repo.save(station);
	}
	
	public void modify(Workstation station) {
		repo.save(station);
	}
}
