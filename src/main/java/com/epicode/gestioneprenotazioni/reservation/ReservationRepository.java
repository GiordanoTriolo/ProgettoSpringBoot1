package com.epicode.gestioneprenotazioni.reservation;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

	@Query("SELECT r FROM Reservation r WHERE r.reservation.id =:id AND r.reservedDay =:day")
	public List<Reservation> findByIdAndDay(Integer id, LocalDate day);
	
	@Query("SELECT r FROM Reservation r WHERE r.user.id =:id AND r.reservedDay =:day")
	public List<Reservation> findByUserAndDay(Integer id, LocalDate day);
}
