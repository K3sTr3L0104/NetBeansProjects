/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak1014;

/**
 *
 * @author user3
 */
public class Gyak1014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] szamok = new int[] {3, 2, 15, 4, 42, 3};
        //1. hány darab páratlan szám van:
        int paratlanszam = 0;
        int i;
        for (i = 0;i < szamok.length;i++) {
            if (szamok[i] % 2 != 0) {
            paratlanszam++;
            }
        }
        int osszeg = 0;
        System.out.println(paratlanszam);
        for (i=0;i < szamok.length; i++) {
            osszeg+= szamok[i];
        }
        System.out.println("Az összeg:"+osszeg);
        int szamlalo = 0;
        int k = 0;
        while (k < szamok.length && szamok[k] > 10 && szamok[k] < 20) {
            k++;
        }
        if (k < szamok.length) {
            System.out.println("Van 10 és 20 közötti szám");
        }
        else {
            System.out.println("Nincs 10 és 20 közötti szám");
        }
        int min = szamok[0];
        for (int g = 1; g < szamok.length; g++) {
            if (szamok[g] < min) {
                min = szamok[g];
            }
        }
        System.out.println("A legkisebb szám az:"+min);
        //
        
        
        
                //LKKT
        //Kérjünk be 2 pozitív egész számot!
        //Számoljuk ki a legkisebb közös többszörösüket
        Scanner scanner = new Scanner (System.in);
        System.out.println("Adjon meg 2 pozitív egész számot!:");
        int szam = scanner.nextInt();
        int szam2 = scanner.nextInt();
        //primtényezős felbontása az első számnak:
        for (int i = 2; i<szam; i++) {
            while(szam%i==0) {
                System.out.println(i+" ");
                szam=szam/i;
            }
        }
        if (szam>2) {
            System.out.println(szam);
        }
        System.out.println("--------------------------------------");
                //primtényezős felbontása a második számnak:
        for (int i = 2; i<szam2; i++) {
            while(szam2%i==0) {
                System.out.println(i+" ");
                szam2=szam2/i;
            }
        }
        if (szam2>2) {
            System.out.println(szam2);
        }
        int szamok1[] = new int[];
        int szamok2[] = new int[];
    }
    
}
