package com.bros.minesweeper.domain.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import com.bros.minesweeper.domain.datainterface.CtrlJugador;
import com.bros.minesweeper.domain.datainterface.CtrlNivell;
import com.bros.minesweeper.domain.factory.FactoriaControladors;
import com.bros.minesweeper.domain.factory.FactoriaEstrategiaPuntuacio;
import com.bros.minesweeper.domain.model.EstatPartida;
import com.bros.minesweeper.domain.model.EstrategiaPuntuacio;
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
	
	public String getJugName() {
		return jugName;
	}

	public void setJugName(String jugName) {
		this.jugName = jugName;
	}
	
	/**
	 * Methods
	 * @throws Exception 
	 */
	public void crearPartida (String nomNivell) {
		int id = this.partida.getIdPartida();
		id = id + 1;
		CtrlNivell cn = FactoriaControladors.getCtrlNivell();
		String nom = cn.get(nomNivell);
		ArrayList<EstrategiaPuntuacio> estrategies = FactoriaEstrategiaPuntuacio.getAll();
		int index = new Random().nextInt(estrategies.size());
		EstrategiaPuntuacio estrategiaEscollida = estrategies.get(index);
		this.partida = new Partida(id, jugName, nom, estrategiaEscollida);
		
	}
	
	
	public void marcarCasella (int numF, int numC) throws Exception {
		this.partida.marcarCasella(numF, numC);
	}
	
	public void desmarcarCasella (int numF, int numC) throws Exception {
		this.partida.desmarcarCasella(numF, numC);
	}
	
	public EstatPartida descobrirCasella (int numF, int numC) throws Exception {
		return this.partida.descobrirCasella(numF, numC);
	}
	
	public void FerAutenticacio(String userN,String passwd) throws Exception {
		CtrlJugador cj = FactoriaControladors.getCtrlJugador();
		if (!cj.exists(userN)) throw new Exception("L'usuari " + userN + " no es jugador");
		LoginUseCaseController lucc = new LoginUseCaseController();
		lucc.login(userN, passwd);
		this.setJugName(userN);
	}
	
	//TODO cal canviar el tipus de funcio i posarli el return.
	public ArrayList<HashMap<String, String> > obtenirNivells() throws Exception {
		ConsultarNivellUseCaseController cnucc = new ConsultarNivellUseCaseController();
		return cnucc.consultarNivells();
	}

}
