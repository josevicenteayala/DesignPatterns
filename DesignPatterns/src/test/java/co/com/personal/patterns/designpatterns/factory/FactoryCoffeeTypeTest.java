/**
 * 
 */
package co.com.personal.patterns.designpatterns.factory;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import co.com.personal.patterns.designpatterns.creational.factory.coffeecup.CoffeeType;
import co.com.personal.patterns.designpatterns.creational.factory.coffeecup.FactoryCoffee;

/**
 * @author vin00
 *
 */
public class FactoryCoffeeTypeTest {
	
	@Before
	public void init() {
		
	}
	
	/**
	 * Test method for {@link FactoryCoffee#getCoffeeType(CoffeeType.COFFEE)}.
	 */
	@Test
	public void testGetCoffeeTypeCappuccino() {
		CoffeeType coffeeType = FactoryCoffee.getCoffeeType(CoffeeType.COFFEE.CAPPUCCINO);
		assertTrue("it is not cappuccino coffee",coffeeType.getCoffeeType().equals(CoffeeType.COFFEE.CAPPUCCINO.getCofeeType()));
	}

	/**
	 * Test method for {@link FactoryCoffee#getCoffeeType(CoffeeType.COFFEE)}.
	 */
	@Test
	public void testGetCoffeeTypeMochaccino() {
		CoffeeType coffeeType = FactoryCoffee.getCoffeeType(CoffeeType.COFFEE.MOCHACCINO);
		assertTrue("it is not mochaccino coffee",coffeeType.getCoffeeType().equals(CoffeeType.COFFEE.MOCHACCINO.getCofeeType()));
	}
	
	/**
	 * Test method for {@link FactoryCoffee#getCoffeeType(CoffeeType.COFFEE)}.
	 */
	@Test
	public void testGetCoffeeTypeColombianCoffee() {
		CoffeeType coffeeType = FactoryCoffee.getCoffeeType(CoffeeType.COFFEE.COLOMBIANCOFFEE);
		assertTrue("it is not Colombian coffee",coffeeType.getCoffeeType().equals(CoffeeType.COFFEE.COLOMBIANCOFFEE.getCofeeType()));
	}
}
