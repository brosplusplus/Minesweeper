package com.bros.minesweeper.domain.model;

import javax.persistence.Entity;

@Entity
public class EstatPartida {
	public Boolean guanyada;
	public Boolean acabada;
	public Integer puntuacio;
	//TODO revisar si faltan cosas, yo (Borja) creo que si
}