package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Flight {
	@Id
	private int passenger_id;
	private String name;
	private long phone_num;
	public Flight(int passenger_id, String name, long phone_num) {
		super();
		this.passenger_id = passenger_id;
		this.name = name;
		this.phone_num = phone_num;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone_num() {
		return phone_num;
	}
	public void set_Phone_num(long phone_num) {
		this.phone_num = phone_num;
	}
	

}
