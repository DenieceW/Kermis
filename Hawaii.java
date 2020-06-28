package com.miniopdrachtenqien;

public class Hawaii extends RisicoRijkeAttracties{

    Hawaii(String naam, double prijs, boolean keuring){
        this.naam = naam;
        this.prijs = prijs;
        this.draailimiet = 0;
        this.keuring = keuring;
    }

    void draaien(){
        this.draailimiet++;
        if(draailimiet <= 10 && this.keuring){
            this.aantalKaartjesVerkocht++ ;
            totaalKaartjesVerkocht++;
            huidigeOmzetPerAttractie = aantalKaartjesVerkocht * prijs;
            System.out.println( naam  + ": De attractie maakt een ritje");
        } else if(draailimiet > 10){
            this.keuring = false;
            opstellingsKeuring();
        }
    }

}
