package at.fhj.cdss;

import edu.uvm.ccts.arden.model.*;

public class CTD_SIRS_NotificationAM {
	
	private ANumber temperature;
	private ANumber heartRate;
	private ANumber respRate;
	private ANumber paCo2;
	private ANumber wbCellCount;
	private ANumber immatureBand;
	
	private ANumber counter = new ANumber(0);
	
	
	public CTD_SIRS_NotificationAM(ANumber temperature, ANumber heartRate, ANumber respRate, ANumber paCo2, ANumber wbCellCount, ANumber immatureBand) {
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
	public ANumber getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(ANumber temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the heartRate
	 */
	public ANumber getHeartRate() {
		return heartRate;
	}

	/**
	 * @param heartRate the heartRate to set
	 */
	public void setHeartRate(ANumber heartRate) {
		this.heartRate = heartRate;
	}

	/**
	 * @return the respRate
	 */
	public ANumber getRespRate() {
		return respRate;
	}

	/**
	 * @param respRate the respRate to set
	 */
	public void setRespRate(ANumber respRate) {
		this.respRate = respRate;
	}

	/**
	 * @return the paCo2
	 */
	public ANumber getPaCo2() {
		return paCo2;
	}

	/**
	 * @param paCo2 the paCo2 to set
	 */
	public void setPaCo2(ANumber paCo2) {
		this.paCo2 = paCo2;
	}

	/**
	 * @return the wbCellCount
	 */
	public ANumber getWbCellCount() {
		return wbCellCount;
	}

	/**
	 * @param wbCellCount the wbCellCount to set
	 */
	public void setWbCellCount(ANumber wbCellCount) {
		this.wbCellCount = wbCellCount;
	}

	/**
	 * @return the immatureBand
	 */
	public ANumber getImmatureBand() {
		return immatureBand;
	}

	/**
	 * @param immatureBand the immatureBand to set
	 */
	public void setImmatureBand(ANumber immatureBand) {
		this.immatureBand = immatureBand;
	}
	
	/**
	 * @return the counter
	 */
	public ANumber getCounter() {
		return counter;
	}

	/**
	 * @param counter the counter to set
	 */
	public void setCounter(ANumber counter) {
		this.counter = counter;
	}

}
