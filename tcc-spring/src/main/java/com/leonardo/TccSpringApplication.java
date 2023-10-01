package com.leonardo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.leonardo.repository.GradeRespository;
import com.leonardo.model.Grade;

@SpringBootApplication
public class TccSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TccSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(GradeRespository gradeRespository){
		return args -> {
			gradeRespository.deleteAll();

			Grade g = new Grade();
			g.setName("Teste Nome");
			g.setCidade("Teste Cidade");

			gradeRespository.save(g);
		};
	}
	
    
}
