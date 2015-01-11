package com.bros.minesweeper.test;

import org.hibernate.classic.Session;

import com.bros.minesweeper.domain.model.Partida;

public class PartidaTest {
	
	public static void main(String[] args) {
		Session session = MSession.getDefaultSession();
		session.beginTransaction();
		
		Partida p = new Partida();
		p.setEstaAcabada(false);
		p.setEstaGuanyada(false);
		p.setEstrategia(null);
		p.setTeNivell(null);		
		p.setCasellesPerDescobrir(null);
		p.setJugadorPartidaActual(null);
		p.setJugadorPartidaJugada(null);
		p.setTaulell(null);

		session.save(p);
		session.getTransaction().commit();
		
	}
}
