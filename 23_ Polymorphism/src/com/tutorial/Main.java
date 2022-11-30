package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1=new Hero("ucup");
        HeroStrangth hero2=new HeroStrangth("Otong");
        hero1.display();
        hero2.display();

        //polymorphic
        Hero hero3=new HeroAgility("Zilong");
        hero3.display();

        HeroAgility hero4=new HeroAgility("Kagura");
        hero4.display();
        hero4.showOff();

        //Array list
        Hero[]kumpulanHero=new Hero[4];
        kumpulanHero[0]=hero1;
        kumpulanHero[1]=hero2;
        kumpulanHero[2]=hero3;
        kumpulanHero[3]=hero4;

        kumpulanHero[0].display();
        kumpulanHero[1].display();

        //method call
      //  kumpulanHero[4].s

      hero1.attack(hero2);
      hero1.attack(hero3);
    }
}
