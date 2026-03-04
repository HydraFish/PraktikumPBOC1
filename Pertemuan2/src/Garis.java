/* Nama File    : Garis.java
   Deskripsi    : berisi atribut dan method dalam class Garis
   Pembuat      : Haydar Rafi' Sultansyah 
   Tanggal      : 26 Februari 2026
   */

public class Garis {
    /******ATRIBUT******/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /******METHOD******/

    public Garis(){
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik awal, Titik akhir){
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public void setTitikAwal(Titik T){
        titikAwal = T;
    }

    public void setTitikAkhir(Titik T){
        titikAkhir = T;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    public double getPanjang(){
        return titikAwal.getJarak(titikAkhir);
    }

    public double getGradien(){
        double dx;
        double dy;
        dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (dx == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return dy / dx;
    }

    public Titik getTitikTengah(){
        double x;
        double y;
        x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }

    public boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    public boolean isTegakLurus(Garis G){
        double m1;
        double m2;
        m1 = this.getGradien();
        m2 = G.getGradien();
        return m1 * m2 == -1;
    }

    public void printGaris(){
        System.out.print("Titik Awal = ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir = ");
        titikAkhir.printTitik();
    }

    public String getPersamaanGaris(){
        double m;
        double c;
        m = getGradien();
        if (m == Double.POSITIVE_INFINITY){
            return "x = " + titikAwal.getAbsis();
        }
        c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}