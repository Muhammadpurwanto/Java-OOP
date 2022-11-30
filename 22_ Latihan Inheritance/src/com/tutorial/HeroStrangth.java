package com.tutorial;

public class HeroStrangth extends Hero{
    String type="Strangth";
    
    HeroStrangth(String nameInput, double attacInput, double healthInput){
        super(nameInput, attacInput, healthInput);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type\t\t: "+this.type);
    }

    @Override
    void takeDamage(double damage){
        System.out.println(this.name+" receive half damage "+damage+" --> "+0.5*damage);
        this.health=this.health-0.5*damage;
    }
}
