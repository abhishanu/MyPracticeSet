package abhi.practice.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	MyMath math = new MyMath();
	// MyMath.sum
	// 1,2,3 =>6
	@Before
	public void before() {
		System.out.println("Before");
	}

	@Test
	public void test() {
		System.out.println("Test");
		assertEquals(6, math.sum(new int[] { 1, 2, 3 }));
	}

	@After
	public void after() {
		System.out.println("After");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

}
