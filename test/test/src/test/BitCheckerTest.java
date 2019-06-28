package test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import jUnit_practice.BitChecker;

public class BitCheckerTest {

	@Test
	public void testCheckListMaker() {
		private final String A = "checkA";
		private final String B = "checkB";
		private final String C = "checkC";
		BitChecker bc = new BitChecker();
		List<String> listA = Arrays.asList(A);
		List<String> listB = Arrays.asList(B);
		List<String> listC = Arrays.asList(C);
		List<String> listAB = Arrays.asList(A, B);
		List<String> listAC = Arrays.asList(A, C);
		List<String> listBC = Arrays.asList(B, C);
		List<String> listABC = Arrays.asList(A, B, C);

		@Test
		public void testCheckListMaker() {

				assertThat(bc.checkListMaker(1), contains(listA));
				assertThat(bc.checkListMaker(2), contains(listB));
				assertThat(bc.checkListMaker(3), contains(listAB));
				assertThat(bc.checkListMaker(4), contains(listC));
				assertThat(bc.checkListMaker(5), contains(listAC));
				assertThat(bc.checkListMaker(6), contains(listBC));
				assertThat(bc.checkListMaker(7), contains(listABC));
				//		assertThat(bc.checkListMaker(0),hasItems(A,B,C));
				//		assertThat(bc.checkListMaker(8),hasItems(A,B,C));

		}
	}

}
