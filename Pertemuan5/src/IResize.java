/*Nama File     : IRisize.java
 *Deskripsi     : berisi method untuk interface IRisize
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 30 Maret 2026
*/

public interface IResize {
    //menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    //mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //menambah ukuran sesuai dengan input persen yang diberikan
    public void zoom(int percent);
}
