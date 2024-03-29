package co.com.personal.patterns.designpatterns.behavioral.strategy;

public abstract class Calculator {

	public enum OPERATION{
		SUM, DIFFERENCE, MULTIPLICATION, DIVISION
	}
	
	private MathOperation mathOperation;
	
	void setMathOperation(MathOperation mathOperation) {
		this.mathOperation = mathOperation;
	}
	
	double getResultOperation(double number1, double number2) {
		return mathOperation.operation(number1, number2);
	}
	
}
