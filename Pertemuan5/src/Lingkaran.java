/*Nama File     : Lingkaran.java
 *Deskripsi     : berisi atribut dan method dalam class Lingkaran
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 30 Maret 2026
*/

public class Lingkaran extends BangunDatar implements IResize{  
    /******ATRIBUT******/      
    private double jari;


    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek Lingkaran dengan nilai default
    public Lingkaran(){
        setJmlSisi(1);
    }

    //konstruktor untuk membuat objek Lingkaran dengan nilai input
    public Lingkaran(double newJari, String newWarna, String newBorder){
        super(1, newWarna, newBorder);
        this.jari = newJari;
    }


    //SELEKTOR
    //mengembalikan nilai jmljari Lingkaran
    public double getJari(){
        return jari;
    }


    //MUTATOR
    //mengeset nilai jmljari dengan newjari
    public void setJari(int newJari){
        this.jari = newJari;
    }


    /******METHOD LAIN******/
    //mengembalikan nilai luas Lingkaran
    //public double getLuas(){
        //return Math.PI * this.jari * this.jari;
    //}

    //mengembalikan nilai keliling Lingkaran
    //public double getKeliling(){
        //return 2 * Math.PI * this.jari;
    //}

    //mengeluarkan info lingkaran yaitu jmlSisi, warna, border, dan panjang jari jari
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("jari-jari: " + jari);
    }

    //Method abstrak
    //mengembalikan nilai luas Lingkaran
    @Override
    public double getLuas() {
        return Math.PI * this.jari * this.jari;
    }

    //mengembalikan nilai keliling Lingkaran
    @Override
    public double getKeliling() {
        return 2 * Math.PI * this.jari;
    }

    //Method Interface
    //menambah ukuran lingkaran menjadi 10% lebih besar
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    //mengurangi ukuran lingkaran menjadi 10% lebih kecil
    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    //menambah ukuran lingkaran sesuai dengan input persen yang diberikan
    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }
}