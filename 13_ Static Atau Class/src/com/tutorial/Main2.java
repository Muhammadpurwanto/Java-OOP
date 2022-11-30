package com.tutorial;
class Lingkungan{
    static String pohon="apel";
    private String name;

    Lingkungan(String name){
        this.name=name;
    }
    void setPohon(String input){
        Lingkungan.pohon=input;
    }
    void tampilan(){
        System.out.println("Lingkungan = "+this.name);
        System.out.println("pohon = "+Lingkungan.pohon);
    }
}



public class Main2 {
    public static void main(String[] args) {
        Lingkungan lingkungan1=new Lingkungan("pohon");
        lingkungan1.tampilan();
        lingkungan1.setPohon("jeruk");
        System.out.println(lingkungan1.pohon);
       
        
    }
    
}
