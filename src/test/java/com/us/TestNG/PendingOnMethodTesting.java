package com.us.TestNG;

import org.testng.annotations.Test;

public class PendingOnMethodTesting {
	
	@Test()
	public void CarPrice() {
		System.out.println("12,000");
		
	}
	@Test 
	public void CarColor() {
		System.out.println("Black");
	}
	
	@Test
	public void RimSize() {
		System.out.println("20 inch");
	}
}
