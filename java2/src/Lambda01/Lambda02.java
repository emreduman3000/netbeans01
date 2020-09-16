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
public class Lambda02 {
    
    public static void main(String [] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(15);
        
        //print all the cube of all even elements on the console
        list.
            stream().
            filter(t-> t%2==0).
            map(t->(int)(Math.pow(t, 3))).
            forEach(t->System.out.print(t+" "));//1728 64 216 8 64 1728
        System.out.println("");
        
        
        //listeki tüm elemanların toplamını yazdır
        int add=list.
                    stream().
                    reduce(0 ,(t , u)->t+u);//birden fazla elemanı 1 elemana indirme
        System.out.println(add);
        
            //t 0 ile basladı , u ise listteki ilk elemanı alır
            //-> dan sonra elimizdeki 2 variable ile ne yapmak istiyorsak yaparız
            
            //0+12=12
            //12+9=21
            //21+13=34
            
        //tek sayıları carp birbirleri ile
        int multiply=list.
                        stream().
                        filter(t-> t%2==1).
                        reduce(1 ,(t , u)->t*u);
        System.out.println(multiply);
        
        
        //3 e  bölünenleri 2 arttır ve topla birbirleri ile
        System.out.println(list.
                                stream().
                                filter(t-> t%3==0).
                                map(t->t+2).
                                reduce(1 ,(t , u)->t+u));//65
        
        
        
        
        /*
            //listteki elemanları yazdır ama tekrarlılar varsa birkez yazdır
            list.
                stream().
                distinct().
                forEach();// t-> System.out.println(t+" ") : LAMBDA EXPRESSION'dır

        */
        
        //METHOD REFERENCE kullanın
        list.
            stream().
            distinct().
            forEach(System.out::print); //1291346215 birlesik yazdı
        //System: public final class System
        //out   : public static final PrintStream out = null;
        //print : PrintStream classında methodtur
        
            
        
        //list'deki 3 ile bolunebilen elemanlarin 2 fazlalarinin toplamini ekrana yazdiriniz
		System.out.println(list.
	               			stream().
	               			filter(Lambda02::isDivisibleByThree).//sınıf.static method
	               			map(t->t+2).
	               			reduce(0,(t,u)->t+u));//129134621564


        
        
    }
    
    private static boolean isDivisibleByThree(int t) {
        return t%3==0;
    }
    
   
}
