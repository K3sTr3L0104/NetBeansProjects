/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adattipusok;

/**
 *
 * @author user3
 */
public class Adattipusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //egész számok
        byte homerseklet = 19; //-128 - 127
        short magassag = 165; //-32768 - 32767
        int fizetes = 850000; // -2mrd - +2mrd
        long nyeremeny = 2500000000000L;
        //valós számok
        float tomeg = 44333.569874521F;
        double ezEgyValosSzam = 22555447778.02569874;
        //karakter
        char egyBetu = 'k';
        char masikBetu = '\u0041'; //a karakter unicode kódja hexadecimálisan
        System.out.println(masikBetu);
        //logikai
        boolean vane = false;
        //változót értékeinek kiíratása
        System.out.println(homerseklet);
        System.out.println(magassag);
        System.out.println(fizetes);
        System.out.println(nyeremeny);
        System.out.println(tomeg);
        System.out.println(ezEgyValosSzam);
        System.out.println(egyBetu);
        System.out.println(masikBetu);
        System.out.println(vane);
        System.out.println((int)masikBetu);
        //adattípusok tartománya
        int byteAlja = Byte.MIN_VALUE;
        int byteTeteje = Byte.MAX_VALUE;
        System.out.println(byteAlja);
        System.out.println(byteTeteje);
        System.out.println("A Byte adattípus tartománya: "+byteAlja+" értéktől "+byteTeteje+" értékig terjed.");
        int shortAlja = Short.MIN_VALUE;
        int shortTeteje = Short.MAX_VALUE;
        System.out.println("A Short adattípus tartománya: "+shortAlja+" értéktől "+shortTeteje+" értékig terjed.");
        long longAlja = Long.MIN_VALUE;
        long longTeteje = Long.MAX_VALUE;
        System.out.println("A Long adattípus tartománya: "+longAlja+" értéktől "+longTeteje+" értékig terjed.");
        int intAlja = Integer.MIN_VALUE;
        int intTeteje = Integer.MAX_VALUE;
        System.out.println("Az INT adattípus tartománya: "+intAlja+" értéktől "+intTeteje+" értékig terjed.");
        float floatAlja = Float.MIN_VALUE;
        float floatTeteje = Float.MAX_VALUE;
        System.out.println("A Float adattípus tartománya: "+floatAlja+" értéktől "+floatTeteje+" értékig terjed.");
        double doubleAlja = Double.MIN_VALUE;
        double doubleTeteje = Double.MAX_VALUE;
        System.out.println("A Double adattípus tartománya: "+doubleAlja+" értéktől "+doubleTeteje+" értékig terjed.");
        
    }
    
}
