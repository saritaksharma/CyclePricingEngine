package com.sar.cyclePricingEngine;

import java.time.LocalDate;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTaskRunner {

	public static void main(String[] args) {

		/*
		 * LocalDate date = LocalDate.now().minusYears(4); Cycle cycle = new
		 * Cycle(Frame.IRON_FRAME, new Handlebar("Spike", Gear.FOUR_GREAR), "seating",
		 * new Wheel("spokes", "rim", Tyre.TUBE_TYPE), Chain.FOUR_CHAINING, date);
		 * Thread thread =new Thread(cycle); BlockingQueue queue = new
		 * ArrayBlockingQueue(10); RejectedExecutionHandler handler = new
		 * ThreadPoolExecutor.AbortPolicy(); ThreadPoolExecutor pool = new
		 * ThreadPoolExecutor(3, 3, 0, TimeUnit.SECONDS, queue, handler);
		 * pool.execute(thread); pool.shutdown();
		 */
	}

}
