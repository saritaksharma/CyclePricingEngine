package com.sar.cyclePricingEngine;

public enum Chain{
	TWO_CHAINING("TwoChain", 200), FOUR_CHAINING("FourChain", 400);
	private String chainName;
	private double chainPrice;

	private Chain(String chainName, double chainPrice) {
		this.chainName = chainName;
		this.chainPrice = chainPrice;
	}

	public String getChainName() {
		return chainName;
	}

	public void setChainName(String chainName) {
		this.chainName = chainName;
	}


	public void setChainPrice(double chainPrice) {
		this.chainPrice = chainPrice;
	}

	public double getChainPrice() {
		return chainPrice;
	}
}
