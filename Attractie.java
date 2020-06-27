package com.miniopdrachtenqien;

public class Attractie extends RisicoRijkeAttracties{
     String naam;
     double prijs;
     double omzet;
     int kaartjesVerkocht;
     static int totaalKaartjesGekocht;

    void draaien(){
        this.draailimiet++;
        this.kaartjesVerkocht++ ; //kunnen per attractie 12 mensen in
        totaalKaartjesGekocht++;
        System.out.println(this.naam + " draait en kost " + this.prijs + " euros");
    }

    void getTotaleOmzetAttractie(){
        this.omzet = this.kaartjesVerkocht * this.prijs;
        System.out.println("De omzet van de " + this.naam + " is " + this.omzet + " euro.");
    }

    void getKaartjesVerkocht(){
        System.out.println("Er zijn bij de " + this.naam + " " + this.kaartjesVerkocht + " kaartjes verkocht.");
    }

    static void getTotaalAantalKaartjesKermis(){
        System.out.println("Er zijn in totaal " + totaalKaartjesGekocht + " kaartjes verkocht");
    }

}



