package com.tutorial;
import com.terminal.Consol;

class Player {
    private String name;
        Player(String name){
            this.name=name;
        }

        String getName(){
            return this.name;
        }
        
        void show(){
           // System.out.println("Player = "+this.name);
           Consol.log("player1 = "+getName());
        }
    }

