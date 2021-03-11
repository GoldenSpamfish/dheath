/////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
// Author: Ryan Ellis                        
// Date: 10/8/19                                               
// Program name: Cylinder Generator                                           
// Function: Generates various values of a cylinder, and draws a tp and side view.          
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.text.DecimalFormat;
import javafx.scene.*;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.application.*;

public class shape extends Application
{
    public void start(Stage primaryStage){
    Random gen = new Random ();
    
    int radius =gen.nextInt(21)+11;
    int height =gen.nextInt(41)+21;
    DecimalFormat fmt = new DecimalFormat ("0.#");
    
    double Vol = ((Math.pow(radius, 2) * 3.14159)*height);
    
    //double Vo= fmt.Vol;
    Text top= new Text(250,100, "top: ");
    Text side= new Text(250,150, "side: ");
    Rectangle rect = new Rectangle (300,150,(radius*2),height);
    Circle circ = new Circle (300+radius,100,radius);
    circ.setFill(Color.BLUE);
    rect.setFill(Color.BLUE);
    
    
    
    
    Text volu= new Text(100,100, "Volume: "+fmt.format(Vol));
    Text hegt= new Text(100,120, "Height: "+height);
    Text rad= new Text(100,140, "Radius: "+radius);
    
    Group root = new Group (circ, rect, volu,hegt,rad, top, side);
    Scene scene = new Scene (root,400 ,400);    
    primaryStage.setScene(scene);    
    primaryStage.show();    
        
        
        
    }
}
