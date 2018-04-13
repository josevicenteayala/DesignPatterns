package co.com.personal.patterns.designpatterns.strategy;

public class DifferenceOperation implements MathOperation {

	@Override
	public double operation(double number1, double number2) {
		return Double.sum(number1, -number2);
	}

}
