package co.com.personal.patterns.designpatterns.behavioral.observer;

public class ShoppingMall {

	public void openShoppinfMall() {
		UserObserver observerJose = new UserObserver("Jose");
		UserObserver observerMartha = new UserObserver("Martha");
		
		Discount smartPhoneDiscount = new SmartPhoneDiscount();
		smartPhoneDiscount.addObserver(observerJose);
		smartPhoneDiscount.addObserver(observerMartha);
		
		System.out.println("ShoppingMall.openShoppinfMall(): INICIA CON LOS DESCUENTOS");
		smartPhoneDiscount.initStopDiscount();
		System.out.println("ShoppingMall.openShoppinfMall(): DETIENE LOS DESCUENTOS");
		smartPhoneDiscount.initStopDiscount();
		System.out.println("ShoppingMall.openShoppinfMall(): INICIA CON LOS DESCUENTOS OTRA VEZ");
		smartPhoneDiscount.initStopDiscount();
	}

}
