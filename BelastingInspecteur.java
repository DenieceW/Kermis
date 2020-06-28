package com.miniopdrachtenqien;

import java.util.ArrayList;

public class BelastingInspecteur {
    ArrayList<Attractie> attracties;

    BelastingInspecteur(){
        this.attracties = new ArrayList<Attractie>();
    }
    void lijstAttracties(Attractie attractie){
        attracties.add(attractie);
    }

    void checkAttracties(){
        System.out.println("De Belastinginspecteur is op bezoek, en heeft gecheckt welke attracties gokattracties zijn.");
        for(Attractie attractie : attracties){
            if(attractie instanceof GokAttractie){
                System.out.println(attractie.naam + ": is een gokattractie, hier wordt 30% van de omzet van deze attractie ingehouden.");
            }else
                System.out.println(attractie.naam + ": geen gokattractie");
        }
    }
}


