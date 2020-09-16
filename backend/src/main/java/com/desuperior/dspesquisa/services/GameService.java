package com.desuperior.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desuperior.dspesquisa.dto.gameDTO;
import com.desuperior.dspesquisa.entities.Game;
import com.desuperior.dspesquisa.repositories.GameRepository;


@Service
public class GameService {

	@Autowired//ele instancia o GameReposotory automaticamente
	private GameRepository repository;
	
	@Transactional(readOnly = true) // garantir q toda a parte de bd seja feita e concluida no service precisa desse comando
	public List<gameDTO> findAll(){
		List<Game> list = repository.findAll();
		return list.stream().map(x -> new gameDTO(x)).collect(Collectors.toList());// stream serve pra aplicar instruçoes de ordem alta e collect pra retornar a stream em uma list
				
	}
}
