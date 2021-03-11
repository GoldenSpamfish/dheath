import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class newBoard {

    public newBoard (Group root){

    Circle circle1;

    Rectangle boardSquare= new Rectangle(45,45, 810,810);
    boardSquare.setFill(Color.rgb(21, 64, 3));
    root.getChildren().add(boardSquare);

    for (int y = 0; y <8; y++) {
        for (int x = 0; x < 8; x++) {
            circle1 = new Circle(100*(x+1),100*(y+1),50);
            root.getChildren().add(circle1);


            if (y%2==0) {
                if (x % 2 == 0) {
                    circle1.setFill(Color.rgb(58, 107, 37));
                    circle1.setStroke(Color.BLACK);
                }

                if (x % 2 == 1) {
                    //dark
                    circle1.setFill(Color.rgb(48, 102, 24));
                    circle1.setStroke(Color.BLACK);
                }
            }
            else {
                if (x % 2 == 1) {
                    circle1.setFill(Color.rgb(58, 107, 37));
                    circle1.setStroke(Color.BLACK);
                }

                if (x % 2 == 0) {
                    //dark
                    circle1.setFill(Color.rgb(48, 102, 24));
                    circle1.setStroke(Color.BLACK);
                }

            }

        }
    }
}
}
