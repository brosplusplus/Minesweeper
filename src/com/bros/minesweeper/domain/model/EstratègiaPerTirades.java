package com.bros.minesweeper.domain.model;

public class EstratègiaPerTirades implements EstratègiaPuntuació{
	private Integer tiradesMàximes;

	
	
	public EstratègiaPerTirades(Integer tiradesMàximes) {
		super();
		this.tiradesMàximes = tiradesMàximes;
	}



	@Override
	public Integer getPuntuació(Partida partida) {
		Integer tiradesActuals = partida.getNombreTirades();
		if (tiradesActuals > this.tiradesMàximes) {
			return 0;
		}
		return this.tiradesMàximes - tiradesActuals;
	}
	
}
