package com.bros.minesweeper.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MSession {
	public static org.hibernate.classic.Session getDefaultSession() {
		SessionFactory sessionFact = new AnnotationConfiguration().configure().buildSessionFactory();
		return sessionFact.openSession();
	}
}
