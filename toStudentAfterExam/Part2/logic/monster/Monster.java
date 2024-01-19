package Part2.logic.monster;

import Part2.logic.attack.Attack;

public class Monster {
	protected String name;
	protected int hp;
	protected int maxhp;
	protected int def;
	protected int sp_def;
	protected Attack attack;
	
	protected boolean isDead;
	protected boolean attackStatus;
	
	public Monster(String name, int hp, int def, int sp_def, Attack attack) {
		this.setName(name);
		this.setMaxhp(hp);
		this.setHp(hp);
		this.setDefense(def);
		this.setSpecialDefense(sp_def);
		this.setAttack(attack);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.isBlank()? "No Name":name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp<0? 0: (Math.min(hp, maxhp));
	}

	public int getDefense() {
		return def;
	}

	public void setDefense(int def) {
		this.def = Math.max(def, 0);
	}

	public int getSpecialDefense() {
		return sp_def;
	}

	public void setSpecialDefense(int sp_def) {
		this.sp_def = Math.max(sp_def, 0);
	}

	public Attack getAttack() {
		return attack;
	}

	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	
	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}

	public int getMaxhp() {
		return maxhp;
	}

	public int takeDamage(Attack attack) {
		/*FILL CODE*/
		
		
		return 0;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	public boolean isReady() {
		return true;
	}
	
	public boolean getAttackedStatus() {
		return attackStatus;
	}

	public void setAttackedStatus(boolean isAttacked) {
		this.attackStatus = isAttacked;
	}
	
	
	
}
