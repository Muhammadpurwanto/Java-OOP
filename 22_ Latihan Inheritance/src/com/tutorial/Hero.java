package com.tutorial;

public class Hero{
    String name;
    double attacPower, health;

    Hero(String nameInput, double attacInput, double healthInput){
        this.name=nameInput;
        this.attacPower=attacInput;
        this.health=healthInput;
    }

    void attack(Hero enemy){
        System.out.println("\n"+this.name+" attack "+enemy.name);
        enemy.takeDamage(this.attacPower);
    }

    void takeDamage(double damage){
        System.out.println(this.name+" receive damage "+damage);
        this.health=this.health-damage;
    }

    void display(){
        System.out.println("\nName\t\t: "+this.name);
        System.out.println("Attack Power\t: "+this.attacPower);
        System.out.println("Health\t\t: "+this.health);
    }
}
