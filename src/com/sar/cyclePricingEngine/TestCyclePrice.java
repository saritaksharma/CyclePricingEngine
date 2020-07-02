package com.sar.cyclePricingEngine;

import java.time.LocalDate;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import com.sar.cyclePricingEngine.Cycle;

public class TestCyclePrice {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now().minusYears(4);

		Cycle cycle = new Cycle(Frame.IRON_FRAME, new Handlebar("Spike", Gear.FOUR_GREAR), "seating",
				new Wheel("spokes", "rim", Tyre.TUBE_TYPE), Chain.FOUR_CHAINING, date);
		Cycle cycle1 = new Cycle(Frame.IRON_FRAME, new Handlebar("Spike", Gear.FOUR_GREAR), "seating",
				new Wheel("spokes", "rim", Tyre.TUBE_TYPE), Chain.FOUR_CHAINING, date);
		System.out.println("Cycle Configuration  "+cycle);
		System.out.println(cycle.getCyclePrice(cycle, date));
		
		System.out.println("===   Using BlockingQueue  ===========");
		Thread thread =new Thread(cycle);
		BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(10);
		RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();
	    ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 3, 0, TimeUnit.SECONDS, queue, handler);
	    pool.execute(thread);
	    pool.shutdown();
	    
	    System.out.println("=======  Using Thread  ============");
	    Thread thread2 = new Thread(cycle1);
	    thread2.start();
		
		

	}

}
