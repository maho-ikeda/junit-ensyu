package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {

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
	@DisplayName("初期状態でincrementを1回実行すると2が取得できる")
	void testCounter1() {
		Counter counter = new Counter();
		int calcCount = 0;
		int actual = 0;
		for(int i = 0; calcCount >= i; i++) {
			actual = counter.increment();
		}
		int expected = 1;
		assertEquals(expected, actual, "期待値と実際の値が異なります");
	}
	
	@Test
	@DisplayName("incrementを1回実行した状態でincrementを1回実行すると2が取得できる")
	void testCounter2() {
		Counter counter = new Counter();
		int calcCount = 1;
		int actual = 0;
		for(int i = 0; calcCount >= i; i++) {
			actual = counter.increment();
		}
		int expected = 2;
		assertEquals(expected, actual, "期待値と実際の値が異なります");
	}
	
	@Test
	@DisplayName("incrementを50回実行した状態でincrementを実行すると51が取得できる")
	void testCounter3() {
		Counter counter = new Counter();
		int calcCount = 50;
		int actual = 0;
		for(int i = 0; calcCount >= i; i++) {
			actual = counter.increment();
		}
		int expected = 51;
		assertEquals(expected, actual, "期待値と実際の値が異なります");
	}
	

}
