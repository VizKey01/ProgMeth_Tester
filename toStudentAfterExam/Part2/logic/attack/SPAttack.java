package Part2.logic.attack;

import Part2.logic.monster.Monster;

public class SPAttack {
    // Method
    public int calculateDamage (Monster target) {

        return Math.max(0,getPower() - target.getSpecialDefense());
    }

}
