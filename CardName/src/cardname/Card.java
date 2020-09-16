/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardname;

/**this class provides model for card
 * COUPLINGS ALLOWS YOU TO CHANGE AND REUSE THE CODE ON A DIFFERENT FILE
 *
 * @author emreduman
 */
public class Card 

{
    public enum Color{RED,YELLOW,GREEN,BLUE};
    public enum Ranks{ZER0,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAWTWO,DRAWFOUR,WILDCARD};

    private final Color color;
    private final Ranks ranks;

        
    public Card(Color s, Ranks v)
    {
        color=s;
        ranks=v;
    }
        
    public Color getColor()
    {
        return this.color;
    }
    
        public Ranks getRanks()
    {
        return this.ranks;
    }


}
