/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlkezeles;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author user3
 */
public class fajlkezeles4 {
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        try {
            raf = new RandomAccessFile("adat1.txt","r");
            sor = raf.readLine();
            while(sor!=null) {
                numbers.add(Integer.parseInt(sor));
                sor = raf.readLine();
            }
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println(numbers.get(i));
            } 
        }
        catch ( IOException e) {
            System.out.println("HIBA");
        }
    }
}
