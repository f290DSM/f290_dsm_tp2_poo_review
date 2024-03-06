package domain;

import domain.intefaces.ElectricType;
import domain.intefaces.FireType;

public class Pikachu extends Pokemon implements ElectricType {

    public Pikachu(String nick, int cp, int hp) {
        super(nick, cp, hp);
    }

    @Override
    public void attack() {
        thunderbolt();
    }

    @Override
    public void thunderbolt() {
        System.out.println("Pikachu executou o ataque thunderbolt!");
    }

}
