//********************************************************************
//  AI_Guessing.java       Author: Lewis/Loftus, edited by Ryan Ellis
//
//  Demonstrates the use of a block statement in an if-else. Also some other stuff. 
//  Unlike specified by assignment, can work with any max.
//********************************************************************

import java.util.*;

public class AI_guessing
{
   //-----------------------------------------------------------------
   //  Plays a godawfully complex guessing game with the user.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);
      Scanner sc = new Scanner (System.in);
      Random gen = new Random();
      System.out.println("what would you like as your max?");
      int maxpos = sc.nextInt();
      
      int answer;
      int strat;
      int guesscount= 20 ;
      int i=0;
      int min=(int)((maxpos/2)+0.01); 
      int max=(int)((maxpos/2)+0.01);
      int guess=(int)((maxpos/2)+0.01);
      int prevmin=1;
      int prevmax=maxpos;
     
      boolean playing= true;
      boolean subplaying= true;
      String cont = null;
      answer = gen.nextInt(maxpos) + 1;
      //System.out.println(max+" "+min+" "+guess);
      System.out.println("what strategy would you like to play?" );
      
      System.out.println("to guess a random within the possible range, enter 1" );
      System.out.println("to guess in the middle every time, enter 2" );
      strat=sc.nextInt();
      if (strat==1) {
      while (playing = true){
      
        answer = gen.nextInt(maxpos) + 1;
        System.out.println ("I'm thinking of a number between 1 and "+ maxpos + ". Guess what it is: ");
      
        i=0;
       
      
      while (subplaying=true){
      
      guess = gen.nextInt(max + 1 - min) + min;
      if (guess > answer){
         System.out.println ("The AI guessed "+guess);
         System.out.println ("Close. Guess lower.");
         i++;
         min=prevmin;
         max=guess-1;
         prevmax=max;
         prevmin=min;
         //System.out.println(max+" "+min+" "+prevmax+" "+prevmin);
        }
      else if (guess < answer){
         System.out.println ("The AI guessed "+guess);
         System.out.println ("Close. Guess higher.");
         i++;
         min=guess+1;
         max=prevmax;
         prevmax=max;
         prevmin=min;
         //System.out.println(max+" "+min+" "+prevmax+" "+prevmin);
        }
        
      else if (guess == answer){
         System.out.println ("The AI guessed "+guess);
         System.out.println ("The AI got it! It took "+i+" tries");
         System.out.println ("Try again? (Y/N)");
         cont = sc.next();
       
         if (cont.equals ("Y")){
        min=(int)((maxpos/2)+0.01); 
        max=(int)((maxpos/2)+0.01);
        guess=(int)((maxpos/2)+0.01);
        prevmin=1;
        prevmax=maxpos;
        
        System.out.println ("Enjoy!");
        answer = gen.nextInt(maxpos) + 1;
        System.out.println ("I'm thinking of a number between 1 and "+ maxpos + ". Guess what it is: ");
        
        i=0;
        
        }
         
       else if (cont.equals ("N")){
        System.out.println ("Well, I hope you enjoyed!");
        i=99;
        subplaying=false;
        playing=false;
        guess=0;
        //System.out.println ("tstmsg");
        System.exit(0) ;
        }
       else{
       System.out.println ("type capital Y or capital N next time");
        
        System.exit(0) ;
           
        }     
                                }
    }  
    }
    }
      
      
      if (strat==2) {
      while (playing = true){
      
        answer = gen.nextInt(maxpos) + 1;
        System.out.println ("I'm thinking of a number between 1 and "+ maxpos + ". Guess what it is: ");
        
        i=0;
        min=(int) maxpos/2;
        max=(int) maxpos/2;
      
      while (subplaying=true){
      
      guess = (int)(max + min)/2;
      if (guess > answer){
         System.out.println ("The AI guessed "+guess);
         System.out.println ("Close. Guess lower.");
         i++;
         min=prevmin;
         max=guess-1;
         prevmax=max;
         prevmin=min;
         //System.out.println(max+" "+min+" "+prevmax+" "+prevmin);
        }
      else if (guess < answer){
         System.out.println ("The AI guessed "+guess);
         System.out.println ("Close. Guess higher.");
         i++;
         min=guess+1;
         max=prevmax;
         prevmax=max;
         prevmin=min;
         //System.out.println(max+" "+min+" "+prevmax+" "+prevmin);
        }
        
      else if (guess == answer){
         System.out.println ("The AI guessed "+guess);
         System.out.println ("The AI got it! It took "+i+" tries");
         System.out.println ("Try again? (Y/N)");
      
       cont = sc.next();
       if (cont.equals ("Y")){
        min=(int)((maxpos/2)+0.01); 
        max=(int)((maxpos/2)+0.01);
        guess=(int)((maxpos/2)+0.01);
        prevmin=1;
        prevmax=maxpos;
        
        System.out.println ("Enjoy!");
        answer = gen.nextInt(maxpos) + 1;
        System.out.println ("I'm thinking of a number between 1 and "+ maxpos + ". Guess what it is: ");
        
        i=0;
        
        }
         
       else if (cont.equals ("N")){
        System.out.println ("Well, I hope you enjoyed!");
        i=99;
        playing=false;
        subplaying=false;
        System.exit(0) ;
        
        
        }
       else{
       System.out.println ("type capital Y or capital N next time");
        
        System.exit(0) ;
           
    }     
    }
    }  
    }
    }
}
}



