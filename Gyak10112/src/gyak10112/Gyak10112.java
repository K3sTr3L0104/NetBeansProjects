/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak10112;

/**
 *
 * @author user3
 */
public class Gyak10112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "Ez egy tetszőleges szöveg. ";
        //szöveg hossza
        System.out.println(szoveg.length());
        //adott pozíción levő karakter
        System.out.println(szoveg.charAt(5));
        //kisbetűs kiíratás
        System.out.println(szoveg.toLowerCase());
        //nagybetűs kiíratás
        System.out.println(szoveg.toUpperCase());
        //sorvégi és sor eleji szóköz levágása
        System.out.println(szoveg.trim().length());
        //kezdődik valamivel
        System.out.println(szoveg.startsWith(" "));
        //végződik valamivel
        System.out.println(szoveg.endsWith(" "));
        //keresett karakter(ek) első pozíciója
        System.out.println(szoveg.indexOf("t"));
        System.out.println(szoveg.indexOf("egy"));
        //keresett karakterek utolsó pozíciója
        System.out.println(szoveg.lastIndexOf("t"));
        //string üres-e (boolean)
        System.out.println(szoveg.isEmpty());
        String szoveg2 = "";
        System.out.println(szoveg2.isEmpty());
        //lecseréli a szövegben az összes megadott karakter(ek)et más karakter(ek)re
        System.out.println(szoveg.replace("tetszőleges", "akármilyen"));
        System.out.println(szoveg.replace("e", "b"));
        //lecseréli a szövegben az első megadott karakter(ek)et más karakter(ek)re
        System.out.println(szoveg.replaceFirst("e", "b"));
        System.out.println(szoveg.replaceAll("e", "b"));
        //String szétszedése tömbbe megadott karakterek mellé
        System.out.println(szoveg.split(" "));
        //Nem string típúsú adatot stringgé konvertálása
        Integer szam = 512;
        System.out.println(szam.toString());
        //stringből substring kivétele
        System.out.println(szoveg.substring(3));
        System.out.println(szoveg.substring(3,6));
    }
    
}
