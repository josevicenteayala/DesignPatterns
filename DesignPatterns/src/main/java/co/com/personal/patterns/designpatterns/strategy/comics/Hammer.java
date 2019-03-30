/**
 * 
 */
package co.com.personal.patterns.designpatterns.strategy.comics;

/**
 * @author josevicenteayalaluna
 *
 */
public class Hammer implements WeaponBehavior {

	/**
	 * 
	 */
	public Hammer() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.strategy.comics.WeaponBehavior#useWeapon()
	 */
	@Override
	public String useWeapon() {
		return "Hammer.useWeapon()";
	}

}
