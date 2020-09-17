package com.desuperior.dspesquisa.dto;

import java.io.Serializable;

import com.desuperior.dspesquisa.entities.Game;
import com.desuperior.dspesquisa.entities.enums.Platform;

public class gameDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String title;
	private Platform platform;
	
	
	public gameDTO() {
		
	}

	public gameDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		platform = entity.getPlatform();
	}

	public gameDTO(Long id, String nome, Platform platform) {
		super();
		this.id = id;
		this.title = title;
		this.platform = platform;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
