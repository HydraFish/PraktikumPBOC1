/*Nama File     : BangunDatar.java
 *Deskripsi     : berisi atribut dan method dalam class BangunDatar
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 30 Maret 2026
*/

public abstract class BangunDatar {  
    /******ATRIBUT******/      
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek BangunDatar dengan nilai default
    public BangunDatar(){
        counterBangunDatar++;
        //this.jmlSisi = 0;
        //this.warna = "";
        //this.border = "";
    }

    //konstruktor untuk membuat objek BangunDatar dengan nilai input
    public BangunDatar(int newJmlSisi, String newWarna, String newBorder){
        this.jmlSisi = newJmlSisi;
        this.warna = newWarna;
        this.border = newBorder;
        counterBangunDatar++;
    }


    //SELEKTOR
    //mengembalikan nilai jmlSisi BangunDatar
    public int getJmlSisi(){
        return jmlSisi;
    }

    //mengembalikan nilai warna BangunDatar
    public String getWarna(){
        return warna;
    }

    //mengembalikan nilai border BangunDatar
    public String getBorder(){
        return border;
    }


    //MUTATOR
    //mengeset nilai jmlSisi dengan newJmlSisi
    public void setJmlSisi(int newJmlSisi){
        this.jmlSisi = newJmlSisi;
    }

    //mengeset nilai warna dengan newWarna
    public void setWarna(String newWarna){
        this.warna = newWarna;
    }

    //mengeset nilai border dengan newBorder
    public void setBorder(String newBorder){
        this.border = newBorder;
    }


    /******METHOD LAIN******/
    //mencetak nilai jmlSisi, warna, dan border BangunDatar
    public void printInfo(){
       System.out.println("Jumlah sisi: " + jmlSisi);
       System.out.println("Warna: " + warna);
       System.out.println("Border: " + border);
    }

    //mengeluarkan jumlah objek BangunDatar yang telah dibuat
    public static void printCounterBangunDatar(){
        System.err.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    //Metode abstrak
    //Mencari luas bangun datar
    public abstract double getLuas();

    //Mencari keliling bangun datar
    public abstract double getKeliling();

    //Method tambahan pertemuan 5
    //Membandingkan luas 2 bangun datar, bernilai true jika luas keduanya sama
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    //Membandingkan keliling 2 bangun datar, bernilai true jika keliling keduanya sama
    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}