/*Nama File     : MTitik.java
 *Deskripsi     : berisi realisasi untuk class Titik
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 26 Februari 2026
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        System.out.println("Absis T1 = " + T1.getAbsis());
        System.out.println("Ordinat T1 = " + T1.getOrdinat());

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T9 = new Titik();
        Titik T10 = new Titik(3,5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T10.getCounterTitik());
        T9.printCounterTitik();


        Titik T3 = new Titik(1,1);
        Titik T4 = new Titik(-2,-2);
        Titik T5 = new Titik(-3,1);
        Titik T6 = new Titik(1,-4);

        System.out.println("Kuadran T3 = \n" + T3.getKuadran());
        System.out.println("Kuadran T4 = \n" + T4.getKuadran());
        System.out.println("Kuadran T5 = \n" + T5.getKuadran());
        System.out.println("Kuadran T6 = \n" + T6.getKuadran());

        System.out.println("Jarak T3 ke pusat = \n" + T3.getJarakPusat());
        System.out.println("Jarak T3 ke T5 = \n" + T3.getJarak(T5));

        System.out.println("Titik T4 sebelum refleksi X:");
        T4.printTitik();
        T4.refleksiX();
        System.out.println("Titik T4 setelah refleksi X:");
        T4.printTitik();

        System.out.println("Titik T4 sebelum refleksi Y:");
        T4.printTitik();
        T4.refleksiY();
        System.out.println("Titik T4 setelah refleksi Y:");
        T4.printTitik();

        Titik T7 = T3.getRefleksiX();
        T7.printTitik();

        Titik T8 = T3.getRefleksiY();
        T8.printTitik();
    }
}