package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

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
	@DisplayName("「aaa」と入力すると「aaa」が取得できる")
	void testToSnakeCase1() {
		String expected = "aaa";
		String actual = StringUtils.toSnakeCase("aaa");
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("「HelloWorld」と入力すると「hello_world」が取得できる")
	void testToSnakeCase2() {
		String expected = "hello_world";
		String actual = StringUtils.toSnakeCase("HelloWorld");
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("「practiceJunit」と入力すると「practice_junit」が取得できる")
	void testToSnakeCase3() {
		String expected = "practice_junit";
		String actual = StringUtils.toSnakeCase("practiceJunit");
		assertEquals(expected, actual);
	}

}
