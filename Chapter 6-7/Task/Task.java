//********************************************************************
//  Task.java       Author: Ryan Ellis
//
//  implements complexity and priority.
//********************************************************************
import java.util.*;
public class Task implements Priority, Complexity
{
 private int pri;
 private int comp;
 private String todo;
 public Task (String items, int priority, int complexity){
 todo=items;
 pri=priority;
 comp= complexity;
         
    }
     public Task (String items, int priority){
 todo=items;
 pri=priority;
 comp= 0;
         
    }
    
 public int getPriority (){
    return this.pri; 
     
     
    }
    
 public int getComplexity (){
    return this.comp; 
     
     
    }
    
 public void setComplexity (int mycomplexity){
    comp=mycomplexity;
     
                                                                                
    }
 
 public String getTask (){
    return this.todo; 
     
     
    }
}