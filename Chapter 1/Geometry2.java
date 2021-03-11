//*********************************************************************
//|  Geometry_v2.0.java       Author: Ryan Ellis                      |
//|                           Based on code by: Lewis And Loftus      |
//*********************************************************************

public class Geometry2
{
   
   public static void main(String[] args)
   {
      int sides = 50 ;  // To user: Change this in order to change the entire
                        // expression. "Works" with all numbers of sides, play around with it!
                     
                     
      if (sides == 3) {
          
          String shape = "triangle" ;
          System.out.println (" A " +shape+ " has " + sides + " sides.");
        }
        else if (sides < 3) {
          
          String shape = "no shape" ;
           System.out.println (shape+ " has " + sides + " side(s).");
        }
      else if (sides == 4) {
          
          String shape = "square" ;
           System.out.println (" A " +shape+ " has " + sides + " sides.");
        }
      else if (sides == 5) {
          
          String shape = "pentagon" ;
           System.out.println (" A " +shape+ " has " + sides + " sides.");
        }
      else if (sides == 6) {
          
          String shape = "hexagon" ;
           System.out.println (" A " +shape+ " has " + sides + " sides.");
        }
      else if (sides == 7) {
          
          String shape = "heptagon" ;
           System.out.println (" A " +shape+ " has " + sides + " sides.");
        }
      else if (sides == 8) {
          
          String shape = "octogon" ;
           System.out.println (" A " +shape+ " has " + sides + " sides.");
        }
      else if (sides == 9) {
          
          String shape = "nonogon" ;
           System.out.println (" A " +shape+ " has " + sides + " sides.");
        }
      else if (sides == 10) {
          
          String shape = "decagon" ;
           System.out.println (" A " +shape+ " has " + sides + " sides.");
        }
        else if (sides > 10) {
          
          String shape = "no supported shape" ;
           System.out.println (shape+ " has " + sides + " sides.");
        }
    
      
      
     

        // assignment statement
      

     
   }
}