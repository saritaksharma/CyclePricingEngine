package com.sar.cyclePricingEngine;

public class Handlebar{
	private String brakes;
	private Gear gear;

	public Handlebar(String brakes, Gear gear) {
		super();
		this.brakes = brakes;
		this.gear = gear;
	}

	public String getBrakes() {
		return brakes;
	}

	public void setBrakes(String brakes) {
		this.brakes = brakes;
	}
	
	public Gear getGear() {
		return gear;
	}

	public void setGear(Gear gear) {
		this.gear = gear;
	}

	@Override
	public String toString() {
		return "Handlebar[brakes=" + brakes + ", gear=" + gear + "]";
	}

}
