package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.gen.GetAddRequest;

@SpringBootApplication
public class GenericArithmeticRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenericArithmeticRestApplication.class, args);
	}

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.gen");
		return marshaller;

	}
	@Bean
	public GetAddRequest getAddRequest(){
		return new GetAddRequest();
	}
}
