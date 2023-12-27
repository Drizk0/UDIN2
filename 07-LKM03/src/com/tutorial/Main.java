package com.tutorial;
class Pegawai {
    public String nama;
    public String jabatan; 
    public float pajak;
    public float gajiPokok;
    private float gajiBersih;

    // Konstruktor
    public Pegawai(String nama, String jabatan, float gajiPokok, float pajak) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.pajak = pajak/100;
    }
    
    public void setPajak(float pajak) {
        this.pajak = pajak/100;
    }
    public float hitungGajiBersih() {
        return this.gajiPokok -(this.gajiPokok*pajak);
    }

    public void display() {
        System.out.println("Nama Pegawai: " + this.nama);
        System.out.println("Jabatan: " + this.jabatan);
        System.out.println("Gaji Bersih: Rp." + this.hitungGajiBersih());
    }
}

public class Main {
    public static void main(String[] args) {
        // instansiasi objek
        Pegawai pegawai = new Pegawai("Damar", "Owner", 3500000, 10);
        pegawai.display();
        pegawai.setPajak(15);
        pegawai.display();
       
    }
}
