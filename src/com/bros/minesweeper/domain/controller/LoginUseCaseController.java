package com.bros.minesweeper.domain.controller;

import com.bros.minesweeper.domain.datainterface.CtrlUsuariRegistrat;
import com.bros.minesweeper.domain.factory.FactoriaControladors;
import com.bros.minesweeper.domain.model.UsuariRegistrat;

public class LoginUseCaseController {
	
	public Boolean login (String userN, String passwd) throws Exception {
		FactoriaControladors FC = new FactoriaControladors();
		CtrlUsuariRegistrat CU = FC.getCtrlUsuari();
		UsuariRegistrat u = CU.get(userN);

		if(passwd != u.getPwd()) throw new Exception("Password Incorrecta");

		return true;
	}

}
