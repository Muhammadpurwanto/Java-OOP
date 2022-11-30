package com.tutorial;


class Mahasiswa{
String nama;
String NIM;
String jurusan;
double IPK;
int umur;
}

public class Main {
    public static void main(String[] args) {
      

        Mahasiswa mahasiwa1=new Mahasiswa();
        mahasiwa1.nama="ucup";
        mahasiwa1.NIM="2342890";
        mahasiwa1.jurusan="sistem informasi";
        mahasiwa1.IPK=4.3;
        mahasiwa1.umur=27;

        System.out.println(mahasiwa1.nama);
        System.out.println(mahasiwa1.NIM);
        System.out.println(mahasiwa1.jurusan);
        System.out.println(mahasiwa1.IPK);
        System.out.println(mahasiwa1.umur);


        Mahasiswa mahasiwa2=new Mahasiswa();
        mahasiwa2.nama="ara";
        mahasiwa2.NIM="2342340";
        mahasiwa2.jurusan="sistem informasi";
        mahasiwa2.IPK=3.4;
        mahasiwa2.umur=18;

        System.out.println(mahasiwa2.nama);
        System.out.println(mahasiwa2.NIM);
        System.out.println(mahasiwa2.jurusan);
        System.out.println(mahasiwa2.IPK);
        System.out.println(mahasiwa2.umur);
        
    }
}
