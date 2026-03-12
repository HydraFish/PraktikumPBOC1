/*Nama File     : MainBangunDatar.java
 *Deskripsi     : berupa main yang berisi realisasi dari method yang ada dalam Class Lingkaran dan Persegi
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 12 Maret 2026
*/

public class MainBangunDatar {
    public static void main(String[] args){
        /******REALISASI CLASS Persegi******/ 
        Persegi P1 = new Persegi(1, "Putih", "Hitam");
        System.out.println("jumlah sisi Persegi P1 adalah: " + P1.getJmlSisi());
        System.out.println("warna Persegi P1 adalah: " + P1.getWarna());
        System.out.println("border Persegi P1 adalah: " + P1.getBorder());
        System.out.println("sisi Persegi P1 adalah: " + P1.getSisi());
        System.out.println("luas Persegi P1 adalah: " + P1.getLuas());
        System.out.println("keliling Persegi P1 adalah: " + P1.getKeliling());
        System.out.println("diagonal Persegi P1 adalah: " + P1.getDiagonal());

        Persegi P2 = new Persegi();
        P2.setJmlSisi(4);
        P2.setWarna("Merah");
        P2.setBorder("Biru");
        P2.setSisi(3);
        P2.printInfo();

        /******REALISASI CLASS Lingkaran******/ 
        Lingkaran L1 = new Lingkaran(1, "Merah", "Hitam");
        System.out.println("jumlah sisi Lingkaran L1 adalah: " + L1.getJmlSisi());
        System.out.println("warna Lingkaran L1 adalah: " + L1.getWarna());
        System.out.println("border Lingkaran L1 adalah: " + L1.getBorder());
        System.out.println("jari-jari Lingkaran L1 adalah: " + L1.getjari());
        System.out.println("luas Lingkaran L1 adalah: " + L1.getLuas());
        System.out.println("keliling Lingkaran L1 adalah: " + L1.getKeliling());

        Lingkaran L2 = new Lingkaran();
        L2.setJmlSisi(1);
        L2.setWarna("Putih");
        L2.setBorder("Abu-abu");
        L2.setjari(3);
        L2.printInfo();


        BangunDatar.printCounterBangunDatar();
        Persegi.printCounterBangunDatar();
        Lingkaran.printCounterBangunDatar();
    }
}

