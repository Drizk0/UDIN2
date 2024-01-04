package com.tutorial;


class Pegawai {
    String nama;
    float gajipokok;

    void display() {
        System.out.println("Nama Pegawai: " + this.nama);
        System.out.println("Gaji Pokok: " + this.gajipokok);
    }
}

class PegawaiTetap extends Pegawai {
    float durasi_lembur;
    float tunjangan;
    float lembur;
    private float gaji_bersih;

    float Tunjangan() {
        return (float)0.7d * gajipokok;
    }

    float Lembur() {
        return lembur = this.durasi_lembur * (float)(0.1d * this.gajipokok);
    }

    float GajiBersih() {
        return this.gajipokok + Tunjangan() + Lembur(); 
    }

    void display() {
        System.out.println("Nama Pegawai: " + this.nama);
        System.out.println("Gaji Pokok: " + this.gajipokok);
        System.out.println("Tunjangan: " + Tunjangan());
        System.out.println("Durasi Lembur: " + this.durasi_lembur);
        System.out.println("Gaji Bersih: " + GajiBersih());
    }
}
class PegawaiTidakTetap extends Pegawai {
    float durasi_lembur;
    float lembur;
    private float gaji_bersih;

    float Lembur() {
        return lembur = durasi_lembur * (float) (0.05d * gajipokok);
    }

    float GajiBersih() {
        return gajipokok + Lembur(); 
    }

    void display() {
        System.out.println("Nama Pegawai: " + this.nama);
        System.out.println("Gaji Pokok: " + this.gajipokok);
        System.out.println("Durasi Lembur: " + this.durasi_lembur);
        System.out.println("Gaji Bersih: " + GajiBersih());
    }
}

public class Main {
    public static void main(String[] args) {

        PegawaiTetap pegawaiTetap = new PegawaiTetap();
        pegawaiTetap.nama = "Damar Rizky Mustafa";
        pegawaiTetap.durasi_lembur = 4;
        pegawaiTetap.gajipokok = 3500000;
        pegawaiTetap.display();

        PegawaiTidakTetap PegawaiTidakTetap = new PegawaiTidakTetap();
        PegawaiTidakTetap.nama = "Damar Rizky Mustafaa";
        PegawaiTidakTetap.durasi_lembur = 9;
        PegawaiTidakTetap.gajipokok = 3500000;
        PegawaiTidakTetap.display();
    }
}