package com.epicode.gestioneprenotazioni.runner;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.gestioneprenotazioni.building.Building;
import com.epicode.gestioneprenotazioni.building.BuildingConfig;
import com.epicode.gestioneprenotazioni.building.BuildingRepository;
import com.epicode.gestioneprenotazioni.building.BuildingService;
import com.epicode.gestioneprenotazioni.reservation.Reservation;
import com.epicode.gestioneprenotazioni.reservation.ReservationConfig;
import com.epicode.gestioneprenotazioni.reservation.ReservationRepository;
import com.epicode.gestioneprenotazioni.reservation.ReservationService;
import com.epicode.gestioneprenotazioni.user.User;
import com.epicode.gestioneprenotazioni.user.UserConfig;
import com.epicode.gestioneprenotazioni.user.UserRepository;
import com.epicode.gestioneprenotazioni.user.UserService;
import com.epicode.gestioneprenotazioni.workstation.Workstation;
import com.epicode.gestioneprenotazioni.workstation.WorkstationConfig;
import com.epicode.gestioneprenotazioni.workstation.WorkstationRepository;
import com.epicode.gestioneprenotazioni.workstation.WorkstationService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AppRunner implements ApplicationRunner {

	@Autowired
	private UserService userService;
	@Autowired
	private ReservationService reservationService;
	@Autowired
	private BuildingService buildingService;
	@Autowired
	private WorkstationService workstationService;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ReservationRepository reservationRepository;
	@Autowired
	private BuildingRepository buildingRepository;
	@Autowired
	private WorkstationRepository workstationRepository;
	@Autowired
	private BuildingConfig buildingConfig;
	@Autowired
	private UserConfig userConfig;
	@Autowired
	private ReservationConfig reservationConfig;
	@Autowired
	private WorkstationConfig workstationConfig;
	
	@Autowired
	@Qualifier("building")
	ObjectProvider<Building> building;
	
	@Autowired
	@Qualifier("user")
	ObjectProvider<User> user;
	
	@Autowired
	@Qualifier("reservation")
	ObjectProvider<Reservation> res;
	
	@Autowired
	@Qualifier("private")
	ObjectProvider<Workstation> privateStation;
	
	@Autowired
	@Qualifier("openspace")
	ObjectProvider<Workstation> openSpaceStation;
	
	@Autowired
	@Qualifier("meeting")
	ObjectProvider<Workstation> meetingStation;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("-------- AppRunner has started ----------");

		// Purtroppo ho innumerevoli errori che non riesco a risolvere, ho porvato a mettere giù un esercizio che potesse
		// avere un senso logico ma non riesco a testarlo. Sicuramente mi è stato utile per capire le cose in cui sono meno 
		// ferrato cosicchè riesca magari a chiarirle con lei nelle prossime lezioni.
		
		Building b = building.getObject();
		b.setId(1);
		b.setCity("Milano");
		b.setName("Sala studio Feltrinelli");
		b.setAddress("Piazza Gae Aulenti");
		b.addWorkstation(workstationConfig.newOpenSpaceStation());
	}

}
