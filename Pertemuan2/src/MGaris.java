/*Nama File     : MGaris.java
 *Deskripsi     : berisi realisasi untuk class Garis
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 26 Februari 2026
*/

public class MGaris {
    public static void main(String[] args) {
        Titik A = new Titik(-2, 0);
        Titik B = new Titik(0, 4);

        System.out.print("Garis G1\n");
        Garis G1 = new Garis();
        G1.setTitikAwal(A);
        G1.setTitikAkhir(B);
        G1.printGaris();
        
        System.out.print("Titik Awal = ");
        G1.getTitikAwal().printTitik();
        System.out.print("Titik Akhir = ");
        G1.getTitikAkhir().printTitik();

        System.out.print("Garis G2\n");
        Garis G2 = new Garis(A, B);
        G2.printGaris();
        System.out.println("Jumlah Garis = " + Garis.getCounterGaris());
        
        System.out.println("Panjang Garis = " + G1.getPanjang());
        System.out.println("Gradien = " + G1.getGradien());

        Titik tengah = G1.getTitikTengah();
        System.out.print("Titik Tengah: ");
        tengah.printTitik();

        System.out.println("Apakah G1 sejajar G2 = " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus G2 = " + G1.isTegakLurus(G2));

        System.out.println("Persamaan Garis: " + G1.getPersamaanGaris());

    }
}