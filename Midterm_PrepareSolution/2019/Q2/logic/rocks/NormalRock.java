package logic.rocks;

import logic.zombies.Zombie;

public class NormalRock {
    protected int damage;

    public NormalRock(int damage) {
        setDamage(damage);
    }

    public void setDamage(int damage) {
        this.damage = Math.max(damage, 0);
    }

    public int getDamage(){
        return damage;
    }

    public int dealDamage(Zombie zombie) {
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
    public String toString() {
        return "Normal Rock (" + getDamage() + ")";
    }

}
