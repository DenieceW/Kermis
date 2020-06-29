package com.miniopdrachtenqien;

import java.text.NumberFormat;

public class Attractie{
     String naam;
     double prijs;
     double omzet;
     double huidigeOmzetPerAttractie;
     int aantalKaartjesVerkocht;
     static int totaalKaartjesVerkocht;
    NumberFormat format = NumberFormat.getCurrencyInstance();

    void draaien(){
        aantalKaartjesVerkocht++;
        totaalKaartjesVerkocht++;
        System.out.println( naam  + ": De attractie maakt een ritje");
    }


    double getOmzet(){
        return omzet = aantalKaartjesVerkocht * prijs;
    }

    double getPrijs(){
        return prijs;
    }

    void printOmzetPerAttractie(){
        System.out.println(naam + ": Omzet is: " + format.format(getOmzet()) + ".");
    }

    void printKaartjesVerkocht(){
        System.out.println( naam + ": " + aantalKaartjesVerkocht + " kaartjes verkocht.");
    }

    static void printTotaalAantalKaartjesKermis(){
        System.out.println("Er zijn in totaal " + totaalKaartjesVerkocht + " kaartjes verkocht.");
    }

}



