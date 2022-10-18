/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oraimunka1011;

/**
 *
 * @author user3
 */
public class OraiMunka1011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hozz létre egy 10 elemű integer tömböt.
        //Generáld le random az elemeit (1-10 közötti szám).
        //-összegezd az elemeit
        //-számláld meg a páros számokat
        //-mekkora a legkisebb
        //-mekkora a legnagyobb
        //-hányadik eleme a listának az első 5-nél kisebb szám
        //-van-e a számok között 4-gyel osztható
        
        //10elemű integer tömb
        int[] szamok = new int[10];
        //10 elem random generálása bele
        int i;
        for (i=0;i<10;i++){
            szamok[i] = (int) (Math.random()*10 ) +1;
            System.out.println(szamok[i]);
        }
        //összegzés, páros szem megnézése
        int osszeg = 0;
        int parosszam = 0;
        for (i = 0; i < szamok.length; i++) {
            osszeg += szamok[i];
            if( szamok[i] % 2 == 0 ) {
              parosszam += 1;
            }
        }
        System.out.println("A számok összege" + osszeg);
        System.out.println("A páros számok összege" + parosszam);
        //legnagyobb szám
        int max = 0;
        for (i=1; i < szamok.length;i++) {
            if (szamok[i] > szamok[max])
                max = i;
        }
        System.out.println("A tömbben a legnagyobb szám a(z) "+szamok[max]);
        //legkisebb szám
        int min = max;
        for (i=1; i < szamok.length;i++) {
            if (szamok[i] < szamok[min])
                min = i;
        }
        System.out.println("A tömbben a legkisebb szám a(z) "+szamok[min]);
        //Hányadik eleme az első 5-nél kisebb szám
        i = 0;
        while (szamok[i] > 5) {
            i++;
        }
        System.out.println("Az első 5-nél kisebb szám a(z) " + (i+1) + ". helyen áll");
        //Van-e 4-gyel osztható szám
        i = 0;
        while (i < szamok.length && (szamok[i] % 4 != 0)) {
            i++;
        }
        if (i < szamok.length) {
            System.out.println("Van néggyel osztható szám");
        }
    }
    
}
