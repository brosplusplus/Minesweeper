package com.bros.minesweeper.domain.controller;

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
	public void marcarCasella (int numF, int numC) {
		this.partida.marcarCasella(numF, numC);
	}
	
	public void desmarcarCasella (int numF, int numC) {
		this.partida.desmarcarCasella(numF, numC);
	}
		
	public void FerAutenticacio(String userN,String passwd) {
		FactoriaControladors fc = new FactoriaControladors()
		fc = getCtrlJugador();
		try {
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());	
		}
	}

	public void obtenirNivells() {//ArrayList<Nivell> 
		
	}
}
