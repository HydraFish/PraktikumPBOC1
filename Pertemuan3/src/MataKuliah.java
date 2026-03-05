public class MataKuliah {
    private String idMatKul;
    private String nama;
    private Integer sks;

    public MataKuliah(){
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String inpId, String inpNama, Integer inpSks){
        this.idMatKul = inpId;
        this.nama = inpNama;
        this.sks = inpSks;
    }

    public String getidMatkul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public Integer getSks(){
        return sks;
    }

    public void setIdMatkul(String inpId){
        idMatKul = inpId;
    }

    public void setNama(String inpNama){
        nama = inpNama;
    }

    public void setSks(Integer inpSks){
        sks = inpSks;
    }

    public void printMatKul(){
        System.out.println("isMatkul: " + idMatKul + ", Nama: " + nama + ", Sks: " + sks);
    }
}
