/*Nama File     : Pengusaha.java
 *Deskripsi     : berisi atribut dan method dalam class Pengusaha
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 30 Maret 2026
*/

package LatihanPajak;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    /******ATRIBUT******/  
    private String npwp;
    private static int counterPengusaha = 0;

    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek Pengusaha dengan nilai input
    public Pengusaha(String nama, String tgl, String alamat, double pendapatan, String npwp) {
        super(nama, LocalDate.parse(tgl), alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //SELEKTOR
    //mengembalikan npwp Pengusaha
    public String getNpwp() {
        return npwp;
    }

    //mengembalikan jumlah objek Pengusaha yang sudah dibuat
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    //MUTATOR
    //mengeset npwp Pengusaha
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    /******METHOD LAIN******/
    //Method abstract parent
    //menghitung masa kerja dari Pengusaha
    //B = 2, sesuai digit ke-13 nim 24060124120023
    @Override
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears() + 2;
    }

    //mencetak info Pengusaha berupa nama, tanggal mulai kerja, alamat, pendapatan, dan npwp
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }

    //Method Interface
    //menghitung pajak yang harus dibayar oleh Pengusaha
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
}