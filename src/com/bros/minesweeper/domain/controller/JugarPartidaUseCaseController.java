package com.bros.minesweeper.domain.controller;

import java.util.ArrayList;

import javassist.util.proxy.FactoryHelper;

import com.bros.minesweeper.domain.model.Partida;

public class JugarPartidaUseCaseController {

	/**
	 * Association attributes
	 */
	private Partida partida;
	
	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}
	
	/**
	 * Methods
	 */
	
	public void FerAutenticació(String userN,String passwd) {
		
	}

	public void obtenirNivells() {//ArrayList<Nivell> 
		
	}
}
