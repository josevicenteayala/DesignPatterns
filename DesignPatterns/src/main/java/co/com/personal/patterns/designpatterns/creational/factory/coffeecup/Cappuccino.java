/**
 * 
 */
package co.com.personal.patterns.designpatterns.factory.coffeecup;

/**
 * @author vin00
 *
 */
public class Cappuccino implements CoffeeType {

	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.factory.coffeecup.CofeeType#getCoffeeType()
	 */
	@Override
	public String getCoffeeType() {
		return CoffeeType.COFFEE.CAPPUCCINO.getCofeeType();
	}

	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.factory.coffeecup.CofeeType#getCoffeePrice()
	 */
	@Override
	public Double getCoffeePrice() {
		return CoffeeType.COFFEE.CAPPUCCINO.getPrice();
	}

}
