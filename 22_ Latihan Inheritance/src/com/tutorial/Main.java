package com.tutorial;



public class Main {
    public static void main(String[] args) {
        Hero hero1=new Hero("sasuke", 10, 100);
        HeroStrangth hero2=new HeroStrangth("kakasi", 20, 100);
        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.display();
        hero2.display();
    }
}
