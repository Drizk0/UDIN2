package com.tutorial;

class mahasiswa {
    String nama;
    String nim;
    String prodi;
}
public class Main {
    public static void main(String[] args) {
        // instlasi pembuatan objek
        mahasiswa MHS1 = new mahasiswa();
        MHS1.nama = "Damar Rizky Mustafa";
        MHS1.nim = "22241009";
        MHS1.prodi = "Pendidikan Teknologi Informasi";

        System.out.println("Nama Mahasiswa : " + MHS1.nama);
        System.out.println("Nim Mahasiswa : " + MHS1.nim);
        System.out.println("Prodi Mahasiswa :" + MHS1.prodi);

        mahasiswa MHS2 = new mahasiswa();
        MHS2.nama = "Sonya Dewi Andita" ;
        MHS2.nim = "82567100";
        MHS2.prodi = "Akuntansi";

        System.out.println("Nama Mahasiswa : " + MHS2.nama);
        System.out.println("Nim Mahasiswa : " + MHS2.nim);
        System.out.println("Prodi Mahasiswa : " + MHS2.prodi);
    }
}
