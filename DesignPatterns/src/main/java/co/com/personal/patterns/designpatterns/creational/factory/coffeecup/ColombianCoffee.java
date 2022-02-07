/**
 * 
 */
package co.com.personal.patterns.designpatterns.factory.coffeecup;

/**
 * @author vin00
 *
 */
public class ColombianCoffee implements CoffeeType {

	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.factory.coffeecup.CoffeeType#getCoffeeType()
	 */
	@Override
	public String getCoffeeType() {
		return CoffeeType.COFFEE.COLOMBIANCOFFEE.getCofeeType();
	}

	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.factory.coffeecup.CoffeeType#getCoffeePrice()
	 */
	@Override
	public Double getCoffeePrice() {
		return CoffeeType.COFFEE.COLOMBIANCOFFEE.getPrice();
	}

}
