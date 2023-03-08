package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class controller {
	@Autowired
	repo serviceRepository;
	@Autowired
	service service;
	@GetMapping("/getwatchlist")
	List<model>getList(){
		return serviceRepository.findAll();
	}
	@GetMapping("/getwatchlist/{id}")
	public Optional<model>getbyid(@PathVariable int id){
		return service.getName(id);
	}
	@PostMapping("/postvalue")
	public model create(@RequestBody model mov) {
	return serviceRepository.save(mov);
	}
	@PutMapping("/name")

		public String update(@RequestBody model mov)
		{
			return service.updateDetails(mov);
		}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id)
	{
		return service.deleteDetails(id);
	}

}
