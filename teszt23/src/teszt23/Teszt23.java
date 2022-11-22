/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teszt23;

/**
 *
 * @author user3
 */
public class Teszt23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
    
}
---------------
public class Metodusgyak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Írj egy metódust, ami három szám közül visszaadja a legkisebbet
       int a = 831;
        int b = 4723;
        int c = 424;
         
        int legkisebb;
         
        if(a<b) {
            if(c<a) {
                legkisebb = c;
            } else {
                legkisebb = a;
            }
        } else {
            if(b<c) {
                legkisebb = b;
            } else {
                legkisebb = c;
            }
        }
         
        System.out.println(legkisebb + " A legkisebb szám.");
        
        
        //vissza adja egy string középső karakterét
        Scanner in = new Scanner(System.in);
        System.out.print("Add meg a stringet: ");
        String str = in.nextLine();
        System.out.print("A string középső karaktere: " + middle(str)+"\n");
        System.out.println("----------------");
        System.out.println(count_Vowels(str));
        }
 public static String middle(String str)
    {
        int pozicio;
        int hossz;
        if (str.length() % 2 == 0)
        {
            pozicio = str.length() / 2 - 1;
            hossz = 2;
        }
        else
        {
            pozicio = str.length() / 2;
            hossz = 1;
        }
        return str.substring(pozicio, pozicio + hossz);
    }
 public static int count_Vowels(String str) {
        int szamol = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                szamol++;
            }
        }
        return szamol;
    }
        
}