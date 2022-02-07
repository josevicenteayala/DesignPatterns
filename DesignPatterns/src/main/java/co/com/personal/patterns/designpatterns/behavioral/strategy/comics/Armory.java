/**
 * 
 */
package co.com.personal.patterns.designpatterns.behavioral.strategy.comics;

/**
 * @author josevicenteayalaluna
 *
 */
public class Armory implements WeaponBehavior {

	/**
	 * 
	 */
	public Armory() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.strategy.comics.WeaponBehavior#useWeapon()
	 */
	@Override
	public String useWeapon() {
		return "Armory.useWeapon()";
	}

}
