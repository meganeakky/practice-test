package test_project_ver4;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import jUnit_practice.BitChecker;
import jUnit_practice.BitCheckerException;

public class BitCheckerTest {
	private final String A = "checkA";
	private final String B = "checkB";
	private final String C = "checkC";
	BitChecker bc = new BitChecker();


	@Test
	public void testCheckListMaker_case1() {
			assertThat(bc.checkListMaker(1), contains(A));
	}

	@Test
	public void testCheckListMaker_case2() {
			assertThat(bc.checkListMaker(2), contains(B));
	}

	@Test
	public void testCheckListMaker_case3() {
			assertThat(bc.checkListMaker(3), contains(A,B));
	}

	@Test
	public void testCheckListMaker_case4() {
			assertThat(bc.checkListMaker(4), contains(C));
	}

	@Test
	public void testCheckListMaker_case5() {
			assertThat(bc.checkListMaker(5), contains(A,C));
	}

	@Test
	public void testCheckListMaker_case6() {
			assertThat(bc.checkListMaker(6), contains(B,C));
	}

	@Test
	public void testCheckListMaker_case7() {
			assertThat(bc.checkListMaker(7), contains(A,B,C));
	}

	@Test (expected = BitCheckerException.class)
	public void bitCheckerExceptionTest_case1() {
			bc.checkListMaker(8);
	}

	@Test (expected = BitCheckerException.class)
	public void bitCheckerExceptionTest_case2() {
			bc.checkListMaker(0);
	}

	@Test (expected = BitCheckerException.class)
	public void bitCheckerExceptionTest_case3() {
			bc.checkListMaker(100);
			expectedException.expect(BitCheckerException.class);
			expectedException.expectMessage("扱えない整数が入力されました");
	}

	 @Rule
	    public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void bitCheckerExceptionTest_case4() {
		expectedException.expect(BitCheckerException.class);
		expectedException.expectMessage("扱えない整数が入力されました");
//		あくまで例外が起きるかもしれないという定義。実際にスローされるか判定するためにメソッドを呼び出す
		bc.checkListMaker(1000);
	}
}
