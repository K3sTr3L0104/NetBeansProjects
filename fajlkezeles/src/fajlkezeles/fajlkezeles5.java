/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlkezeles;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author user3
 */
public class fajlkezeles5 {
    public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    String sor;
    RandomAccessFile raf;
    String[] seged = null;
    try {
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        int db = 0;
        raf = new RandomAccessFile("adat3.txt","r");
        sor = raf.readLine();
        while(sor!=null) {
            seged = sor.split(" ");
            row1.add(sor);
            matrix.add(row1);
            sor = raf.readLine();
        }
        
    }
    catch (IOException e) {
        System.out.println("HIBA");
            }

        System.out.println(matrix.toString());
}
}
