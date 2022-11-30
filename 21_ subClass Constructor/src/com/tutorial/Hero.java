package com.tutorial;

public class Hero{
    String name;
    double defencePower;

    Hero(String name, double defencePower){
      this.name=name;
      this.defencePower=defencePower;
    }

    Hero(String name){
        this.name=name;
    }

    void display(){
        System.out.println("name = "+this.name+this.defencePower);
    }
}
