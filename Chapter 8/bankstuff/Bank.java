
//********************************************************************
//  bank.java       Author: Ryan Ellis
//
//  A bank software, uses logins to allow seamless use by admins and users.
//********************************************************************
import java.util.*;
public class Bank
{
    //-----------------------------------------------------------------
    //  Creates a AccountCollection object and adds some Accounts to it. Prints
    //  reports on the status of the collection.
    //-----------------------------------------------------------------
    
    public static void main(String[] args)
    {
        boolean logged= false;
        boolean adlogged= false;
        Scanner sc= new Scanner (System.in);
        int input;
        double dinput;
        String strInput;
        String newName=null;
        int acctnum;
        double bal;
        String pass;
        boolean permiss;
        double tot$=0;
        
        
        
        
        
        int temp=0;
        int prev=0;
        int num=0;
        int place=0;
        int tries=0;
        int test=0;
        int finish= 0;
        
        AccountCollection bank = new AccountCollection();

        bank.addAccount("Ryan Ellis",  0001, 10000.00,"admin", true);
        bank.addAccount("Phil Swift", 0002, 30000.00, "flex", false);
        bank.addAccount("Guy Fieri",  0003, 25000.00, "flavortown", false);
        
        
        
      
        
        
        System.out.println("Welcome to GS bank");
        System.out.println("Enter your full name.");
        // System.out.println(bank.retNom(4));
        String name = sc.nextLine();
        for (int i=0; i < bank.getLength()-1; i++){
    if (name.equals(bank.retNom(i))){
    System.out.println("What is your password?");   
    pass = sc.nextLine(); 
    if (pass.equals(bank.retPass(i))){
     if(bank.retAdmin(i)==true){
    adlogged= true;    
    
    }
     else if(bank.retAdmin(i)==false){
    logged= true;    
    }
    }
    
}
    
    while (logged == true){
    System.out.println("Welcome to your account, "+name);
    System.out.println("What would you like to do?");
    System.out.println("Press 1 to display your account");
    System.out.println("Press 2 make a deposit");
    System.out.println("Press 3 make a withdraw");    
    System.out.println("Press 4 to exit"); 
    input= sc.nextInt();
   sc.nextLine();
    switch (input){ 
          case 1:
          System.out.println("Displaying your account:");
          System.out.println(bank.retAccount(i));
          break;
          
          case 2:
          System.out.println("How much would you like to add?");
          dinput=sc.nextDouble();
          bank.addMoney(dinput,i);
          
          break;
          
          case 3:
          System.out.println("How much would you like to withdraw?");
          dinput=sc.nextDouble();
          bank.addMoney(-dinput,i);
          break;
          
          case 4:
          System.out.println("Logging out...");
          logged=false;
          break;   
        
        
    }
}
    while (adlogged==true){
    
    System.out.println("Welcome to your ADMIN account, "+name);
    System.out.println("What would you like to do?");
    System.out.println("Press 1 to display all accounts");
    System.out.println("Press 2 to display statistics on one account");
    System.out.println("Press 3 to display statistics on the entire bank");
    System.out.println("Press 4 to remove/modify an account");
    System.out.println("Press 5 to create a new account");
    System.out.println("Press 6 to add intrest to all accounts");
    System.out.println("Press 7 to sort accounts");
    System.out.println("Press 8 to exit the software");
    input= sc.nextInt();
   sc.nextLine();
    
       switch (input){ 
          case 1:
          System.out.println("Displaying all accounts:");
          System.out.println(bank.toString());
          break;
          
          case 2:
          System.out.println("What account would you like to display? (enter account number)");
          input=sc.nextInt();
         sc.nextLine();
          System.out.println(bank.retAccount(input-1));
          break;
          
          case 3:
          System.out.println("Displaying statistics:");
          for (int a=0; a < bank.getLength()-1; a++){
          tot$+= bank.retBalance(a);
          
            }
          System.out.println("Average Balance: "+ (tot$/bank.getLength()));
          System.out.println("Total Accounts: "+ (bank.getLength()));
          System.out.println("Total Balance: "+ tot$);
          break;
          
          case 4:
          System.out.println("What account would you like to modify? (enter account number)");
          acctnum=sc.nextInt();
         sc.nextLine();
          System.out.println(bank.retAccount(acctnum-1));
          System.out.println("What would you like to do?");
          System.out.println("Press 1 to change account name");
          System.out.println("Press 2 to change password");
          System.out.println("Press 3 to change clearance level");
          System.out.println("Press 4 to delete account");
          input=sc.nextInt();
         sc.nextLine();
          if (input==1){
          System.out.println("enter the new name.");
          newName=sc.nextLine();
          bank.setNom (acctnum, newName);
            }
          if (input==2){
          System.out.println("enter the new password.");
          newName=sc.nextLine();
          bank.setPass (acctnum, newName);    
          
            }
          if (input==3){
          System.out.println("Should this account be admin? (true/false)");
          permiss=sc.nextBoolean();
          bank.setRights (acctnum, permiss);    
              
            }  
          if (input==4){
          System.out.println("deleting.");    
          bank.delCount(acctnum);
            } 
          break;
          
          case 5:
          System.out.println("Enter the name of the new account:");
          
          newName=sc.nextLine();
          
          
          System.out.println("Assigning account number..");
          acctnum= bank.getLength();
          
          System.out.println("What is it's initial balance?");
          bal =sc.nextDouble();
          
          System.out.println("what is this account's password");
          pass=sc.nextLine();
          
          
          System.out.println("Is this an admin account? (true/false)");
          permiss=sc.nextBoolean();
          
          System.out.println("Creating...");
          bank.addAccount(newName, acctnum, bal, pass, permiss);
          System.out.println("Done!");
          break;
          
          case 6:
          System.out.println("Enter % intrest: (as a decimal)");
          dinput=sc.nextDouble();
          for (int a=0; a < bank.getLength()-1; a++){
          bank.addIntrest(dinput,a); 
          
            }
          break;
          
          case 7:
          System.out.println("Sorting by balance...");
          bank.Sort();
          System.out.println(bank.toString());
          
          break;
          
          case 8:
          System.out.println("Logging out...");
          adlogged=false;
          break;
          
        }
    }
    


}
}
}