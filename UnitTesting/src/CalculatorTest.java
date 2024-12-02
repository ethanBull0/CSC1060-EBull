import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculatorTest {

	Calculator calc;
	
	@BeforeEach
	void setup() {
		calc = new Calculator();
	}
	@Test
	@DisplayName("Add Test")
	void testAdd() {
		assertEquals(0, calc.add(0, 0), "Addition does not work correctly");
	}
	

}
