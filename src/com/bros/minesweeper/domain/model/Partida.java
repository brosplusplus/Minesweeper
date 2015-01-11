package com.bros.minesweeper.domain.model;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Partida represents a single game of minesweeper
 * 
 * @author Borja Arias
 * @version 0.1
 */

@Entity
@Table(name="Partida")
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
	
	private ArrayList<ArrayList<Casella>> taulell;

	@Id
	@GeneratedValue
	@Column(name="idPartida")
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
	
	@ManyToOne
	@JoinColumn(name="nomNivell")
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
	
	public ArrayList<ArrayList<Casella>> getTaulell() {
		return taulell;
	}
	
	public void setTaulell(ArrayList<ArrayList<Casella>> taulell) {
		this.taulell = taulell;
	}
	
	private void setCasella(int numF, int numC, Casella c) {
		this.taulell.get(numF).set(numC, c);
	}
	private Casella getCasella(int numF, int numC) {
		return this.taulell.get(numF).get(numC);
	}
	
	public void marcarCasella(int numF, int numC){
		Casella c = new Casella();
		c = getCasella(numF, numC);
		c.marcar();
	}
	
	public void desmarcarCasella (int numF, int numC) {
		Casella c = new Casella();
		c = getCasella(numF, numC);
		c.desmarcar();
	}
	
	public EstatPartida descobrirCasella (int numF, int numC) {
		Casella c = new Casella();
		c = getCasella(numF, numC);
		c.descobrirCasella();
		EstatPartida es = new EstatPartida();
		return es;
	}
	
	public void inicialitzarCaselles( ) {
		Integer filesDelNivell = this.teNivell.getNombreCasellesxFila();
		Integer columnesDelNivell = this.teNivell.getNombreCasellesxColumna();
		for (int i = 0; i < filesDelNivell; ++i) {
			for (int j = 0; j <  columnesDelNivell; ++i) {
				Casella c = new Casella();
				c.setNumeroFila(i);
				c.setNumeroColumna(j);
				c.setNumero(null);
				c.setEstaDescoberta(false);
				c.setEstaMarcada(false);
				c.setTeMina(null);
				setCasella(i, j, c);
			}
		}
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
