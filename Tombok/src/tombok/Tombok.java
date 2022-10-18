/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombok;

/**
 *
 * @author user3
 */
public class Tombok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //integer tömb deklarálása
        int [] szamok =new int[10];
        
        //értékadás
        szamok[0] = 11;
        szamok[1] = 56; //stb
        System.out.println(szamok[1]);
        
        //tömb deklarálása értékadással együtt (inicializálás)
        int[] jegyek =new int[] {3,2,5,4,4,3};
        System.out.println(jegyek[3]);
        
                //tömb bejárása
        int i;
        for (i=0;i<jegyek.length;i++){
            System.out.println(jegyek[i]);
        }
        
        //String tömb deklarálása
        String[] nevek = new String[3];
        nevek[0] = "Amitakarok";
        nevek[1] = "Amitnemakarok";
        System.out.println(nevek[0]);
        System.out.println(nevek[1]);
        
        //String deklarálása
        String nevem;
        //string értékadása
        nevem= "Roli";
        System.out.println(nevem);
        
        System.out.println(nevem.charAt(0));
    }
    
}
