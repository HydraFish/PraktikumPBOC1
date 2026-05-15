/**
 * File      : MainPiaraan.java
 * Deskripsi : Program berisi Main untuk mengetes kelas Piaraan
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();

        Anabul a1 = new Kucing("Persia", 4.5, "Asa");
        Anabul a2 = new Anjing("Bulldog", "Benjamin Netanyahu");
        Anabul a3 = new Burung("Kenari", "Darwin Nunez");
        Anabul a4 = new Anggora("Anggora", 3.8, "Marcell");
        Anabul a5 = new Kembangtelon("Kembang Telon", 2.9, "Maximus III");

        //Menambahkan anabul ke koleksi
        p.enqueueAnabul(a1);
        p.enqueueAnabul(a2);
        p.enqueueAnabul(a3);
        p.enqueueAnabul(a4);
        p.enqueueAnabul(a5);

        //Menampilkan jumlah elemen
        System.out.println("===== Jumlah Anabul =====");
        System.out.println("Jumlah Anabul dalam antrean: " + p.getNbelm());

        //Menampilkan semua nama panggilan
        System.out.println("===== Nama Panggilan Anabul =====");
        p.showAnabul();

        //Mengecek dengan isMember apakah objek ada dalam koleksi
        System.out.println("===== Memeriksa Apakah Nama Anabul Ada =====");
        System.out.println("Apakah Benjamin Netanyahu ada dalam antrean? " + p.isMember(a2));

        //Mengambil anabul pertama tanpa menghapus
        System.out.println("===== Peek Anabul =====");
        System.out.println("Anabul pertama: " + p.getAnabul().getPanggilan());

        //Mengambil dan menghapus anabul pertama
        System.out.println("===== Dequeue Anabul =====");
        Anabul keluar = p.dequeueAnabul();
        System.out.println("Anabul yang keluar dari antrean: " + keluar.getPanggilan());

        //Menampilkan antrean setelah dequeue
        System.out.println("===== Menampilkan Nama Panggilan Anabul Setelah Dequeue=====");
        p.showAnabul();

        //Menghitung keluarga kucing
        System.out.println("===== Jumlah Kucing =====");
        System.out.println("Jumlah keluarga kucing: " + p.countKucing());

        //Menghitung total bobot keluarga kucing
        System.out.println("===== Jumlah Bobot Kucing =====");
        System.out.println("Total bobot keluarga kucing: " + p.bobotKucing() + " kg");

        //Menampilkan nama panggilan dan jenis objek
        System.out.println("===== Menampilkan Anabul dan Jenisnya =====");
        p.showJenisAnabul();
    }
}