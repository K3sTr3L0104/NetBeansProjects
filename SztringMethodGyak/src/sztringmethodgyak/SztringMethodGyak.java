/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sztringmethodgyak;

/**
 *
 * @author user3
 */
public class SztringMethodGyak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "A Diak osztály objektuma (Vad Alma Korte ) példányosítás útján jön létre.";
        String nev;
        System.out.println(szoveg.indexOf("("));
        System.out.println(szoveg.indexOf(")"));
        nev = szoveg.substring(26,41).toUpperCase();
        System.out.println(nev);
        System.out.println(nev.length()-1);
        System.out.println(nev.trim());
        System.out.println(szoveg.replace("Alma", "Körte"));
        String osztalyAzonosito = "2022i";
        System.out.println(nev.toLowerCase().replace(" ", ".")+osztalyAzonosito+"@bankitatabanya.hu");
        //doga:
        System.out.println("-----------------------------------------------");
        String szoveg1 = "Sok lúd disznót győz.";
        System.out.println(szoveg1.length());
        System.out.println(szoveg1.charAt((0)));
        System.out.println(szoveg1.equals(szoveg));
        System.out.println(szoveg1.contains("lúd"));
        System.out.println(szoveg1.indexOf("lúd"));
        System.out.println(szoveg1.replace("lúd", "veréb"));
        System.out.println(szoveg1.indexOf(" "));
        System.out.println(szoveg1.substring(4, szoveg1.length()));
        
    }
    
}
