package com.tutorial;
import com.hero.Hero;
import com.hero.HeroAgility;
import com.hero.HeroIntel;

public class Main {
    public static void main(String[] args) {
        //non abstrak
        HeroIntel hero1=new HeroIntel("otong");
        hero1.display();

        //class abstrak
        HeroAgility hero2=new HeroAgility("mario");
        hero2.display();
            
        hero1.levelUp();
        hero2.levelUp();
        hero1.display();
        hero2.display();
    }
}
