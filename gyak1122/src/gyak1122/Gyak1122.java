/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak1122;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Gyak1122 {
    public static int legkisebb(int a, int b, int c) {
        int min;
        
        if (a <= b && a <= c) {
            min = a;
        }
        else if (b <= c && b <= a) {
            min = b;
        }
        else {
            min = c;
        }
        return min;
    }
     public static String middle(String str)
    {
        int pozicio;
        int hossz;
        if (str.length() % 2 == 0)
        {
            pozicio = str.length() / 2 - 1;
            hossz = 2;
        }
        else
        {
            pozicio = str.length() / 2;
            hossz = 1;
        }
        return str.substring(pozicio, pozicio + hossz);
    }
    public static int szamlalo(String str) {
        int szamol = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                szamol++;
            }
        }
        return szamol;
    }
    public static boolean novekvoe(int para1, int para2, int para3) {
        if (para1 < para2 && para2 < para3) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int osszeg(int szam) {
        int vegeredmeny = 0;
        String osszege = String.valueOf(szam);
        int reszeredmeny;
        for (int i = 0; i < osszege.length(); i++) {
            reszeredmeny = osszege.charAt(i);
            System.out.println(reszeredmeny);
            reszeredmeny = Character.getNumericValue('1');
        }
        return vegeredmeny;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.println("Adjon meg egy Stringet:");
        String str = in.nextLine();
        System.out.println("Adjon meg egy tetszőleges hosszú számot:");
        int szam4 = in.nextInt();
        System.out.println("Adjon meg egy számot: (1)");
        int szam1 = in.nextInt();
        System.out.println("Adjon meg egy számot: (2)");
        int szam2 = in.nextInt();
        System.out.println("Adjon meg egy számot: (3)");
        int szam3 = in.nextInt();
        System.out.println("A legkisebb szám a három közül:"+legkisebb(szam1,szam2,szam3));
        System.out.println("----------------------------");
        System.out.println("A string közepe:"+middle(str));
        System.out.println("A magánhangzók száma a stringben:"+szamlalo(str));
        System.out.println("Növekvő sorrendben vannak-e:"+novekvoe(szam1,szam2,szam3));
        System.out.println("A számjegyek összege:"+osszeg(szam4));
    }
}
