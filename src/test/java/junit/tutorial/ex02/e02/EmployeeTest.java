package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

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
	@DisplayName("指定のテキストファイルで実行すると、Employeeオブジェクトを取得できる")
	void test() {
			InputStream input = getClass().getResourceAsStream("Employee.txt");
			List<Employee> employeeList = Employee.load(input);
			Employee employee = new Employee();
			employee = employeeList.get(0);
			assertEquals("Ichiro", employee.getFirstName());
			assertEquals("Tanaka", employee.getLastName());
			assertEquals("ichiro@example.com", employee.getEmail());

	}


}
