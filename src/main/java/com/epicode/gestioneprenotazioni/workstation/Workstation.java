package com.epicode.gestioneprenotazioni.workstation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.epicode.gestioneprenotazioni.building.Building;
import com.epicode.gestioneprenotazioni.reservation.Reservation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Workstation {
	
	@Id
	private Integer id;
	
	private String description;
	private WorkstationTypes type;
	private Integer maxWorkers;
	
	@ManyToOne
	private Building building;
	
	@OneToMany
	List<Reservation> reservationList = new ArrayList<Reservation>();
}
