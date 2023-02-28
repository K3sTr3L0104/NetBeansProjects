/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak0228;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author user3
 */
public class Gyak0228 {
    public static int[] statisztika(int szamok[][]) {
        int i;
        int j;
        int[] lista = new int[256];
                        for (i = 0; i < szamok.length; i++){
            for (j = 0; j < szamok[i].length; j++){
                int item = szamok[i][j];
                lista[item]++;
            }
                }
                        return lista;
    }
    public static void floatprint(float szamok4[][]) {
                    int i;
            int j;
                    for (i = 0; i < szamok4.length; i++){
            for (j = 0; j < szamok4[0].length; j++){
                System.out.print(szamok4[i][j] + " ");
            }
                        System.out.println();
        }
    }
    public static float[][] hanyados(int szamok[][], int szamok1[][]) {
        int i;
        int j;
        float[][] quotiens = new float[5][5];
                for (i = 0; i < szamok.length; i++){
            for (j = 0; j < szamok[i].length; j++){
                quotiens[i][j] = (float)szamok[i][j] / (float)szamok1[i][j];
            }
                        }
                                return quotiens;
    }
    public static void oszlopmin(int szamok[][]) {
                int sorszam = 1;
                int j;
                int i;
        for (j = 0; j < szamok[0].length; j++){
            int minimum = szamok[0][j];
            for (i = 0; i < szamok.length; i++){
                if (szamok[i][j] < minimum) {
                    minimum = szamok[i][j];
                }
            }
            System.out.println("Minimum az "+sorszam+" oszlopban: "+minimum);
            sorszam++;
        }
    }
    public static void sormax(int szamok[][]) {
                int sorszam = 1;
                int i;
                int j;
                for (i = 0; i < szamok.length; i++){
                    int max = 0;
            for (j = 0; j < szamok[i].length; j++){
                if (szamok[i][j] > max) {
                    max = szamok[i][j];
                }
            }
            System.out.println("Maximum az "+sorszam+" sorban: "+max);
            sorszam++;
                }
    }
            public static void matrixfill1(float szamok4[][]) {
        Random rand = new Random();
        int i;
        int j;
                for (i = 0; i < szamok4.length; i++){
            for (j = 0; j < szamok4[i].length; j++){
                szamok4[i][j] = (int)(Math.random() * 5) +65;
            }
                }
    }
        public static void matrixfill(int szamok[][]) {
        Random rand = new Random();
        int i;
        int j;
                for (i = 0; i < szamok.length; i++){
            for (j = 0; j < szamok[i].length; j++){
                szamok[i][j] = (int)(Math.random() * 5) +65;
            }
                }
    }
            public static void printmatrix(int szamok[][]) {
            int i;
            int j;
                    for (i = 0; i < szamok.length; i++){
            for (j = 0; j < szamok[0].length; j++){
                System.out.print(szamok[i][j] + " ");
            }
                        System.out.println();
        }
        }
    public static int[][] osszeadas(int szamok1[][], int szamok[][], int szamok3[][]) {
        int i;
        int j;
                        for (i = 0; i < szamok3.length; i++){
            for (j = 0; j < szamok3[i].length; j++){
                szamok3[i][j] = szamok1[i][j] + szamok[i][j];
            }
                        }
                        return szamok3;
    }
    public static void main(String[] args) {
        int szamok [][] = new int[5][5];
        int i;
        int j;
        //Mátrix feltöltése random számokkal
        matrixfill(szamok);
        printmatrix(szamok);
        //Soronként maximum számítás
        sormax(szamok);
                int minimum = szamok[0][0];
        //Oszloponként számolj minimumot
        oszlopmin(szamok);
        //Generálj egy másik mátrixot (5x5)
        int szamok1 [][] = new int[5][5];
                        for (i = 0; i < szamok1.length; i++){
            for (j = 0; j < szamok1[i].length; j++){
                szamok1[i][j] = (int)(Math.random() * 5) +65;
            }
                        }
        //Add össze a mátrixokat
        int szamok3 [][] = new int[5][5];
        osszeadas(szamok1,szamok,szamok3);
        printmatrix(szamok3);
        //Hozd létre a hányadosukat
        float szamok4 [][] = hanyados(szamok,szamok1);
        floatprint(szamok4);
        //Készíts statisztikát, hogy hány darab 65,66,67,68,69 van a mátrixban
        int[] lista = statisztika(szamok);
        System.out.println(lista[65]);
        System.out.println(lista[66]);
        System.out.println(lista[67]);
        System.out.println(lista[68]);
        System.out.println(lista[69]);
        
    }
    
}
