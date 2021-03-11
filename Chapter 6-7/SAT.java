import java.util.*;
public class SAT
{
public static void main(String [] args){
int x [] = new int [10] ;
boolean y [] = new boolean [10] ; 

Random gen = new Random ();
for (int i=0; i<10; i++) {
x [i]=gen.nextInt(600)+200;
//System.out.println(x [i]);

}
for (int n=0; n<10; n++) {  
    if (x [n] >= 600) {
y [n]=true;
}
else {
y [n]=false;
}
System.out.println(" | "+x[n]+" | "+y[n]+" | ");


}
}
}
