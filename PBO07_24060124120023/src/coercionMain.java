/**
 * File      : coercionMain.java
 * Deskripsi : Program untuk menunjukkan coercion
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class coercionMain {
    public static void main(String[] args) {
        //a. Polimorfisme nilai integer 65
        int intValue = 65;
        System.out.println("Sebagai integer: " + intValue);
        System.out.println("Sebagai char: " + (char) intValue);
        System.out.println("Sebagai real/double: " + (double) intValue);

        //b. Konversi integer ke real dan kembali ke integer
        double realValue = (double) intValue;
        int newIntValue = (int) realValue;
        System.out.println("Nilai integer yang sudah diubah menjadi real: " + realValue);
        System.out.println("Ketika dikembalikan menjadi integer: " + newIntValue);

        //c. Konkatenasi dan penjumlahan String X dan Y
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Konkatenasi X dan Y: " + S);
        System.out.println("Penjumlahan X dan Y: " + Z);

        //d. Konkatenasi dan penjumlahan String P dan Q
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Konkatenasi P dan Q: " + R);
        System.out.println("Penjumlahan P dan Q: " + D);

        //e. Konversi nilai S menjadi Integer
        Integer A = Integer.parseInt(S);
        System.out.println("Konversi S menjadi Integer: " + A);
        System.out.println("Tipe A: " + A.getClass().getSimpleName());

        //f. Konversi nilai A menjadi String
        String T = A.toString();
        System.out.println("Konversi A menjadi String: " + T);
        System.out.println("Tipe T: " + T.getClass().getSimpleName());
    }
}
