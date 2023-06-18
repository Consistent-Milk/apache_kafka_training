package com.course.kafkaproducer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.course.kafkaproducer.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Service
public class EmployeeJsonProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	// This is an important change. As java.time.LocalDate cannot be handled by jackson by default,
	// so we have to register the JavaTimeModule to the ObjectMapper so that it can handle
	// java.time.LocalDate Objects. JavaTimeModule class is fetched from jackson.datatype.jsr310,
	// which we have to add as a dependency in our project.
	private ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

	public void sendMessage(Employee emp) throws JsonProcessingException {
		var json = objectMapper.writeValueAsString(emp);
		kafkaTemplate.send("t_employee", json);
	}
}
