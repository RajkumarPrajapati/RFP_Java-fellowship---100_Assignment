package com.bridgelabz.assignment.day_6;


public class SimulateStopwatch {
	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		Thread.sleep(1000);
		long endTime = System.currentTimeMillis();
		long elaspseTime = endTime-startTime;
		System.out.println(elaspseTime);
}

}
