package com.tutorial;


public class Mian {
    public static void main(String[] args) {
       Hero hero1 =new Hero("Tomi",2) ;
       hero1.display();

       HeroStrangth hero2=new HeroStrangth("Jesi",4);
       hero2.display();

       Hero hero3=new Hero("Lala");
       hero3.display();
    }
}
