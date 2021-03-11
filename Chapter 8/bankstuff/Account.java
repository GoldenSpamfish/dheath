

//********************************************************************
//  Account.java       Author: Lewis/Loftus Modified by Ryan Ellis
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.*;  

public class Account
{
   private final double RATE = 0.035;  // interest rate of 3.5%

   private int acctNumber;
   private double balance;
   private String name;
   private String pass;
   private boolean administrating;
   
   
   DecimalFormat accfm = new DecimalFormat ("000000") ;
   //-----------------------------------------------------------------
   //  Sets up the account by defining its owner, account number,
   //  and initial balance.
   //-----------------------------------------------------------------
   public Account (String owner, int account, double initial, String password, boolean admin)
   {
      name = owner;
      acctNumber = account;
      balance = initial;
      administrating= admin;
      pass=password;
   }

    public void setOwner (String owner){
    name =owner;     
    }
    
    public void setPass (String password){
    pass =password;     
    }
    
    public void setRights (boolean myadmin){
    administrating =myadmin;     
    }
    
    public void del (){
    //name =null;     
    //acctNumber =null;
    //pass =null;
    //administrating =false;
    
    }
   //-----------------------------------------------------------------
   //  Deposits the specified amount into the account. Returns the
   //  new balance.8
   //-----------------------------------------------------------------
   public double deposit (double amount)
   {
      balance = balance + amount;
      return balance;
   }

   //-----------------------------------------------------------------
   //  Withdraws the specified amount from the account and applies
   //  the fee. Returns the new balance.
   //-----------------------------------------------------------------
   public double withdraw (double amount, double fee)
   {
      balance = balance - amount - fee;
      return balance;
   }

   
 
   //-----------------------------------------------------------------
   //  Returns the current balance of the account.
   //-----------------------------------------------------------------
   public double getBalance ()
   {
      return balance;
   }

   public String getOwner ()
   {
       if (name != null) {
       return name;}
       else {
       return "x";}
       }
   
   
   public String getPass ()
   {
      return pass;
   }
   
   
   public boolean getAdmin ()
   {
      return administrating ;
   }
   //-----------------------------------------------------------------
   //  Returns a one-line description of the account as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      return (accfm.format(acctNumber) + "\t" + name + "\t" + fmt.format(balance));
   }
}
