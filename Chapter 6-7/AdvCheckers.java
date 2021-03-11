/**
 * Write a description of class check here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class check
{
    public static void main(String [] args){
    char [] [] board = new char [9] [9] ;
    boolean toggle = true;
    int test1=0;
    int test2=0;
    Scanner sc = new Scanner (System.in);
    int x1 =0;
    int y1 =0;
    int newX =0;
    int newY =0;
    // I wanted to mess around with formatting, so I did it like this. 
    // this was made completely from scratch.
    // I could have just printed arrays, but I don't want to.
    
    System.out.print("  ⎯   ⎯   ⎯   ⎯   ⎯   ⎯   ⎯   ⎯");
    System.out.println();
    for (int x=1; x<=8; x++){
    if (x%2==0){
    toggle = false;
}
 else if (x%2!=0){
    toggle = true;
}


    
        for (int y=1; y<=8; y++){
    System.out.print(" | ");    
 if (5<x || x<4) {
        if (5<x){    
                if (toggle == true){
            board [x] [y]= '●';   
         toggle = false;
        test1++;
        }
        
             else if (toggle == false){
            board [x] [y]= ' ';   
         toggle = true;
         test2++;
        }
        //System.out.print("----------------");
        System.out.print(board [x] [y]);
    }
    
    
      else if (x<4){    
                if (toggle == true){
            board [x] [y]= '○';   
         toggle = false;
        test1++;
        }
        
             else if (toggle == false){
            board [x] [y]= ' ';   
         toggle = true;
         test2++;
        }
        //System.out.print("----------------");
        System.out.print(board [x] [y]);
    }
}  
 else {
     board [x] [y]= ' ';  
     System.out.print(board [x] [y]);
}

}
    System.out.println(" | ");
    System.out.print("  ⎯   ⎯   ⎯   ⎯   ⎯   ⎯   ⎯   ⎯");
    System.out.println();
    
    
   
}
while (true){
System.out.println("enter y of piece you want to move");
x1=sc.nextInt();

System.out.println("enter x of piece you want to move");
y1=sc.nextInt();

System.out.println("enter y where you want to move");
newX=sc.nextInt();

System.out.println("enter x where you want to move");   
newY=sc.nextInt();    

  
    
if (board [x1][y1]== '●') {
board [newX][newY] =  '●' ;   
}
else if (board [x1][y1] == '○'){
board [newX][newY] =  '○' ;       
    
}
board [x1] [y1]= ' '; 
System.out.println();   
System.out.print("  ⎯   ⎯   ⎯   ⎯   ⎯   ⎯   ⎯   ⎯");
System.out.println();  
  for (int a=1; a<=8; a++){
        for (int b=1; b<=8; b++){
    System.out.print(" | ");    
    System.out.print(board [a] [b]);
    
}
    System.out.println(" | ");
    System.out.print("  ⎯   ⎯   ⎯   ⎯   ⎯   ⎯   ⎯   ⎯");
    System.out.println();   
}    
    
    
    
 }
    
    

  }
  
    
    
}


