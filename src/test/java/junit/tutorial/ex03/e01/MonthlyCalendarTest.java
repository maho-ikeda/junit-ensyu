package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MonthlyCalendarTest {

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
	@DisplayName("指定した日付を入れると月末までの残り日数が表示される")
	@CsvSource({
		"2012-01-31, 0",
		"2012-01-30, 1",
		"2012-02-01, 28"
	})
	void testGetRemainingDays(LocalDate date, int expected) {
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(date);
		assertEquals(expected, monthlyCalendar.getRemainingDays(), "期待値と実際の値が異なります");
		
	}

}
