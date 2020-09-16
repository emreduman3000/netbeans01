
package vegetable;

import java.util.ArrayList;

/**
 *
 * @author Megha Patel
 */
public class StirFry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Vegetable> veggie=new ArrayList();
        Vegetable v1=new Onion();
      //  Onion o=new Onion(); find out can we use it??
        Vegetable v2=new Potato();
        Vegetable v3=new Spinach();
        Vegetable v4=new Tomato();
    
        veggie.add(v1);
        veggie.add(v2);
        veggie.add(v3);
        veggie.add(v4);
        
        for(Vegetable v:veggie)
        {
            String result="good";
            if(!v.isTasty())
            {
                    result="bad";
            }
            System.out.println("The "+v.getName()+" taste is "+result);
        }
    
    }

}
