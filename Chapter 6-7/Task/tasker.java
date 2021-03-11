//********************************************************************
//  tasker.java       Author: Ryan Ellis
//
//  Demonstrates the task class.
//********************************************************************
public class tasker
{
    public static void main(String [] args){
    Task task1 =new Task ("do thing", 1);
    Task task2 =new Task ("do other thing", 2, 5);
    Task task3 =new Task ("do more thing", 3, 2);
    
    
    System.out.println(task1.getTask());
    System.out.println(task1.getPriority());
    System.out.println(task2.getComplexity());
    task1.setComplexity(3);
    System.out.println(task1.getComplexity());
    
     
    }
}
