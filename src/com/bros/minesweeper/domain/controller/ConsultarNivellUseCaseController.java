package com.bros.minesweeper.domain.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.bros.minesweeper.domain.datainterface.CtrlNivell;
import com.bros.minesweeper.domain.factory.FactoriaControladors;
import com.bros.minesweeper.domain.model.Nivell;

public class ConsultarNivellUseCaseController {

	public HashMap<String, Integer> consultarNivells() throws Exception{
		CtrlNivell cn = FactoriaControladors.getCtrlNivell();
		ArrayList<Nivell> ns = cn.getAll();
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		
		//Nivell level = 
				
		if(result.isEmpty()) throw new Exception("No hi ha nivells");
		
		return result;

	}
}
