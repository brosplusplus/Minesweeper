package com.bros.minesweeper.domain.model;

/**
 * EstratègiaPuntuació defines the interface to create Strategy Pattern over puntuation policy
 * @author Borja Arias
 * @version 0.1
 *
 */
public interface EstratègiaPuntuació {
	public Integer getPuntuació(Partida partida);
}
