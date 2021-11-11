package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

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
	@DisplayName("第2引数に0を指定するとIllegalArgumentExcpetionが起きる")
	void testDivide() {
		Calculator calculator = new Calculator();
		try {
			calculator.divide(5, 0);
			fail("IllegalArgumentException例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertEquals("divide by zero.", e.getMessage(), "例外メッセージに差異があります");
		}
		
		
	}

}
