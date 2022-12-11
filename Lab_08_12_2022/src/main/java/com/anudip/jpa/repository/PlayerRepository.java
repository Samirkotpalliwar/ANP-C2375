package com.anudip.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.jpa.entity.Player;

public interface PlayerRepository extends JpaRepository<Player,Long> {

}
