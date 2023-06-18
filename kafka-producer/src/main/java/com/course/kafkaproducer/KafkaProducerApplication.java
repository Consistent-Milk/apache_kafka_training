package com.course.kafkaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

//import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.course.kafkaproducer.entity.Employee;
import com.course.kafkaproducer.producer.EmployeeJsonProducer;
//import com.course.kafkaproducer.producer.HelloKafkaProducer;
//import com.course.kafkaproducer.producer.KafkaKeyProducer;

@SpringBootApplication
//@EnableScheduling
public class KafkaProducerApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}
	
	@Autowired
	private EmployeeJsonProducer producer;
	
	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 5; i++) {
			var employee = new Employee("emp-" + i, "Employee" + i, LocalDate.now());
			producer.sendMessage(employee);
		}
	}

}
