/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciklusok;

/**
 *
 * @author user3
 */
public class Ciklusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        //növekményes ciklus (FOR)
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //FOR visszafelé
        for (i =4; i > -1; i--) {
            System.out.println(i);
        }
        //FOR 2-esével
        for (i = 0; i < 5; i+=2) {
            System.out.println(i);
        }
        //Elöltesztelő ciklus
        int szam = 1;
        int hanyszorFutott = 0;
        while (szam % 2 != 0){
            szam = (int) (Math.random() *20) +1;
            hanyszorFutott++;
        }
        System.out.println("A páros szám:"+szam);
        System.out.println("Hányszor futott le:"+hanyszorFutott);
        
    }
    
}
