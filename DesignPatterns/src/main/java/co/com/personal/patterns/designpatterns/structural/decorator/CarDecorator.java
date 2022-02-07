package co.com.personal.patterns.designpatterns.structural.decorator;

/**
 * @author Asus
 * This class is a guarantee that the original functionality is keeping
 */
public abstract class CarDecorator implements Car {

	protected Car car;
	
	public CarDecorator(Car decoratedCar) {
		car = decoratedCar;
	}
	
	@Override
	public void run() {
		car.run();
	}

}
