package co.com.personal.patterns.designpatterns.structural.decorator.foodexample;

public class FinalHamburger extends ToppingHamburgerDecorator {

	public FinalHamburger(Hamburger hamburger) {
		super(hamburger);
		System.out.println("FinalHamburger.FinalHamburger()");
	}

}
