package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //objec dengan class hero intel
        HeroIntel hero1=new HeroIntel("ucup", 100);
        hero1.display();

        //bisa up casting dari sub class ke super class
        Hero heroUp=(Hero) hero1;
        heroUp.display();
        Hero hero2=new Hero("otong", 80);
        hero2.display();

        // System.out.println(heroUp.type);
        // heroUp.castMagic();

        //tidak bisa down casting dari super class ke sub class
        // HeroAgility heroDown=(HeroAgility)hero2;
        // heroDown.display();

        //bisa dikembalikan ke hero intel
        HeroIntel heroDown=(HeroIntel)heroUp;
        heroDown.display();
        System.out.println(heroDown.type);
        heroDown.castMagic();
    }
}
