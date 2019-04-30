package at.fhj.cdss.pneumonia;

import at.fhj.cdss.ArdenModule;
import edu.uvm.ccts.arden.model.AString;

public class PneumoniaFact extends ArdenModule {

	private XRayFact xrf;
	private SymptomsFact smf;
	private PBWimberleyFact pbw;

	public PneumoniaFact(XRayFact xrf, SymptomsFact smf, PBWimberleyFact pbw) {
		this.xrf = xrf;
		this.smf = smf;
		this.pbw = pbw;
	}

	public XRayFact getXrf() {
		return xrf;
	}
	public void setXrf(XRayFact xrf) {
		this.xrf = xrf;
	}

	public SymptomsFact getSmf() {
		return smf;
	}
	public void setSmf(SymptomsFact smf) {
		this.smf = smf;
	}
	
	public PBWimberleyFact getPbw() {
		return pbw;
	}
	public void setPbw(PBWimberleyFact pbw) {
		this.pbw = pbw;
	}

	@Override
	public void generateAction() {
		getAction().add(getResult());
		getAction().add(xrf.getResult());
		getAction().add(smf.getResult());
		getAction().add(new AString("Pneumonia alert"));
	}
}
