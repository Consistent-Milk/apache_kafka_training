package com.course.kafkaproducer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;

import com.course.kafkaproducer.entity.Vehicle;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//@Service
public class VehicleProducer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	public void sendMessage(Vehicle vehicle) throws JsonProcessingException {
		var json = objectMapper.writeValueAsString(vehicle);
		
		kafkaTemplate.send("ifmt_services_error", json);
	}
}
