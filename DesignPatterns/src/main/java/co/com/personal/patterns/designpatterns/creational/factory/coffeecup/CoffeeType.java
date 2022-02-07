/**
 * 
 */
package co.com.personal.patterns.designpatterns.factory.coffeecup;

/**
 * @author vin00
 *
 */
public interface CoffeeType {
	
	enum COFFEE {
		CAPPUCCINO("Cappuccino Coffee", 6000.0),MOCHACCINO("Mochaccinno Coffee", 5000.0),COLOMBIANCOFFEE("Colombian Coffee",3000.0);
		private String cofeeType;
		private Double price;
		COFFEE(String coffeeType, Double price){
			this.cofeeType = coffeeType;
			this.price = price;
		}
		
		public String getCofeeType() {
			return cofeeType;
		}
		
		public Double getPrice() {
			return price;
		}
	}
	

	String getCoffeeType();
	
	Double getCoffeePrice();
}
