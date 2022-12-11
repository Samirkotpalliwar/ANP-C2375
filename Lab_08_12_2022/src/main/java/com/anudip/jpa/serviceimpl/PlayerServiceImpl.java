package com.anudip.jpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.jpa.entity.Player;
import com.anudip.jpa.exception.PlayerNotFoundException;
import com.anudip.jpa.repository.PlayerRepository;
import com.anudip.jpa.service.PlayerService;

@Service
//implement all CRUD method,all business logic
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	PlayerRepository plyRepository;
	
	@Override
	// saving Player details into table using save() of JpaRepository
	public Player savePlayer(Player ply) {
		// TODO Auto-generated method stub
		return plyRepository.save(ply);
	}
	@Override
	//fetching player details from table based on id,if not found then throw exception
	public Player getPlayerById(long id) {
		// TODO Auto-generated method stub
		return plyRepository.findById(id).orElseThrow(()-> new PlayerNotFoundException("Entered Passenger id dose not exist"));
		
	}
	@Override
	public List<Player> getAllPlayer() {
		// TODO Auto-generated method stub
		return plyRepository.findAll();
	}
	@Override
	//updating player details based on id from table using save()
	public Player updatePlayerById(Player ply, long id) {
		// TODO Auto-generated method stub
		Player player1=plyRepository.findById(id).orElseThrow(()->new PlayerNotFoundException("Entered player id does not exist"));
		
		//set new values
		player1.setEmail(ply.getEmail());
		player1.setPhoneNo(ply.getPhoneNo());	
		
		//save details
		plyRepository.save(player1);
		return player1;
	}
	@Override
	public void deletePlayerById(long id) {
		// TODO Auto-generated method stub
		plyRepository.findById(id).orElseThrow(()->new PlayerNotFoundException("Entered Player does not exist"));
		plyRepository.deleteById(id);
	}

}
