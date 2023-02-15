package Diablo;

import Diablo.Character;

public class Sorceress extends Character {
    public Sorceress() {
        hp = 300;
        mp = 550;
    }

    @Override
    public void info() {
        System.out.println("체력 : " + hp + "\n지능 : "+ mp);
    }
}
