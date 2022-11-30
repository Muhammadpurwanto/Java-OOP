package com.tutorial;
import com.terminal.Consol;
import static com.terminal.Consol.log;

public class Main {
    public static void main(String[] args) {
        Player player1=new Player("otong");
        player1.show();

        Consol.log(player1.getName());
        log(player1.getName());
    }
    
}
