package com.anudip.jpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.jpa.entity.Passenger;
import com.anudip.jpa.exception.PassengerNotFoundException;
import com.anudip.jpa.repository.PassengerRepository;
import com.anudip.jpa.service.PassengerService;

@Service
//implement all CRUD method, all business logic
public class PassengerServiceImpl implements PassengerService{

	@Autowired
	PassengerRepository passRepository;
	
	
	@Override
	// saving passenger details into table using save() of JpaRepository
 	public Passenger savePassenger(Passenger pass) {
		return passRepository.save(pass);
	}

	@Override
	// fetching passenger details from table based on id, if not found then throw exception
	public Passenger getPassengerById(long pid) {
		return passRepository.findById(pid).orElseThrow(()-> new PassengerNotFoundException("Entered Passenger id dose not exist"));
	}

	public List<Passenger> getAllPassengers() {
		return passRepository.findAll();
	}

	@Override
	// updating passenger details based on id  from table using save()
	public Passenger updatePassengerById(Passenger pass, long pid) {
		Passenger passenger1 =  passRepository.findById(pid).orElseThrow(()-> new PassengerNotFoundException("Entered Passenger id dose not exist"));
		
		// set new values
		passenger1.setPEmail(pass.getPEmail());
		passenger1.setPhone(pass.getPhone());
		
		// save details 
		passRepository.save(passenger1);
		return passenger1;
	}

	@Override
	public void deletePassengerById(long pid) {
		passRepository.findById(pid).orElseThrow(()-> new PassengerNotFoundException("Entered Passenger id dose not exist"));
		passRepository.deleteById(pid);
	}

	
}
