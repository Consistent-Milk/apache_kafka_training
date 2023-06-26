package com.course.kafkaproducer.entity;

public class Vehicle {
	private String name;
	private int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Vehicle() {
		
	}

	public Vehicle(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
