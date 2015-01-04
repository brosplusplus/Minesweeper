package com.bros.minesweeper.domain.model;

public class EstratègiaPerTemps implements EstratègiaPuntuació {

	/**
	 * Maximum time in millis
	 */
	private long tempsMàxim;
	private long startTimeStamp;
	
	public EstratègiaPerTemps() {
		this.startTimeStamp = System.currentTimeMillis(); 
	}
	
	@Override
	public Integer getPuntuació(Partida partida) {
		long actualTime = System.currentTimeMillis();
		long timeDiff = actualTime - this.startTimeStamp;
		if (timeDiff > this.tempsMàxim)
			return 0;
		else
			return (int) (this.tempsMàxim - timeDiff);
	}

}
