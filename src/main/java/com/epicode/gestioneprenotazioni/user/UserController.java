package com.epicode.gestioneprenotazioni.user;

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
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> findAll() {
		return userService.findAll();
	}

	@GetMapping("/{id}")
	public User findById(@PathVariable Integer id) {
		return userService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		userService.delete(id);
	}

	@PostMapping
	public void create(@RequestBody User user) {
		userService.create(user);
	}

	@PutMapping
	public void modifica(@RequestBody User user) {
		userService.modify(user);
	}
}
