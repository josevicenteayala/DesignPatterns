package co.com.personal.patterns.designpatterns.templatemethod;

import static org.junit.Assert.*;

import java.util.Base64;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.com.personal.patterns.designpatterns.templatemethod.FootballWebStore;
import co.com.personal.patterns.designpatterns.templatemethod.MarketWebStore;
import co.com.personal.patterns.designpatterns.templatemethod.WebStore;

public class WebStoreTest {

	private WebStore footBallWebStore;
	private WebStore marketWebStore;
	private static String user;
	private static String password;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		user = WebStore.class.getSimpleName();		
		byte[] decode = Base64.getDecoder().decode(user);
		password = decode.toString();
	}

	@Before
	public void setUp() throws Exception {
		footBallWebStore = new FootballWebStore(user, password);
		marketWebStore = new MarketWebStore(user, password);
	}

	@Test
	public void testBuyOnlineInFootBallWebStore() {
		assertNotNull(footBallWebStore);
		System.out.println("*********Shopping in FootBall Store********");
		try {
			footBallWebStore.buyOnline();
		} catch (Exception e) {
		}
	}

	@Test
	public void testBuyOnlineInMarketWebStore() {
		assertNotNull(marketWebStore);
		System.out.println("*********Shopping in Market Store********");
		try {
			marketWebStore.buyOnline();
		} catch (Exception e) {
		}
	}	
	
}
