/*Nama File     : Petani.java
 *Deskripsi     : berisi atribut dan method dalam class Petani
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 30 Maret 2026
*/

package LatihanPajak;

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    /******ATRIBUT******/
    private String asalKota;
    private static int counterPetani = 0;

    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek Petani dengan nilai input
    public Petani(String nama, String tgl, String alamat, double pendapatan, String asalKota) {
        super(nama, LocalDate.parse(tgl), alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    //SELEKTOR
    //mengembalikan asal kota Petani
    public String getAsalKota() {
        return asalKota;
    }

    //mengembalikan jumlah objek Petani yang sudah dibuat
    public static int getCounterPetani() {
        return counterPetani;
    }

    //MUTATOR
    //mengeset asal kota Petani
    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    /******METHOD LAIN******/
    //Method abstract parent
    //menghitung masa kerja dari Petani
    //C = 0, sesuai digit ke-12 nim 24060124120023
    @Override
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears() + 0;
    }

    //mencetak info Petani berupa nama, tanggal mulai kerja, alamat, pendapatan, dan asal kota
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
    }

    //Method Interface
    //menghitung pajak yang harus dibayar oleh Petani
    @Override
    public double hitungPajak() {
        return 0;
    }
}