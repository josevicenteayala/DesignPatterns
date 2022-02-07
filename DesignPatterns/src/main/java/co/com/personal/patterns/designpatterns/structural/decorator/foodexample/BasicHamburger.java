package co.com.personal.patterns.designpatterns.structural.decorator.foodexample;

public class BasicHamburger implements Hamburger {

	@Override
	public String getDescription() {
		return "bread, tomato, lettuce, meat";
	}

	@Override
	public Double getCost() {
		return 3000.00;
	}

}
