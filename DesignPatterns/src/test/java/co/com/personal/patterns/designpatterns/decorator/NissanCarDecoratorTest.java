package co.com.personal.patterns.designpatterns.decorator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NissanCarDecoratorTest {

	private Car nissanCar;
	private Car nissanCarDecorator;
	
	@Before
	public void init() {
		nissanCar = new Nissan();
		nissanCarDecorator = new NissanCarDecorator(nissanCar);
	}
	
	@Test
	public void testRunSimpleNissanCar() {
		nissanCar.run();
		assertNotNull(nissanCar);
	}

	@Test
	public void testRunNissanCarDecorator() {
		nissanCarDecorator.run();
		assertNotNull(nissanCarDecorator);
	}

}
