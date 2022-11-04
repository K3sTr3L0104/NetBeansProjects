/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sajatmethod;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class SajatMethod {

    public static double atlag(int szam1, int szam2) {
        double atl = (szam1 + szam2) / 2.0;

        return atl;
    }

    public static void feladat() {
        System.out.println("***************");
        System.out.println("*   Feladat   *");
        System.out.println("***************");
    }
    public static void tartomany(int szam3, int szam4){
        int tartomanyAlja;
        int tartomanyTeteje;
        if(szam3<szam4) {
            tartomanyAlja = szam3;
            tartomanyTeteje = szam4;
        }
        else{
            tartomanyAlja = szam4;
            tartomanyTeteje = szam3;
        }
        System.out.println("A tartomány alja:"+tartomanyAlja);
        System.out.println("A tartomány teteje:"+tartomanyTeteje);
    }
    public static int veletlen() {
        Random Rand = new Random();
        int randomSzam = rand.nextInt(tartomanyTeteje - tartomanyAlja + 1) + tartomanyAlja;
        return randomSzam;
    }

    public static void main(String[] args) {
        feladat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot:");
        int szam1 = scanner.nextInt();
        System.out.println("Adj meg egy másik számot:");
        int szam2 = scanner.nextInt();
        System.out.println(atlag(szam1, szam2));
        System.out.println("Adjon meg egy 3. számot:");
        int szam3 = scanner.nextInt();
        System.out.println("Adjon meg egy 4. számot:");
        int szam4 = scanner.nextInt();
        tartomany(szam3, szam4);
    }

}
