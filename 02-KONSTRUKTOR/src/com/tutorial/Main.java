package com.tutorial;

class Mahasiswa {
    String Nama;
    String NIM;
    String Prodi;

    Mahasiswa(String InputNama, String InputNIM, String InputProdi) {
        Nama = InputNama;
        NIM = InputNIM;
        Prodi = InputProdi;
        System.out.println("Nama Mahasiswa: " + Nama);
        System.out.println("NIM Mahasiswa: " + NIM);
        System.out.println("Prodi Mahasiswa: " + Prodi);
    }
}

public class Main {
    public static void main(String[] args) {
        new Mahasiswa("Damar", "22241009", "PTI");
    }
}
