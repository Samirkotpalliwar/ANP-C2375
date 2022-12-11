package com.anudip.jpa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.jpa.entity.Passenger;
import com.anudip.jpa.service.PassengerService;

@RestController
//rest controller to handle all incoming request using REST APi
public class PassengerController {
	@Autowired
	private PassengerService ps;
	
	
	//saving passenger details using post mapping
	@PostMapping("/savep")
	public ResponseEntity<Passenger> saveP(@Valid @RequestBody Passenger passenger){
		return new ResponseEntity<Passenger>(ps.savePassenger(passenger),HttpStatus.CREATED);
	}
	
	
	// fetching passenger details by id using get mapping
	@GetMapping("/get/{pid}")
	public ResponseEntity<Passenger> getP(@PathVariable("pid") long pid){
		return new ResponseEntity<Passenger>(ps.getPassengerById(pid),HttpStatus.OK);
	}
	
	
	//updating passenger details by id using put mapping
	@PutMapping("/update/{pid}")
	public ResponseEntity<Passenger> updateP(@PathVariable("pid") long pid, @RequestBody Passenger passenger){
		return new ResponseEntity<Passenger>(ps.updatePassengerById(passenger, pid),HttpStatus.OK);
	}
	
	
	// deleting passenger details by id using delete mapping 
	@DeleteMapping("/deletep/{pid}")
	public ResponseEntity<String> deleteP(@PathVariable("pid") long pid){
		ps.deletePassengerById(pid);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
	}
	
	// fetching passenger details using get mapping 
	@GetMapping("/gett")
	public List<Passenger> getAllP(){
		return ps.getAllPassengers();
	}

}
