package at.fhj.cdss.pneumonia;

import at.fhj.cdss.ArdenModule;
import edu.uvm.ccts.arden.model.ANumber;

public class PBWimberleyFact extends ArdenModule {

	private ANumber colonyFormingUnits;
	
	public PBWimberleyFact(ANumber colonyFormingUnits) {
		this.colonyFormingUnits = colonyFormingUnits;
	}
	
	public void setColonyFormingUnits(ANumber colonyFormingUnits) {
		this.colonyFormingUnits = colonyFormingUnits;
	}
	
	public ANumber getColonyFormingUnits() {
		return this.colonyFormingUnits;
	}

	@Override
	public void generateAction() {
		getAction().add(getResult());
		getAction().add(colonyFormingUnits);
	}
}
