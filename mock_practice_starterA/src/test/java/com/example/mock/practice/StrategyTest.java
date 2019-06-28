package com.example.mock.practice;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class StrategyTest {

	 @Test
	    public void test_sunRandom() {
	        Random rndMock = mock(Random.class);
	        when(rndMock.nextInt(10)).thenReturn(2);

	        Strategy strategy = new Strategy(rndMock);
	        final int actual = strategy.sumRandomNumber(5);

	        assertEquals(7, actual);
	    }

}
