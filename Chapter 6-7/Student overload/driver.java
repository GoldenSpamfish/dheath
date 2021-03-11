//********************************************************************
//  driver.java       Author: Ryan Ellis
//
//  Demonstrates the Student class.
//********************************************************************
public class driver
{
public static void main(String [] args){     
    Address home1= new Address ("Mullberry", "Worcestershire", "NE",32234);
    Address school1= new Address ("Grape", "Ketchup", "NE",32244);
    
    
    Student student1= new Student ("John", "Doe",home1,school1, 80, 86, 93 );
    Student student2= new Student ("Jane", "Doe",home1, school1);
    
    
    System.out.println(student1);
    System.out.println(student2);
    
    int grade1=1;
    System.out.println("student 2's grade: "+student1.getGrade(grade1));  
    System.out.println("student 2's grade: "+student1.getGrade(2));  
    
    student1.setGrade(98,2);
    System.out.println("student 1's changed grade: "+student1.getGrade(2));  

    System.out.println(student1.getAvg());

}
}
