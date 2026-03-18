/*Nama File     : DosenTetap.java
 *Deskripsi     : berisi atribut dan method dalam class DosenTetap
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 12 Maret 2026
*/

import java.time.*;

public class DosenTetap extends Dosen{
    /******ATRIBUT******/
    private String nidn;
    private static final int BUP = 65;

    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek DosenTetap dengan nilai default
    public DosenTetap(){
        super();
        this.nidn = "";
    }

    //konstruktor untuk membuat objek DosenTetap dengan nilai input
    public DosenTetap(String newNip, String newNidn, String newNama, LocalDate newTglLahir, LocalDate newTmt, double newGajiPokok, String newFakultas){
        super(newNip, newNama, newTglLahir, newTmt, newGajiPokok, newFakultas);
        this.nidn = newNidn;
    }

    //SELEKTOR
    //selektor NIDN 
    public String getNidn(){
        return this.nidn;
    }

    //MUTATOR
    //mutator NIDN
    public void setNidn(String newNidn){
        this.nidn = newNidn;
    }

    /******METHOD LAIN******/
    //menghitung waktu pensiun dosen tetap
    public LocalDate hitungPensiun(){
        return tglLahir.plusYears(BUP).plusMonths(1);
    }

    //menghitung tunjangan dosen tetap saat ini
    public double hitungTunjangan(){
        int masa = Period.between(tmt, LocalDate.now()).getYears();
        return 0.02 * masa * gajiPokok;
    }

    //menampilkan info dosen tetap
    @Override
    public void printInfo(){
        System.out.println("NIP: " + nip);
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tglLahir));
        System.out.println("TMT: " + formatTanggal(tmt));
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Tanggal Pensiun: " + formatTanggal(hitungPensiun()));
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + hitungTunjangan());
    }
}