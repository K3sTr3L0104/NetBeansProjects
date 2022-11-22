/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak1118;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class Gyak1118 {
    public static boolean isValidIgazolvany(String igazolvany) {
        if ((int) igazolvany.charAt(0) >= 65 && (int) igazolvany.charAt(0) <= 90
                || (int) igazolvany.charAt(0)
                && (int) igazolvany.charAt(1) >= 65 && (int) igazolvany.charAt(1) <= 90
                || (int) igazolvany.charAt(1) >= 48 && (int) igazolvany.charAt(1) <= 57
                && (int) igazolvany.charAt(2) >= 48 && (int) igazolvany.charAt(1) <= 57
                && (int) igazolvany.charAt(3) >= 48 && (int) igazolvany.charAt(3) <= 57
                && (int) igazolvany.charAt(4) >= 48 && (int) igazolvany.charAt(4) <= 57
                && (int) igazolvany.charAt(5) >= 48 && (int) igazolvany.charAt(5) <= 57
                && (int) igazolvany.charAt(6) >= 48 && (int) igazolvany.charAt(6) <= 57
                || (int) igazolvany.charAt(6) >= 65 && (int) igazolvany.charAt(6) <= 90
                && (int) igazolvany.charAt(7) >= 48 && (int) igazolvany.charAt(7) <= 57
                || (int) igazolvany.charAt(7) >= 65 && (int) igazolvany.charAt(7) <= 90
                && igazolvany.length() == 8)
                return true;
        else {
            return false;
        }
                
    }
    
    public static void main(String[] args) {
        //kérjük be a felhasználótól a személyi igazolványának számát!
        //(ellenőrzött input, saját metódussal ellenőrizzünk)
        //következő formátumok elfogadottak:
        //123456AB
        //123456aB
        //JN123456
        Scanner scanner = new Scanner(System.in);
        String szemelyIgazolvany = new String();
        System.out.println("Adjon meg egy személyigazolvány számot (8 hosszú legyen)");
        szemelyIgazolvany = scanner.nextLine();
        System.out.println(isValidIgazolvany(szemelyIgazolvany));
        
        
    }
    
}
