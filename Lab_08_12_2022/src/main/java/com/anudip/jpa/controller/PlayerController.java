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

import com.anudip.jpa.entity.Player;
import com.anudip.jpa.service.PlayerService;

@RestController
//rest controller to handle all incoming request using rest APi
public class PlayerController {
	
	@Autowired
	private PlayerService ps;
	
	//saving player details using post mapping
	@PostMapping("/savep")
	public ResponseEntity<Player>saveP(@Valid @RequestBody Player player){
		return new ResponseEntity<Player>(ps.savePlayer(player),HttpStatus.CREATED);
		
	}
	//fetching player by id using get mapping
	@GetMapping(value = "/get/{id}")
	public ResponseEntity <Player>getP(@PathVariable("id") long id) {
		return new ResponseEntity<Player>(ps.getPlayerById(id),HttpStatus.OK);
	}

	//updating passenger details by id using put mapping
		@PutMapping("/update/{pid}")
		public ResponseEntity<Player> updateP(@PathVariable("pid") long pid, @RequestBody Player passenger){
			return new ResponseEntity<Player>(ps.updatePlayerById(passenger, pid),HttpStatus.OK);
		}
		
		
		// deleting passenger details by id using delete mapping 
		@DeleteMapping("/deletep/{pid}")
		public ResponseEntity<String> deleteP(@PathVariable("pid") long pid){
			ps.deletePlayerById(pid);
			return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
		}
		
		// fetching passenger details using get mapping 
		@GetMapping("/gett")
		public List<Player> getAllP(){
			return ps.getAllPlayer();
		}
	}

