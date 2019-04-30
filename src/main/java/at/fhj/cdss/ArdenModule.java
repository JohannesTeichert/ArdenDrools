package at.fhj.cdss;

import edu.uvm.ccts.arden.model.ABoolean;
import edu.uvm.ccts.arden.model.ADataType;
import edu.uvm.ccts.arden.model.AList;

public abstract class ArdenModule {

	private ABoolean result = new ABoolean(false);
	public final ABoolean getResult() {
		return result;
	}
	public final void setResult(ABoolean result) {
		this.result = result;
	}
	public final void setResult(Boolean result) {
		this.result = new ABoolean(result);
	}
	
	private AList action = new AList();
	public AList getAction() {
		if(this.action.equals(null))
			return new AList();
		return this.action;
	}
	public void setAction(AList action) {
		this.action = action;
	}
	public void addAction(ADataType<ADataType> o) {
		this.action.add(o);
	}
	
	public abstract void generateAction();
	
}
