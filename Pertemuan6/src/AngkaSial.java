/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 * Pengenalan klausa 'throw' dan 'throws'
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

//kelas untuk mempraktekan penggunaan exception buatan sendiri
public class AngkaSial {

    //prosedur untuk memeriksa apakah suatu angka bernilai 13 atau tidak
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) { //mengecek apakah angka adalah 13
            throw new AngkaSialException(); //melempar exception jika angka bernilai 13//
        }
        System.out.println(angka + " bukan angka sial"); //mencetak informasi bahwa angka tidak bernilai 13
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial(); //membuat objek as
        try {
            as.cobaAngka(10); //mencoba mengecek apakah angka 10 angka sial atau bukan
            as.cobaAngka(13); //mencoba mengecek apakah angka 13 angka sial atau bukan
            as.cobaAngka(12); //mencoba mengecek apakah angka 12 angka sial atau bukan
        } catch (AngkaSialException ase) { //menangkap exception yang terjadi, yaitu angka bernilai 13
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// PERTANYAAN
// Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// jelaskan pada lembar praktikum anda!
// JAWABAN
// Baris 12 yaitu System.out.println(angka bukan angka sial");, tidak akan dieksekusi ketika eksepsi terjadi, 
// karena ketika eksepsi yaitu coba Angka memiliki parameter 13 maka akan mengeksekusi perintah 
// throw new AngkaSialException(); di baris 10. Baris 12 hanya dieksekusi pada try sebelumnya 
// yaitu ketika parameter coba Angka memiliki parameter 10.
// Baris 21 yaitu catch (AngkaSialException ase), akan dieksekusi karena ketika baris 19 yaitu ketika cobaAngka 
// memiliki parameter 13, maka akan throw Angka SialException. Jadi baris ke 21 akan dieksekusi karena 
// terdapat percobaan cobaAngka dengan parameter 13 di baris ke 19.


//output dari java AngkaSial adalah
//10 bukan angka sial
//jangan memasukkan angka 13 karena angka sial!!!
//hati-hati memasukkan angka!!!
//10 akan keluar sebagai bukan angka sial, 13 akan keluar sebagai angka sial dan muncul peringatan, 12 tidak ada output karena telah terjadi exception