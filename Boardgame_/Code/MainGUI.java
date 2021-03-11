import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;


//************************************************************************
//  MOSAIC.java       Edited By: Ryan Ellis
//
//
//************************************************************************

public class MainGUI extends Application
{
    boolean whichTurn=false;
    Troops board = new Troops();
    Group root = new Group();
    int turnsLeft=16;

    int movingVal;

    Random gen = new Random();


    int clicks=0;
    int x1;
    int y1;
    int x2;
    int y2;

    public static void wait(int x)
    {
        try {
            Thread.sleep(x);
        }        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    ChoiceBox<String> AiLevels= new ChoiceBox<>();
    public void start(Stage primaryStage) {



        board.fillTroops();

        //makes the first board

        //adds units
        updater updater = new updater(root, board, turnsLeft,whichTurn,"");







        Text AiText = new Text(1350,860,"Choose a mode:");
        AiText.setFont(Font.font("Arial", FontWeight.BOLD, 50));
        AiText.setFill(Color.YELLOW);
        AiText.setStroke(Color.BLACK);
        AiText.setStrokeWidth(2);
            root.getChildren().add(AiText);



        Scene scene = new Scene(root, 1920, 1080, Color.rgb(33, 74, 15));
        scene.setOnMousePressed(this::processMousePressed);


        AiLevels.getItems().addAll("2 player", "AI LVL 1","AI LVL 2","AI LVL 3");
        AiLevels.setLayoutX(1800);
        AiLevels.setLayoutY(830);
        AiLevels.setScaleX(2);
        AiLevels.setScaleY(2);
        AiLevels.setValue("2 player");

        root.getChildren().add(AiLevels);

        primaryStage.setTitle("MOSAIC");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

        public int makeValid (double position){

        if (((position-50)/100)<8){
            return (int) (position-50)/100;

        }

        else{
return 99;
        }


    }



        public int moveCount(int x1, int y1, int x2, int y2){

        int i = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        return i;
    }


public boolean isEnough (int x1, int y1 , int x2, int y2, boolean clickSide){
    if (clickSide && (moveCount(x1, y1, x2, y2) * board.getUnits2(x1, y1) > turnsLeft) && turnsLeft > 0) {
    board.setSelected2(x1,y1,false);
        updater updater = new updater(root, board,turnsLeft, whichTurn,"");
        return false;

    }
    else if (!clickSide && (moveCount(x1, y1, x2, y2) > turnsLeft) && turnsLeft > 0) {
        board.setSelected2(x1,y1,false);
        updater updater = new updater(root, board,turnsLeft, whichTurn,"");
        return false;

    }
    else return true;

}
    int onePts;
    int twoPts;
    boolean result;
public void encounterVal (int x1,int y1 ,int x2,int y2,boolean MB) {
    if (MB) {


        onePts = gen.nextInt(board.getUnits2(x1, y1)+2);
    twoPts = gen.nextInt(board.getUnits2(x2, y2)+1);
}
    if (!MB) {
        onePts = gen.nextInt(2);
        twoPts = gen.nextInt(board.getUnits2(x2, y2)+1);
    }
    //System.out.println("1TROOPS "+board.getUnits2(x1, y1));
    //System.out.println("2TROOPS:"+board.getUnits2(x2, y2));
    //System.out.println("1Pts: "+onePts);
    //System.out.println("2Pts:"+twoPts);

    if ( onePts >= twoPts) { //win
        //System.out.println("W");
        result=true;

        if (MB) {
            updater encounterer = new updater(root, onePts, twoPts, board.getSide2(x1, y1));
            board.setTroop2(x2, y2, true, board.getSide2(x1, y1), board.getUnits2(x1, y1));
            board.setTroop2(x1, y1, false, false, 0);
        }
        else{
            updater encounterer = new updater(root, onePts, twoPts, board.getSide2(x1, y1));


            if (1 >= board.getUnits2(x2, y2))
                board.setTroop2(x2, y2, true, board.getSide2(x1, y1), board.getUnits2(x2, y2) - 1);

            else
                board.setTroop2(x2, y2, true, board.getSide2(x2, y2), board.getUnits2(x2, y2) - 1);


            board.setTroop2(x1, y1, true, board.getSide2(x1, y1), board.getUnits2(x1, y1)-1);


        }



        }
        else if (onePts < twoPts) { //loss

        updater encounterer = new updater(root,twoPts,onePts, board.getSide2(x2,y2));
        //System.out.println("L");
        result=false;



        if (MB) {
            if (board.getUnits2(x1, y1) <= board.getUnits2(x2, y2))
                board.setTroop2(x1, y1, false, false, 0);

            else if (board.getUnits2(x1, y1) > board.getUnits2(x2, y2))
                board.setTroop2(x1, y1, true, board.getSide2(x1,y1), board.getUnits2(x1, y1)-board.getUnits2(x2, y2));
        }
        else {

            board.setTroop2(x1, y1, true, board.getSide2(x1, y1), board.getUnits2(x1, y1)-1);
        }



        }


}

public boolean encounter (int x1,int y1 ,int x2,int y2,boolean MB) {
    if (isEnough(x1, y1, x2, y2,MB)) {




    if (MB==true) {
        if (board.getSide2(x1, y1) == board.getSide2(x2, y2) && board.getExist2(x1, y1) && board.getExist2(x2, y2)&& ((board.getUnits2(x1,y1)+board.getUnits2(x2,y2)) > 8)){
            //System.out.println("test");
            updater updater = new updater(root, board,turnsLeft, whichTurn,"Cannot exceed 8");
return false;

        }

        else if (board.getSide2(x1, y1) == board.getSide2(x2, y2) && board.getExist2(x1, y1) && board.getExist2(x2, y2)) {
            board.setTroop2(x2, y2, true, board.getSide2(x2, y2), board.getUnits2(x2, y2) + board.getUnits2(x1, y1));
            board.removeTroop(x1, y1);

        }
        else if (board.getSide2(x1, y1) != board.getSide2(x2, y2) && board.getExist2(x1, y1) && board.getExist2(x2, y2)) {
            encounterVal(x1,y1,x2,y2,MB);

        } else {
            board.moveTroop(x1, y1, x2, y2);


        }

    } else if (MB==false) {
        if (board.getSide2(x1, y1) == board.getSide2(x2, y2) && board.getExist2(x1, y1) && board.getExist2(x2, y2)&& ((1+board.getUnits2(x2,y2)) > 8)){
            //System.out.println("test");
            updater updater = new updater(root, board,turnsLeft, whichTurn,"Cannot exceed 8");
            return false;

        }
        else if (board.getSide2(x1, y1) == board.getSide2(x2, y2) && board.getExist2(x1, y1) && board.getExist2(x2, y2)) {
            board.setTroop2(x2, y2, true, board.getSide2(x2, y2), board.getUnits2(x2, y2) + 1);
            board.setTroop2(x1, y1, true, board.getSide2(x1, y1), board.getUnits2(x1, y1) - 1);

        } else if (board.getSide2(x1, y1) != board.getSide2(x2, y2) && board.getExist2(x1, y1) && board.getExist2(x2, y2)) {

            encounterVal(x1,y1,x2,y2,false);

        } else {
            board.moveOneTroop(x1, y1, x2, y2);


        }


    }

        updater updater = new updater(root, board,turnsLeft, whichTurn,"");
    return true;
}


    else
    {
        updater updater = new updater(root, board,turnsLeft, whichTurn,"");
        return false;
    }
}




        public boolean turnController (int x1, int y1, int x2, int y2, boolean clickSide){

            if (!isEnough(x1,y1,x2,y2, clickSide)) {
                //System.out.println((moveCount(x1, y1, x2, y2) * board.getUnits2(x1, y1)));
               // System.out.println("not enough moves");
                updater updater =new updater(root, board,turnsLeft, whichTurn,"not enough moves");
                //System.out.println(turnsLeft);

                return false;

            }


            else if (turnsLeft <= 0) {


                root.getChildren().clear();
                updater updater = new updater(root, board,turnsLeft, whichTurn,"No more moves, switching sides...");
                //System.out.println(turnsLeft);
                turnsLeft = 16;
                whichTurn=!whichTurn;
                updater update = new updater(root, board,turnsLeft, whichTurn,"");


                if (AiLevels.getValue().equals("AI LVL 1")) {
                    aiMoving =true;
                    Ai1();
                    updater updater3 = new updater(root, board,turnsLeft, whichTurn,"");
                    whichTurn=false;
                    turnsLeft=16;

                    updater updater2 = new updater(root, board,turnsLeft, whichTurn,"");
                    aiMoving=false;


                }

                else if (AiLevels.getValue().equals("AI LVL 2")) {
                    aiMoving =true;
                    Ai2();
                    whichTurn = false;
                    turnsLeft = 16;

                    updater updater2 = new updater(root, board,turnsLeft, whichTurn,"");
                    aiMoving=false;

                }

                else if (AiLevels.getValue().equals("AI LVL 3")) {
                    aiMoving =true;
                    Ai3();
                    whichTurn = false;
                    turnsLeft = 16;

                    updater updater2 = new updater(root, board, turnsLeft, whichTurn, "");

                    aiMoving=false;
                }


            }



            return true;


            }

        public void Ai1 () {

        while (turnsLeft > 0) {
                x1 = gen.nextInt(7);
                y1 = gen.nextInt(7);
                x2 = gen.nextInt(7);
                y2 = gen.nextInt(7);
                if (turnsLeft > 0 && isEnough(x1, y1, x2, y2, false) && !board.getSide2(x1,y1) && board.getExist2(x1,y1) && board.getUnits2(x1,y1)>0 && !board.getMoved2(x1,y1)) {

                    encounter(x1, y1, x2, y2, false);
                    board.setMoved2(x1,y1,true);


                    turnsLeft -= (moveCount(x1, y1, x2, y2));
                    System.out.println(turnsLeft);



                }
                else {
                    x1 = gen.nextInt(7);
                    y1 = gen.nextInt(7);
                    x2 = gen.nextInt(7);
                    y2 = gen.nextInt(7);

                }


            }
            for (int y = 0; y <8; y++) {
                for (int x = 0; x < 8; x++) {
                board.setMoved2(x,y,false);


                }
                }


        }
boolean abort=false;
    public void Ai2 (){




    while (turnsLeft > 0) {

        if (n >265){
        turnsLeft=0;
        n=0;
        }
        n++;
        x1 = gen.nextInt(7);
        y1 = gen.nextInt(7);
        x2 = gen.nextInt(7);
        y2 = gen.nextInt(7);
        if (isEnough(x1, y1, x2, y2, true) && !board.getSide2(x1, y1) && board.getExist2(x1, y1)
                && board.getUnits2(x1, y1) > 0 && !board.getMoved2(x1, y1)
                && !(x1 == x2 && y1 == y2)
        ) {
            //System.out.println(accumTest++);
            turnsLeft -= (moveCount(x1, y1, x2, y2) * board.getUnits2(x1, y1));
            encounter(x1, y1, x2, y2, true);
            board.setMoved2(x1, y1, true);


            System.out.println(turnsLeft);
n=0;

        } else {
            x1 = gen.nextInt(7);
            y1 = gen.nextInt(7);
            x2 = gen.nextInt(7);
            y2 = gen.nextInt(7);

        }


    }
    for (int y = 0; y < 8; y++) {
        for (int x = 0; x < 8; x++) {
            board.setMoved2(x, y, false);


        }


}
    }
    private void mover() {
        while (turnsLeft > 0) {
            x1 = gen.nextInt(7);
            y1 = gen.nextInt(7);
            x2 = gen.nextInt(7);
            y2 = gen.nextInt(7);
            if (isEnough(x1,y1,x2,y2,true)&& !board.getSide2(x1,y1) && board.getExist2(x1,y1)
                    && board.getUnits2(x1,y1)>0 && !board.getMoved2(x1,y1)
                    && !(x1==x2 && y1==y2)
            ) {
                //System.out.println(accumTest++);
                turnsLeft -= (moveCount(x1, y1, x2, y2)*board.getUnits2(x1,y1));
                encounter(x1, y1, x2, y2, true);
                board.setMoved2(x1,y1,true);



                System.out.println(turnsLeft);



            }
            else {
                x1 = gen.nextInt(7);
                y1 = gen.nextInt(7);
                x2 = gen.nextInt(7);
                y2 = gen.nextInt(7);

            }


        }
    }
    int n=0;
    public void Ai3 (){




        while (turnsLeft > 0) {
            root.getChildren().clear();
            if (n >265){
                turnsLeft=0;
                n=0;
            }
            n++;

            for (int i=0; i<256; i++) {
                root.getChildren().clear();
                x1 = gen.nextInt(7);
                y1 = gen.nextInt(7);
                x2 = gen.nextInt(7);
                y2 = gen.nextInt(7);

                if (    isEnough(x1, y1, x2, y2, true)
                        && !board.getSide2(x1, y1)
                        && board.getExist2(x1, y1)
                        && board.getExist2(x2, y2)
                        && board.getUnits2(x1, y1) > 0
                        && !board.getMoved2(x1, y1)
                        && !(x1 == x2 && y1 == y2)
                        && board.getSide2(x2, y2)
                        && turnsLeft>0


                ) {

                    System.out.println("attacked");
                    turnsLeft -= (moveCount(x1, y1, x2, y2) * board.getUnits2(x1, y1));
                    encounter(x1, y1, x2, y2, true);
                    board.setMoved2(x1, y1, true);


                    System.out.println(turnsLeft);
                    n = 0;

                }
            }
            x1 = gen.nextInt(7);
            y1 = gen.nextInt(7);
            x2 = gen.nextInt(7);
            y2 = gen.nextInt(7);

            if (    isEnough(x1, y1, x2, y2, true)
                    && !board.getSide2(x1, y1)
                    && board.getExist2(x1, y1)
                    && board.getUnits2(x1, y1) > 0 && !board.getMoved2(x1, y1)
                    && !(x1 == x2 && y1 == y2)
            ) {
                //System.out.println(accumTest++);
                turnsLeft -= (moveCount(x1, y1, x2, y2) * board.getUnits2(x1, y1));
                encounter(x1, y1, x2, y2, true);
                board.setMoved2(x1, y1, true);


                System.out.println(turnsLeft);
                n=0;

            }
            else {
                x1 = gen.nextInt(7);
                y1 = gen.nextInt(7);
                x2 = gen.nextInt(7);
                y2 = gen.nextInt(7);

            }


        }
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                board.setMoved2(x, y, false);


            }


        }
    }



