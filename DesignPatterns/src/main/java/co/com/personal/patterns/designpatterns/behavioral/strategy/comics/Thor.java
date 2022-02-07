/**
 * 
 */
package co.com.personal.patterns.designpatterns.behavioral.strategy.comics;

/**
 * @author josevicenteayalaluna
 *
 */
public class Thor extends Character {

	/**
	 * 
	 */
	public Thor() {
	}

	@Override
	public void fight() {
		System.out.println("Thor.fight() with his "+weapon.useWeapon());
	}

}
