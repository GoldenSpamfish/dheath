 

//********************************************************************
//  CoinFlipRace.java       Author: Lewis/Loftus/Ryan Ellis
//
//  first to 3 wins!
//********************************************************************

public class CoinFlip
{
   
 public static void main (String[] args)
   {
   int p1score=0;
   int p2score=0;
   boolean playing=true;
   int flips=0;
   
      Coin myCoin = new Coin();

     

      
  while (playing=true){
    myCoin.flip();  
    if (myCoin.isHeads()){
         p1score++;
         System.out.println (myCoin);
         System.out.println ("Player 1 now has "+ p1score + " points");
         flips++;
        }
    else {
         p1score=0;
         System.out.println (myCoin);
         System.out.println ("Player 1 now has "+ p1score + " points");
         flips++;
        }
         
    myCoin.flip(); 
    if (myCoin.isHeads()){
         p2score++;
        System.out.println (myCoin);
         System.out.println ("Player 2 now has "+ p2score + " points");
         flips++;
        }
      else{
         p2score=0;
         System.out.println (myCoin);
         System.out.println ("Player 2 now has "+ p2score + " points");
         flips++;
        }
    if (p1score==3) {   
        System.out.println ("Player 1 wins!");
        System.out.println ("In total, it took "+ flips + " flips before a winner was counted.");
        playing = false;
   
        System.exit(0) ;
    }
    else if (p2score==3)  {  
        System.out.println ("Player 2 wins!");
        System.out.println ("In total, it took "+ flips + " flips before a winner was counted.");
        playing = false;
        System.exit(0) ;
    }
        }
    }
}

