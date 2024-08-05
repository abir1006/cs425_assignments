import org.junit.Test;

import static org.junit.Assert.*;

public class MortgageTest {

//	@Test
//	public void test1() {
//		MortgageCalculator mc = new MortgageCalculator();
//		double result = mc.computeMaximumMortgage(1967, 5, 2, 3000, false, 0, "Architect");
//	    assertEquals(180000, result, 0.001);
//	}
	
	@Test
	public void test2() {
		MortgageCalculator mc = new MortgageCalculator();
		double result = mc.computeMaximumMortgage(2008, 5, 2, 3000, false, 0, "Architect");
	    assertEquals(0, result, 0.001);
	}
	
	@Test
	public void test3() {
		MortgageCalculator mc = new MortgageCalculator();
		double result = mc.computeMaximumMortgage(1977, 12, 2, 4000, true, 2000, "Developer");
	    assertEquals(220000, result, 0.001);
	}
	
	@Test
	public void test4() {
		MortgageCalculator mc = new MortgageCalculator();
		double result = mc.computeMaximumMortgage(1954, 5, 12, 5500, false, 0, "Professor");
	    assertEquals(280000, result, 0.001);
	}

}
