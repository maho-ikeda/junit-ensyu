package junit.tutorial.ex02.e04;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

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

	@ParameterizedTest
	@DisplayName("min=-0.0、max=10.5の範囲のとき、containsメソッドに-0.1 ,10.6を与えるとfalseを返す")
	@ValueSource(doubles = {-0.1, 10.6})
	void testContains1(double d) {
		Range range = new Range(-0.0, 10.5);
		assertFalse(range.contains(d));
	}

	@ParameterizedTest
	@DisplayName("min=-0.0、max=10.5の範囲のとき、containsメソッドに0.0 ,10.5を与えるとtrueを返す")
	@ValueSource(doubles = {0.0, 10.5})
	void testContains2(double d) {
		Range range = new Range(-0.0, 10.5);
		assertTrue(range.contains(d));
	}
	
	@ParameterizedTest
	@DisplayName("min=-5.1、max=5.1の範囲のとき、containsメソッドに-5.2 ,5.2を与えるとfalseを返す")
	@ValueSource(doubles = {-5.2, 5.2})
	void testContains3(double d) {
		Range range = new Range(-5.1, 5.1);
		assertFalse(range.contains(d));
	}
	
	@ParameterizedTest
	@DisplayName("min=-5.1、max=5.1の範囲のとき、containsメソッドに-5.1 ,5.1を与えるとtrueを返す")
	@ValueSource(doubles = {-5.1, 5.1})
	void testContains4(double d) {
		Range range = new Range(-5.1, 5.1);
		assertTrue(range.contains(d));
	}
}
