package com.bros.minesweeper.domain.model;

public class Estrat�giaPerTemps implements Estrat�giaPuntuaci� {

	/**
	 * Maximum time in millis
	 */
	private long tempsM�xim;
	private long startTimeStamp;
	
	public Estrat�giaPerTemps() {
		this.startTimeStamp = System.currentTimeMillis(); 
	}
	
	@Override
	public Integer getPuntuaci�(Partida partida) {
		long actualTime = System.currentTimeMillis();
		long timeDiff = actualTime - this.startTimeStamp;
		if (timeDiff > this.tempsM�xim)
			return 0;
		else
			return (int) (this.tempsM�xim - timeDiff);
	}

}
