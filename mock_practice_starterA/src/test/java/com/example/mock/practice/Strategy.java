package com.example.mock.practice;

import java.util.Random;

public class Strategy {
	final Random rnd;

	public Strategy(Random rnd) {
		this.rnd = rnd;
	}

	public int sumRandomNumber(int value) {
		int ran = rnd.nextInt(10);
		return value + ran;
	}

}
