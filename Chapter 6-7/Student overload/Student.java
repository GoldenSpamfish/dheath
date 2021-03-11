//********************************************************************
//  Student.java       Author: Lewis/Loftus -Modified by Ryan Ellis
//
//  Represents a college student.
//********************************************************************
import java.util.*;
public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int grade1, grade2, grade3;
   private int[] grades;
   //-----------------------------------------------------------------
   //  Sets up this Student object with the specified initial values.
   //-----------------------------------------------------------------
   public Student (String first, String last, Address home,
                   Address school)
   {
      grades= new int[4];
       firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      int mygrade=1;
      grades[1]= 0;
      grades[2]= 0;
      grades[3]= 0;
   }
   public Student (String first, String last, Address home,
                   Address school, int grade, int twograde, int threegrade)
   {
      grades= new int[4];
       firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      int mygrade=1;
      grades[1]= grade;
      grades[2]= twograde;
      grades[3]= threegrade;
   }
   public int getGrade (int whichgrade){
       int mygrade= grades[whichgrade];
       return mygrade;    
       
    }
   public double getAvg (){
       int mygrade= (grades[1]+grades[2]+grades[3]);
       return mygrade/3;    
       
    }
    public void setGrade (int grade, int whichgrade){
        int gr=grade;
        int wgr=whichgrade;
        grades[wgr]= gr;
          
       
    }
   //-----------------------------------------------------------------
   //  Returns this Student object as a string.
   //-----------------------------------------------------------------
   
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress;

      return result;
   }
   
}
