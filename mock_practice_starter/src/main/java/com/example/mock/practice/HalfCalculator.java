package com.example.mock.practice;

public class HalfCalculator {

	private NumberGenerator ng;

	public HalfCalculator() {
		this.ng = new NumberGenerator();
	}


	public double halfCalculator(){
//		NumberGenerator ng = new NumberGenerator();
		int x = ng.random2();
//		System.out.println("halfCalculator内で取れた値は" + x);
		return x / 2.0;
	}

}
