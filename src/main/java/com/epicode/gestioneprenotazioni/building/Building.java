package com.epicode.gestioneprenotazioni.building;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.epicode.gestioneprenotazioni.workstation.Workstation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Building {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String address;
	private String city;
	
	@OneToMany
	private List<Workstation> buildingWorkstations = new ArrayList<Workstation>();
	
	public void addWorkstation(Workstation station) {
		buildingWorkstations.add(station);
	}
	
}
