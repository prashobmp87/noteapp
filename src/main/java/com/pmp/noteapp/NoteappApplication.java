package com.pmp.noteapp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class NoteappApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteappApplication.class, args);
	}

	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}