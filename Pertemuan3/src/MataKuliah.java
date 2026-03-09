/*Nama File     : MataKuliah.java
 *Deskripsi     : berisi atribut dan method dalam class MataKuliah
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 5 Maret 2026
*/

public class MataKuliah {
    /******ATRIBUT******/   
    private String idMatKul;
    private String nama;
    private Integer sks;


    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek MataKuliah dengan nilai default
    public MataKuliah(){
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    //konstruktor untuk membuat objek MataKuliah dengan nilai input
    public MataKuliah(String newId, String newNama, Integer newSks){
        this.idMatKul = newId;
        this.nama = newNama;
        this.sks = newSks;
    }


    //SELEKTOR
    //mengembalikan nilai idMatkul MataKuliah
    public String getIdMatkul(){
        return idMatKul;
    }

    //mengembalikan nilai nama MataKuliah
    public String getNama(){
        return nama;
    }

    //mengembalikan nilai sks MataKuliah
    public Integer getSks(){
        return sks;
    }


    //MUTATOR
    //mengeset nilai idMatkul dengan newId
    public void setIdMatkul(String newId){
        this.idMatKul = newId;
    }

    //mengeset nilai nama dengan newNama
    public void setNama(String newNama){
        this.nama = newNama;
    }

    //mengeset nilai sks dengan newSks
    public void setSks(Integer newSks){
        this.sks = newSks;
    }

    /******METHOD LAIN******/
    //mencetak nilai idMatkul, nama, dan sks MataKuliah
    public void printMatKul(){
        System.out.println("idMatkul: " + idMatKul + ", Nama: " + nama + ", Sks: " + sks);
    }
}
