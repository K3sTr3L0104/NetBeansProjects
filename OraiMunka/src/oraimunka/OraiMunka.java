/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oraimunka;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class OraiMunka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Generáljunk egy számot 1-7 között. Írjuk ki, ez melyik napja a hétnek.
        int randomSzam = (int) (Math.random() *7) +1;
        System.out.println(randomSzam);
        switch ( randomSzam ){
            case 1: System.out.println("Hétfő");
            break;
            case 2: System.out.println("Kedd");
            break;
            case 3: System.out.println("Szerda");
            break;
            case 4: System.out.println("Csütörtök");
            break;
            case 5: System.out.println("Péntek");
            break;
            case 6: System.out.println("Szombat");
            break;
            case 7: System.out.println("Vasárnap");
            break;
            default: System.out.println("Nincs ilyen.");
        }
    }
    
}
