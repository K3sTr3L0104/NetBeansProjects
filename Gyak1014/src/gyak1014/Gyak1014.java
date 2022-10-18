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
    }
    
}
