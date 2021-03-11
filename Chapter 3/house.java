/////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
// Author: Ryan Ellis                        
// Date: 10/8/19                                               
// Program name: house                                           
// Function: Generates a completely random house, using all random sizes and colors.  
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
public class house extends Application
{
    public void start(Stage primaryStage){
    Random gen = new Random ();
    
    
    int househ=gen.nextInt(250)+180;  
    double housew=gen.nextInt(250)+180; 
    int window=gen.nextInt(100)+70;   
    int sceneh=800;
    
    double roofdai=Math.sqrt(Math.pow(househ,2)+Math.pow(housew,2));
    
    Rectangle house = new Rectangle (50,200,housew,househ);
    Rectangle wind = new Rectangle (50+(housew/2)-(window/2),househ-(window/2),window,window);
    Rectangle windb = new Rectangle (50+(housew/2)-(window/2),househ-(window/2),window,window);
    Polygon roof = new Polygon();
    roof.getPoints().addAll(new Double[]{
    50.0, 200.0,
    (housew/2)+50.0,75.0 ,
    housew+50.0,200.0 });
    
    //Rectangle roof = new Rectangle (0,0,100,100);
    //Rectangle crop = new Rectangle (50,200,housew,househ);
    
    wind.setFill(Color.rgb(gen.nextInt(255),gen.nextInt(255),gen.nextInt(255)));
    house.setFill(Color.rgb(gen.nextInt(255),gen.nextInt(255),gen.nextInt(255)));
    windb.setFill(null);
    windb.setStroke(Color.rgb(gen.nextInt(255),gen.nextInt(255),gen.nextInt(255)));
    //windb.setStroke(10);
    roof.setFill(Color.rgb(gen.nextInt(255),gen.nextInt(255),gen.nextInt(255)));

    //roof.setRotate(45);

    Group root = new Group (roof,house,wind,windb);
    Scene scene = new Scene (root,800 ,sceneh);    
    primaryStage.setScene(scene);    
    primaryStage.show();  
    
    }
}
