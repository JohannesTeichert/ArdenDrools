package at.fhj.cdss.sirsexample;

public class CTDSIRSNotification {
	
	private double temperature;
	private double heartRate;
	private double respRate;
	private double paCo2;
	private double wbCellCount;
	private double immatureBand;
	
	private double counter;
	
	
	public CTDSIRSNotification(double temperature, double heartRate, double respRate, double paCo2, double wbCellCount, double immatureBand) {
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
	public double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the heartRate
	 */
	public double getheartRate() {
		return heartRate;
	}

	/**
	 * @param heartRate the heartRate to set
	 */
	public void setheartRate(double heartRate) {
		this.heartRate = heartRate;
	}

	/**
	 * @return the respRate
	 */
	public double getRespRate() {
		return respRate;
	}

	/**
	 * @param respRate the respRate to set
	 */
	public void setRespRate(double respRate) {
		this.respRate = respRate;
	}

	/**
	 * @return the paCo2
	 */
	public double getPaCo2() {
		return paCo2;
	}

	/**
	 * @param paCo2 the paCo2 to set
	 */
	public void setPaCo2(double paCo2) {
		this.paCo2 = paCo2;
	}

	/**
	 * @return the wbCellCount
	 */
	public double getWbCellCount() {
		return wbCellCount;
	}

	/**
	 * @param wbCellCount the wbCellCount to set
	 */
	public void setWbCellCount(double wbCellCount) {
		this.wbCellCount = wbCellCount;
	}

	/**
	 * @return the immatureBand
	 */
	public double getImmatureBand() {
		return immatureBand;
	}

	/**
	 * @param immatureBand the immatureBand to set
	 */
	public void setImmatureBand(double immatureBand) {
		this.immatureBand = immatureBand;
	}
	
	/**
	 * @return the counter
	 */
	public double getCounter() {
		return counter;
	}

	/**
	 * @param counter the counter to set
	 */
	public void setCounter(double counter) {
		this.counter = counter;
	}

}
