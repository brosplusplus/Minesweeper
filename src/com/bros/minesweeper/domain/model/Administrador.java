package com.bros.minesweeper.domain.model;

import javax.persistence.Entity;

@Entity
public class Administrador extends UsuariRegistrat {
	private String tlfn;

	public String getTlfn() {
		return tlfn;
	}

	public void setTlfn(String tlfn) {
		this.tlfn = tlfn;
	}
	
}
