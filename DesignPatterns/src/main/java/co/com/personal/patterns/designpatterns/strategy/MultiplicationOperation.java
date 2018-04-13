package co.com.personal.patterns.designpatterns.strategy;

public class MultiplicationOperation implements MathOperation {

	@Override
	public double operation(double number1, double number2) {
		return number1 * number2;
	}

}
