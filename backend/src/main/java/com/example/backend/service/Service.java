package com.example.backend.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.backend.repository.UserRepository;

import antlr.collections.List;

import com.example.backend.entity.User;

@Service
public class Service {
	
	@Autowired
	private UserRepository user_repo;
	
	public List<User> listAll(){
		return user_repo.findAll();
	}
	
	public void save(User user) {
		user_repo.save(user);
	}
	
	public User get(long id) {
		return user_repo.findBy]Id(id).get();
	}
	
	public long delete(long id) {
		return user_repo.deleteById(id);
	}

}
