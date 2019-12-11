package com.jorgesoares.projetotcc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoTccApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoTccApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{}

}
