package com.aes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aes.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
