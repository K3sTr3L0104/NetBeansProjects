/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak1007;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class Gyak1007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //kérjünk be a felhasználótól egy nullánál nagyobb páros számot.
          Scanner scanner = new Scanner (System.in);
        int szam = -1;
        //előltesztelő ciklus(WhileLoop) ha van hogy 1 se kell
        while (szam<0 || szam % 2 == 1) {
        System.out.println("Adjon meg egy másik számot:");
        szam = scanner.nextInt();
        }
        System.out.println(szam);
        //hátultesztelő ciklus (javaDoWhileLoop) ha legalább 1 kell
        int szam1 = -1;
        do {
            System.out.println("Adjon meg egy másik számot:");
            szam1 = scanner.nextInt();
        } while (szam1<0 || szam1 % 2 ==1);
        System.out.println(szam1);
        //For loop (ha pontosan tudjuk hányszor fusson le)
        
        //gondoltam egy számot
        int szam2 = (int) (Math.random() *10) +1;
        System.out.println("Adj meg egy számot 1-10 között!!!!");
        int szam3 = scanner.nextInt();
        while (szam2 != szam3) {
            System.out.println("Adj meg egy számot 1-10 között");
            szam3 = scanner.nextInt();
        }
        System.out.println("A random szám"+szam2);
        System.out.println("A tipped"+szam3);
    }
}
