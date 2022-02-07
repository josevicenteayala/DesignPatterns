/**
 * 
 */
package co.com.personal.patterns.designpatterns.strategy.comics;

/**
 * @author josevicenteayalaluna
 *
 */
public abstract class Character {
	WeaponBehavior weapon;
	
	public abstract void fight();
	
	public void setWeaponBehavior(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
}
