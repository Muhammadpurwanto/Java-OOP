package com.tutorial;

public class HeroIntel extends Hero {
    String type="intel";
    public HeroIntel(String name, double health){
        super(name,health);

    }
    public void display(){
        System.out.println(this.getName()+" is an "+this.type+" hero");
    }
    public void castMagic(){
        System.out.println("mengeluarkan magic");
    }


}

