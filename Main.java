package com.miniopdrachtenqien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Attractie botsauto = new Botsauto("botsauto", 2.50);
        Attractie spin = new Spin("spin", 2.25,true);
        Attractie spiegelpaleis = new SpiegelPaleis("spiegelpaleis", 2.75);
        Attractie spookhuis = new SpookHuis("spookhuis", 3.20);
        Attractie hawaii = new Hawaii("hawaii", 2.90,true);
        Attractie ladderklimmen = new Ladderklimmen("ladderklimmen", 5.50);
        Kassa kassa = new Kassa();


        while(true) {
            String invoer = scanner.nextLine();
            if (invoer.equals("1")) {
                botsauto.draaien();
                botsauto.getTotaleOmzetAttractie();
                kassa.totaleOmzetKermis(botsauto.omzet);
            }
            if (invoer.equals("2")) {
                spin.draaien();
                spin.getTotaleOmzetAttractie();
                kassa.totaleOmzetKermis(spin.omzet);

            }
            if (invoer.equals("3")) {
                spiegelpaleis.draaien();
                spiegelpaleis.getTotaleOmzetAttractie();
                kassa.totaleOmzetKermis(spiegelpaleis.omzet);

            }
            if (invoer.equals("4")) {
                spookhuis.draaien();
                spookhuis.getTotaleOmzetAttractie();
                kassa.totaleOmzetKermis(spookhuis.omzet);

            }
            if (invoer.equals("5")) {
                hawaii.draaien();
                hawaii.getTotaleOmzetAttractie();
                kassa.totaleOmzetKermis(hawaii.omzet);
                }

            if (invoer.equals("6")) {
                ladderklimmen.draaien();
                ladderklimmen.getTotaleOmzetAttractie();
                kassa.totaleOmzetKermis(ladderklimmen.omzet);
            }
            if(invoer.equals("k")){
                botsauto.getKaartjesVerkocht();
                spin.getKaartjesVerkocht();
                spiegelpaleis.getKaartjesVerkocht();
                spookhuis.getKaartjesVerkocht();
                hawaii.getKaartjesVerkocht();
                ladderklimmen.getKaartjesVerkocht();
                Attractie.getTotaalAantalKaartjesKermis();

            }
            if (invoer.equals("o")) {
                kassa.printTotaleOmzet();
                break;
            }
        }


	//



    }
}
