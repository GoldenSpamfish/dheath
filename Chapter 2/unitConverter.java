/**
 * I was feeling bold a 1 am, so I decided to combine 2.7, 2.8, and 2.9 into one code, which is expandable.
 * enjoy.
 * @Ryan
 * @1.0 I guess
 */
import java.util.Scanner ;


public class unitConverter
{
    public static void main (String [] args) {
    int control = 0 ;
    
    Scanner sc = new Scanner (System.in) ;
   
        
    
    
    System.out.println ("Would you like to convert distance units, time, money, or speed?") ;
    

  
    String textInput = sc.nextLine ();
    if (textInput.equals ("speed")) {
    System.out.println ("what distance was travelled?") ;
    double distance = sc.nextDouble() ;
    
    System.out.println ("how long did it take (in seconds)") ;
    double time = sc.nextDouble() ;
    
    double speed = distance/time ;
    System.out.println ("speed = " +speed+ "u/s") ;
    
    
        
    }
    else if (textInput.equals("money") ) {
     System.out.println ("How much money would you like to convert to change") ;
     double inputMoney = sc.nextDouble() ;
     int centsMoney = (int) (inputMoney* 100.0) ;
     
     int twentys = centsMoney/2000 ;
     centsMoney = centsMoney-(twentys*2000);
     
     int tens = centsMoney /1000 ;
     centsMoney = centsMoney-(tens*1000);
     
     int fives = centsMoney /500 ;
     centsMoney = centsMoney-(fives*5000);
        
     int ones = centsMoney /100 ;
     centsMoney = centsMoney-(ones*100);
     
     int quarters = centsMoney /25 ;
     centsMoney = centsMoney-(quarters*25);
     
     int dimes = centsMoney /10 ;
     centsMoney = centsMoney-(dimes*10);
     
     int nickles = centsMoney /5 ;
     centsMoney = centsMoney-(nickles*5);
     
     int cents = centsMoney / 1 ;
     
     System.out.println ("$"+inputMoney+ " is made up of: " +twentys+ " 20 dollar bill(s) " +tens+ " 10 dollar bill(s) " +fives+ " 5 dollar bill(s) " +ones+ " 1 dollar bills " +quarters+ " quarters " + dimes+ " dimes " + nickles + " nickels " + cents+ " cents") ;
    }
    else if (textInput.equals("time") ) {
        
     System.out.println ("would you like to convert hours, minutes or seconds to standard time form (h:m:s)?") ;   
     
     int hours = 0 ;
     int minutes = 0 ;
     int seconds = 0 ;
     
    textInput = sc.nextLine ();
     if (textInput.equals("hours") ) {
     
         System.out.println ("how many " + textInput+ " would you like to convert to (h:m:s)?") ;   
         hours = sc.nextInt () ;
         
         
         System.out.println (hours+ " " +textInput+ "is represented in iso 8601 as " +hours+" hrs: "+minutes+" mins: "+seconds+" secs") ;
        
        
        
        
    }
    if (textInput.equals("minutes") ) {
     
         System.out.println ("how many " + textInput+ " would you like to convert to (h:m:s)?") ;   
         minutes = sc.nextInt () ;
         hours = minutes/60 ;
         int newMinutes = minutes%60 ;
         
         System.out.println (minutes+ " " +textInput+ " is represented in iso 8601 as " +hours+" hrs: "+newMinutes+" mins: "+seconds+" secs") ;
        
        
        
        
    }
    if (textInput.equals("seconds") ) {
     
         System.out.println ("how many " + textInput+ " would you like to convert to (h:m:s)?") ;   
         seconds = sc.nextInt () ;
         hours = seconds/3600 ;
         int preMinutes = seconds-(hours*3600);
         minutes = preMinutes / 60 ;
         int newSeconds = seconds- (hours*3600) - (minutes*60) ;
         
         System.out.println (seconds+ " " +textInput+ " is represented in iso 8601 as " +hours+" hrs: "+minutes+" mins: "+newSeconds+" secs") ;
        
        
        
        
    }
    
    }
   
    
    
    
    
    
    else if (textInput.equals ("distance") ) {
    
        System.out.println ("What distance unit would you like to convert from, km or mi?") ;
    
    
    textInput = sc.nextLine ();
    if (textInput.equals("km")){
       String opTextInput = ("miles"); //copy and paste, and change this if you want a different unit
        
    System.out.println ("how many " + textInput+ " would you like to convert to " +opTextInput+ " ?") ;
    
    double numInput = sc.nextDouble ();
    double unitMultiplier = 0.621371 ; // change this too
    double output = numInput*unitMultiplier ;
    
    System.out.println (numInput+ textInput +" is " + output+ " " +opTextInput) ;
    
    
    
    }
    else if (textInput.equals("mi")){
    String opTextInput = ("kilometers"); //copy and paste, and change this if you want a different unit
        
    System.out.println ("how many " + textInput+ " would you like to convert to " +opTextInput+ " ?") ;
    
    double numInput = sc.nextDouble ();
    double unitMultiplier = 1.60934 ; // change this too
    double output = numInput*unitMultiplier ;
    
    System.out.println (numInput+ textInput +" is " + output+ " " +opTextInput) ;
    }
    
}
    }
}
