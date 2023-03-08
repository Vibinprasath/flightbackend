package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Flight;
import com.example.demo.repositories.FlightRepo;

@Service
public class FlightService {

	@Autowired
	FlightRepo repo;
	
	public List<Flight> getal()
	{
		return repo.findAll();
	}
	public Flight Posting(@RequestBody Flight val) 
	{
		return repo.save(val);
	}
	public String Deleting(@RequestParam int id)
	{
		repo.deleteById(id);
		return "deleted";
	}
	public String Putting(@RequestBody Flight id)
	{
		repo.save(id);
		return "Updated";
	}
}
