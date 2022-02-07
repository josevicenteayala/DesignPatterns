package co.com.personal.patterns.designpatterns.behavioral.templatemethod;

public class FootballWebStore extends WebStore {

	public FootballWebStore(String user, String password) {
		super(user, password);
	}

	@Override
	public void logout() throws Exception {
		System.out.println("Logout from Football Store");
	}

	@Override
	public void addPaymentMethod() throws Exception {
		System.out.println("the football store receive all kind of payments");
	}

}
