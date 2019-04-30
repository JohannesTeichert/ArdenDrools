package at.fhj.cdss.pneumonia;

import at.fhj.cdss.ArdenModule;
import edu.uvm.ccts.arden.model.ABoolean;
import edu.uvm.ccts.arden.model.AString;

public class RespiratorySymptomsFact extends ArdenModule {

	private ABoolean cough;
	private ABoolean dyspnea;
	private ABoolean tachypnea;
	
	public RespiratorySymptomsFact(ABoolean cough, ABoolean dyspnea, ABoolean tachypnea) {
		this.cough = cough;
		this.dyspnea = dyspnea;
		this.tachypnea = tachypnea;
	}

	public ABoolean getCough() {
		return cough;
	}
	public void setCough(ABoolean cough) {
		this.cough = cough;
	}

	public ABoolean getDyspnea() {
		return dyspnea;
	}
	public void setDyspnea(ABoolean dyspnea) {
		this.dyspnea = dyspnea;
	}

	public ABoolean getTachypnea() {
		return tachypnea;
	}
	public void setTachypnea(ABoolean tachypnea) {
		this.tachypnea = tachypnea;
	}

	@Override
	public void generateAction() {
		getAction().add(new AString("respiratory symptoms evaluated true"));
	}

}
