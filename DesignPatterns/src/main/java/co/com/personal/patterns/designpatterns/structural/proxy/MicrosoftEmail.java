package co.com.personal.patterns.designpatterns.proxy;

public class MicrosoftEmail extends Email {

	@Override
	public boolean sendEmail(String subject, String from, String to, String message) {
		System.out.println("The email was sent by Microsoft Email");
		System.out.println("TO: "+to);
		System.out.println("FROM "+from);
		System.out.println("SUBJECT "+subject);
		System.out.println("MESSAGE "+message);
		return true;
	}

}
