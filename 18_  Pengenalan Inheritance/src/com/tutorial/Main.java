package com.tutorial;

//inheritance adalah hubungan ia-a
class Hero{
    String name;

    void display(){
        System.out.println("name = "+this.name);
    }
}

class HeroStrength extends Hero{
}

class HeroIntelegent extends Hero{
}

public class Main {
    public static void main(String[] args) {
        Hero hero1=new Hero();
        hero1.name="ucup"; 
        hero1.display();       

        HeroStrength hero2=new HeroStrength();
        hero2.name="otong";
        hero2.display();
        
        HeroIntelegent hero3=new HeroIntelegent();
        hero3.name="kakasi";
        hero3.display();

    }
}
