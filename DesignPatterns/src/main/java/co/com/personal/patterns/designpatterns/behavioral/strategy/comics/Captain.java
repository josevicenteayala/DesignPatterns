/**
 * 
 */
package co.com.personal.patterns.designpatterns.behavioral.strategy.comics;

/**
 * @author josevicenteayalaluna
 *
 */
public class Captain extends Character {

	/**
	 * 
	 */
	public Captain() {

	}

	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.strategy.comics.Character#fight()
	 */
	@Override
	public void fight() {
		System.out.println("Captain.fight() with his "+weapon.useWeapon());
	}

}
