/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak1202;
import java.util.*;
import java.util.function.Supplier;

/**
 *
 * @author user3
 */
public class Gyak1202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Írj egy programot, ami megkeresi egy tömb 2. legnagyobb elemét.
        int max = 0;
        int jelenlegi = 0;
        int max2 = 0;
        List<Integer> list=new ArrayList<Integer>();
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        boolean egyezoe = false;
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(56);
        list.add(55);
        list1.add(1);
        list1.add(3);
        list1.add(4);
        list1.add(55);
        System.out.println("ArrayList : " + list.toString());
        for (int i = 0; i < list.size(); i++) {
            jelenlegi = list.set(i, list.get(i));
            System.out.println(jelenlegi);
            if (max < jelenlegi) {
                max = jelenlegi;
            }
        }
        System.out.println(max);
        list.remove(list.indexOf(max));
        System.out.println(list.toString());
        for (int i = 0; i < list.size(); i++) {
            jelenlegi = list.set(i, list.get(i));
            System.out.println(jelenlegi);
            if (max2 < jelenlegi) {
                max2 = jelenlegi;
            }
        }
        System.out.println("második legnagyobb szám:"+max2);
        //2. írj egy programot, ami összehasonlít két egyenlő méretű tömböt, és megállapítja, hogy azonosak-e.
        int k = 0;
        if (list.size() == list1.size()) {
            for (int i = 0; i < list.size(); i++) {
            k++;
            if (list.get(i) == list1.get(i)) {
                list2.add(list.get(i));
                }
            }
        }
        System.out.println(list2.toString());
        if (list.size() == list2.size()) {
            egyezoe = true;
        }
        System.out.println("A két tömb azonos-e:"+egyezoe);
        
    }
    
}
