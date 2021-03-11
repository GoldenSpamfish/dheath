
import java.util.Scanner ;
public class Nnodes
{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in) ;
    int control=0 ;
      while (control == 0){ 
     System.out.println("How many nodes would you like to connect?");
     
     double n= sc.nextInt();  
     double x= (n*(n-1))/2 ;
     
     System.out.println(n+ " interconnected nodes have " +x+ " connections.");
     System.out.println("Would you like to try another? If you do, input 0."); 
      
     control= sc.nextInt();
      
      
      
      
    }
}
    
}
