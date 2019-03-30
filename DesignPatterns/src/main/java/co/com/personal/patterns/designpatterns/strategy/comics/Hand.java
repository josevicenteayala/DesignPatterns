/**
 * 
 */
package co.com.personal.patterns.designpatterns.strategy.comics;

/**
 * @author josevicenteayalaluna
 *
 */
public class Hand implements WeaponBehavior {

	/**
	 * 
	 */
	public Hand() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.strategy.comics.WeaponBehavior#useWeapon()
	 */
	@Override
	public String useWeapon() {
		return "Hand.useWeapon()";
	}

}
