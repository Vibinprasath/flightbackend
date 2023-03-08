 package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.FlightService;
import com.example.demo.models.Flight;
import com.example.demo.repositories.FlightRepo;

@RestController
@CrossOrigin
public class FlightController {
	@Autowired
	FlightRepo repo;
	@Autowired
	FlightService service;
	
	@GetMapping("/get")
	List<Flight> gett()
	{
		return repo.findAll();
	}
	@PostMapping("/post")
	public Flight post(@RequestBody Flight val) {
		return service.Posting(val);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id){
		return service.Deleting(id);
	}
	@PutMapping("/put")
	public String put(@RequestBody Flight id)
	{
		return service.Putting(id);
	}

	
}
