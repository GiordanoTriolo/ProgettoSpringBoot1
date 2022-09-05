package com.epicode.gestioneprenotazioni.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class UserConfig {

	@Bean("user")
	@Scope("prototype")
	public User newUser() {
		User u = new User();
		return u;
	}
}
