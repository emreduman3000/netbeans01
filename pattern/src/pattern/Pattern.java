/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;
import java.util.ArrayList;

/**
 *
 * @author emreduman
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ArrayList<Vegetable> veggie=new ArrayList();
        
        VegetableFactory factory=new VegetableFactory();
        
        Vegetable v1=factory.getVegetable("Carrot");
        Vegetable v2=factory.getVegetable("Onion");
        Vegetable v3=factory.getVegetable("Corn");
        Vegetable v4=factory.getVegetable("Spinach");
        
        veggie.add(v1);
        veggie.add(v2);
        veggie.add(v3);
        veggie.add(v4);
        
        for(Vegetable v: veggie)
        {
            String taste="good";
            if(!v.isTasty())
            {
                taste="bad";
            }
            System.out.println("The "+v.getName()+" taste is "+taste);
        }
        
        
    }
    
}

interface Organic 
{
    
    public static final boolean PESTISIDE_USE=false;
    
    public abstract void grawVeggie();
    public abstract void grawDuration();
}

    //<editor-fold defaultstate="collapsed" desc="abstract class Vegetable">

abstract class Vegetable
{
    private String name;//name of the vegetable
    private String color;//color of the vegetable

    public abstract boolean isTasty();

    protected Vegetable(String n, String c){
        name=n;
        color=c;
    }
    
    public void setName(String name){this.name = name;}
    public String getName() {  return name;}

    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
}
    // </editor-fold>




    //<editor-fold defaultstate="collapsed" desc="class Carrot extends Vegetable implements Organic">

class Carrot extends Vegetable implements Organic
{
    private int dummy;

    public Carrot(int dummy)//constructor from vegetable
    {
      super("Carrot","Orange");
      this.dummy=dummy;
    }
    @Override
    public boolean isTasty()//gövdesiz method vegetableda
    {
        return true;
    }

    @Override
    public void grawVeggie() {
     
    }

    @Override
    public void grawDuration() {
  
    }

}
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="class Corn extends Vegetable">


class Corn extends Vegetable
{

    public Corn()
    {
        super("Corn","Yellow");
    }
    
    @Override
    public boolean isTasty()
    {
       return false;
    }

}

    // </editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="class Onion extends Vegetable">

 class Onion extends Vegetable
 {

    private int layer;//new variable
    public Onion(int givenLayer)
    {
        super("Onion","Red");
        this.layer=givenLayer;
    }
    @Override
    public boolean isTasty()
    {
        return false;
    }
    
}
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="class Spinach extends Vegetable">


class Spinach extends Vegetable {

    public Spinach()
    {
        super("Spinach","Green");
    }
    @Override
    public boolean isTasty() 
    {
        return true;
    }

}


    // </editor-fold>








class VegetableFactory {

    public Vegetable getVegetable(String vegType)
    {
        Vegetable veg=null;
        
        if(vegType.compareToIgnoreCase("Carrot")==0)
        {
            veg=new Carrot(100);//ıt has iown variable / private int dummy;
        }
        
        else if(vegType.compareToIgnoreCase("Corn")==0)
        {
            veg=new Corn();
        }
        
        else if(vegType.compareToIgnoreCase("Onion")==0)
        {
            veg=new Onion(100);//ıt has iown variable/ private int layer;
        }
        
        else if(vegType.compareToIgnoreCase("Spinach")==0)
        {
            veg=new Spinach();    
        }
     return veg;
    }
}



   
