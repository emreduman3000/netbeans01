/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 */
public class Ice1 {
    
    public static void main(String[] args)
    {
             Card[] magicHand = new Card[7];

        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            int random1=(int)  ( 1 +( Math.random() *13) );
            int random2=(int)  ( 1 +( Math.random() *2) );
          
            c.setValue(random1);
            c.setSuit(Card.SUITS[random2]);
            
            
            System.out.println(c.getValue());
            System.out.println(c.getSuit());

             

        }
        Card c2 =new Card();
        Scanner scan=new Scanner(System.in);
        System.out.println("please choose a suite(Hearts, Diamonds, Spades, Clubs)");
        c2.setSuit(scan.nextLine());
        System.out.println("please choose a number(1-13)");
        c2.setValue(scan.nextInt());
        
        System.out.print(c2.toString());
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
