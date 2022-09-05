package com.epicode.gestioneprenotazioni.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/reservations")
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	
	@GetMapping
	public List<Reservation> findAll() {
		return reservationService.findAll();
	}

	@GetMapping("/{id}")
	public Reservation findById(@PathVariable Integer id) {
		return reservationService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		reservationService.delete(id);
	}

	@PostMapping
	public void create(@RequestBody Reservation res) {
		reservationService.create(res);
	}

	@PutMapping
	public void modifica(@RequestBody Reservation res) {
		reservationService.modify(res);
	}
}
