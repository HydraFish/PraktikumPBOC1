package FolderAnabul;

/**
 * File      : MainAnabul.java
 * Deskripsi : Program untuk mengaplikasikan kelas Anabul dan child nya
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class MainAnabul {
    public static void main(String[] args) {
        Anabul anabul0 = new Anabul("Peliharaan");
        Anabul anabul1 = new Anjing("Shiba Inu");
        Anabul anabul2 = new Kucing("Scottish Fold");
        Anabul anabul3 = new Burung("Jay Blue");

        System.out.println("============================");
        System.out.println("Anabul 0: ");
        System.out.println(anabul0.getNama());
        anabul0.Gerak();
        anabul0.Suara();

        System.out.println("============================");
        System.out.println("Anabul 1: ");
        System.out.println(anabul1.getNama());
        anabul1.Gerak();
        anabul1.Suara();

        System.out.println("============================");
        System.out.println("Anabul 2: ");
        System.out.println(anabul2.getNama());
        anabul2.Gerak();
        anabul2.Suara();

        System.out.println("============================");
        System.out.println("Anabul 3: ");
        System.out.println(anabul3.getNama());
        anabul3.Gerak();
        anabul3.Suara();
    }
}
