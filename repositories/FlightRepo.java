package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.models.Flight;

public interface FlightRepo extends JpaRepository<Flight,Integer> {

}
