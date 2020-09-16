/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardname;

/**I EDITED THE CARD PROJECT INTO UNOCARD
 *
 * @author emreduman
 */
public class CardPlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        CardHand ch=new CardHand();
        ch.generateHand();
        
        for(Card c:ch.c)
        {
            System.out.println(c.getRanks()+" of "+c.getColor());
        }
    }
    
}
