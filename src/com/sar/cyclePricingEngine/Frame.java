package com.sar.cyclePricingEngine;

public enum Frame{
	STEEL_FRAME("SteelFrame", 500), IRON_FRAME("IronFrame",300);
	private String frameName;
	private double framePrice;
	private Frame() {
		// TODO Auto-generated constructor stub
	}
	private Frame(String frameName, double framePrice) {
		this.frameName = frameName;
		this.framePrice = framePrice;
	}
	public String getFrameName() {
		return frameName;
	}
	public void setFrameName(String frameName) {
		this.frameName = frameName;
	}
	public double getFramePrice() {
		return framePrice;
	}
	public void setFramePrice(double framePrice) {
		this.framePrice = framePrice;
	}

	

}
