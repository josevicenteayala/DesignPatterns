package co.com.personal.patterns.designpatterns.structural.decorator.foodexample;

public class HamburgerCheese extends ToppingHamburgerDecorator {

	public HamburgerCheese(Hamburger hamburguer) {
		super(hamburguer);
		System.out.println("Adding cheese");
	}

	
	@Override
	public String getDescription() {
		return super.getDescription() + ", cheese";
	}
	
	@Override
	public Double getCost() {

		return super.getCost() + 1000.00;
	}
}
