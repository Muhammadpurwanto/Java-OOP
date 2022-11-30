package com.tutorial;

class Player{
    private String name;

    public int demage;
    private int attack;

    Player(String name, int demage, int attack){
        this.name=name;
        this.demage=demage;
        this.attack=attack;
    }
    void display(){
        tambahDemage();
        System.out.println("Name : "+this.name);
        System.out.println("Demage : "+this.demage);
        System.out.println("Attack : "+this.attack);
    }
     void setName(String ubahNama){
         this.name=ubahNama;
    }
     private void tambahDemage(){
         this.demage+=10;
     }
}

public class Main {
    public static void main(String[] args) {
        Player player1=new Player("Tono",20,15);
        player1.display();
        player1.setName("agus");
        player1.display();
    }
    
}
