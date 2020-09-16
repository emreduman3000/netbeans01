/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestRectangle;

/**
  @author emreduman
  @version 1.0
 */
public class TestRectangle {

    /**
     @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        
        //<editor-fold defaultstate="collapsed" desc="PRODUCT">
        System.out.println("----------- PRODUCTS -----------");
        Product product=new Product();
        product.setName1("Toaster");
        product.setPrice1(29.95);      
        product.setName2("Microwave");
        product.setPrice2(124.95);
        
        System.out.println(product);
        product.setPrice1_Price2();
        System.out.println(product);
        
        
        Product product2=new Product();
      
        System.out.println(product.equals(product2));//false
        
        
         //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="ROACH-POPULATION">
        System.out.println("\n----------- ROACH POPULATION -----------");

        RoachPopulation roach=new RoachPopulation(10);
        roach.waitFOR_Doubling();roach.spray();roach.getRoaches();
        roach.waitFOR_Doubling();roach.spray();roach.getRoaches();
        roach.waitFOR_Doubling();roach.spray();roach.getRoaches();
        
      //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="RECTANGLE">

        System.out.println("\n----------- RECTANGLE -----------");

        Rectangle rec=new Rectangle();//first object of Rectangle using default constructor
        System.out.println("Lenght:"+rec.getLenght()+"\tWidth:"+rec.getWidth()+"\tcolor:"+rec.getColor());
        
        Rectangle rec2=new Rectangle(15,16,"blue");// second object of Rectangle using  parameterized constructor
        System.out.println("Lenght:"+rec2.getLenght()+"\tWidth:"+rec2.getWidth()+"\t Color:"+rec2.getColor());

        rec.setLenght(13);//change value of lenght variable of Rectangle class to
        rec.setWidth(14);//change value of width variable of Rectangle class to
        rec.setColor("purple");//change value of width variable of Rectangle class to
        System.out.println("Lenght:"+rec.getLenght()+"\tWidth:"+rec.getWidth()+"\tColor:"+rec.getColor());

        rec.findArea();
        rec.findPerimeter();
        
        Rectangle [] arrray =new Rectangle[10];// created object array
        for(int i=0;i<arrray.length;i++)
        {
            arrray[i]=new Rectangle(i+1,i+1,"red");//constructor method that contains lenght and width
            System.out.println("----"+arrray[i]);
        }
        
        
        System.out.println(rec.equals(rec2));//ıf ı did not override the equals method ,'false' was goint to be printed
        

//</editor-fold>
        
     }    
}


//<editor-fold defaultstate="collapsed" desc="PRODUCT">
class Product
{
private  String name1,name2;
private double price1,price2;

public void setName1(String name){ this.name1=name; }   
public String getName1()         {  return name1;}


public void setPrice1(double price) {  this.price1=price;}
public double getPrice1()           {  return price1;}



public void setName2(String name)
{
this.name2=name;
}   
public String getName2()    {  return name2;}


public void setPrice2(double price)
{
this.price2=price;
}
public double getPrice2()    {  return price2;}


public void setPrice1_Price2()
{
    this.price1=price1-5;
    this.price2=price2-5;
}
/*
public void showINFOs()
{
    System.out.println("Product1 >> Name:"+getName1()+"   -- Price: $"+getPrice1());
    System.out.println("Product2 >> Name:"+getName2()+" -- Price: $"+getPrice2());
}

public void showINFOs_2()           
{
if("Toaster".equals(name1))
    System.out.println("Product1 >> Name:"+getName1()+"   -- Price: $"+(getPrice1()-5));
if("Microwave".equals(name2))
    System.out.println("Product2 >> Name:"+getName2()+" -- Price: $"+(getPrice2()-5));
}
*/


 @Override //of toString() method
    public String toString()
    {
        return 
        ("Product1 >> Name:"+getName1()+"   -- Price: $"+getPrice1()
        +"\nProduct2 >> Name:"+getName2()+" -- Price: $"+getPrice2());
      
    }

     @Override//of equals() method
    public boolean equals (Object a)
    {
        Product q=(Product)a;//I created a new object and equaled to object a that ı will assign
        return(this.getName1().equals(q.getName1())&& this.getName2().equals(q.getName2()));
    }
   

}


//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="ROACH-POPULATION">



//WEEK11 THURSDAY
class RoachPopulation
{
int size;

RoachPopulation(int sizee)
{
size=sizee;
}

public void waitFOR_Doubling()
{
size*=2; 
}

public void spray()
{
size-=(size*0.1); 
} 

public void getRoaches()
{
System.out.println(this.size+" Roaches");
}
}

//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="RECTANGLE">

class Rectangle//Java Program to create and call a default constructor  
{
    static private double lenght;//constant and private value
    static private double width;
    static private String color;
    
    /**
    creating a default constructor
    */
    Rectangle()
    {
        this.lenght=5;
        this.width=10;
        this.color="green";
    }
    /**
    creating a default constructor with three parameters
    * @param lenght 
    * @param width
    * @param color
    */
    Rectangle(double lenght,double width,String color)//define a constructor with two arguments
    {
        this.lenght=lenght;
        this.width=width;
        this.color=color;
    }
    /**
     * 
     *@param color 
     */
    public void setColor(String color)//method to assign a value
    {
        Rectangle.color=color;//reference
    } 
    /**
     * 
     * @return color 
     */
    public String getColor()//method to assign a value
    {
       return Rectangle.color;
    } 
    
    /**
     * 
     * @param lenght 
     */
    public void setLenght(double lenght)//method to assign a value
    {
        Rectangle.lenght=lenght;//reference
    } 
    /**
     * 
     * @return 
     */
    public double getLenght()//this method returns the value of lenght
    {
        return lenght;      
    }
    /**
     * 
     * @param width 
     */
    public void setWidth(double width)//method to assign a value
    {
        Rectangle.width=width;
    } 
    /**
     * 
     * @return 
     */
    public double getWidth()//this method returns the value of width
    {
        return width;      
    }
    /**
     * 
     * @param lenght
     * @param width
     * @param color 
     */
    public void setLenght_Width_color(double lenght,double width,String color)//method to assign a value to both variables
    {
        this.lenght=lenght;
        this.width=width;
        this.color=color;
    }
   
  /**
   * multiply length and width to find area of rectangle
   */
    public void findArea()
    {
        System.out.println("Area:"+lenght*width);
    }
    /**
    *finding perimeter
    */
    public void findPerimeter()
    {
        System.out.println("Perimeter:"+ 2*(lenght+width));
    }
    /**
     * 
     * @return length ,width , color
     */
    @Override //of toString() method
    public String toString()
    {
        return ("length="+lenght+ "\twidth="+width+ " \tcolor="+color);
    }
   /**
    * 
    * @param a
    * @return 
    */
    @Override//of equals() method
    public boolean equals (Object a)
    {
        Rectangle q=(Rectangle)a;//I created a new object and equaled to object a that ı will assign
        return(this.getLenght()==q.getLenght()&& this.getWidth()==q.getWidth());
    }
   
}
    
//</editor-fold>

