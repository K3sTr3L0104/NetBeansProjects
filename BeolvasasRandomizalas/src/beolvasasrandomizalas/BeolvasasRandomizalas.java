/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beolvasasrandomizalas;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class BeolvasasRandomizalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner bill = new Scanner(System.in);
        
        //adat beolvasás a billentyűzetről - egész szám
        System.out.print("Adj meg egy egész számot: ");
        int szam;
        szam = bill.nextInt();
        System.out.println("A beolvasott érték: "+szam);
        
        System.out.print("Adj meg egy valós számot: ");
        float szam2;
        szam2 = bill.nextFloat();
        System.out.println("A megadott valós szám: "+szam2);
        
        System.out.print("Adjon meg egy stringet: ");
        String szoveg;
        szoveg = bill.next();
        System.out.println(szoveg);
        //random szám generálás:
        //(Math.random() * intervallum_mérete) + alsó;
        int randomSzam = (int)(Math.random() * 21); //0-20 közötti szám
        System.out.println(randomSzam);
        // -55;15
        int randomSzam1 = (int)(Math.random() * 71) -55;
        System.out.println(randomSzam1);
        //-40;5
        int randomSzam2 = (int)(Math.random() * 46) -40;
        System.out.println(randomSzam2);
        //60;105
        int randomSzam3 = (int)(Math.random() * 46) +60;
        System.out.println(randomSzam3);
        //-45;-20
        int randomSzam4 = (int)(Math.random() * 26) -45;
        System.out.println(randomSzam4);
    }
    
}
