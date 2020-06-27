package com.miniopdrachtenqien;

public class Spin extends Attractie {

    Spin(String naam, double prijs, boolean keuring){
        this.naam = naam;
        this.prijs = prijs;
        this.draailimiet = 0;
        this.keuring = keuring;
    }

}
