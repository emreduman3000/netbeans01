/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rationalnumbertest;

import rationalnumbers.RationalNumbers;

/**
 *
 * @author emreduman
 */
public class RationalNumberTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RationalNumbers n1=new RationalNumbers(1,2);// 1/2 olusucak
        RationalNumbers n2=new RationalNumbers(3,2);// 3/2 olusucak
        
        RationalNumbers toplam = n1.add(n2); //1/2 + 3/2 = 4/2=2
        System.out.println(toplam);// burada cevabı yazıcak yani 2
        
        n1.main();
    }
    
}
