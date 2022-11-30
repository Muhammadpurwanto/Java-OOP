package com.tutorial;
class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
    }
    void display(){
        System.out.println("Judul  : "+judul);
        System.out.println("Penulis: "+penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku1= new Buku("Conversation", "Arul");
        buku1.display();

        //menampilkan address
        String addresBuku1=Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addresBuku1);

        //assigment object
        Buku buku2=buku1;
        buku2.display();
        String addresBuku2=Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addresBuku2);

        //karena buku 1 dan buku 2 berada pada address atau reference yang sama
        buku1.judul="Percakapan";
        buku1.display();
        buku2.display();
        //memasukan object dalam method
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }
        public static void fungsi(Buku dataBuku){
            String addresBuku2=Integer.toHexString(System.identityHashCode(dataBuku));
            System.out.println("address dalam fungsi:" +addresBuku2);
            dataBuku.penulis="Aril";
        }
}
