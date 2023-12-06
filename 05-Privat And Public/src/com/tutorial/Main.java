package com.tutorial;


class Player {
    // Data Member
    String name; // Default (Bisa dibaca dan ditulis kelas lain)
    public int exp; // Bisa  dibaca dan ditulis kelas lain
    private int health; // Hanya bisa dibaca oleh kelas itu sendiri

    // konstruktor
    Player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    void display(){
        System.out.println("name:"+ name);
        System.out.println("exp:"+ exp);
        System.out.println("health:"+ health);
    }
}
public class Main {
    public static void main(String[] args) {
        Player hero = new Player("YuZhong", 95, 20);
        hero.display();
        hero.name = "Dyroth";
        System.out.println(hero.name);

        hero.exp = 60;
        System.out.println(hero.exp);
    }
}
