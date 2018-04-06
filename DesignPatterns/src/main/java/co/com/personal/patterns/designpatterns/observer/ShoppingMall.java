package co.com.personal.patterns.designpatterns.observer;

public class ShoppingMall {

	public void openShoppinfMall() {
		UserObserver observerJose = new UserObserver("Jose");
		UserObserver observerMartha = new UserObserver("Martha");
		
		Discount smartPhoneDiscount = new SmartPhoneDiscount();
		smartPhoneDiscount.addObserver(observerJose);
		smartPhoneDiscount.addObserver(observerMartha);
		
		smartPhoneDiscount.initStopDiscount();
		smartPhoneDiscount.initStopDiscount();
		smartPhoneDiscount.initStopDiscount();
	}

}
