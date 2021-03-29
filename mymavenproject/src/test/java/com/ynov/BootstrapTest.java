package com.ynov;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BootstrapTest {
	
	@Test
	public void testCompute() {
		
		int a = 2;
		int b = 4;
		Bootstrap bt = new Bootstrap();
		
		int resultat = bt.compute(a, b);
		
		assertEquals(8, resultat);
	}

}