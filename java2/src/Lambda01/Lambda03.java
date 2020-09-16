/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author emreduman
 */
public class Lambda03 {
    
    public static void main(String [] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Ali");
        list.add("Mark");
        
        //alfabetik sıraya göre bikere yazdır
        
        list.
            stream().
            distinct().
            sorted().
            forEach(System.out::println);
        /*
        Ali
        Amanda
        Jackson
        Mark
        */
        
        
        
        System.out.println("");
        //eleamanları bir kere yazdır(tekrarlı olanları da) ve uzunluklarına göre sırala
        list.
            stream().
            distinct().
            sorted(Comparator.comparing(t->t.length())).
            forEach(System.out::println);
        
        /*
        Ali
        Mark
        Amanda
        Jackson
        */
        System.out.println("");
        //list elemanlarını tekrarlı olanları 1 kez yazır, elemanların sonharflerine göre sırala
        
        list.
            stream().
            distinct().
            sorted(Comparator.comparing(t->t.substring(t.length()-1))).          
            forEach(System.out::println);

        /*
        Amanda
        Ali
        Mark
        Jackson
        */
        
        System.out.println("");
       //alfabetik sıraya göre tersten yazdır
       list.
               stream().
               distinct().
               sorted(Comparator.reverseOrder()).
               forEach(System.out::println);
        
       /*
        Mark
        Jackson
        Amanda
        Ali
       */
        
    }
        
    
}
