package com.tutorial;

class hero{ 
    //att
    String nama;
    float exp;
    float health;

    void display() {
        System.out.println("nama hero: " + this.nama);
        System.out.println("exp hero: " + this.exp);
        System.out.println("health hero: " + this.health);
    }
}

//subclass
    class HeroTank extends hero{

    }

public class Main {
    public static void main(String[] args) {
     //instansiasi objek
     hero hero_1 = new hero();
     hero_1.display();

     HeroTank hero_2 = new HeroTank();
     hero_2.nama = "saitama";

     hero_2.display();
    }
}
