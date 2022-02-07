/**
 * 
 */
package co.com.personal.patterns.designpatterns.behavioral.strategy.comics;

/**
 * @author josevicenteayalaluna
 *
 */
public class Marvel {

	private Character character;
	/**
	 * 
	 */
	public Marvel() {
	}

	public void setCharacter(Character character) {
		this.character = character;
	}
	
	public void showFight() {
		character.fight();
	}
	
}
