//********************************************************************
//  till0.java       Author: Ryan Ellis
//
//  displays a set of fractions, counting up to 0.
//********************************************************************
public class till0
{
    public static void main(String [] args){
   
   int num =1;
   int den =2;
   RationalNumber prev = new RationalNumber (num,den);
   RationalNumber curr = new RationalNumber (num+1,den+1);   
   
   while (prev.comparer(curr)!=0){
   for (int i=1;i<=10;i++){     
   prev.setFrac(num,den);
   curr.setFrac(num+1,den+1);
         
   RationalNumber diff = prev.subtract (curr);
    System.out.println(prev+","+curr+","+"("+diff+")"+",");
   num++;
   den++;
        
        
    }
}
}
}
