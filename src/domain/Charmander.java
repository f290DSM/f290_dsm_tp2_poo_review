package domain;

import domain.intefaces.FireType;

public class Charmander extends Pokemon implements FireType{

    public Charmander(String nick, int cp, int hp) {
        super(nick, cp, hp);
    }

    @Override
    public void attack() {
        amber();
    }

    @Override
    public void amber() {
        System.out.println("Charmander executou o ataque amber!");
    }
}
