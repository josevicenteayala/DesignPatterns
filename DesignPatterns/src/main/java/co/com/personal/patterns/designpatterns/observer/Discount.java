package co.com.personal.patterns.designpatterns.observer;

import java.util.Observer;

/**
 * @author Asus
 * This interface define the main methods to use in the example
 */
public interface Discount {

	int CERO_PERCENT_DISCOUNT = 0;
	int TEN_PERCENT_DISCOUNT = 10;
	
	double getDiscount();
	void initStopDiscount();
	
	public void addObserver(Observer o);
	public void deleteObserver(Observer o);
	public void notifyObservers(Object arg);
	public void deleteObservers();
	public boolean hasChanged();
	public int countObservers();
}
