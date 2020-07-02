package com.sar.cyclePricingEngine;

public class Wheel{

	private String spokes;
	private String rim;
	private Tyre tyre;
	public Wheel(String spokes, String rim, Tyre tyre) {
		super();
		this.spokes = spokes;
		this.rim = rim;
		this.tyre = tyre;
	}
	public String getSpokes() {
		return spokes;
	}
	public void setSpokes(String spokes) {
		this.spokes = spokes;
	}
	public String getRim() {
		return rim;
	}
	public void setRim(String rim) {
		this.rim = rim;
	}
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	@Override
	public String toString() {
		return "Wheel[spokes=" + spokes + ", rim=" + rim + ", tyre=" + tyre + "]";
	}

	
}
