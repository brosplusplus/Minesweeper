package com.bros.minesweeper.domain.model;

import javax.persistence.Entity;

@Entity
public class Jugador extends UsuariRegistrat {
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
