/////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
// Author: Ryan Ellis                        
// Date: 10/8/19                                               
// Program name: usernamer                                       
// Function: Generates username using inputs, and adds a number to the end.          
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner ;
public class usernamer
{
    public static void main (String [] args ) {
    
    Scanner sc = new Scanner (System.in);
        
    System.out.println("What is your first name?");
    
    String String1 = new String (sc.nextLine()) ;
    char first = String1.charAt (0);
    
    System.out.println("What is your last name?");
    
    String String2 = new String (sc.nextLine()) ;
    String last = String2.substring (0,5);
    
   
    double rand= Math.floor(Math.random ()*100) ;
    int rand1 = (int) Math.round(rand) ;
    
    String pass = (first+last+rand1);
    System.out.println("your pass is " +pass);
    
}}