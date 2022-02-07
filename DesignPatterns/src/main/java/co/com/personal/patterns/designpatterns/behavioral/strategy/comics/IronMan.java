/**
 * 
 */
package co.com.personal.patterns.designpatterns.strategy.comics;

/**
 * @author josevicenteayalaluna
 *
 */
public class IronMan extends Character {

	/**
	 * 
	 */
	public IronMan() {
	}

	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.strategy.comics.Character#fight()
	 */
	@Override
	public void fight() {
		System.out.println("IronMan.fight() with his "+weapon.useWeapon());
	}

}
