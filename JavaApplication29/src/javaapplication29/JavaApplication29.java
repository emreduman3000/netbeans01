/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author emreduman
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String input;    // To hold user input

      // Create a DecimalFormat object for displaying dollars.
      DecimalFormat dollar = new DecimalFormat("#,###.00");

      // Get the starting balance.
      input = JOptionPane.showInputDialog("What is your " +
                            "account's starting balance?");

      // Create a BankAccount object.
      BankAccount account = new BankAccount(input);

      // Get the amount of pay.
      input = JOptionPane.showInputDialog("How much were " +
                                   "you paid this month? ");

      // Deposit the user's pay into the account.
      account.deposit(input);

      // Display the new balance.
      JOptionPane.showMessageDialog(null,
                        "Your pay has been deposited.\n" +
                        "Your current balance is $ " +
                        dollar.format(account.getBalance()));

      // Withdraw some cash from the account.
      input = JOptionPane.showInputDialog("How much would " +
                                   "you like to withdraw? ");
      account.withdraw(input);

      // Display the new balance
      JOptionPane.showMessageDialog(null,
                     "Now your balance is $" +
                     dollar.format(account.getBalance()));

      System.exit(0);
    }
    
}
