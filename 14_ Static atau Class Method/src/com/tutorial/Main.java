package com.tutorial;
import java.util.ArrayList;

class Player{
    private static int numberOfPlayer;
    private static ArrayList<String> nameList=new ArrayList<String>();
    private String name;
    
    Player(String name){
        this.name=name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }
    
    void show(){
        System.out.println(this.name);
    }

    static void showNumber(){
        System.out.println("Number : "+Player.numberOfPlayer);
    }

    static ArrayList<String>getName(){
        return Player.nameList;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1=new Player("Sinobi");
        Player player2=new Player("Naruto");
        Player palyer3=new Player("Kakasi");
        Player player4=new Player("Sasuke");
        
        player1.show();
        player2.show();

        Player.showNumber();

        System.out.println("Names = "+Player.getName());
        
    }
    
}
