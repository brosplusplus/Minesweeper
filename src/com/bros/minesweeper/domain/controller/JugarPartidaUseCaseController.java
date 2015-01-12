package com.bros.minesweeper.domain.controller;

import com.bros.minesweeper.domain.factory.FactoriaControladors;
import com.bros.minesweeper.domain.model.Partida;

public class JugarPartidaUseCaseController {

	/**
	 * Association attributes
	 */
	private Partida partida;
	private String jugName;
	
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
		
	public void FerAutenticacio(String userN,String passwd) throws Exception {
		FactoriaControladors fc = new FactoriaControladors();
		fc = getCtrlJugador();
		if (!fc.exists(userN)) throw new Exception("L'usuari " + userN + " no es jugador");
		LoginUseCaseController lucc = new LoginUseCaseController();
		lucc.login(userN, passwd);
		this.jugName = userN;
	}

	private FactoriaControladors getCtrlJugador() {
		// TODO Auto-generated method stub
		return null;
	}

	public void obtenirNivells() {//ArrayList<Nivell> 
		
	}
}
