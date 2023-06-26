package com.course.kafkaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.course.kafkaproducer.entity.FoodOrder;
import com.course.kafkaproducer.producer.FoodOrderProducer;

@SpringBootApplication
//@EnableScheduling
public class KafkaProducerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}

//	@Autowired
//	private VehicleProducer producer;

//	@Autowired
//	private EmployeeJsonProducer producer;
//
//	@Override
//	public void run(String... args) throws Exception {
//		for (int i = 0; i < 5; i++) {
//			var employee = new Employee("emp-" + i, "Employee" + i, LocalDate.now());
//			producer.sendMessage(employee);
//		}
//	}

//	Vehicle v1 = new Vehicle("My Car", 2000);

	@Autowired
	private FoodOrderProducer producer;

	FoodOrder o1 = new FoodOrder(2, "Pizza");

	@Override
	public void run(String... args) throws Exception {
		producer.sendMessage(o1);
	}
}
