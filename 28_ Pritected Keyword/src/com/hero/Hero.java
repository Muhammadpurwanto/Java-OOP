package com.hero;

public abstract class Hero {
    protected String name;
    private int level=1;

    public Hero(String name){
        this.name=name;
    }

    public abstract void display();

    public String getName(){
        String str="name : "+this.name+"_"+this.level;
        return str;
    }
}
