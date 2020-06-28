package com.miniopdrachtenqien;

import java.text.NumberFormat;

public class Kassa{
    double totaleOmzet = 0;
    int bezoekBelastingInspecteur;
    NumberFormat format = NumberFormat.getCurrencyInstance();

    void omzetKermis(double geld){
        this.totaleOmzet += geld;
    }

    void bijhoudenBelastingBezoek(){
        bezoekBelastingInspecteur++;
    }

    int getBezoekBelastingInspecteur(){
        return this.bezoekBelastingInspecteur;
    }

    void printOmzetKermis(){
        System.out.println("De totale omzet van de Kermis (incl. aftrek gokbelasting) is " + format.format(totaleOmzet) + ".");
    }

    void aftrekBelasting(double gokbelasting){
        this.totaleOmzet = this.totaleOmzet - gokbelasting;
    }



}
