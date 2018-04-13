package co.com.personal.patterns.designpatterns.strategy;

public class DivisionOperation implements MathOperation {

	@Override
	public double operation(double dividend, double divisor) {
		if(divisor == 0 ) {
			throw new NumberFormatException();
		}
		return dividend/divisor;
	}

}
