package domain;

import domain.intefaces.ElectricType;
import domain.intefaces.FlyingType;

public class Zapdos extends Pokemon
        implements ElectricType, FlyingType {

    public Zapdos(String nick, int cp, int hp) {
        super(nick, cp, hp);
    }

    @Override
    public void attack() {
        wingAttack();
        thunderbolt();
    }
    @Override
    public void wingAttack() {
        System.out.printf("%s aplicou o ataque wingAttack!\n",
                getNick());
    }
    @Override
    public void thunderbolt() {
        System.out.printf("%s aplicou o ataque thunderbolt!\n",
                getNick());
    }

}
