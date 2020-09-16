/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emreduman
 */
public class Lambda01 {
    
    public static void main(String [] args)
    {
        List<String>list=new ArrayList<>();
        list.add("Ali");
        list.add("can");
        list.add("kemal");
        list.add("mücella");
        list.add("ayse");
        list.add("emine");
        System.out.println(list);//[Ali, can, kemal, mücella, ayse, emine]
        
        //1.yol Structured Programming
        for(String i:list)
            System.out.print(i+" ");//Ali can kemal mücella ayse emine Ali 
        System.out.println("");
        
        
        //2. yol functional programming
        list.//liste elimizde
            stream().//elemanları alt alta yazar
            forEach(t->System.out.print(t+" "));//tek tek gezdik elemanları 
        ////Ali can kemal mücella ayse emine    
        System.out.println("");

        
        
        //1.yol uzunluğu 5ten az olanları yazdır
        for(String i:list)
            if(i.length()<5)
                System.out.print(i+" ");//Ali can ayse
        System.out.println("");

        
        //2.yol
        list.
            stream().
            filter(t-> t.length()<5).//sart koyarak eleman saceriz filtreleme
            forEach(t-> System.out.print(t+" "));//Ali can ayse
        System.out.println("");

        
        
        
        
        //son harfi e olanları yazdırın
        list.               //[A,B,C,D,E]
            stream().       //A,B,C,D,E ALT ALTA YAZILIR
            filter(t->t.endsWith("e")).                          
            forEach(t-> System.out.print(t+" "));//ayse emine
        System.out.println("");
        
        
        
        
        //a içerenleri yazdır
        list.
            stream().
            filter(t->t.contains("a")).
            forEach(t-> System.out.print(t+" "));///can kemal mücella ayse 
        System.out.println("");
        
        
        //uzunlugu 4ten fazla olanları uppercase yap
        //map() methodu ile elemanı alıp update yaparsın
        list.
                stream().
                filter(t->t.length()>4).
                map(t->t.toUpperCase()).//elemanları update etmek için kullanırız
                forEach(t-> System.out.print(t+" "));//elemenları tek tek gezer
        //KEMAL MÜCELLA EMINE
        System.out.println("");
        
        
        
        //listin içindeki elemanlerın uzunlugunu yazdır
        list.
            stream().
            map(t->t.length()).
            forEach(t->System.out.print(t+" "));///3 3 5 7 4 5
        System.out.println("");

        
        //kolay yolu, yukarda amacımız map() i kullanmak
        list.
            stream().
            forEach(t->System.out.print(t.length()+" "));  //3 3 5 7 4 5 
        System.out.println("");

        
        
        //listin içindeki elemanlardan e içerenlern uzunlugunn karesini al
        list.stream().
                filter(t->t.contains("e")).//e olanları aldı
                map(t->(int)(Math.pow(t.length(), 2))).//aldklarının uzunlugunun karesini al doubledan int e cevirdi
                forEach(t-> System.out.print(t+" ")  );//25 49 16 25 
        System.out.println("");
        
        

        
        
    }
}
