package com.example.microservicecompte.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.microservicecompte.entities.Company;
//using the annotation @RepositoryRestResource to get ride of recreating my own crud rest function
// the JpaRepositry is the interface on behalf of making the communication with the BD 
@RepositoryRestResource
public interface CompanyRepository extends JpaRepository<Company,Long> {

}
