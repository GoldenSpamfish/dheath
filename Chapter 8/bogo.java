// Author: Ryan Ellis
// Version: 1.0
// 
// Bogo the ape will bogosort any array you throw at him!
// he's a bit slow though.
//
import java.util.*;
public class bogo
{
    public static void wait(int x)
   {
        try {
            Thread.sleep(x);
        }        catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
       }
    } 
    
   public static void main(String [] args){
Random rand = new Random (); 
   Scanner sc = new Scanner (System.in);
   int temp=0;
   int prev=0;
   int num=0;
   int place=0;
   int tries=0;
   int test=0;
  
   System.out.println("We have tasked our famous monkey, bogo, to sort an array for you!");  
   System.out.println("Bogo asks, how big you want array?"); 
   
   int length= sc.nextInt();
   
   
   int [] randarr = new int [length];  
   int [] testarr = new int [length]; 
   
   System.out.println("ok!");
    wait(1000);
   
   for (int i=0; i < length; i++) {
       num = rand.nextInt(9)+1;
       randarr [i] = num;
       testarr [i] = num;
 
    } 
   System.out.println("Here is your array!");
   System.out.println(Arrays.toString(randarr)); 
   wait(1000);
   System.out.println("Now he'll start!");
   wait(1000);
   
   while (test == 0){
         for (int i=0; i < length; i++) {
    place = rand.nextInt(length); 
    prev = randarr [i];
    temp = randarr [place];    
    randarr [i] = temp;
    randarr [place]= prev; 
    System.out.println("SWAP "+(i+1)+ ":"+Arrays.toString(randarr));   
    tries++;
    
}

System.out.println("DONE:  "+Arrays.toString(randarr));   

if (Arrays.equals(randarr, testarr)) {
    
    System.out.println("Bogo took "+tries+" tries");             
    test=1;       
           
           
        
    }
}
     
}
  
}
