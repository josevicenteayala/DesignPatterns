package co.com.personal.patterns.designpatterns.decorator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.com.personal.patterns.designpatterns.structural.decorator.foodexample.BasicHamburger;
import co.com.personal.patterns.designpatterns.structural.decorator.foodexample.FinalHamburger;
import co.com.personal.patterns.designpatterns.structural.decorator.foodexample.Hamburger;
import co.com.personal.patterns.designpatterns.structural.decorator.foodexample.HamburgerBacon;
import co.com.personal.patterns.designpatterns.structural.decorator.foodexample.HamburgerCheese;

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
		
		//Hamburger hamburgerCheese = new HamburgerCheese(hamburger);
		
		Hamburger hamburgerBaconAndCheese = new HamburgerCheese(hamburgerBacon);
		
		/***************FINAL HAMBURGER**************************************/
		
		Hamburger finalHambuerger = new FinalHamburger(hamburgerBaconAndCheese);
		
		System.out.println("Hamburger Ingredients: "+finalHambuerger.getDescription());
		
		System.out.println("Hamburger price: "+finalHambuerger.getCost());
	}

}
