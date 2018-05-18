package co.com.personal.patterns.designpatterns.decorator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.com.personal.patterns.designpatterns.decorator.foodexample.BasicHamburger;
import co.com.personal.patterns.designpatterns.decorator.foodexample.Hamburger;
import co.com.personal.patterns.designpatterns.decorator.foodexample.HamburgerBacon;
import co.com.personal.patterns.designpatterns.decorator.foodexample.HamburgerCheese;

public class HamburguerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMakeHamburguer() {
		
		Hamburger hamburger = new BasicHamburger();
		
		Hamburger hamburgerBacon = new HamburgerBacon(hamburger);
		
		Hamburger hamburgerBaconAndCheese = new HamburgerCheese(hamburgerBacon);
		
		System.out.println("Hamburger Ingredients: "+hamburgerBaconAndCheese.getDescription());
		
		System.out.println("Hamburger price: "+hamburgerBaconAndCheese.getCost());
	}

}
