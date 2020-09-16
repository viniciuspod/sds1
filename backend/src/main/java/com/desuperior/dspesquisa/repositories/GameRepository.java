package com.desuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desuperior.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
