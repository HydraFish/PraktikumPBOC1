/*Nama File     : Persegi.java
 *Deskripsi     : berisi atribut dan method dalam class Persegi
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 30 Maret 2026
*/

public class Persegi extends BangunDatar implements IResize{  
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
    //mengeset nilai jmlSisi dengan newSisi
    public void setSisi(int newSisi){
        this.sisi = newSisi;
    }


    /******METHOD LAIN******/
    //mengembalikan nilai luas Persegi
    //public double getLuas(){
        //return this.sisi * this.sisi;
    //}

    //mengembalikan nilai keliling Persegi
    //public double getKeliling(){
        //return this.sisi * 4;
    //}

    //mengembalikan nilai diagonal Persegi
    public double getDiagonal(){
        return Math.sqrt(this.sisi * this.sisi + this.sisi * this.sisi);
    }

    //mengeluarkan info persegi yaitu jmlSisi, warna, border, dan panjang sisi
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("sisi: " + sisi);
    }

    //Method abstrak 
    //mengembalikan nilai luas Persegi
    @Override
    public double getLuas() {
        return this.sisi * this.sisi;
    }

    //mengembalikan nilai keliling Persegi
    @Override
    public double getKeliling() {
        return this.sisi * 4;
    }

    //Method Interface
    //menambah ukuran persegi menjadi 10% lebih besar
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    //mengurangi ukuran persegi menjadi 10% lebih kecil
    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    //menambah ukuran persegi sesuai dengan input persen yang diberikan
    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
}