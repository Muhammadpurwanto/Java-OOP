package com.tutorial;

public class Hero {
    private String name;
    private double health;

    Hero(String name, double health){
        this.name=name;
        this.health=health;
    }

    //getter
    public double getHealth(){
        return this.health;
    }
    public String getName(){
        return this.name;
    }

    //setter
    public void setName(String ubahName){
        this.name=ubahName;
    }
    public void setHealth(double ubahHealth){
        this.health=ubahHealth;
    }

    //method umum
    public void display(){
        System.out.println(this.name+ "is a reguler hero ");
    }
}
