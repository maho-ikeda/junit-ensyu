package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("入力値に10を与えるとtrueを返す")
	void testIsEven1() {
		boolean expected = true;
		boolean actual = NumberUtils.isEven(10);
		assertEquals(expected, actual, "期待値と実際の値が異なります");
	}
	
	@Test
	@DisplayName("入力値に7を与えるとfalseを返す")
	void testIsEven2() {
		boolean expected = false;
		boolean actual = NumberUtils.isEven(7);
		assertEquals(expected, actual, "期待値と実際の値が異なります");
	}

}
