package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import javax.imageio.IIOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LogAnalyzerTest {

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
	@DisplayName("logLoaderのloadメソッドが呼び出された場合、IOExceptionを送出したならばAnalyzeExceptionが創出される")
	void testAnalyze() {
		LogAnalyzer logAnalyzer = new LogAnalyzer();
		try {
			logAnalyzer.analyze(null);
		} catch (AnalyzeException e) {
		}
		
	}

}
