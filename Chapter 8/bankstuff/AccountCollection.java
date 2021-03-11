//********************************************************************
//  AccountCollection.java       Author: Lewis/Loftus Modified by Ryan Ellis
//
//  Represents a collection of Account movies.
//********************************************************************

import java.text.NumberFormat;

public class AccountCollection
{
   public Account[] collection;
   private int count;
   private double totalCost;
   private int acc;
   private String movs;

   //-----------------------------------------------------------------
   //  Constructor: Creates an initially empty collection.
   //-----------------------------------------------------------------
   public AccountCollection ()
   {
      collection = new Account[1];
      count = 0;
      totalCost = 0.0;
      
   }
   
   public void fillList(){
       
       
    }
   
//-----------------------------------------------------------------
   //  Adds a Account to the collection, increasing the size of the
   //  collection array if necessary.
   //-----------------------------------------------------------------
   public void addAccount (String owner, int account, double initial, String password, boolean admin)
   {
      if (count == collection.length)
         increaseSize();

      collection[count] = new Account (owner, account, initial, password, admin);
      count++;
   }
   
   public void addMoney (double money, int index)
   {
   collection[index].deposit(money);
   }
   
   public void addIntrest (double percent, int index)
   {
   collection[index].deposit(percent*collection[index].getBalance());
   }
   
   public int getLength (){
   return collection.length;
       
    }
   //-----------------------------------------------------------------
   //  Returns a report describing the Account collection.
   //-----------------------------------------------------------------
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
      report += "My Account Collection\n\n";

      report += "Number of Accounts: " + count + "\n";
      report += "\n\nAccount List:\n\n";

      for (int Account = 0; Account < count; Account++)
      if  (collection[Account] !=null){  
      report += collection[Account].toString() + "\n";

      
    }
    
    return report;
}
   
public void Sort()
    {
        for(int pos = 0; pos < count; pos++)
        {
            double lowest = 100000000000000000000000000000000000000.00;
            int lowindex = -1;
            for(int i = pos; i < count; i++)
            {
                if(collection[i].getBalance() < lowest)
                {
                    lowest = collection[i].getBalance();
                    lowindex = i;
                }
            }
            Account temp = collection[pos];
            collection[pos] = collection[lowindex];
            collection[lowindex] = temp;
        }
    }
    
   public String retAccount(int account)
   {
      return collection[account].toString() ;
       
      
    }
   
   public String retNom (int index){
       return collection [index].getOwner();    
  
       
    }
    
   public String retPass (int index){
       return collection [index].getPass();    
  
       
    }
   
   public boolean retAdmin (int index){
       return collection [index].getAdmin();    
  
       
    }
    
    public double retBalance (int index){
       return collection [index].getBalance();    
  
    }
    
    
    
    public void delCount (int index){
       collection [index-1] =null;    
  
    }
    
    
    
    
    
    public void setNom (int index, String name){
       collection [index-1].setOwner(name);    
  
    }
     
    public void setPass (int index, String pass){
       collection [index].setPass(pass);    
  
    }
    
    public void setRights (int index, boolean rights){
       collection [index].setRights(rights);    
  
    }
    
   public void setPass (int index){
       //return collection [index].getPass();    
  
    }
   
   public void setAdmin (int index){
       //return collection [index].getAdmin();    
  
    }
   //-----------------------------------------------------------------
   //  Increases the capacity of the collection by creating a
   //  larger array and copying the existing collection into it.
   //-----------------------------------------------------------------
   private void increaseSize ()
   {
      Account[] temp = new Account[collection.length * 2];

      for (int Account = 0; Account < collection.length; Account++)
         temp[Account] = collection[Account];

      collection = temp;
   }
   
   
   
   
}