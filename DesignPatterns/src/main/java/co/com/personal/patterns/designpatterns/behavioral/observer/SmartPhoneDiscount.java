package co.com.personal.patterns.designpatterns.behavioral.observer;

import java.util.Observable;

/**
 * @author Asus
 * This class implements the discount relative to smartphones
 */
public class SmartPhoneDiscount  extends Observable implements Discount{

	private boolean discountIsActive;
	@Override
	public double getDiscount() {
		if(discountIsActive) {
			return TEN_PERCENT_DISCOUNT;
		}
		return CERO_PERCENT_DISCOUNT;
	}

	/*when this method is called, immediately the register's objects will be notified*/
	@Override
	public void initStopDiscount() {
		if(discountIsActive) {
			discountIsActive = false;
		}else {
			setChanged();
			discountIsActive = true;
			notifyObservers(this);
		}
	}

}
