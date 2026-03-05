public class Dosen {        
    private String nip;
    private String nama;
    private String prodi;

    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen(String nipInp, String namaInp, String prodiInp){
        this.nip = nipInp;
        this.nama = namaInp;
        this.prodi = prodiInp;
    }

    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNip(String nipInp){
        nip = nipInp;
    }

    public void setNama(String namaInp){
        nama = namaInp;
    }

    public void setProdi(String prodiInp){
        prodi = prodiInp;
    }

    public void printDosen(){
        System.out.println("NIP: " + nip + ", Nama: " + nama + ", Prodi: " + prodi);
    }
}
