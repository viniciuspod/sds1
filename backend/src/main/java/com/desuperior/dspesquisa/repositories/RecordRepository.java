package com.desuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desuperior.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
