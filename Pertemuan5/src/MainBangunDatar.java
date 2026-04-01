/*Nama File     : MainBangunDatar.java
 *Deskripsi     : berupa main yang berisi realisasi dari method yang ada dalam Class BangunDatar, Lingkaran, dan Persegi
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 30 Maret 2026
*/

public class MainBangunDatar {
    public static void main(String[] args){
        /******REALISASI CLASS Persegi******/ 
        Persegi P1 = new Persegi(1, "Putih", "Hitam"); //membuat persegi P1 dengan panjang sisi 1, warna putih, dan border hitam
        System.out.println("jumlah sisi Persegi P1 adalah: " + P1.getJmlSisi()); //mengeluarkan jumlah sisi persegi P1
        System.out.println("warna Persegi P1 adalah: " + P1.getWarna()); //mengeluarkan warna persegi P1
        System.out.println("border Persegi P1 adalah: " + P1.getBorder()); //mengeluarkan border persegi P1
        System.out.println("sisi Persegi P1 adalah: " + P1.getSisi()); //mengeluarkan panjang sisi persegi P1
        System.out.println("luas Persegi P1 adalah: " + P1.getLuas()); //mengeluarkan luas persegi P1
        System.out.println("keliling Persegi P1 adalah: " + P1.getKeliling()); //mengeluarkan keliling persegi P1
        System.out.println("diagonal Persegi P1 adalah: " + P1.getDiagonal()); //mengeluarkan panjang diagonal persegi P1

        Persegi P2 = new Persegi(); //membuat persegi P2 dengan nilai default
        P2.setJmlSisi(4); //mengeset jml sisi persegi P2 dengan nilai 4
        P2.setWarna("Merah"); //mengeset warna persegi P2 dengan warna merah
        P2.setBorder("Biru"); //mengeset warna border persegi P2 dengan warna biru
        P2.setSisi(3); //mengeset panjang sisi persegi P2 dengan nilai 3
        P2.printInfo(); //mengeluarkan info jmlSisi, warna, border, dan panjang sisi dari persegi P2

        System.out.println("Apakah Luas P1 sama dengan Luas P2? : " + P1.isEqualLuas(P2)); //membandingkan luas persegi P1 dan P2 apakah sama atau tidak
        System.out.println("Apakah keliling P1 sama dengan keliling P2? : " + P1.isEqualKeliling(P2)); //membandingkan keliling persegi P1 dan P2 apakah sama atau tidak

        System.out.println("Sisi persegi P1 awal: " + P1.getSisi());
        P1.zoomIn(); //memperbesar persegi P1 sebesar 10%
        System.out.println("Sisi persegi P1 setelah zoomIn (+10%): " + P1.getSisi());
        P1.zoomOut(); //memperkecil persegi P1 sebesar 10%
        System.out.println("Sisi persegi P1 setelah zoomOut (-10%): " + P1.getSisi());
        P1.zoom(200); //memperbesar persegi P1 sebesar 100%
        System.out.println("Sisi persegi P1 setelah zoom (200%): " + P1.getSisi());

        /******REALISASI CLASS Lingkaran******/ 
        Lingkaran L1 = new Lingkaran(1, "Merah", "Hitam"); //membuat lingkaran L1 dengan panjang jari jari 1, warna merah, dan border hitam
        System.out.println("jumlah sisi Lingkaran L1 adalah: " + L1.getJmlSisi()); //mengeluarkan jumlah sisi lingkaran L1
        System.out.println("warna Lingkaran L1 adalah: " + L1.getWarna()); //mengeluarkan warna lingkaran L1
        System.out.println("border Lingkaran L1 adalah: " + L1.getBorder()); //mengeluarkan border lingkaran L1
        System.out.println("jari-jari Lingkaran L1 adalah: " + L1.getJari()); //mengeluarkan panjang jari jari lingkaran L1
        System.out.println("luas Lingkaran L1 adalah: " + L1.getLuas()); //mengeluarkan luas lingkaran L1
        System.out.println("keliling Lingkaran L1 adalah: " + L1.getKeliling()); //mengeluarkan keliling lingkaran L1

        Lingkaran L2 = new Lingkaran(); //membuat lingkaran L2 dengan nilai default
        L2.setJmlSisi(1); //mengeset jml sisi lingkaran L2 dengan nilai 1
        L2.setWarna("Putih"); //mengeset warna lingkaran L2 dengan warna putih
        L2.setBorder("Abu-abu"); //mengeset warna lingkaran L2 dengan warna abu-abu
        L2.setJari(3); //mengeset panjang jari jari lingkaran L2 dengan nilai 3
        L2.printInfo(); //mengeluarkan info jmlSisi, warna, border, dan panjang jari jari dari lingkaran L2

        System.out.println("Apakah Luas L1 sama dengan Luas L2? : " + L1.isEqualLuas(L2)); //membandingkan luas lingkaran L1 dan L2 apakah sama atau tidak
        System.out.println("Apakah keliling L1 sama dengan keliling L2? : " + L1.isEqualKeliling(L2)); //membandingkan keliling lingkaran L1 dan L2 apakah sama atau tidak

        System.out.println("Jari-jari lingkaran L1 awal: " + L1.getJari());
        L1.zoomIn(); //memperbesar lingkaran L1 sebesar 10%
        System.out.println("Jari-jari lingkaran L1 setelah zoomIn (+10%): " + L1.getJari());
        L1.zoomOut(); //memperkecil lingkaran L1 sebesar 10%
        System.out.println("Jari-jari lingkaran L1 setelah zoomOut (-10%): " + L1.getJari());
        L1.zoom(200); //memperbesar lingkaran L1 sebesar 100%
        System.out.println("Jari-jari lingkaran L1 setelah zoom (200%): " + L1.getJari());

        /******REALISASI CLASS BangunDatar******/ 
        BangunDatar B1 = new Persegi(5, "Hijau", "Putih"); //membuat objek bangun datar B1 berupa persegi dengan panjang sisi5, warna hijau, dan border putih
        B1.getJmlSisi(); //mengambil jumlah sisi bangun datar B1
        B1.getWarna(); //mengambil warna bangun datar B1
        B1.getBorder(); //mengambil border bangun datar B1
        ((Persegi) B1).getSisi(); //mengambil panjang sisi bangun datar B1
        B1.printInfo(); //mengeluarkan info jmlSisi, warna, border, dan panjang sisi dari bangun datar persegi B1

        BangunDatar B2 = new Persegi(); //membuat objek bangun datar B1 berupa persegi dengan nilai default
        B2.setJmlSisi(4); //mengeset jumlah sisi bangun datar B2 dengan nilai 4
        B2.setWarna("Kuning"); //mengeset warna bangun datar B2 dengan warna kuning
        B2.setBorder("Hitam"); //mengeset warna border bangun datar B2 dengan warna hitam
        ((Persegi) B2).setSisi(3); //mengeset panjang sisi bangun datar B2 dengan nilai 3 menggunakan casting
        B2.printInfo(); //mengeluarkan info jmlSisi, warna, border, dan panjang sisi dari bangun datar persegi B2

        /******REALISASI Counter******/
        BangunDatar.printCounterBangunDatar();
    }
}
