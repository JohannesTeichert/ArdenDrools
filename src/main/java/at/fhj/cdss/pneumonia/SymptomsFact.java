package at.fhj.cdss.pneumonia;

import at.fhj.cdss.ArdenModule;
import edu.uvm.ccts.arden.model.AString;

public class SymptomsFact extends ArdenModule {

	private BodyTemperatureFact btf;	
	private LeukopeniaFact lpf;
	private LeucocytosisFact lcf;
	private RespiratorySymptomsFact rsf;
	
	public SymptomsFact(BodyTemperatureFact btf, LeukopeniaFact lpf, LeucocytosisFact lcf, RespiratorySymptomsFact rsf) {
		this.btf = btf;
		this.lpf = lpf;
		this.lcf = lcf;
		this.rsf = rsf;
	}

	public BodyTemperatureFact getBtf() {
		return btf;
	}
	public void setBtf(BodyTemperatureFact btf) {
		this.btf = btf;
	}

	public LeukopeniaFact getLpf() {
		return lpf;
	}
	public void setLpf(LeukopeniaFact lpf) {
		this.lpf = lpf;
	}

	public LeucocytosisFact getLcf() {
		return lcf;
	}
	public void setLcf(LeucocytosisFact lcf) {
		this.lcf = lcf;
	}

	public RespiratorySymptomsFact getRsf() {
		return rsf;
	}
	public void setRsf(RespiratorySymptomsFact rsf) {
		this.rsf = rsf;
	}

	@Override
	public void generateAction() {
		getAction().add(btf.getResult());
		getAction().add(getLpf().getResult());
		getAction().add(getLcf().getResult());
		getAction().add(getRsf().getResult());
		getAction().add(new AString("Symptoms indicate Pneumonia"));
	}
	
}
