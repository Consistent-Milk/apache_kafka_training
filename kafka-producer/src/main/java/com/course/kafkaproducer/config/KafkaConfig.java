package com.course.kafkaproducer.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
@EnableKafka
public class KafkaConfig {
	
	@Autowired
	private KafkaProperties kafkaProperties;
	
	@Bean
	public ProducerFactory<String, String> producerFactory() {
		var properties = kafkaProperties.buildProducerProperties();

		properties.put(ProducerConfig.CLIENT_ID_CONFIG, "my-id");
		properties.put(ProducerConfig.BATCH_SIZE_CONFIG, "10");
		properties.put(ProducerConfig.METADATA_MAX_AGE_CONFIG, "180000");
		
		return new DefaultKafkaProducerFactory<String, String>(properties);
	}
	
	@Bean
	public KafkaTemplate<String, String> kafkaTemplate() {
		return new KafkaTemplate<String, String>(producerFactory());
	}
}
