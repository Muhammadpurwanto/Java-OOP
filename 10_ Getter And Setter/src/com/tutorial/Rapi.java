package com.tutorial;
class Data{
    public int intPublic;
    private int intPrivate;
    Data(){
        this.intPublic=0;
        this.intPrivate=3;
    }
    //GETTER
    public int getPrivate(){
        return this.intPrivate;
    }
    //SETTER
    public void setPrivate(int angka){
        this.intPrivate= angka;
    }
    void display(){
        System.out.println("public : "+this.intPublic);
        System.out.println("private : "+this.intPrivate);
        System.out.println();
    }
}
class Lingkaran{
    private int diameter;
    Lingkaran(){
        this.diameter=6;
    }
    public void settUbah(int ubah){
        this.diameter=ubah;
    }
    public int jari2(){
      return  this.diameter/2;
    }
    public int diameter(){
        return jari2()*2;
    }
}

public class Rapi {
    public static void main(String[] args) {
        Data data1=new Data();
        data1.intPublic=10;
        data1.setPrivate(8);
        data1.display();
        System.out.println("getter : "+data1.getPrivate());
        Lingkaran lingkaran1=new Lingkaran();
        lingkaran1.settUbah(10);
        System.out.println("Jari2 : "+lingkaran1.jari2());
        System.out.println("diameter : "+lingkaran1.diameter());
    }
    
}
