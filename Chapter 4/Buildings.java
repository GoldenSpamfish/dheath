/////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
// Author: Ryan Ellis                        
// Date: 10/31/19                                               
// Program name: Buildings                                           
// Function: Generates as many completely random houses as you would like using the Building class. it can be assigned various parameters. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.*;
import java.text.DecimalFormat;
import javafx.scene.*;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.application.*;
import javafx.scene.shape.Polygon;
public class Buildings extends Application
{
    public void start(Stage primaryStage){
   
    Group root= new Group();
    //Building example= new Building (offset from other house,extra height,root);
    Building build1= new Building (0,20,root);
    Building build2= new Building (450,50,root);
    Building build3= new Building (900, -10,root);
    //Building build4= new Building (1200,30, root);
   
    int sceneh=800;
    int scenew=1300;
//    root = new Group (roof,house,wind,windb);
    Scene scene = new Scene (root,scenew ,sceneh); 
    primaryStage.setScene(scene);    
    primaryStage.show();     
    
    
    
    }
}