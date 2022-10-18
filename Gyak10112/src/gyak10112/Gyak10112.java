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
    }
    
}
