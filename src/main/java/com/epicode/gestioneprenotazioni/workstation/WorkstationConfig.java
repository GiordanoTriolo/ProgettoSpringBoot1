package com.epicode.gestioneprenotazioni.workstation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class WorkstationConfig {

	@Bean("private")
	@Scope("prototype")
	public Workstation newPrivateStation() {
		
		Workstation station = new Workstation();
		
		station.setDescription("Single private desk");
		station.setType(WorkstationTypes.PRIVATE);
		station.setMaxWorkers(1);
		
		return station;
	}
	
	@Bean("openspace")
	@Scope("prototype")
	public Workstation newOpenSpaceStation() {
		
		Workstation station = new Workstation();
		
		station.setDescription("Openspace tables for groups of people");
		station.setType(WorkstationTypes.OPEN_SPACE);
		station.setMaxWorkers(6);
		
		return station;
	}
	
	@Bean("meeting")
	@Scope("prototype")
	public Workstation newMeetingStation() {
		
		Workstation station = new Workstation();
		
		station.setDescription("Meeting room");
		station.setType(WorkstationTypes.MEETING_ROOM);
		station.setMaxWorkers(20);
		
		return station;
	}
}
