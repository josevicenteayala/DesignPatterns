/**
 * 
 */
package co.com.personal.patterns.designpatterns.strategy;

import org.junit.Before;
import org.junit.Test;

import co.com.personal.patterns.designpatterns.strategy.comics.Armory;
import co.com.personal.patterns.designpatterns.strategy.comics.Captain;
import co.com.personal.patterns.designpatterns.strategy.comics.Character;
import co.com.personal.patterns.designpatterns.strategy.comics.Hammer;
import co.com.personal.patterns.designpatterns.strategy.comics.Hand;
import co.com.personal.patterns.designpatterns.strategy.comics.IronMan;
import co.com.personal.patterns.designpatterns.strategy.comics.Marvel;
import co.com.personal.patterns.designpatterns.strategy.comics.Thor;
import co.com.personal.patterns.designpatterns.strategy.comics.WeaponBehavior;

/**
 * @author josevicenteayalaluna
 *
 */
public class MarvelTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link co.com.personal.patterns.designpatterns.strategy.comics.Marvel#showFight()}.
	 */
	@Test
	public void testShowFight() {
		Character character = null;
		WeaponBehavior weaponBehavior;
		Marvel marvel = new Marvel();
		for (int i = 0; i < 10; i++) {
			double randomCharacter = Math.ceil(Math.random()*10);
			if(randomCharacter< 4) {
				character = new Captain();
			} else if(randomCharacter > 3 && randomCharacter < 8) {
				character = new IronMan();
			} else {
				character = new Thor();
			}
			double randomWeapon = Math.ceil(Math.random()*10);
			
			if(randomWeapon<4) {
				weaponBehavior = new Armory();
			}else if (randomWeapon > 3 && randomWeapon < 8) {
				weaponBehavior = new Hammer();
			}else {
				weaponBehavior = new Hand();
			}
			
			character.setWeaponBehavior(weaponBehavior);
			marvel.setCharacter(character);
			marvel.showFight();
			waitAFewSeconds();
		}
		
		
	}

	
	private void waitAFewSeconds() {
		try {
			Thread.sleep(2000,500);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
}
