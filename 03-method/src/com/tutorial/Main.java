package com.tutorial;
class Mahasiswa{
    // Data Member
    String nama;
    String nim;
    String prodi;

    // construktor dengan parameter
    Mahasiswa (String nama, String nim,
    String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    // method tanpa parameter dan tanpa return
    void show(){
        System.out.println("Nama:" + this.nama);
        System.out.println("nim:" + this.nim);
        System.out.println("prodi:" + this.prodi);
        
    }
    //Method tanpa return dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }
    //Method dengan return tanpa parameter
    String getNama(){
        return this.nama;
    }
    //method dengan return dan parameter
    String sayHi(String pesan){
        return pesan + " aku adalah " + this.nama;
    }
}
    

public class Main{
    public static void main(String[] args) {
        //instansi objek
        Mahasiswa mhs1 = new Mahasiswa("Damar Rizky Mustafa", "22241009", "PTI");
        mhs1.show(); 
        mhs1.setNama("Damar");
        mhs1.show();
        System.out.println(mhs1.getNama());

        String pesan = mhs1.sayHi("Haloo");
        System.out.println(pesan);
    }

    
}
