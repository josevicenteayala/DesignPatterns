package co.com.personal.patterns.designpatterns.decorator;

public class NissanCarDecorator extends CarDecorator {

	public NissanCarDecorator(Car decoratedCar) {
		super(decoratedCar);
	}
	
	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.decorator.CarDecorator#run()
	 * Run the same functionality as the original car but add another function, without modify the first one 
	 */
	@Override
	public void run() {
		car.run();
		runFaster();
	}

	private void runFaster() {
		System.out.println("The car run faster now.");
	}
	
}
