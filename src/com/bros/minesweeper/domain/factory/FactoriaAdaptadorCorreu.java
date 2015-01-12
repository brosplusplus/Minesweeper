package com.bros.minesweeper.domain.factory;

import com.bros.minesweeper.domain.adapter.AdaptadorCorreu;
import com.bros.minesweeper.domain.adapter.IAdaptadorCorreu;

public class FactoriaAdaptadorCorreu {
	public static IAdaptadorCorreu getAdaptadorCorreu(AdaptadorType tipus)
	{
		IAdaptadorCorreu adap = null;
		switch (tipus){
			case OWN: 
				adap = new AdaptadorCorreu();
				break;
			default:
				break;
		}
		return adap;
	}
}
