package com.tutorial;

class Mahasiswa{
    //data member
    String nama="otong";
    String NIM="1343586";

    //method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : "+nama);
        System.out.println("NIM  : "+NIM);
    }

    //method tanpa return dan dengan parameter
    void setNama(String nama){
      this.nama=nama;
    }

    //method dengan return dan tanpa parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    //method dengan ruturn dan parameter
    String sayHy(String message){
      return message+" juga, nama saya adalah "+this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1=new Mahasiswa();
      //method
      mahasiswa1.show();
      mahasiswa1.setNama("tutung");
      mahasiswa1.show();

      System.out.println(mahasiswa1.getNama());
      System.out.println(mahasiswa1.getNIM());

      System.out.println(mahasiswa1.sayHy("hallo"));
     
   } 
}
