/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak10112;
import java.util.Random;
import java.util.Scanner;
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
        
        //feladatok:
        //Kérjük be egy diák teljes nevét a fullName változóba!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a diák teljes nevét:");
        String fullName = scanner.nextLine();
        //Szedjük szét a nevet firstName és lastName változókba!
        String[] arr = fullName.split(" ");
        String firstName = arr[0];
        String lastName = arr[1];
        System.out.println(firstName);
        System.out.println(lastName);
        //Kérjük be az osztály azonosítóját a classId változóba.
        System.out.println("Adja meg az osztályazonosítóját:");
        String classId = scanner.nextLine();
        //4es feladat:
        if (classId.charAt(4) == 'e') {
                    classId = classId.replaceFirst("e", "E");
        }
        System.out.println(classId);
        //5ös feladat:
        int evfolyam = Integer.parseInt(classId.substring(0,4));
        if (evfolyam < 2022) classId = classId.toUpperCase();
        System.out.println(classId);
        //6os feladat:
        if (classId.equals(classId.toUpperCase()))
            System.out.println("Estis osztály");
            
        }
        
            
        }
        
        
    }
----------------------------------
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sajatmethod;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class SajatMethod {

    //Metódusok és osztályok helye
    public static double atlag(int szam1, int szam2) {
        double atl = (szam1 + szam2) / 2.0;
        return atl;
    }

    public static int veletlen(int also, int felso) {
        Random rand = new Random();
        int randomSzam = rand.nextInt(felso - also + 1) + also;
        return randomSzam;
    }

    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        System.out.println("Adj meg 1 számot:");
        int also = bill.nextInt();
        System.out.println("Adj meg még egy számot:");
        int felso = bill.nextInt();

        //Két szám átlaga
        System.out.println(atlag(4, 5));

        
        //veletlen method meghívása
        veletlen(also,felso);
        
        //Random szám generálása bekért tartományból
        System.out.print("Adj meg egy egész számot: ");
        int a = bill.nextInt();
        System.out.print("Adj meg még egy egész számot: ");
        int b = bill.nextInt();
        
        if (a < b){
            System.out.println(veletlen(a,b));
        } else if (b < a) {
            System.out.println(veletlen(b,a));
        } else System.out.println("A két számból nem generálható véletlen szám.");
    }

}

    
