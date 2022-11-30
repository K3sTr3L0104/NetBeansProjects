/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak1129;
import java.util.Random;

/**
 *
 * @author user3
 */
public class Gyak1129 {
        public static boolean parose(int szám) {
            String s = String.valueOf(szám);
            char[] szetbontas = s.toCharArray();
            int igaz = 0;
            int hamis = 0;
    for (int i = 0; i < s.length(); i++) {
            if (szetbontas[i] % 2 == 0) {
                igaz++;
            }
            else {
                hamis++;
            }
        }
    if (hamis > 0) {
        return false;
    }
    else {
    return true;
    }
}
        public static boolean kozepponte(int min, int kozep, int max) {
            int er1 = kozep-min;
            System.out.println(min);
            int er2 = max-kozep;
            System.out.println("asd"+er1);
            System.out.println("basd"+er2);
            if (er1 == er2) {
            return true;
        }
            else {
                return false;
            }
        }

    public static void main(String[] args) {
        //1. feladat
        int szám = 2023;
        System.out.println(parose(szám));
        //2. feladat

        int a = 2;
        int b = 6;
        int c = 10;
        int min = 0;
        int max = 0;
        int kozep = 0;
        //minimum eldöntés
        if (a < b && a < c) {
            min = a;
        }
        if (b < a && b < c) {
            min = b;
        }
        if (c < a && c < b) {
            min = c;
        }
        //maximum eldöntés
        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c > b) {
            max = c;
        }
        //középső
        if (min == a && max == b) {
            kozep = c;
        }
        if (min == a && max  == c) {
            kozep = b;
        }
        if (min == b && max == a) {
            kozep = c;
        }
        if (min == b && max == c) {
            kozep = a;
        }
        if (min == c && max == a) {
            kozep = b;
        }
        if (min == c && max == b) {
            kozep = a;
        }
        System.out.println("minimum:"+min);
        System.out.println("maximum:"+max);
        System.out.println("közép:"+kozep);
        //ELDÖNTÉS HOGY UGYAN ANNYI-E A TÁVOLSÁG KÖZTÜK
        //3. feladat
        
        int[][] Example =    new int [5][5];
        int n = 5;
        for (int i=0;i< n;i++){
            for(int k=0;k<n;k++)
                System.out.println((rand.nextInt(2) +0)+" ");
            System.out.println(); 

       }
        System.out.println("-------------------------");
        System.out.println(kozepponte(min,max,kozep));
    }
}
