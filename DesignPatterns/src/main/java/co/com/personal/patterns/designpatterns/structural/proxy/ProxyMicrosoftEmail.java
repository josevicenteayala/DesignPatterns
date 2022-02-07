package co.com.personal.patterns.designpatterns.structural.proxy;

import java.util.Objects;

public class ProxyMicrosoftEmail extends MicrosoftEmail {
	
	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.proxy.MicrosoftEmail#sendEmail(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * This is the proxy, and this method validate the input data
	 */
	@Override
	public boolean sendEmail(String subject, String from, String to, String message) {
		Objects.requireNonNull(subject);
		Objects.requireNonNull(from);
		Objects.requireNonNull(to);
		Objects.requireNonNull(message);
		return super.sendEmail(subject, from, to, message);
	}
}
