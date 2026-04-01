/*Nama File     : PNS.java
 *Deskripsi     : berisi atribut dan method dalam class PNS
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 30 Maret 2026
*/

package LatihanPajak;

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    /******ATRIBUT******/  
    private String nip;
    private static int counterPNS = 0;

    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek PNS dengan nilai input
    public PNS(String nama, String tgl, String alamat, double pendapatan, String nip) {
        super(nama, LocalDate.parse(tgl), alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //SELEKTOR
    //mengembalikan nip PNS
    public String getNip() {
        return nip;
    }

    //mengembalikan jumlah objek PNS yang sudah dibuat
    public static int getCounterPNS() {
        return counterPNS;
    }

    //MUTATOR
    //mengeset nip PNS
    public void setNip(String nip) {
        this.nip = nip;
    }

    /******METHOD LAIN******/
    //Method abstract parent
    //menghitung masa kerja dari PNS
    //A = 3, sesuai digit ke-14 nim 24060124120023
    @Override
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears() + 3;
    }

    //mencetak info PNS berupa nama, tanggal mulai kerja, alamat, pendapatan, dan nip
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }

    //Method Interface
    //menghitung pajak yang harus dibayar oleh PNS
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }
}
