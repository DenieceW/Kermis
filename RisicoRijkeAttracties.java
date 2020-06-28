package com.miniopdrachtenqien;

abstract class RisicoRijkeAttracties extends Attractie  {
    boolean keuring;
    int draailimiet;


    void opstellingsKeuring(){
        this.keuring = false;
        System.out.println("Deze attractie heeft het draailimiet overschreden en moet gekeurd worden, anders mag deze attractie niet meer open." +
                    "\nHaal de monteur erbij ('m').");

    }

    void monteur(){
        this.keuring = true;
        System.out.println("De monteur is langgeweest en de attractie is weer goedgekeurd");

    }



}
