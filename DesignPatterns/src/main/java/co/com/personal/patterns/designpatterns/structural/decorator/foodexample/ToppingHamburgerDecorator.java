package co.com.personal.patterns.designpatterns.structural.decorator.foodexample;

public abstract class ToppingHamburgerDecorator implements Hamburger {

	protected Hamburger hamburguer;
	
	public ToppingHamburgerDecorator(Hamburger hamburguer) {
		super();
		this.hamburguer = hamburguer;
	}	
	
	@Override
	public String getDescription() {

		return hamburguer.getDescription();
	}

	@Override
	public Double getCost() {

		return hamburguer.getCost();
	}

}
