import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.util.*;

//************************************************************************
//  PushRand.java       Author: Lewis/Loftus | Modified by: Ryan Ellis
//
//  Demonstrates JavaFX buttons and event handlers.
//************************************************************************

public class PushRand extends Application
{
    private int count;
    private Text countText;
    Random gen = new Random ();
    //--------------------------------------------------------------------
    //  Presents a GUI containing a button and text that displays
    //  how many times the button is pushed.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        count = 0;
        countText = new Text("Zero: "+count);

        Button push = new Button("Push Me!");
        push.setOnAction(this::processButtonPress);

        FlowPane pane = new FlowPane(push, countText);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: cyan");

        Scene scene = new Scene(pane, 300, 100);
        
        primaryStage.setTitle("Push Random");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //--------------------------------------------------------------------
    //  Updates the counter and text when the button is pushed.
    //--------------------------------------------------------------------
    public void processButtonPress(ActionEvent event)
    {
        count= gen.nextInt(100);
        countText.setText("Your Random: " + count);
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}