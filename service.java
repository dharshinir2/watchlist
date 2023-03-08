package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
	@Autowired
	repo repository;
	public Optional<model>getName(int id){
		return repository.findById(id);
	}
	public String updateDetails(model mov) {
		repository.save(mov);
		return "Updated";
	}
	public String deleteDetails(int id)
	{
		repository.deleteById(id);
		return "deleted";
	}
	

}
