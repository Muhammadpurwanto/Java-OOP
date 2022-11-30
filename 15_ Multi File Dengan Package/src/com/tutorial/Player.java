package com.tutorial;
    
        class Player{
            private String name;
            
            Player(String name){
               this.name=name;
            }
        
            void setName(String set){
               this.name=set;   
            }
            void show(){
                System.out.println("name = "+this.name); 
            }
        }
        
