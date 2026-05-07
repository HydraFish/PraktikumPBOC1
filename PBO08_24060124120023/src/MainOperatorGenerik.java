public class MainOperatorGenerik {
    public static void main(String[] args) {
        OperatorGenerik op = new OperatorGenerik();

        // b. Aplikasi Tukar untuk sesama Integer
        System.out.println("=== Tukar Sesama Integer ===");
        Datum<Integer> angka1 = new Datum<>(3);
        Datum<Integer> angka2 = new Datum<>(6);
        System.out.println("Sebelum: a=" + angka1.getIsi() + ", b=" + angka2.getIsi());
        OperatorGenerik.Tukar(angka1, angka2);
        System.out.println("Sesudah: a=" + angka1.getIsi() + ", b=" + angka2.getIsi());

        // b. Aplikasi Tukar untuk sesama String
        System.out.println("\n=== Tukar Sesama String ===");
        Datum<String> str1 = new Datum<>("Si Kucing");
        Datum<String> str2 = new Datum<>("Si Anjing");
        System.out.println("Sebelum: a=" + str1.getIsi() + ", b=" + str2.getIsi());
        OperatorGenerik.Tukar(str1, str2);
        System.out.println("Sesudah: a=" + str1.getIsi() + ", b=" + str2.getIsi());

        // b. Aplikasi Tukar untuk sesama keluarga Anabul
        System.out.println("\n=== Tukar Sesama Keluarga Anabul ===");
        Anjing doggy = new Anjing("Hachi");
        Kucing kitty = new Kucing("Luna", 4.0);
        Datum<Anabul> anabul1 = new Datum<>(doggy);
        Datum<Anabul> anabul2 = new Datum<>(kitty);
        
        System.out.println("Sebelum: a=" + anabul1.getIsi().getNama() + ", b=" + anabul2.getIsi().getNama());
        OperatorGenerik.Tukar(anabul1, anabul2);
        System.out.println("Sesudah: a=" + anabul1.getIsi().getNama() + ", b=" + anabul2.getIsi().getNama());

        // c. Aplikasi Fungsi Bobot2
        System.out.println("\n=== Aplikasi Fungsi Bobot2 ===");
        Anggora kucingAnggora = new Anggora("Marcell", 4.5);
        Kembangtelon kucingKembang = new Kembangtelon("Nala", 3.2);
        
        double totalBobot = op.Bobot2(kucingAnggora, kucingKembang);
        System.out.println("Bobot " + kucingAnggora.getNama() + " + Bobot " + kucingKembang.getNama() + " = " + totalBobot + " kg");
    }
}