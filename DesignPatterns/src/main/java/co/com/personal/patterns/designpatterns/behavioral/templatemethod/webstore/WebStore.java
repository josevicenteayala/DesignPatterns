package co.com.personal.patterns.designpatterns.behavioral.templatemethod.webstore;

import java.util.Objects;

/**
 * @author Asus
 * This class is a model or reference to buy online products, contains the generic algorithm to do the shopping 
 */
public abstract class WebStore {

	private String user;
	private String password;
	
	public WebStore(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	/**
	 * @throws Exception
	 * Generic algorithm to buy online
	 */
	public void buyOnline() throws Exception {
		authenticate();
		selectItems();
		addPaymentMethod();
		payItems();
		logout();
	}

	public abstract void logout() throws Exception;
	
	private void payItems() throws Exception {
		System.out.println("Proceed to pay Items");
	}

	private void selectItems() throws Exception {
		System.out.println("Adding items at shopping car");
	}

	public abstract void addPaymentMethod() throws Exception;
	
	public void authenticate() throws Exception {
		Objects.requireNonNull(user);
		Objects.requireNonNull(password);
		validateCredentials();
	}

	private void validateCredentials() {
		System.out.println("Validating the credentials and everithing it is OK");
	}
	
}
