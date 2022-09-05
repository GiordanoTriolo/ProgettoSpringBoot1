package com.epicode.gestioneprenotazioni.reservation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ReservationConfig {

	@Bean("reservation")
	@Scope("prototype")
	public Reservation newReservation() {	
		Reservation res = new Reservation();
		return res;
	}
}
