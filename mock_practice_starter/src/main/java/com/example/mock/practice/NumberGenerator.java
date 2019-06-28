package com.example.mock.practice;

import java.util.Random;

public class NumberGenerator {

	int random2() {
		Random r = new Random();
		int rValue = r.nextInt(101);
		return rValue;
	}
}
