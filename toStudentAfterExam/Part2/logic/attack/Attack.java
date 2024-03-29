package Part2.logic.attack;

import Part2.logic.monster.Monster;

public class Attack {
	protected int power;
	protected String name;
	protected boolean isLeader;

	public Attack(int power, String name,boolean isLeader) {
		this.setPower(power);
		this.setName(name);
		this.setLeader(isLeader);
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = Math.max(power, 0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.isBlank()? "No Name":name;
	}

	public boolean isLeader() {
		return isLeader;
	}

	public void setLeader(boolean isLeader) {
		this.isLeader = isLeader;
	}

	public int calculateDamage(Monster target) {
		return Math.max(getPower() - target.getDefense(), 0);
	}
	
	@Override
	public boolean equals(Object o) {
		//If the comparison is the object itself
	    if (this == o) {
	        return true;
	    }
	    //If the other one is null
	    if (o == null) {
	        return false;
	    }
	    //Type checking, then cast
	    if (getClass() != o.getClass()) {
	        return false;
	    }
	    Attack other = (Attack) o;
	    return power==other.power && name.equals(other.getName()) && isLeader==other.isLeader();
	}
}
