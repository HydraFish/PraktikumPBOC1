/**
 * File      : MainData.java
 * Deskripsi : Program berisi Realsisasi kelas Data
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class MainData {
    public static void main(String[] args) {
        //Membuat objek Data untuk menampung keluarga Anabul
        Data<Anabul> dataAnabul = new Data<>();

        //Membuat beberapa objek Anabul
        Anjing anjing1 = new Anjing("Benjamin Netanyahu");
        Burung burung1 = new Burung("Bibi");
        Kucing kucing1 = new Kucing("Gentong", 4.2);
        Anggora anggora1 = new Anggora("Marcel", 3.8);
        Kembangtelon kembang1 = new Kembangtelon("Rahmat", 3.5);

        //4.b Aplikasi setIsi untuk keluarga objek Anabul
        System.out.println("===Aplikasi setIsi===");
        dataAnabul.setIsi(1, anjing1);
        dataAnabul.setIsi(2, burung1);
        dataAnabul.setIsi(3, kucing1);
        dataAnabul.setIsi(4, anggora1);
        dataAnabul.setIsi(5, kembang1);

        //4.c Aplikasi getIsi untuk keluarga objek Anabul
        System.out.println("\n=== Aplikasi getIsi ===");
        for (int i = 1; i <= 5; i++) {
            Anabul a = dataAnabul.getIsi(i);
            if (a != null) {
                System.out.println("Data pada posisi " + i + ": " + a.getNama());
                System.out.print("Gerak: ");
                a.Gerak();
                System.out.print("Suara: ");
                a.Suara();
                if (a instanceof Kucing) {
                    System.out.println("Bobot: " + ((Kucing) a).getBobot() + " kg");
                }
                System.out.println();
            }
        }

        //4.d Aplikasi getSize untuk keluarga objek Anabul
        System.out.println("=== Aplikasi getSize ===");
        System.out.println("Jumlah elemen efektif dalam Data = " + dataAnabul.getSize());
    }
}