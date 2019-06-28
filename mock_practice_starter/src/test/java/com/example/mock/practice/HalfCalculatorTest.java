package com.example.mock.practice;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
class HalfCalculatorTest {

//	①
	@Spy
	NumberGenerator ng = new NumberGenerator();

//	②
	@InjectMocks
	HalfCalculator hcMock = new HalfCalculator();

//	③
//	@BeforeはJUnit4までなので注意！！
	@BeforeEach //
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void ac2test() {

//		④
		doReturn(20).when(ng).random2();

//		⑤
		assertThat(hcMock.halfCalculator(),is(10.0));
	}

}
