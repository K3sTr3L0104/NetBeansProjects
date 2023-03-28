/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlkezeles;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author user3
 */
public class fajlkezeles3 {
    public static void main(String[] args) {
        int[][] szamok = new int[5][4];
        RandomAccessFile raf;
        String sor;
        String[] seged = null;
        try {
            int db = 0;
            raf = new RandomAccessFile("adat3.txt","r");
            sor = raf.readLine();
            while(sor!= null) {
                seged = sor.split(" ");
                for (int i = 0; i < 4; i++) {
                    szamok[db][i] = Integer.parseInt(seged[i]);
                }
                db++;
                sor = raf.readLine();
            }
            int i;
            int j;
                    for (i = 0; i < szamok.length; i++){
            for (j = 0; j < szamok[0].length; j++){
                System.out.print(szamok[i][j] + " ");
            }
                        System.out.println();
        }
        }
        catch ( IOException e) {
            System.out.println("HIBA");
     }
    }
}
