package syl.com;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class App2Test {
	
	@Test
	public void testAddition() {
        App2 calculator = new App2();
        int result = calculator.add(2, 3);
        assertEquals(result, 5, "Expected result is 5");

	}
}
