package co.com.personal.patterns.designpatterns.creational.factory.coffeecup;

public class Mochaccino implements CoffeeType {

	@Override
	public String getCoffeeType() {
		return CoffeeType.COFFEE.MOCHACCINO.getCofeeType();
	}

	@Override
	public Double getCoffeePrice() {
		return CoffeeType.COFFEE.MOCHACCINO.getPrice();
	}

}
