package co.com.personal.patterns.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class UserObserver implements Observer {
	private String userName;
	
	public UserObserver(String userName) {
		this.userName = userName;
	}
	
	@Override
	public void update(Observable observable, Object objectHasBeenModify) {	
		Discount smartPhoneDiscount = (Discount)objectHasBeenModify;
		System.out.println("user "+userName+" has been notified about the SmartPhone discount");		
		System.out.println("The discount is: "+smartPhoneDiscount.getDiscount());
	}

}
