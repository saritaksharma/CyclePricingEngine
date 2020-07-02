package com.sar.cyclePricingEngine;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTestCyclePrincing {

	Cycle cycle;
	LocalDate date;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
		date = LocalDate.now().minusYears(2);

		cycle = new Cycle(Frame.IRON_FRAME, new Handlebar("Spike", Gear.FOUR_GREAR), "seating",
				new Wheel("spokes", "rim", Tyre.TUBE_TYPE), Chain.FOUR_CHAINING, date);
	}

	@Test
	public void testCyclePrice() throws Throwable {

		date = LocalDate.now().minusYears(2);
		System.out.println("Cycle price with different Specification");
		assertEquals(1950.0d, cycle.getCyclePrice(cycle, date), 0.0);
		date = LocalDate.now().minusYears(4);
		assertEquals(1300.0d, cycle.getCyclePrice(cycle, date), 0.0);
		date = LocalDate.now();
		assertEquals(2600.0d, cycle.getCyclePrice(cycle, date), 0.0);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

}
