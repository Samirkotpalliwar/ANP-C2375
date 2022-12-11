package com.anudip.jpa.service;

import java.util.List;

import com.anudip.jpa.entity.Player;

//Abstract method for performing CRUD on entity Passenger
public interface PlayerService {
	
	//Method for saving passenger details
	Player savePlayer(Player pass);
	
	//Method for fetching passenger detail based on id
	Player getPlayerById(long id);
	
	//Method for fetching all player details
	List<Player>getAllPlayer();
	
	//Method for updating player details based on id
	Player updatePlayerById(Player ply,long id);
	
	//Method for removing player details based on id
	void deletePlayerById(long id);
	

}
