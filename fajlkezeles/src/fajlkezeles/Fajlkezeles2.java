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
public class Fajlkezeles2 {
    public static void main(String[] args) {
        int[] szamok = new int[5];
        RandomAccessFile raf;
        String sor;
        int elsosor;
        try {
            raf = new RandomAccessFile("adat2.txt","r");
            elsosor = Integer.parseInt(raf.readLine());
            for (int i = 0; i <elsosor; i++) {
                sor = raf.readLine();
                szamok[i] = Integer.parseInt(sor);
                System.out.println(szamok[i]);
            }
        }
        catch ( IOException e) {
            System.out.println("HIBA");
     }
    }
}
