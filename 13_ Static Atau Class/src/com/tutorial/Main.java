package com.tutorial;

class Display{
    static String type="display";
    private String name;
    
    Display(String name){
      this.name=name;
}
void setType(String typeInput){
    //type        =typeInput; //alternatif 1
    //this.type   =typeInput; //alternatif 2
    Display.type=typeInput; //alternatif 3
}
void Show(){
    System.out.println("Display name = "+this.name);
}

}


public class Main {
    public static void main(String[] args) {
    Display display1=new Display("monitor");
        display1.Show();

        Display display2=new Display("monitor");
        display2.Show();

        //tampilkan static variable

        display1.setType("booster");

        System.out.println("\nmenampilkan static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

    
    }
    
}
