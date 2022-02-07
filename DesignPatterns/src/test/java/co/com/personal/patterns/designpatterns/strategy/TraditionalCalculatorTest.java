package co.com.personal.patterns.designpatterns.strategy;

import static org.junit.Assert.*;

import co.com.personal.patterns.designpatterns.behavioral.strategy.Calculator;
import co.com.personal.patterns.designpatterns.behavioral.strategy.TraditionalCalculator;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TraditionalCalculatorTest {

	private TraditionalCalculator traditionalCalculator;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		traditionalCalculator = new TraditionalCalculator();
	}

	@Test
	public void testDoSomeBasicMathOperationSum() {
		double sum = traditionalCalculator.doSomeBasicMathOperation(Calculator.OPERATION.SUM, 2, 2);
		System.out.println("The Sum result is: "+sum);
		assertTrue(sum == 4);
	}

	@Test
	public void testDoSomeBasicMathOperationDifference() {
		double difference = traditionalCalculator.doSomeBasicMathOperation(Calculator.OPERATION.DIFFERENCE, 5, 2);
		System.out.println("The Difference result is: "+difference);
		assertTrue(difference == 3);
	}	
	
	@Test
	public void testDoSomeBasicMathOperationMultiplication() {
		double multiplication = traditionalCalculator.doSomeBasicMathOperation(Calculator.OPERATION.MULTIPLICATION, 8, 4);
		System.out.println("The Multiplication result is: "+multiplication);
		assertTrue(Double.compare(multiplication,32) == 0);
	}	
	
	@Test
	public void testDoSomeBasicMathOperationDivision() {
		double division = traditionalCalculator.doSomeBasicMathOperation(Calculator.OPERATION.DIVISION, 100, 10);
		System.out.println("The Division result is: "+division);
		assertTrue(division == 10);
	}	
}
