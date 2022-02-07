package co.com.personal.patterns.designpatterns.singleton;

import static org.junit.Assert.*;

import co.com.personal.patterns.designpatterns.creational.singleton.PoolConnectionSingleton;
import org.junit.Before;
import org.junit.Test;

public class PoolConnectionSingletonTest {

	private static final String POOL_FROM_TESTGETINSTANCE1 = "POOL_FROM_TESTGETINSTANCE1";
	private static final String POOL_FROM_TESTGETINSTANCE2 = "POOL_FROM_TESTGETINSTANCE2";
	private PoolConnectionSingleton poolConnectionSingleton;
	
	@Before
	public void init(){
		poolConnectionSingleton = PoolConnectionSingleton.getInstance();
	}
		
	@Test
	public void testGetInstance1() {
		String poolName = poolConnectionSingleton.getPoolName();
		System.out.println("Pool Name over testGetInstance1: "+poolName);
		assertNull(poolName);
		poolConnectionSingleton.setPoolName(POOL_FROM_TESTGETINSTANCE1);
	}

	@Test
	public void testGetInstance2() {
		poolConnectionSingleton = PoolConnectionSingleton.getInstance();
		String poolName = poolConnectionSingleton.getPoolName();
		System.out.println("Pool Name over testGetInstance2: "+poolName);
		assertEquals(POOL_FROM_TESTGETINSTANCE1, poolName);
		poolConnectionSingleton.setPoolName(POOL_FROM_TESTGETINSTANCE2);
	}
	
	@Test
	public void testGetInstance3() {
		poolConnectionSingleton = PoolConnectionSingleton.getInstance();
		String poolName = poolConnectionSingleton.getPoolName();
		System.out.println("Pool Name over testGetInstance3: "+poolName);
		assertEquals(POOL_FROM_TESTGETINSTANCE2, poolName);
	}	
}
