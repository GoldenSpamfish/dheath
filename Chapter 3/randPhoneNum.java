/////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
// Author: Ryan Ellis                        
// Date: 10/8/19                                               
// Program name: randPhoneNum                                           
// Function: Generates a random phone number using util.Math and and array          
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.util.Arrays;
import java.text.DecimalFormat;
public class randPhoneNum
{
    public static void main (String [] args ) {
     Random rand= new Random();
     DecimalFormat fmt = new DecimalFormat ("000");
     DecimalFormat fm = new DecimalFormat ("0000");
     int nums[];
     nums = new int[5];
     nums[0] = Math.abs(rand.nextInt(8));
     nums[1] = Math.abs(Math.round(rand.nextInt(8)));
     nums[2] = Math.abs(Math.round(rand.nextInt(8)));
     nums[3] = Math.abs(Math.round(rand.nextInt(655)));
     nums[4] = Math.abs(Math.round(rand.nextInt(9999)));
    int i=1;
     System.out.println(" ");
    System.out.print("your random phone number is "+nums[0]);
    while (i <= 2) {
    System.out.print(nums[i]);
    i++;
}
    int nums3=nums[3];
    fmt.format(nums3);
  
    int nums4=nums[4];
    fm.format(nums4);
    System.out.print(nums3);
    System.out.print(nums4);    
    
    
    
    
    
    
    
    
    }
}