package logic.rocks;

import logic.zombies.Zombie;

public class PoisonRock extends NormalRock {
    private int damage;
    private int damageOverTime;

    public PoisonRock (int damage, int damageOverTime){
        super(damage);
        setDamageOverTime(damageOverTime);
    }

    public void setDamageOverTime(int damageOT) {
        this.damageOverTime = Math.max(0, damageOT);
    }

    public int getDamageOverTime() {
        return damageOverTime;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int dealDamage(Zombie zombie) {

        zombie.setDecay(damageOverTime);
        int atk = damage;
        if(zombie.getDefense() < damage) {
            atk = Math.max(atk - zombie.getDefense(), 0);
        }
        else {
            atk = 0;
        }

        zombie.setHealth(Math.max(zombie.getHealth() - atk, 0));
        return atk;
    }

    @Override
    public String toString(){
        return "Poison Rock (" + getDamage() +", DoT = " +getDamageOverTime() +")";
    }

}
