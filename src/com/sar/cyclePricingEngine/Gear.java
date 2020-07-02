package com.sar.cyclePricingEngine;

public enum Gear{
TWO_GEAR("TwoGear",200), FOUR_GREAR("FourGear", 400);
	
	private String gearName;
	private double gearPrice;
	private Gear(String gearName, double gearPrice) {
		this.gearName = gearName;
		this.gearPrice = gearPrice;
	}
	public String getGearName() {
		return gearName;
	}
	public void setGearName(String gearName) {
		this.gearName = gearName;
	}
	public double getGearPrice() {
		return gearPrice;
	}
	public void setGearPrice(double gearPrice) {
		this.gearPrice = gearPrice;
	}
	
}
