package com.tutorial;

//player
class Player{
    String name;
    double health;
    int level;

    //objec member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
      this.name=name;
      this.health=health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon=weapon;

    }
    void equipArmor(Armor armor){
    this.armor=armor;

    }
    void display(){
        System.out.println("Nama : "+this.name);
        System.out.println("Health : "+this.health+" hp");
        this.weapon.display();
        this.armor.display();

    }

}

//senjata
class Weapon{
    double attackPower;
    String name;
    Weapon(String name, double attackPower){
        this.name=name;
        this.attackPower=attackPower;

    }
    void display(){
        System.out.println("Weapon : "+this.name+",  power : "+this.attackPower);

    }

}


//armor
class Armor{
    String nama;
    double defencePower;
    Armor(String nama, double defencePower){
        this.nama=nama;
        this.defencePower=defencePower;
    }
 void display(){
        System.out.println("Armor : "+this.nama+",  defence : "+this.defencePower);

    }
}



public class Main {
    public static void main(String[] args) {


    //membuat object player 
    Player player1=new Player("ucup", 100);
    Player player2=new Player("otong", 50);


    //membuat object weapon
    Weapon weapon1=new Weapon("pedang",15);
    Weapon weapon2=new Weapon("ketapel",5);

    //membuat object armor
    Armor armor1=new Armor("baju besi",10);
    Armor armor2=new Armor("kaos",2);

    //equip weapon dan armor
    player1.equipWeapon(weapon1);
    player1.equipArmor(armor1);
    player1.display();

    player2.equipWeapon(weapon2);
    player2.equipArmor(armor2);
    player2.display();



    }
}
