package co.com.personal.patterns.designpatterns.strategy;

public class TraditionalCalculator extends Calculator{

	public double doSomeBasicMathOperation(OPERATION operation, double number1, double number2) {
		switch(operation) {
			case SUM:{
				MathOperation mathOperation = new SumOperation();
				return calculateMathResult(number1, number2, mathOperation);
			}
			case DIFFERENCE:{
				MathOperation mathOperation = new DifferenceOperation();
				return calculateMathResult(number1, number2, mathOperation);				
			}
			case DIVISION:{
				MathOperation mathOperation = new DivisionOperation();
				return calculateMathResult(number1, number2, mathOperation);				
			}
			case MULTIPLICATION:{
				MathOperation mathOperation = new MultiplicationOperation();
				return calculateMathResult(number1, number2, mathOperation);				
			}
			default: return 0;
		}
	}

	/**
	 * @param number1
	 * @param number2
	 * @param mathOperation
	 * @return
	 */
	private double calculateMathResult(double number1, double number2, MathOperation mathOperation) {
		setMathOperation(mathOperation);
		return getResultOperation(number1, number2);
	}
	
}
