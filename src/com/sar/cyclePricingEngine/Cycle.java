package com.sar.cyclePricingEngine;

import java.time.LocalDate;

public class Cycle implements Runnable {

	private Frame frame;
	private Handlebar handlebar;
	private String seating;
	private Wheel wheels;
	private Chain chainAssembly;
	//private double cyclePrice;
	private LocalDate date;

	public Cycle() {

	}

	public Cycle(Frame frame, Handlebar handlebar, String seating, Wheel wheels, Chain chainAssembly, LocalDate date) {
		super();
		this.frame = frame;
		this.handlebar = handlebar;
		this.seating = seating;
		this.wheels = wheels;
		this.chainAssembly = chainAssembly;
		this.date = date;
		//this.cyclePrice = 500;
	}

	public Frame getFrame() {
		return frame;
	}

	public Handlebar getHandlebar() {
		return handlebar;
	}

	public String getSeating() {
		return seating;
	}

	public Wheel getWheels() {
		return wheels;
	}

	public Chain getChainAssembly() {
		return chainAssembly;
	}

	public Cycle setFrame(Frame frame) {
		this.frame = frame;
		return this;
	}

	public Cycle setHandlebar(Handlebar handlebar) {
		this.handlebar = handlebar;
		return this;
	}

	public Cycle setSeating(String seating) {
		this.seating = seating;
		return this;
	}

	public Cycle setWheels(Wheel wheels) {
		this.wheels = wheels;
		return this;
	}

	public Cycle setChainAssembly(Chain chainAssembly) {
		this.chainAssembly = chainAssembly;
		return this;
	}

	public double getCyclePrice(Cycle cycle, LocalDate date) {
		// LocalDate date = LocalDate.now().minusYears(4);
		int dateCurrent = date.getYear();
		double cyclePrice = 500;
		double totalCyclePrice = cyclePrice + getPrice();

		switch (dateCurrent) {
		case 2016:
			totalCyclePrice = totalCyclePrice - totalCyclePrice* 50 / 100;
			break;
		case 2018:
			totalCyclePrice = totalCyclePrice - totalCyclePrice* 25 / 100;
			break;
		default:
			break;
		}
		return totalCyclePrice;
	}

	private double getPrice() {
		return this.getChainAssembly().getChainPrice() + this.getFrame().getFramePrice()
				+ this.getWheels().getTyre().getTyrePrice() + this.getHandlebar().getGear().getGearPrice();

	}

	@Override
	public void run() {
		double runnableCyclePrice = 0;
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName());
			runnableCyclePrice += getCyclePrice(this, this.date);

		}
		System.out.println("cycle runnable price  " + runnableCyclePrice);
	}

	@Override
	public String toString() {
		return "Cycle [frame=" + frame + ", handlebar=" + handlebar + ", seating=" + seating + ", wheels=" + wheels
				+ ", chainAssembly=" + chainAssembly + ", date=" + date + "]";
	}



}
