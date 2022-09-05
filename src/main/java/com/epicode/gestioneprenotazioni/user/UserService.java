package com.epicode.gestioneprenotazioni.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
	@Autowired
	UserRepository repo;
	
	public List<User> findAll(){
		return (List<User>) repo.findAll();
	}
	
	public User findById(Integer id) {
		return repo.findById(id).get();
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

	public void create(User user) {
		repo.save(user);
	}

	public void modify(User user) {
		repo.save(user);
	}
}
