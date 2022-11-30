package com.tutorial;

public class Hero {
    String nama;

    Hero(String nama){
       this.nama=nama;
    }

    void display(){
        System.out.println("\nnama\t: "+this.nama);
    }

    void attack(Hero enemy){
        System.out.println(this.nama+" Menyerang "+enemy.nama);
    }
}
