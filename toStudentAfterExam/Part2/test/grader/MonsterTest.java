package Part2.test.grader;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Part2.logic.attack.Attack;
import Part2.logic.attack.SPAttack;
import Part2.logic.monster.Monster;

class MonsterTest {

	Monster m;
	Attack a;
	
	@BeforeEach
	void setUp(){
		m = new Monster("Greninja",20,3,2,new Attack(12,"Hydro Cannon",true));
	}

	@Test
	void testTakeDamage() {
		Attack opponent = new Attack(10,"Thunder Punch",false);
		m.takeDamage(opponent);
		
		assertEquals(13,m.getHp());
		assertEquals(false,m.isDead());
	}
	
	@Test
	void testTakeDamage_SP() {
		SPAttack opponent = new SPAttack(10,"Thunder Punch",false);
		m.takeDamage(opponent);
		
		assertEquals(12,m.getHp());
		assertEquals(false,m.isDead());
	}
	
	@Test
	void testTakeDamageDead() {
		Attack opponent = new Attack(30,"Thunder Punch",false);
		m.takeDamage(opponent);
		
		assertEquals(0,m.getHp());
		assertEquals(true,m.isDead());
	}

}
