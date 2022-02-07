package co.com.personal.patterns.designpatterns.behavioral.templatemethod;

public class MarketWebStore extends WebStore {

	public MarketWebStore(String user, String password) {
		super(user, password);
	}

	@Override
	public void logout() throws Exception {
		System.out.println("Logout from MarketWebStore");
	}

	@Override
	public void addPaymentMethod() throws Exception {
		System.out.println("The payment in the market store is only cash");
	}

}
