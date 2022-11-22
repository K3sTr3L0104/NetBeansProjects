/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karaktermetodusok;

/**
 *
 * @author user3
 */
public class KarakterMetodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char kar = 'A';
        //alfabetikus-e
        System.out.println(Character.isAlphabetic(kar));
        //szám-e
        System.out.println(Character.isDigit(kar));
        //betű-e
        System.out.println(Character.isLetter(kar));
        //betű vagy szám-e
        System.out.println(Character.isLetterOrDigit(kar));
        //kisbetűs-e
        System.out.println(Character.isLowerCase(kar));
        //nagybetűs-e
        System.out.println(Character.isUpperCase(kar));
        //szóköz-e
        System.out.println(Character.isSpaceChar(kar));
        //whitespace karakter-e
        System.out.println(Character.isWhitespace(kar));
        //nagybetűt kisbetűvé teszi.
        System.out.println(Character.toLowerCase(kar));
        //
        System.out.println(Character.isLowerCase(kar));
        
    }
    
}
