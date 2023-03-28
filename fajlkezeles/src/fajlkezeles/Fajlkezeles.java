/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlkezeles;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author user3
 */
public class Fajlkezeles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] szamok = new int[6];
         RandomAccessFile raf;
         String sor;
         try
         {
             raf = new RandomAccessFile("adat1.txt", "r");
             int db = 0;
             sor = raf.readLine();
             while (sor!= null ) {
                 szamok[db] = Integer.parseInt(sor);
                 db++;
                 sor = raf.readLine();
             }
             raf.close();
         }
         catch( IOException e) {
             System.out.println("HIBA");
         }
         int osszeg = 0;
         for (int i = 0; i < szamok.length; i++) {
            osszeg = osszeg+szamok[i];
         }
         System.out.println(osszeg);
    }
}
