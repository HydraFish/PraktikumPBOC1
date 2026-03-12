/*Nama File     : Persegi.java
 *Deskripsi     : berisi atribut dan method dalam class Persegi
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 12 Maret 2026
*/

public class Persegi extends BangunDatar{  
    /******ATRIBUT******/      
    private double sisi;


    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek Persegi dengan nilai default
    public Persegi(){
        setJmlSisi(4);
    }

    //konstruktor untuk membuat objek Persegi dengan nilai input
    public Persegi(double newSisi, String newWarna, String newBorder){
        super(4, newWarna, newBorder);
        this.sisi = newSisi;
    }


    //SELEKTOR
    //mengembalikan nilai jmlSisi Persegi
    public double getSisi(){
        return sisi;
    }


    //MUTATOR
    //mengeset nilai jmlSisi dengan jmlSisi
    public void setSisi(int newSisi){
        this.sisi = newSisi;
    }


    /******METHOD LAIN******/
    //mengembalikan nilai luas Persegi
    public double getLuas(){
        return this.sisi * this.sisi;
    }

    //mengembalikan nilai keliling Persegi
    public double getKeliling(){
        return this.sisi * 4;
    }

    //mengembalikan nilai luas Persegi
    public double getDiagonal(){
        return Math.sqrt(this.sisi * this.sisi + this.sisi * this.sisi);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("sisi: " + sisi);
    }

}