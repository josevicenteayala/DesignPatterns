/**
 * 
 */
package co.com.personal.patterns.designpatterns.creational.factory.coffeecup;

/**
 * @author vin00
 *
 */
public abstract class FactoryCoffee {

	public static CoffeeType getCoffeeType(CoffeeType.COFFEE coffee) {
		switch (coffee) {
		case CAPPUCCINO:
			return new Cappuccino();
		case MOCHACCINO:
			return new Mochaccino();
		default:
			return new ColombianCoffee();
		}
	}

}
