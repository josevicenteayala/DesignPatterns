package co.com.personal.patterns.designpatterns.observer;

import org.junit.Before;
import org.junit.Test;

public class ShoppingMallTest {

	private ShoppingMall shoppingMall;
	
	@Before
	public void init() {
		shoppingMall = new ShoppingMall();
	}
	
	@Test
	public void testOpenShoppinfMall() {
		shoppingMall.openShoppinfMall();
	}

}
