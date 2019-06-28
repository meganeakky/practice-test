package com.example.mock.practice;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
class HalfCalculatorTest {

	@Spy
	NumberGenerator ng = new NumberGenerator();

	@InjectMocks
	HalfCalculator hcMock = new HalfCalculator();

//	@BeforeはJUnit4までなので注意！！
	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void ac2test() {
		when(ng.random2()).thenThrow(new NullPointerException());
		try {
			System.out.println(ng.random2());

		}catch (Exception e) {
			System.out.println("cause NullPointerException");
		}

//		assertThat(hcMock.halfCalculator(),is(10.0));
	}

}
