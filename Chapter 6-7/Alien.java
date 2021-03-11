import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//************************************************************************
//  AlienDirection.java       Author: Lewis/Loftus -Modified by Ryan Ellis
//
//  Demonstrates the handling of keyboard events.
//************************************************************************

public class Alien extends Application
{
    public final static int JUMP = 10;
    
    private ImageView imageView;
    private ImageView imageView2;

    //--------------------------------------------------------------------
    //  Displays an image that can be moved using the arrow keys.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        Image alien = new Image("alien.png");
        
        imageView = new ImageView(alien);
        imageView.setX(20);
        imageView.setY(20);
        
        Image alien2 = new Image("alien2.png");
        
        imageView2 = new ImageView(alien2);
        imageView2.setX(20);
        imageView2.setY(20);
        
        Group root = new Group(imageView,imageView2);

        Scene scene = new Scene(root, 1920, 1080, Color.BLACK);
        scene.setOnMousePressed(this::processMouseDrag);
        scene.setOnKeyPressed(this::processKeyPress);
        
        primaryStage.setTitle("Alien");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //--------------------------------------------------------------------
    //  Modifies the position of the image view when an arrow key is
    //  pressed.
    //--------------------------------------------------------------------
    public void processMouseDrag(MouseEvent event)
    {
    
        imageView.setY(event.getY()-140);
        imageView.setX(event.getX()-140);
        //System.out.println("test");
        }
    
    
    
    public void processKeyPress(KeyEvent event)
    {
        switch (event.getCode())
        {
            case UP:
                imageView2.setY(imageView2.getY() - JUMP);
                break;
            case DOWN:
                imageView2.setY(imageView2.getY() + JUMP);
                break;
            case RIGHT:
                imageView2.setX(imageView2.getX() + JUMP);
                break;
            case LEFT:
                imageView2.setX(imageView2.getX() - JUMP);
                break;
            default:
                break;  // do nothing if it's not an arrow key
        }
    }
    
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
