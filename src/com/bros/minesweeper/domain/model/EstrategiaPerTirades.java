package com.bros.minesweeper.domain.model;

public class Estrat�giaPerTirades implements Estrat�giaPuntuaci�{
	private Integer tiradesM�ximes;

	
	
	public Estrat�giaPerTirades(Integer tiradesM�ximes) {
		super();
		this.tiradesM�ximes = tiradesM�ximes;
	}



	@Override
	public Integer getPuntuaci�(Partida partida) {
		Integer tiradesActuals = partida.getNombreTirades();
		if (tiradesActuals > this.tiradesM�ximes) {
			return 0;
		}
		return this.tiradesM�ximes - tiradesActuals;
	}
	
}
