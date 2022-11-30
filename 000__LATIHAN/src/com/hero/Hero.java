package com.hero;
public abstract class Hero{
    protected String name;
    private int level;
    public Hero(String name){
        this.name=name;
        this.level=1;
    }
    public abstract void display();
    protected String getName(){
        String str = "name "+this.name+" level = "+this.level;
        return str;
    }
    protected void setName(String newName){
        this.name=newName;
    }
}