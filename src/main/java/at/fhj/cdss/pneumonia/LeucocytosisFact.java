package at.fhj.cdss.pneumonia;

import at.fhj.cdss.ArdenModule;
import edu.uvm.ccts.arden.model.ANumber;
import edu.uvm.ccts.arden.model.AString;

public class LeucocytosisFact extends ArdenModule {

	private ANumber wbcount;
	
	public LeucocytosisFact(ANumber wbcount) {
		this.wbcount = wbcount;
	}
	
	public void setWbcount(ANumber wbcount) {
		this.wbcount = wbcount;
	}
	
	public ANumber getWbcount() {
		return this.wbcount;
	}
	
	@Override
	public void generateAction() {
		getAction().add(wbcount);
		getAction().add(new AString("Leucocytosis fact evaluated true"));
	}
}
