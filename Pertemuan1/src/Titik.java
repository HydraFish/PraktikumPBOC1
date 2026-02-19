/*Nama File     : Titik.java
 *Deskripsi     : berisi atribut dan method dalam class Titik
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 19 Februari 2006
*/

public class Titik {
    /******ATRIBUT******/
    double absis;
    double ordinat;
    /******METHOD******/
    //konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
    }
    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }
    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }
    //mengeset nilai absis dengan x
    void setAbsis(double x){
        absis = x;
    }
    //mengeset nilai ordinat dengan y
    void setOrdinat(double y){
        ordinat = y;
    }
    //menggeser absis dan ordinat dari titik sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} //end class Titik
