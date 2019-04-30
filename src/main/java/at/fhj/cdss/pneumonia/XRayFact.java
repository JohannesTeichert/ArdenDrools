package at.fhj.cdss.pneumonia;

import at.fhj.cdss.ArdenModule;
import edu.uvm.ccts.arden.model.ABoolean;
import edu.uvm.ccts.arden.model.AString;

public class XRayFact extends ArdenModule {
	
	private ABoolean chestXray1;
	private ABoolean chestXray2;
	private ABoolean cardiacDisease;
	private ABoolean pulmonaryDisease;
	private ABoolean definitiveXray;

	public XRayFact(ABoolean chestXray1, ABoolean chestXray2, ABoolean cardiacDisease, ABoolean pulmonaryDisease, ABoolean definitiveXray) {
		this.chestXray1 = chestXray1;
		this.chestXray2 = chestXray2;
		this.cardiacDisease = cardiacDisease;
		this.pulmonaryDisease = pulmonaryDisease;
		this.definitiveXray = definitiveXray;
	}

	public ABoolean getChestXray1() {
		return chestXray1;
	}

	public void setChestXray1(ABoolean chestXray1) {
		this.chestXray1 = chestXray1;
	}

	public ABoolean getChestXray2() {
		return chestXray2;
	}

	public void setChestXray2(ABoolean chestXray2) {
		this.chestXray2 = chestXray2;
	}

	public ABoolean getCardiacDisease() {
		return cardiacDisease;
	}

	public void setCardiacDisease(ABoolean cardiacDisease) {
		this.cardiacDisease = cardiacDisease;
	}

	public ABoolean getPulmonaryDisease() {
		return pulmonaryDisease;
	}

	public void setPulmonaryDisease(ABoolean pulmonaryDisease) {
		this.pulmonaryDisease = pulmonaryDisease;
	}

	public ABoolean getDefinitiveXray() {
		return definitiveXray;
	}

	public void setDefinitiveXray(ABoolean definitiveXray) {
		this.definitiveXray = definitiveXray;
	}

	@Override
	public void generateAction() {
		getAction().add(new AString("xray fact evaluated true"));
	}



}
