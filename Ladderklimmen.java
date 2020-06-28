package com.miniopdrachtenqien;

public class Ladderklimmen extends Attractie implements GokAttractie{

    Ladderklimmen(String naam, double prijs){
        this.naam = naam;
        this.prijs = prijs;
    }

    public double kansSpelBelastingBetalen(){
         return this.omzet -= (0.7 * this.omzet);
    }




}
