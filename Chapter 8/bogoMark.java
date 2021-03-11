// Author: Ryan Ellis
// Version: 1.0
// Bwahhh ha haaaa! I have turned Bogo the monkey into a Benchmark software.
// its effectively an excessive way to find execution times.
// Try it out!
//
import java.util.*;
import java.lang.Math;
public class bogoMark
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
   long startTime = 0;
   long elapsedTime = 0;
   long accum =0;
   Random rand = new Random (); 
   Scanner sc = new Scanner (System.in);
   int temp=0;
   int prev=0;
   int num=0;
   int place=0;
   double tries=0;
   int test=0;
   int score=0;
  
   System.out.println("We have tasked our famous monkey, bogo, to benchmark your computer (or JDE)");  
   System.out.println("Bogo is benchmarking!"); 
   
   int length= 5;
   
   
   int [] randarr = new int [length];  
   int [] testarr = new int [length]; 
   
   for (int n=0; n < 30; n++) {
   test=0;
   startTime = System.currentTimeMillis();
       
   for (int i=0; i < length; i++) {
       num = rand.nextInt(9)+1;
       randarr [i] = num;
       testarr [i] = num;
 
    } 
   
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
elapsedTime = System.currentTimeMillis() - startTime;
accum += elapsedTime;
}

double prescore= 1000*(100-(tries/accum));
score =  (int) prescore;  

System.out.println("Your bogoMark score is :"+ score);   

}
  
}
