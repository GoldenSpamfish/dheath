import java.util.Scanner ;
public class avg
{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in) ;
    int control=0 ;
     while (control == 0){ 
     System.out.println("enter the first number you would like to average");
     
     int num1= sc.nextInt();  
     
     System.out.println("enter the second number you would like to average");
     
     int num2= sc.nextInt();  
     
     System.out.println("enter the third number you would like to average");
     
     int num3 = sc.nextInt();  
     
     double avg = ((num1+num2+num3)/3.0) ;
     
     
     
     System.out.println("your average is "+avg);
     
     
     
     
     
     System.out.println("Would you like to try another? If you do, input 0."); 
      
     control= sc.nextInt();
      
      
      
      
    }
}
    
}