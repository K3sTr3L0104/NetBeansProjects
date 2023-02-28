/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1209;

/**
 *
 * @author user3
 */
public class Main {
    
    public static double kamatozas(double osszeg, int kamat, int hanyEvigKamat) {
        double kamatozottOsszeg = 0;
        double ujOsszeg2 = 0;
        for (int i = 0; i<=hanyEvigKamat; i++) {
            kamatozottOsszeg += osszeg+(osszeg/kamat);
            System.out.println(kamatozottOsszeg);
            ujOsszeg2 = (kamatozottOsszeg/kamat);
            System.out.println(ujOsszeg2);
        }
        return ujOsszeg2;
    }
    
    public static void main(String[] args) {
        double osszeg = 1000;
        int kamat = 10;
        int hanyEvigKamat = 5;
        System.out.println(kamatozas(osszeg,kamat,hanyEvigKamat));
    }
    
}
