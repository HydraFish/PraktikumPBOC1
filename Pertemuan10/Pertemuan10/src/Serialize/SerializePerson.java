package Serialize;

import java.io.*;

 //Nama: Haydar Rafi' Sultansyah
 //NIM: 24060124120023
 //Lab: C1
 //Tanggal: 20 Mei 2026
 // File : SerializePerson.java
 // Deskripsi : Program untuk serialisasi objek Person

class Person implements Serializable {
    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        System.out.println("Initialization is done");
        
        try {
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            out.writeObject(person);
            out.close();
            fileOut.close();
            
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}