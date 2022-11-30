package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //over loading pada constructor
        Player player1=new Player("Syatama");
        Player player2=new Player();
        Player player3=new Player();
        Player player4=new Player("kagura");


        player1.show();
        player2.show();
        player3.show();
        player4.show();

        //overloading method
        int a=Matematika.tambah(2, 5);
        System.out.println(a);

        double b=Matematika.tambah(2, 0.33);
        System.out.println(b);
    }
}
