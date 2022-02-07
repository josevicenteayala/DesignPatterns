package co.com.personal.patterns.designpatterns.proxy;

import static org.junit.Assert.*;

import co.com.personal.patterns.designpatterns.structural.proxy.Email;
import co.com.personal.patterns.designpatterns.structural.proxy.ProxyMicrosoftEmail;
import org.junit.Before;
import org.junit.Test;

public class ProxyMicrosoftEmailTest {

	private Email email;
	
	@Before
	public void init() {
		email = new ProxyMicrosoftEmail();
	}

	@Test
	public void testSendEmailAllDataIsOk() {
		String to ="testTo@test.com";
		String subject = "Test every thing is ok";
		String message = "Every thing is OK";
		String from = "testFrom@test.com";
		boolean response = email.sendEmail(subject, from, to, message);
		assertTrue(response);
	}

	@Test
	public void testSendEmailNoToData() {
		String to =null;
		String subject = "Test every thing is ok";
		String message = "Every thing is OK";
		String from = "testFrom@test.com";
		try {
			email.sendEmail(subject, from, to, message);
		}catch(Exception e){
			assertNotNull(e);
		}
	}	
	
	@Test
	public void testSendEmailNoFromData() {
		String to = "testTo@test.com";
		String subject = "Test every thing is ok";
		String message = "Every thing is OK";
		String from = null;
		try {
			email.sendEmail(subject, from, to, message);
		}catch(Exception e){
			assertNotNull(e);
		}
	}	
	
	@Test
	public void testSendEmailNoSubjectData() {
		String to = "testTo@test.com";
		String subject = null;
		String message = "Every thing is OK";
		String from = "testFrom@test.com";
		try {
			email.sendEmail(subject, from, to, message);
		}catch(Exception e){
			assertNotNull(e);
		}
	}	
	
	@Test
	public void testSendEmailNoMessageData() {
		String to = "testTo@test.com";
		String subject = "Test every thing is ok";
		String message = null;
		String from = "testFrom@test.com";
		try {
			email.sendEmail(subject, from, to, message);
		}catch(Exception e){
			assertNotNull(e);
		}
	}	
	
}
