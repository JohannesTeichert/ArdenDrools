package at.fhj.cdss;

import edu.uvm.ccts.arden.model.ABoolean;
import edu.uvm.ccts.arden.model.ADataType;
import edu.uvm.ccts.arden.model.AList;
import edu.uvm.ccts.arden.model.ANumber;

public abstract class ArdenModule {

	private ABoolean result = new ABoolean(false);
	private AList action = new AList();
	protected String id;
	
	public final ABoolean getResult() {
		return result;
	}
	public final void setResult(ABoolean result) {
		this.result = result;
	}
	public final void setResult(Boolean result) {
		this.result = new ABoolean(result);
	}
	
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
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