        public void interact (int x1,int y1 ,int x2,int y2,boolean clickSide) {
            Random gen = new Random();




                    //turnController(x1,y1,x2,y2,clickSide);
                    if(encounter(x1,y1,x2,y2,clickSide)) {

                        if (clickSide) {
                            turnsLeft -= (moveCount(x1, y1, x2, y2) * movingVal);
                        }
                        if (!clickSide) {
                            turnsLeft -= (moveCount(x1, y1, x2, y2));
                        }
                        //System.out.println(turnsLeft);


                        updater updater = new updater(root, board,turnsLeft, whichTurn,"");
                    }



                }


    boolean aiMoving=false;
        public void processMousePressed (MouseEvent event) {


            if (makeValid(event.getX()) !=99 && makeValid(event.getY())!=99 && !aiMoving) {
                if (event.getButton() == MouseButton.PRIMARY) {
                    if (clicks % 2 == 0) {

                        x1 = makeValid(event.getX());
                        y1 = makeValid(event.getY());

                        clicks++;

                        //shows yellow selection indicator
                        if (board.getExist2(x1, y1)) {
                            board.setSelected2(x1, y1, true);
                            root.getChildren().clear();
                            updater updater = new updater(root, board, turnsLeft, whichTurn, "");
                            board.setSelected2(x1, y1, false);
                        } else {
                            clicks = 0;
                            //System.out.println("no token");
                            updater updater = new updater(root, board, turnsLeft, whichTurn, "No token");


                        }
                    } else if (clicks % 2 == 1) {
                        x2 = makeValid(event.getX());
                        y2 = makeValid(event.getY());

                        if ((x1 == x2) && (y1 == y2)) {
                            //System.out.println("already a token there");
                            board.setSelected2(x2, y2, false);
                            updater updater = new updater(root, board, turnsLeft, whichTurn, "already a token there");
                        } else {
                            movingVal = board.getUnits2(x1, y1);
                            turnController(x1, y1, x2, y2, true);
                            interact(x1, y1, x2, y2, true);

                            turnController(x1, y1, x2, y2, true);

                        }


                        clicks = 0;
                    }

                }


                if (event.getButton() == MouseButton.SECONDARY) {
                    if (clicks % 2 == 0) {

                        x1 = makeValid(event.getX());
                        y1 = makeValid(event.getY());
                        clicks++;

                        //shows yellow selection indicator
                        if (board.getExist2(x1, y1)) {
                            board.setSelected2(x1, y1, true);
                            updater updater = new updater(root, board, turnsLeft, whichTurn, "");
                            board.setSelected2(x1, y1, false);
                        } else {
                            clicks = 0;
                            //System.out.println("no token");
                            updater updater = new updater(root, board, turnsLeft, whichTurn, "No token");

                        }
                    } else if (clicks % 2 == 1) {
                        x2 = makeValid(event.getX());
                        y2 = makeValid(event.getY());

                        turnController(x1, y1, x2, y2, false);
                        interact(x1, y1, x2, y2, false);
                        turnController(x1, y1, x2, y2, false);

                        clicks = 0;

                        {
                        }

                    }
                }

            }
        }





    public static void main(String[] args)
    {
        launch(args);
    }
}