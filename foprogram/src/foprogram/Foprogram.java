/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foprogram;
import java.util.Scanner;
import java.lang.Math.*;
/**
 *
 * @author user3
 */
public class Foprogram {

    /**
     * @param args the command line arguments
     */
    public static double terfogat(double sugar, double magassag){
        double terfogat= Math.PI*sugar*sugar*magassag;
        return terfogat;
    }
    public static double felszin(double sugar, double magassag) {
        double felszin = (2*sugar*Math.PI)+(2*sugar*Math.PI*magassag);
        return felszin;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Sugár bekérés
        System.out.println("Adja meg a henger sugarát:");
        double sugar = scanner.nextDouble();
        //Magasság bekérés
        System.out.println("Adja meg a henger magasságát:");
        double magassag = scanner.nextDouble();
        System.out.println(terfogat(sugar,magassag));
        System.out.println(felszin(sugar,magassag));
    // Metódus készítés paraméterként kapott sugárból és magasságból kiszámolja a henger térfogatát
   
    }
    
}
