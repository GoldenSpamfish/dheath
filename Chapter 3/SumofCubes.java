/////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
// Author: Ryan Ellis                        
// Date: 10/8/19                                               
// Program name: SumofCubes                                          
// Function: cubes and adds 2 numbers, input by the user        
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner ;
public class SumofCubes
{
    public static void main (String [] args ) {
    
    Scanner sc = new Scanner (System.in);
        
    System.out.println("enter the first number");
    
    int num1 = sc.nextInt() ;
    
    System.out.println("enter the 2nd number");
    
    int num2 = sc.nextInt() ;
    
    double pow1 = (int) Math.pow(num1 ,3.0);
    double pow2 = (int) Math.pow(num2 ,3.0);
    
    System.out.println("the sum of " +num1+ " cubed, and "+num2+ " cubed is: " +(pow1+pow2));
    
    
    
    
    
    
    
    
    }
}