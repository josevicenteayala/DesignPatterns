package co.com.personal.patterns.designpatterns.behavioral.strategy;

/**
 * @author joseaylu
 * This is the strategy, that let changed the behavior at run time.
 *
 */
public interface MathOperation {

	double operation(double number1, double number2);
	
}
