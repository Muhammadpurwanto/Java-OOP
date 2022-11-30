package com.tutorial;

public class Player {
    private String name;
    private static int jumlahPlayer;

    //over loading constructor
    //opsi 1
    Player(String name){
        Player.jumlahPlayer++;
        this.name=name;
    }

    //opsi 2
    Player(){
        this.name="player"+Player.jumlahPlayer++;
    }

    void show(){
        System.out.println("Name = "+this.name);
    }
}
