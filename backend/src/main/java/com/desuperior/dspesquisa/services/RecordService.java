package com.desuperior.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desuperior.dspesquisa.dto.RecordDTO;
import com.desuperior.dspesquisa.dto.RecordInsertDTO;
import com.desuperior.dspesquisa.entities.Game;
import com.desuperior.dspesquisa.entities.Record;
import com.desuperior.dspesquisa.repositories.GameRepository;
import com.desuperior.dspesquisa.repositories.RecordRepository;


@Service
public class RecordService {

	@Autowired//ele instancia o GameReposotory automaticamente
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game =  gameRepository.getOne(dto.getGameId());//getOne ele vai instanciar o objeto soq ele n vai no banco de dados so pra associar
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}

	@Transactional(readOnly =true)
	public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
		return repository.findByMoments(minDate, maxDate,pageRequest).map(x-> new RecordDTO(x));
	}
}
