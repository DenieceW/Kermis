package com.miniopdrachtenqien;

public class Kassa{
    double totaleOmzet;

    void totaleOmzetKermis(double geld){
        this.totaleOmzet += geld;
    }

    void printTotaleOmzet(){
        System.out.println("De totale omzet van de Kermis is " + this.totaleOmzet);
    }

}
