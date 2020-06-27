package com.miniopdrachtenqien;

 class Spin extends RisicoRijkeAttracties {

    Spin(String naam, double prijs, boolean keuring){
        this.naam = naam;
        this.prijs = prijs;
        this.draailimiet = 0;
        this.keuring = keuring;


    }

    void draaien(){
        this.draailimiet++;
        if(draailimiet > 5){
            opstellingsKeuring();
           // monteur();
        }else
            this.kaartjesVerkocht++ ;
        totaalKaartjesGekocht++;
        System.out.println(this.naam + " draait en kost " + this.prijs + " euros");

    }
 }

