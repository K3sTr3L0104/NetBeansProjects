/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oraimunka1018;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class OraiMunka1018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LKKT
        //Kérjünk be 2 pozitív egész számot!
        //Számoljuk ki a legkisebb közös többszörösüket
        Scanner scanner = new Scanner (System.in);
        System.out.println("Adjon meg 2 pozitív egész számot!:");
        int a;
        int b;
        int x;
        int y;
        a = scanner.nextInt();
        b = scanner.nextInt();
        x = a;
        y = b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            else {
                b = b -a;
            }
        }
        System.out.println("LKKT = "+x*y/a);
        
    }
    
}
