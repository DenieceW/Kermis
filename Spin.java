package com.miniopdrachtenqien;

 class Spin extends RisicoRijkeAttracties implements GokAttractie{
     boolean keuring;

    Spin(String naam, double prijs, boolean keuring){
        this.naam = naam;
        this.prijs = prijs;
        this.draailimiet = 0;
        this.keuring = keuring;
    }

     public double kansSpelBelastingBetalen(){
         return this.omzet -= (0.7 * this.omzet);
     }


    void draaien(){
        this.draailimiet++;
        if(draailimiet <= 5 && this.keuring){
            this.aantalKaartjesVerkocht++ ;
            totaalKaartjesVerkocht++;
            huidigeOmzetPerAttractie = aantalKaartjesVerkocht * prijs;
            System.out.println( naam  + ": De attractie maakt een ritje");
        } else if(draailimiet > 5){
            this.keuring = false;
            opstellingsKeuring();
        }

    }

 }

