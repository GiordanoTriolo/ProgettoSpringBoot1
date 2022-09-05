package com.epicode.gestioneprenotazioni.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

	@Autowired
	ReservationRepository repo;
	
	public List<Reservation> findAll (){
		return (List<Reservation>) repo.findAll();
	}
	
	public Reservation findById(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	public void create(Reservation res) {
		// devo controllare che in quella data l'user abbia fatto solo una prenotazione
		// devo controllare che la prenotazione sia effettuabile, e che quindi la postazione abbia ancora posti liberi
		
		if(repo.findByUserAndDay(res.getUser().getId(), res.getReservedDay()).size() == 0 && repo.findByIdAndDay(res.getWorkstation().getId(), res.getReservedDay()).size() < res.getWorkstation().getMaxWorkers()) {
			repo.save(res);
		}
		
		repo.save(res);
	}
	
	public void modify(Reservation res) {
		repo.save(res);
	}
}
