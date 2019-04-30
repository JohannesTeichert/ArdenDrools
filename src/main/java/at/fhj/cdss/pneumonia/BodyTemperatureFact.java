package at.fhj.cdss.pneumonia;

import at.fhj.cdss.ArdenModule;
import edu.uvm.ccts.arden.model.ANumber;
import edu.uvm.ccts.arden.model.AString;

public class BodyTemperatureFact extends ArdenModule {
	
	private ANumber temperature;
	
	public BodyTemperatureFact(ANumber temperature) {
		this.temperature = temperature;
	}

	public ANumber getTemperature() {
		return temperature;
	}

	public void setTemperature(ANumber temperature) {
		this.temperature = temperature;
	}

	@Override
	public void generateAction() {
		getAction().add(temperature);
		getAction().add(new AString("Bodytemperature too high"));
	}
}
