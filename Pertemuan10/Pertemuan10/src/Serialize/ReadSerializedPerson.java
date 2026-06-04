package Serialize;

import java.io.*;

 //Nama: Haydar Rafi' Sultansyah
 //NIM: 24060124120023
 //Lab: C1
 //Tanggal: 20 Mei 2026
 // File : ReadSerializedPerson.java
 // Deskripsi : Program untuk membaca objek Person yang telah terserialisasi
 
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        
        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            person = (Person) in.readObject();
            in.close();
            fileIn.close();
            
            System.out.println("Serialized person name = " + person.getName());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnf) {
            System.out.println("Class tidak ditemukan");
            cnf.printStackTrace();
        }
    }
}
