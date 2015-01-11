package com.bros.minesweeper.test;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import com.bros.minesweeper.domain.model.Administrador;

public class UsuariRegistratTest {
	public static void main (String[] args) {
		SessionFactory sessionFact = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFact.openSession();
		List<Administrador> l = session.createSQLQuery("select * from test.ADMINISTRADOR,"
				+ " test.USUARIREGISTRAT")
				.addEntity("com.bros.minesweeper.domain.model.Administrador")
				.list();
		Administrador ad = l.get(0);
		System.out.println(ad.getUsername());
	}
}
