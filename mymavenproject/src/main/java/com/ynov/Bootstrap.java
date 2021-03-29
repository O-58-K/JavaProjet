package com.ynov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bootstrap {

	public static Logger Logger = LoggerFactory.getLogger(Bootstrap.class);

	public static void main(String[] args) {

		System.out.println("Hello World");
		Logger.info("Ceci est un log !");

	}
	
	public int compute(int a, int b) {
		return a*b;
	}

}
