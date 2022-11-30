package com.tutorial;


    class Mahasiswa{
        String name;
        String nim;
        String jurusan;
      Mahasiswa(String inputName,String inputNim,String inputJurusan){          
        name=inputName;
        nim=inputNim;
        jurusan=inputJurusan;
          System.out.println(name);
          System.out.println(nim);
          System.out.println(jurusan);
        }
    }

public class Main {
    public static void main(String[] args)throws Exception {
     Mahasiswa mahasiswa1=new Mahasiswa("ucup","3829200","teknik");
     Mahasiswa mahasiswa2=new Mahasiswa("otong","10139720","pertanian");
    //  tidak di anjurkan
    //  mahasiswa1.name="adi";
    //  System.out.println(mahasiswa1.name);
    }
    
}
