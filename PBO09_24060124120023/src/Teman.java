import java.util.*;

class Teman {
    //Atribut
    private int nbelm;
    private List<String> Lnama;

    //Method 
    //Konstruktor
    public Teman() {
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    //Getter
    //1.a Fungsi getNBelm()
    int getNbelm(){
        return this.nbelm;
    }

    String getNama(int indeks){
        return Lnama.get(indeks);
    }

    //Setter
    void setNama(int indeks, String nama){
        Lnama.set(indeks, nama);
    }

    void addNama(String nama){
        Lnama.add(nama);
    }

    void delNama(String nama){
        Lnama.remove(nama);
    }

    boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    void gantiNama(String nama,String  namabaru){
        setNama(Lnama.indexOf(nama), namabaru);
    }

    //int countNama(nama);
}
