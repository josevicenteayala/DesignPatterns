package co.com.personal.patterns.designpatterns.singleton;

/**
 * @author Asus
 * Singleton pattern
 */
public class PoolConnectionSingleton {

	private String poolName;
	private int numberOfAvailableConnections;
	
	
	/**
	 * The constructor must be private
	 */
	private PoolConnectionSingleton() {
	}
	
	
	/**
	 * @author Asus
	 * This class let to return the only instance about PoolConnectionSingleton 
	 */
	private static class SingletonHelper{		
		private static final PoolConnectionSingleton poolConnectionSingleton = new PoolConnectionSingleton();
	};
	
	/**
	 * @return
	 * Return the instance abot PoolConnectionSingleton
	 */
	public static PoolConnectionSingleton getInstance() {
		return SingletonHelper.poolConnectionSingleton;
	}

	public int getNumberOfAvailableConnections() {
		return numberOfAvailableConnections;
	}

	public void setNumberOfAvailableConnections(int numberOfAvailableConnections) {
		this.numberOfAvailableConnections = numberOfAvailableConnections;
	}

	public String getPoolName() {
		return poolName;
	}

	public void setPoolName(String poolName) {
		this.poolName = poolName;
	}
}
