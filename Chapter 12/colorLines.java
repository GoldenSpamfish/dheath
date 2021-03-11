import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

//************************************************************************
//  RubberLines.java       Author: Lewis/Loftus Modified by Ryan Ellis
//
//  Demonstrates the handling of mouse press and mouse drag events.
//************************************************************************
import java.time.LocalDate;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class colorLines extends Application
{
    private Line currentLine;
    private Group root;
    private ColorPicker colorPicker;

    //--------------------------------------------------------------------
    //  Displays an initially empty scene, waiting for the user to
    //  draw lines with the mouse.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
   
        colorPicker = new ColorPicker(Color.WHITE);
        colorPicker.setOnMousePressed(this::processMousePress);
        
        
        
        //HBox pickers = new HBox(colorPicker);
        
        //root.getChildren().add(pickers);
        
        root = new Group(colorPicker);
        
        Scene scene = new Scene(root,1000, 1000, Color.BLACK);
        scene.setOnMousePressed(this::processMousePress);
        scene.setOnMouseDragged(this::processMouseDrag);
        
        

        primaryStage.setTitle("Rubber Lines");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //--------------------------------------------------------------------
    //  Adds a new line to the scene when the mouse button is pressed.
    //--------------------------------------------------------------------
    public void processMousePress(MouseEvent event)
    {
        currentLine = new Line(event.getX(), event.getY(), event.getX(),
            event.getY());
        currentLine.setStroke(colorPicker.getValue());
        currentLine.setStrokeWidth(3);
        root.getChildren().add(currentLine);
    }

    //--------------------------------------------------------------------
    //  Updates the end point of the current line as the mouse is
    //  dragged, creating the rubber band effect.
    //--------------------------------------------------------------------
    public void processMouseDrag(MouseEvent event)
    {
        currentLine.setEndX(event.getX());
        currentLine.setEndY(event.getY());
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}