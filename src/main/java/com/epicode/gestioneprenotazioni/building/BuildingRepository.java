package com.epicode.gestioneprenotazioni.building;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends CrudRepository<Building, Integer> {
	
}
