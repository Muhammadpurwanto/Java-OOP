package com.tutorial;

public class HeroStrangth extends Hero{
    double defencePower;
    void display(){
        System.out.println("Hero strangth");
        System.out.println("Hero name = "+this.name);
        System.err.println("defencePower = "+this.defencePower);
    }
}
