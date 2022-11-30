package com.hero;
public class HeroStrenght extends Hero{
    public HeroStrenght(String name){
        super(name);
    }
    public void display(){
        System.out.println(this.getName());
    }
    public void setName(String newName){
        super.setName(newName);
    }
}