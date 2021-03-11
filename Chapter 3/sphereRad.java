
/////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
// Author: Ryan Ellis                        
// Date: 10/8/19                                               
// Program name: sphereRad                                           
// Function: Generates a sphere based on an inputed radius, and finds its values          
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.text.DecimalFormat;
import javafx.scene.*;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.application.*;

public class sphereRad
{
    public static void main(String []args){
    Scanner sc = new Scanner (System.in);
    System.out.println("What is the radius?");    
    int radius =sc.nextInt();
    
    DecimalFormat fmt = new DecimalFormat ("0.####");
    
    double Vol = (4/3)*(Math.pow(radius, 3) * 3.14159);
    double SA=   (4)*(Math.pow(radius, 2) * 3.14159);
    System.out.println("Volume: "+Vol);
    System.out.println("Surface Area: "+SA);    
        
    }
}
