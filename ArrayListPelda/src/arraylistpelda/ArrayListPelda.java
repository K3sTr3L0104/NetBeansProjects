/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpelda;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author user3
 */
public class ArrayListPelda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //.add(mit adok hozzá)
        //.size()
        //.get(hányadik elemet kérem) -- indexet vár
        ArrayList<Integer> szamok = new ArrayList<>();
        Random rand = new Random();
        for (int i =0; i<10; i++) {
        int randomSzam = rand.nextInt(20 - 10) + 10;
        szamok.add(randomSzam);
        }
        for (int i = 0; i<szamok.size(); i++) {
            System.out.println(szamok.get(i));
        }
        System.out.println("");
        szamok.add(25);
        for (int i = 0; i<szamok.size(); i++) {
            System.out.println(szamok.get(i)+" ");
        }
        System.out.println("");
        //hány páros szám van:
        int parosSzam = 0;
        for (int i = 0; i<szamok.size()-1; i++) {
            if (szamok.get(i) % 2 == 0) {
                parosSzam += 1;
            }
        }
        System.out.println("");
        System.out.println(parosSzam);
        
    }
    
}
