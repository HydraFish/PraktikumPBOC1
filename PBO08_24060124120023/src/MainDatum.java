public class MainDatum {
    public static void main(String[] args) {
        //Demonstrasi Datum dengan tipe String
        System.out.println("===Datum dengan String===");
        Datum<String> datumString = new Datum<>("Nama Hewan");
        System.out.println("Isi Datum: " + datumString.getIsi());
        datumString.setIsi("Seekor anjing peliharaan");
        System.out.println("Isi datum setelah diubah: " + datumString.getIsi());

        //Demonstrasi Datum dengan tipe Integer
        System.out.println("===Datum dengan Integer===");
        Datum<Integer> datumInt = new Datum<>(100);
        System.out.println("Isi Datum (Integer): " + datumInt.getIsi());
        datumInt.setIsi(250);
        System.out.println("Isi datum setelah diubah: " + datumInt.getIsi());

        //Demonstrasi Datum dengan tipe Double
        System.out.println("===Datum dengan Double===");
        Datum<Double> datumDouble = new Datum<>(15.5);
        System.out.println("Isi Datum (Double): " + datumDouble.getIsi());
        datumDouble.setIsi(20.75);
        System.out.println("Isi datum setelah diubah: " + datumDouble.getIsi());

        //2. Aplikasi Datum menggunakan keluarga kelas Anabul
        //Demonstrasi Datum dengan Kucing Anggora
        System.out.println("===Datum dengan Kucing Anggora===");
        Anggora kucingAnggora = new Anggora("Marcell", 4.5);
        Datum<Anggora> datumAnggora = new Datum<>(kucingAnggora);
        System.out.println("Nama  : " + datumAnggora.getIsi().getNama());
        System.out.println("Bobot : " + datumAnggora.getIsi().getBobot() + " kg");
        System.out.print("Gerak : "); datumAnggora.getIsi().Gerak();
        System.out.print("Suara : "); datumAnggora.getIsi().Suara();

        //Demonstrasi Datum dengan Kucing Kembang Telon
        System.out.println("===Datum dengan Kucing Kembangtelon===");
        Kembangtelon kucingKembang = new Kembangtelon("Aren", 3.2);
        Datum<Kembangtelon> datumKembang = new Datum<>(kucingKembang);
        System.out.println("Nama  : " + datumKembang.getIsi().getNama());
        System.out.println("Bobot : " + datumKembang.getIsi().getBobot() + " kg");
        System.out.print("Gerak : "); datumKembang.getIsi().Gerak();
        System.out.print("Suara : "); datumKembang.getIsi().Suara();

        //Demonstrasi Datum dengan Kucing
        System.out.println("===Datum dengan Kucing===");
        Kucing kucing = new Kucing("Budi", 5.0);
        Datum<Kucing> datumKucing = new Datum<>(kucing);
        System.out.println("Nama  : " + datumKucing.getIsi().getNama());
        System.out.println("Bobot : " + datumKucing.getIsi().getBobot() + " kg");
        System.out.print("Gerak : "); datumKucing.getIsi().Gerak();
        System.out.print("Suara : "); datumKucing.getIsi().Suara();

        //Demonstrasi Datum dengan Burung
        System.out.println("===Datum dengan Burung===");
        Burung burung = new Burung("Twitter");
        Datum<Burung> datumBurung = new Datum<>(burung);
        System.out.println("Nama  : " + datumBurung.getIsi().getNama());
        System.out.print("Gerak : "); datumBurung.getIsi().Gerak();
        System.out.print("Suara : "); datumBurung.getIsi().Suara();

        //Demonstrasi Datum dengan Anjing
        System.out.println("===Datum dengan Anjing===");
        Anjing anjing1 = new Anjing("Pluto");
        Datum<Anjing> datumAnjing = new Datum<>(anjing1);
        System.out.println("Nama  : " + datumAnjing.getIsi().getNama());
        System.out.print("Gerak : "); datumAnjing.getIsi().Gerak();
        System.out.print("Suara : "); datumAnjing.getIsi().Suara();
    }
}
