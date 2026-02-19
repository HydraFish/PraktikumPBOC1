/*Nama File     : MTitik.java
 *Deskripsi     : berisi atribut dan method dalam class Titik
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 19 Februari 2006
*/

public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik(); //membuat objek titik T1
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
    }
}