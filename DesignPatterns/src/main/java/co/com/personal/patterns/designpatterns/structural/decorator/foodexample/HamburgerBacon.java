package co.com.personal.patterns.designpatterns.decorator.foodexample;

public class HamburgerBacon extends ToppingHamburgerDecorator {

	public HamburgerBacon(Hamburger hamburguer) {
		super(hamburguer);
		System.out.println("Adding Bacon");
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", bacon";
	}
	
	@Override
	public Double getCost() {
		return super.getCost() + 1500.00;
	}
}
