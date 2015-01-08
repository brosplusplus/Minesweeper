package com.bros.minesweeper.domain.model;

import javax.persistence.Entity;


/**
 * EstrategiaPuntuacio defines the interface to create Strategy 
 * Pattern over puntuation policy
 * @author Borja Arias
 * @version 0.1
 *
 */

@Entity
public interface EstrategiaPuntuacio {
	public Integer getPuntuacio(Partida partida);
}
