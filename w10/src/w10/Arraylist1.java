/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w10;

/**
 *
 * @author emreduman
 */
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Arraylist1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ArrayList a=new ArrayList();
//        a.add(new Circle(2.5));  //Circle c1=new Circle(2.5);
//        a.add(new Circle(3.5));
//        a.add(new Circle(4.5));
//        a.add(new Circle(5.5));
//        for(int i=0;i<a.size();i++)
//        {
//            Circle c=(Circle)a.get(i);
//            System.out.println("radius="+c.radius);
//            System.out.println("area of circle="+c.areaCircle());
//        }
        
        ArrayList<Circle> a=new ArrayList<Circle>(); //generic type
        a.add(new Circle(2.5));  //Circle c1=new Circle(2.5);
        a.add(new Circle(3.5));
        a.add(new Circle(4.5));
        a.add(new Circle(5.5));  //index 3
        //a.set(3, new Circle(6.5));
        //a.remove(3);
        for(int i=0;i<a.size();i++)
        {
            System.out.println("radius="+a.get(i).radius);
            System.out.println("area of circle="+a.get(i).areaCircle());
        }
        for(int i=0;i<a.size();i++)
        {
            int d=a.indexOf(a.get(i));
            System.out.println("index="+d);
        }
        try
        {
            if(a.contains(a.get(4)))
            {
                System.out.println("found");
            }               
        }
        catch(Exception e)
        {
            System.out.println("not found");
        }
    }
    
}
