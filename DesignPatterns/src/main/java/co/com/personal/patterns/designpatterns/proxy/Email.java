package co.com.personal.patterns.designpatterns.proxy;

public abstract class Email {

	public abstract boolean sendEmail(String subject, String from, String to, String message);
	
}
