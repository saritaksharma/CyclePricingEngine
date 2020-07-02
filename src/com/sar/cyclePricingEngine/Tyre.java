package com.sar.cyclePricingEngine;

public enum Tyre{
	TUBELESS_TYPES("TubelessTyre", 500), TUBE_TYPE("TubeTyre",1000);
	
	private String tyreName;
	private double tyrePrice;
	
	private Tyre(String tyreName, double tyrePrice) {
		this.tyreName = tyreName;
		this.tyrePrice = tyrePrice;
	}
	
	public String getTyreName() {
		return tyreName;
	}
	public void setTyreName(String tyreName) {
		this.tyreName = tyreName;
	}
	public double getTyrePrice() {
		return tyrePrice;
	}
	public void setTyrePrice(double tyrePrice) {
		this.tyrePrice = tyrePrice;
	}
}
