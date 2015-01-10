package com.bros.minesweeper.domain.model;

import java.util.ArrayList;
import javax.persistence.Entity;

/**
 * Partida represents a single game of minesweeper
 * 
 * @author Borja Arias
 * @version 0.1
 */

@Entity
public class Partida {
	/**
	 * Partida own atributes
	 */
	private Integer idPartida;
	private Boolean estaAcabada;
	private Boolean estaGuanyada;
	private Integer nombreTirades;
	private Integer casellesPerDescobrir;
	
	/**
	 * Association attributes
	 */
	private Jugador jugadorPartidaActual;
	private Jugador jugadorPartidaJugada;
	
	private Nivell teNivell;
	
	private EstrategiaPuntuacio estrategia;
	
	private ArrayList<Casella> taulell;

	public Integer getIdPartida() {
		return idPartida;
	}
	
	public void setIdPartida(Integer idPartida) {
		this.idPartida = idPartida;
	}
	
	public Boolean getEstaAcabada() {
		return estaAcabada;
	}
	
	public void setEstaAcabada(Boolean estaAcabada) {
		this.estaAcabada = estaAcabada;
	}
	
	public Boolean getEstaGuanyada() {
		return estaGuanyada;
	}
	
	public void setEstaGuanyada(Boolean estaGuanyada) {
		this.estaGuanyada = estaGuanyada;
	}
	
	public Integer getNombreTirades() {
		return nombreTirades;
	}
	
	public void setNombreTirades(Integer nombreTirades) {
		this.nombreTirades = nombreTirades;
	}
	
	public Integer getCasellesPerDescobrir() {
		return casellesPerDescobrir;
	}
	
	public void setCasellesPerDescobrir(Integer casellesPerDescobrir) {
		this.casellesPerDescobrir = casellesPerDescobrir;
	}
	
	public Jugador getJugadorPartidaActual() {
		return jugadorPartidaActual;
	}
	
	public void setJugadorPartidaActual(Jugador jugadorPartidaActual) {
		this.jugadorPartidaActual = jugadorPartidaActual;
	}
	
	public Jugador getJugadorPartidaJugada() {
		return jugadorPartidaJugada;
	}
	
	public void setJugadorPartidaJugada(Jugador jugadorPartidaJugada) {
		this.jugadorPartidaJugada = jugadorPartidaJugada;
	}
	
	public Nivell getTeNivell() {
		return teNivell;
	}
	
	public void setTeNivell(Nivell teNivell) {
		this.teNivell = teNivell;
	}
	
	public EstrategiaPuntuacio getEstrategia() {
		return estrategia;
	}
	
	public void setEstrategia(EstrategiaPuntuacio estrategia) {
		this.estrategia = estrategia;
	}
	
	public ArrayList<Casella> getTaulell() {
		return taulell;
	}
	
	public void setTaulell(ArrayList<Casella> taulell) {
		this.taulell = taulell;
	}
	
	public void marcarCasella(int numF, int numC){
		//TODO implement
		Casella c = new Casella();
		c = getCaselles(numF, numC);
		c.marcar();
	}
	
	public void desmarcarCasella (int numF, int numC) {
		//TODO implement
		Casella c = new Casella();
		c = getCaselles(numF, numC);
		c.desmarcar();
	}
	
	public EstatPartida descobrirCasella (int numF, int numC) {
		//TODO implement
		EstatPartida es = new EstatPartida();
		return es;
		Casella c = new Casella();
		c = getCaselles(numF, numC);
		c.descobrirCasella();
	}
	
	public void inicialitzarCaselles( ) {
		//TODO implement
	}
	
	public void assignarPuntuacio() {
		//TODO implement
	}
	
	
	
	public static void main(String[] args) {
		Partida p = new Partida();
		EstatPartida es = p.descobrirCasella(0, 0);
		System.out.print(es.puntuacio);
	}
}
