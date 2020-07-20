package com.example.microservicecompte;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.microservicecompte.dao.CompanyRepository;
import com.example.microservicecompte.entities.Company;
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceCompteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCompteApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CompanyRepository companyRepository) {
		return args->{
			Stream.of("A","b","c").forEach(cn->{
				companyRepository.save(new Company(null,cn,100+Math.random()*900));
			});
			companyRepository.findAll().forEach(System.out::println);
		};
	}
}
