package com.tutorial;

public class HeroStrangth extends Hero{
    String type= "Strength";

    HeroStrangth(String nama){
        super(nama);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type\t: "+this.type);
    }
}
