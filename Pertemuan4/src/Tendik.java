/*Nama File     : Tendik.java
 *Deskripsi     : berisi atribut dan method dalam class Tendik
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 12 Maret 2026
*/
import java.time.*;

public class Tendik extends Pegawai {
    /******ATRIBUT******/
    private String bidang;
    private static final int BUP = 55;


    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek Tendik dengan nilai default
    public Tendik(){
        super();
        this.bidang = "";
    }

    //konstruktor untuk membuat objek Tendik dengan nilai input
    public Tendik(String newNip, String newNama, LocalDate newTglLahir, LocalDate newTmt, double newGajiPokok, String newBidang){
        super(newNip, newNama, newTglLahir, newTmt, newGajiPokok);
        this.bidang = newBidang;
    }

    //SELEKTOR
    //selektor Bidang
    public String getBidang(){
        return this.bidang;
    }

    //MUTATOR
    //mutator Bidang
    public void setBidang(String newBidang){
        this.bidang = newBidang;
    }

    /******METHOD LAIN******/
    //menghitung pensiun tendik
    public LocalDate hitungPensiun(){
        return tglLahir.plusYears(BUP).plusMonths(1);
    }

    //menghitung tunjangan tendik
    public double hitungTunjangan(){
        int masa = Period.between(tmt, LocalDate.now()).getYears();
        return 0.01 * masa * gajiPokok;
    }

    //menampilkan info tendik
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Bidang: " + bidang);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Tanggal Pensiun: " + formatTanggal(hitungPensiun()));
        System.out.println("Tunjangan: " + hitungTunjangan());
    }
}
