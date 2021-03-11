import java.util.Scanner ;
public class pythonBridge
{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in) ;
    
     System.out.println("BRIDGEKEEPER: Stop! Who would cross the Bridge of Death must answer me these questions three, ");
     System.out.println(" ere the other side he see.");
    
     System.out.println("BRIDGEKEEPER: What... is your name?");
     String response1 = sc.nextLine();
     System.out.println("YOU: " +response1);
     
     System.out.println("BRIDGEKEEPER: What... is your favorite color?");
     String response2 = sc.nextLine() ;
     System.out.println("YOU: " +response2);
     
     System.out.println("BRIDGEKEEPER: What... is the airspeed velocity of an unladen swallow?");
     String response3 = sc.nextLine();
     System.out.println("YOU: " +response3);
     
     if (response3.equals ("African or European?") ){ 
     
     System.out.println("BRIDGEKEEPER: I don't know that");
     System.out.println("BRIDGEKEEPER: -falls to his death-");
             
     System.out.println("YOU: can now pass");
    }
     else if (response3.equals ("African or European") ){ 
     
     System.out.println("BRIDGEKEEPER: I don't know that");
     System.out.println("BRIDGEKEEPER: -falls to his death-");
             
     System.out.println("YOU: can now pass");
    }
     else if (response3.equals ("african or european") ){ 
     
     System.out.println("BRIDGEKEEPER: I don't know that");
     System.out.println("BRIDGEKEEPER: -falls to his death-");
             
     System.out.println("YOU: can now pass");
    }else if (response3.equals ("african or european?") ){ 
     
     System.out.println("BRIDGEKEEPER: I don't know that");
     System.out.println("BRIDGEKEEPER: -falls to his death-");
             
     System.out.println("YOU: can now pass");
    }
    
     else {    
         System.out.println("BRIDGEKEEPER: Wrong!");
          System.out.println("YOU: Dies");
    }
     
        

    }
}
    
