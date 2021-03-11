/////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
// Author: Ryan Ellis                        
// Date: 10/31/19                                               
// Program name: Building                                          
// Function: A class that Generates a completely random house, with a door, roof, and 4 windows.
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
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.event.ActionEvent;
public class Building
{
    Random gen = new Random ();
    int househ=gen.nextInt(250)+180;  
    double housew=gen.nextInt(250)+180; 
    int doorh=gen.nextInt(50)+50;   
    
    
    public Building (int myOffset,int myHeight,Group root){
    int offset= myOffset;
    int height= myHeight;
    int y= (200-height)+(househ/5);
   
    
    Rectangle house = new Rectangle (50+offset,100-height,housew,400+height);
    
    Rectangle wind = new Rectangle (50+offset +(housew/4),y-100,(housew/2),(househ/2));
    
    Rectangle bar1 = new Rectangle (50+offset +(housew/4),(y+househ/4)-100-7.5,(housew/2),15);//horizontal
    
    Rectangle bar2 = new Rectangle (40+offset +(housew/2),y-100,15,(househ/2));//vertical
    
    Rectangle door = new Rectangle (50+offset +(housew/2)-(doorh*0.3),500-doorh,0.6*doorh,doorh);//vertical
        
    Polygon roof = new Polygon();
    roof.getPoints().addAll(new Double[]{
    50.0 + offset, 100.0-height,
    (housew/2)+50.0+offset,75.0-height ,
    housew+50.0+offset,100.0-height });
    
    int r=gen.nextInt(255);
    int g=gen.nextInt(255);
    int b=gen.nextInt(255);
    int r2=0;
    int g2=0;
    int b2=0;
    
    wind.setFill(Color.rgb(gen.nextInt(255),gen.nextInt(255),gen.nextInt(255)));
    house.setFill(Color.rgb(r,g,b));
    bar1.setFill(Color.rgb(r,g,b));
    bar2.setFill(Color.rgb(r,g,b));
    
    //windb.setStroke(10);
    Rectangle road = new Rectangle (0,500,1900,200);
    road.setFill(Color.rgb(100,100,100));
    
    roof.setFill(Color.rgb(gen.nextInt(255),gen.nextInt(255),gen.nextInt(255)));
    door.setFill(Color.rgb(gen.nextInt(255),gen.nextInt(255),gen.nextInt(255)));
    
    root.getChildren().add(house);
    root.getChildren().add(wind);
    root.getChildren().add(roof);
    root.getChildren().add(bar1);
    root.getChildren().add(bar2);
    root.getChildren().add(road);
    root.getChildren().add(door);
    }
    
}
