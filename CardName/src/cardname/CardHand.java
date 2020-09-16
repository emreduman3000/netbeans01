/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardname;

/**this class contains method to generate a deck of card
 *
 * @author emreduman
 */
public class CardHand 
{
 
    Card[] c=new Card[60];

    public void generateHand()
    {
        int count=0;
        for(Card.Color s: Card.Color.values())
        {
            for(Card.Ranks v: Card.Ranks.values())
            {
                c[count]=new Card(s,v);
                count++;
            }
        }
    }
    
}
