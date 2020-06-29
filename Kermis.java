package com.miniopdrachtenqien;

import java.util.Scanner;

public class Kermis {
    Scanner scanner = new Scanner(System.in);
    Notificaties notificaties = new Notificaties();
    Kassa kassa = new Kassa();
    BelastingInspecteur belastingInspecteur = new BelastingInspecteur();
    Attractie botsauto = new Botsauto("Botsauto", 2.50);
    Attractie spin = new Spin("Spin", 2.25, true);
    Attractie spiegelpaleis = new SpiegelPaleis("Spiegelpaleis", 2.75);
    Attractie spookhuis = new SpookHuis("Spookhuis", 3.20);
    Attractie hawaii = new Hawaii("Hawaii", 2.90, true);
    Attractie ladderklimmen = new Ladderklimmen("Ladderklimmen", 5.00);

    public void spelen() {
        belastingDienst();
        notificaties.printWelkom();

        while (true) {
            String invoer = scanner.nextLine();
            if (invoer.equals("1")) {
                botsauto.draaien();
                botsauto.printOmzetPerAttractie();
                kassa.omzetKermis(botsauto.getPrijs());
            }
            if (invoer.equals("2")) {
                spin.draaien();
                if(((Spin)spin).keuring){
                    kassa.omzetKermis(spin.getPrijs());
                    spin.printOmzetPerAttractie();
                }
            }
            if (invoer.equals("3")) {
                spiegelpaleis.draaien();
                spiegelpaleis.printOmzetPerAttractie();
                kassa.omzetKermis(spiegelpaleis.getPrijs());
            }
            if (invoer.equals("4")) {
                spookhuis.draaien();
                spookhuis.printOmzetPerAttractie();
                kassa.omzetKermis(spookhuis.getPrijs());
            }
            if (invoer.equals("5")) {
                hawaii.draaien();
                if(((Hawaii)hawaii).keuring){
                    hawaii.printOmzetPerAttractie();
                    kassa.omzetKermis(hawaii.getPrijs());
                }
            }
            if (invoer.equals("6")) {
                ladderklimmen.draaien();
                ladderklimmen.printOmzetPerAttractie();
                kassa.omzetKermis(ladderklimmen.getPrijs());
            }
            if (invoer.equals("k")) {
                aantalKaartjesVerkocht();
            }
            if (invoer.equals("b")) {
                belastingInspecteur.checkAttracties();
                kassa.bijhoudenBelastingBezoek();
                kassa.aftrekBelasting(((GokAttractie)ladderklimmen).kansSpelBelastingBetalen());
                kassa.aftrekBelasting(((GokAttractie)spin).kansSpelBelastingBetalen());
            }
            if (invoer.equals("o")) {
                kassa.printOmzetKermis();
                System.out.println("De Belastinginspecteur is vandaag " + kassa.getBezoekBelastingInspecteur() + " keer langsgeweest. ");
            }
            if (invoer.equals("m")){
                monteur();
            }
            if (invoer.equals("q")) {
                break;
            }
        }
    }

    public void belastingDienst(){ //voegt attracties toe aan de lijst van de inspecteur om te checken welke een gokattractie is.
        belastingInspecteur.lijstAttracties(botsauto);
        belastingInspecteur.lijstAttracties(spin);
        belastingInspecteur.lijstAttracties(spiegelpaleis);
        belastingInspecteur.lijstAttracties(spookhuis);
        belastingInspecteur.lijstAttracties(hawaii);
        belastingInspecteur.lijstAttracties(ladderklimmen);
    }

    public void aantalKaartjesVerkocht(){
        botsauto.printKaartjesVerkocht();
        spin.printKaartjesVerkocht();
        spiegelpaleis.printKaartjesVerkocht();
        spookhuis.printKaartjesVerkocht();
        hawaii.printKaartjesVerkocht();
        ladderklimmen.printKaartjesVerkocht();
        Attractie.printTotaalAantalKaartjesKermis();
    }

    public void monteur(){
        if(!((Hawaii)hawaii).keuring){
            ((Hawaii)hawaii).monteur();
            ((Hawaii)hawaii).draailimiet = 0;
        }
        if(!((Spin)spin).keuring){
            ((Spin)spin).monteur();
            ((Spin)spin).draailimiet = 0;
        }
    }
}

