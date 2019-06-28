package com.example.mock.practice;

import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class Test1 {

//	@Test
//	public void test_hogehoge() {
//	    List<Integer> integerList = new ArrayList<Integer>();
//	    assertEquals(integerList.size(), 5);
//	}

	@Test
	public void test_hogehoge() {
	    List<Integer> integerList = mock(List.class);
	    when(integerList.size()).thenReturn(5);

	    assertEquals(integerList.size(), 5);
	}
}
