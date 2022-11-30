package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1=new Hero("ucup", 100);
        HeroIntel hero2=new HeroIntel("otong", 50);

        hero1.display();
        hero2.display();

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());

        hero1.setHealth(120);
        hero2.setHealth(80);

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());
    }
}
