
public interface Compares2
{
    public static void main(String [] args){
    
    RationalNumber ration1 = new RationalNumber (1,2);
    RationalNumber ration2 = new RationalNumber (99,100);
    RationalNumber ration3 = new RationalNumber (5234,75809);    
    
    if (ration1.comparer(ration2) == 0)
        System.out.println(ration1 + " is closely equivilent to " + ration2);
    if (ration1.comparer(ration3)== 0)
        System.out.println(ration1 + " is closely equivilent to " + ration3);
    if (ration2.comparer(ration3) == 0)
        System.out.println(ration2 + "is closely equivilent to " + ration3);
}   
        
        
    }        

