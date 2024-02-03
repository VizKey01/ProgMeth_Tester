package fighters.derived;

import fighters.base.Attackable;
import fighters.base.Guardable;
import fighters.base.Unit;
import logic.BattleUtils;

public class Guildmaster extends Unit implements Guardable, Attackable {
    public Guildmaster(int maxHealth, int speed, int power, int defense, int location){
        super("Guildmaster", "G", maxHealth, speed, location, false);
        setRange(1);
        setPower(power);
        setDefense(defense);
    }

    @Override
    public boolean move(int spaces) {
        return super.move(-1);
    }

    public void guard(){

    }


    public int attack(Unit e){
        if(sameTeam(e) || !BattleUtils.validRange(getRange(), getLocation(), e.getLocation())){
            return -1;
        }
        else {
            return BattleUtils.calculateDamage(getPower(), e);
        }
    }

}
