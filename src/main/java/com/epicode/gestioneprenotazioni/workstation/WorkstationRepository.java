package com.epicode.gestioneprenotazioni.workstation;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkstationRepository extends CrudRepository<Workstation, Integer> {
	
	@Query("SELECT w FROM Worskstation w WHERE w.building.city =:city AND w.type =:type")
	public List<Workstation> findByCityAndType(String city, WorkstationTypes type);
}
