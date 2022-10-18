/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munka;

/**
 *
 * @author user3
 */
public class Munka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "Ez egy tetszőleges szöveg. ";
        //szöveg hossza
        System.out.println(szoveg.length());
        //minden kisbetűs
        System.out.println(szoveg.toLowerCase());
        //minden nagybetűs
        System.out.println(szoveg.toUpperCase());
        //sorvégi szóköz és soreleji levágása
        System.out.println(szoveg.trim().length());
        //Összehasonlítás 2 string között
        System.out.println(szoveg.compareTo("Ez egy tetszőleges szöveg. "));
        System.out.println(szoveg.compareToIgnoreCase("ez egy tetszőleges szöveg. "));
        System.out.println(szoveg.equals("Ez egy..."));
        System.out.println(szoveg.equalsIgnoreCase("ez egy tetszőleges szöveg. "));
        //összefűzés
        System.out.println(szoveg.concat("Ez pedig egy hozzáfűzött"));
        //tartalmazza-e
        System.out.println(szoveg.contains("tetszőleges"));
        //mivel végződik
        System.out.println(szoveg.endsWith(" "));
        //mivel kezdődik
        System.out.println(szoveg.startsWith(" "));
        
    }
    
}
