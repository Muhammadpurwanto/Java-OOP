package com.tutorial;

public class HeroAgility extends Hero{
    String type="Agility";
    public HeroAgility(String name, double health){
        super(name,health);

    }
    public void display(){
        System.out.println(this.getName()+" is an "+this.type+" hero");
    }
}
