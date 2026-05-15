/**
 * File      : Piaraan.java
 * Deskripsi : Program berisi kelas Piaraan yanag merupakan koleksi kelas bentukan
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

import java.util.Queue;
import java.util.LinkedList;

public class Piaraan{
    //Atribut
    private int nbelm;
    private Queue<Anabul> Lanabul;
    
    //Method
    //Konstruktor
    //Konstruktor tanpa parameter
    public Piaraan(){
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }

    //2.b.i. getNbelm() untuk mendapatkan banyaknya elemen
    public int getNbelm(){
        return this.nbelm;
    }

    //2.b.ii. enqueueAnabul(anabul) untuk menambahkan objek anabul ke koleksi Lanaabul
    public void enqueueAnabul(Anabul anabul){
        Lanabul.add(anabul);
        nbelm++;
    }

    //2.b.iii. isMember(anabul) untuk memeriksa apakah anabul input berada di koleksi Lanabul
    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    //Getter
    //2.b.iv. getAnabul() untuk mengambil/mengintip objek anabul di koleksi
    public Anabul getAnabul(){
        return Lanabul.peek();
    }

    //2.b.v. dequeueAnabul() untuk mengambil dan menghapus objek anabul di koleksi yang terdepan
    public Anabul dequeueAnabul(){
        Anabul temp = Lanabul.poll();
        if (temp != null){
            nbelm--;
        }
        return temp;
    }

    //2.c. showAnabul() untuk menampilkan semua nama panggilan anabul dalam koleksi
    public void showAnabul(){
        System.out.println("Daftar nama panggilan Anabul dalam koleksi:");
        for (Anabul a : Lanabul){
            System.out.println(a.getPanggilan());
        }
    }

    //2.d. countKucing() untuk menghitung banyaknya anabul berjenis kucing di koleksi
    public int countKucing(){
        int count = 0;
        for (Anabul a : Lanabul){
            if (a instanceof Kucing){
                count++;
            }
        }
        return count;
    }

    //2.e. bobotKucing() untuk menghitung total bobot kucing di koleksi
    public double bobotKucing(){
        double totalBobot = 0.0;
        for (Anabul a : Lanabul){
            if (a instanceof Kucing){
                totalBobot = totalBobot + ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    //2.f. showJenisAnabul() untuk menampilkan anabul dan jenisnya
    public void showJenisAnabul(){
        System.out.println("Daftar Anabul dan jenis objeknya:");
        for (Anabul a : Lanabul){
            System.out.println(a.getPanggilan() + " berjenis: " + a.getClass().getName());
        }
    }
}