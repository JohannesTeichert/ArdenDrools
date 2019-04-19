package at.fhj.cdss;

import arden.runtime.*;

public class CTD_SIRS_NotificationA2B {
	
	private ArdenNumber temperature;
	private ArdenNumber heartRate;
	private ArdenNumber respRate;
	private ArdenNumber paCo2;
	private ArdenNumber wbCellCount;
	private ArdenNumber immatureBand;
	private ArdenNumber counter = new ArdenNumber(0);
	
	public int testvar=0;
	
	
	public CTD_SIRS_NotificationA2B(int testvar, ArdenNumber temperature, ArdenNumber heartRate, ArdenNumber respRate, ArdenNumber paCo2, ArdenNumber wbCellCount, ArdenNumber immatureBand) {
		this.testvar = testvar;
		this.temperature = temperature;
		this.heartRate = heartRate;
		this.respRate = respRate;
		this.paCo2 = paCo2;
		this.wbCellCount = wbCellCount;
		this.immatureBand = immatureBand;
	}

	/**
	 * @return the temperature
	 */
	public ArdenNumber getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(ArdenNumber temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the heartRate
	 */
	public ArdenNumber getHeartRate() {
		return heartRate;
	}

	/**
	 * @param heartrate the heartRate to set
	 */
	public void setHeartRate(ArdenNumber heartrate) {
		this.heartRate = heartrate;
	}

	/**
	 * @return the respRate
	 */
	public ArdenNumber getRespRate() {
		return respRate;
	}

	/**
	 * @param respRate the respRate to set
	 */
	public void setRespRate(ArdenNumber respRate) {
		this.respRate = respRate;
	}

	/**
	 * @return the paCo2
	 */
	public ArdenNumber getPaCo2() {
		return paCo2;
	}

	/**
	 * @param paCo2 the paCo2 to set
	 */
	public void setPaCo2(ArdenNumber paCo2) {
		this.paCo2 = paCo2;
	}

	/**
	 * @return the wbCellCount
	 */
	public ArdenNumber getWbCellCount() {
		return wbCellCount;
	}

	/**
	 * @param wbCellCount the wbCellCount to set
	 */
	public void setWbCellCount(ArdenNumber wbCellCount) {
		this.wbCellCount = wbCellCount;
	}

	/**
	 * @return the immatureBand
	 */
	public ArdenNumber getImmatureBand() {
		return immatureBand;
	}

	/**
	 * @param immatureBand the immatureBand to set
	 */
	public void setImmatureBand(ArdenNumber immatureBand) {
		this.immatureBand = immatureBand;
	}
	
	/**
	 * @return the counter
	 */
	public ArdenNumber getCounter() {
		return counter;
	}

	/**
	 * @param counter the counter to set
	 */
	public void setCounter(ArdenNumber counter) {
		this.counter = counter;
	}

}
