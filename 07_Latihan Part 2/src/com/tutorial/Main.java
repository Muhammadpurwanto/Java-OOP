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
    void attack(Player musuh){
        double damage=this.weapon.attackPower;
        System.out.println(this.name+" attacking "+musuh.name+" with power "+damage);        
        musuh.defence(damage);
    }
    void defence(double damage){
        //akan mengambil demage
        double power;
        if(this.armor.defencePower<damage){

            power= damage - this.armor.defencePower;
        }else{
            power=0;
        }
        this.health-=power;
        System.out.println(this.name+" gets damage "+power);
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
    Player player2=new Player("otong", 100);


    //membuat object weapon
    Weapon weapon1=new Weapon("pedang",15);
    Weapon weapon2=new Weapon("ketapel",5);

    //membuat object armor
    Armor armor1=new Armor("baju besi",10);
    Armor armor2=new Armor("kaos",5);

    //equip weapon dan armor
    player1.equipWeapon(weapon1);
    player1.equipArmor(armor1);
    player1.display();

    player2.equipWeapon(weapon2);
    player2.equipArmor(armor2);
    player2.display();

    System.out.println("------PERTEMPURAN-----");
    player1.attack(player2);
    player2.display();
    player2.attack(player1);
    player1.display();
    }
}
