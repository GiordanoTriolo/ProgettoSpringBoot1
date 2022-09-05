package com.epicode.gestioneprenotazioni.reservation;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.epicode.gestioneprenotazioni.user.User;
import com.epicode.gestioneprenotazioni.workstation.Workstation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Workstation workstation;
	
	@ManyToOne
	private User user;
	
	private LocalDate reservedDay;
}
