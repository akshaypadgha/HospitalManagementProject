package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.Doctor;

	@RepositoryRestResource(path="doctor")
	@CrossOrigin("") 
	public interface DoctorRepositaryInterface extends JpaRepository<Doctor, Integer>{
	    

	
}
