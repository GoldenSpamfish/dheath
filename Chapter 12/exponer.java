
/**
 * it do expon
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class exponer
{
    public static void main (String [] args){
    System.out.println("5 exponered to 2 is: " + expon(2,5));

    }
    public static int expon (int pow, int num){
    if(pow==0){
    return 1;    
        
    }
    else{
    return num * expon(pow-1, num);
        
    }
    }
}
