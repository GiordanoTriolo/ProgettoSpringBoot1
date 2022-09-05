package com.epicode.gestioneprenotazioni.building;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BuildingConfig {

	@Bean("building")
	@Scope("prototype")
	public Building newBuilding() {
		Building building = new Building();
		return building;
	}
}
