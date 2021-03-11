import javafx.scene.Group;
import javafx.scene.control.ChoiceBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;



public class updater {

    Circle unit;


    Text playerTurn = new Text(350, 950,"");
    Text turnCounterR = new Text(870, 225,"");
    Text turnCounterB = new Text(870, 725,"");
    Text outputText = new Text(50, 1020,"");
    Text winner = new Text();
    Text bRollText = new Text(1000-120, 430,"");
    Text VS = new Text(970, 430,"");
    Text aRollText = new Text(1265-120, 430,"");
    Text resultText = new Text(870, 530,"");
    public updater (Group root, Troops myTroops,int turns, boolean whichTurn,String text){



        Text title = new Text(1420,100,"RULES:");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 80));
        title.setFill(Color.WHITESMOKE);
        title.setStroke(Color.BLACK);
        title.setStrokeWidth(2);
        root.getChildren().add(title);



Text rules = new Text(1350, 150,
                "Click on a unit. \n" +
                        "Then click where you want it to go. \n" +
                        "Left click to move all,\n" +
                        "Right click to move 1 at a time\n\n" +
                        "When attacking: both sides roll from\n" +
                        "1 to the number on the token. \n"+
                        "Attack has a +2 advantage. \n" +
                        "Attacker takes all. Defender doesn't.\n\n" +
                        "You can move 16 units per turn. \n" +
                        "Ex: a 4 token moving 4 squares, \n" +
                        "an 8 token moving 2 squares.\n\n" +
                        "Troops from one side \n" +
                        "can be combined together.\n\n" +
                        "Eliminate the enemy team!");
        rules.setFont(Font.font("Arial", FontWeight.BOLD, 32));
        rules.setFill(Color.WHITESMOKE);
        rules.setStroke(Color.BLACK);
        rules.setStrokeWidth(1.5);

        root.getChildren().add(rules);


    Rectangle highlight0 = new Rectangle(1350,800,600,400);
    highlight0.setFill(Color.rgb(33, 74, 15));
    root.getChildren().add(highlight0);



        //overlays board background
        newBoard newboard = new newBoard (root);


    Rectangle highlight = new Rectangle(350,880,400,80);
    highlight.setFill(Color.rgb(33, 74, 15));
    root.getChildren().add(highlight);

    //text for which player

        playerTurn.setFont(Font.font("Arial", FontWeight.BOLD, 80));
        playerTurn.setStroke(Color.BLACK);
        playerTurn.setStrokeWidth(3);
        root.getChildren().add(playerTurn);







        //To update based on which player is moving
        if (!whichTurn) {
            Rectangle highlight2 = new Rectangle(870,645,120,90);
            highlight2.setFill(Color.rgb(33, 74, 15));
            root.getChildren().add(highlight2);


            //text for how many turns left

            turnCounterB.setText(""+turns);
            turnCounterB.setFill(Color.BLUE);
            turnCounterB.setFont(Font.font("Arial", FontWeight.BOLD, 80));
            turnCounterB.setStroke(Color.BLACK);
            turnCounterB.setStrokeWidth(3);
            root.getChildren().add(turnCounterB);


            playerTurn.setText( "BLUE");
            playerTurn.setFill(Color.BLUE);
        }

        if (whichTurn) {
            Rectangle highlight3 = new Rectangle(870,150,120,90);
            highlight3.setFill(Color.rgb(33, 74, 15));
            root.getChildren().add(highlight3);


            //text for how many turns left

            turnCounterR.setText(""+turns);
            turnCounterR.setFill(Color.RED);
            turnCounterR.setFont(Font.font("Arial", FontWeight.BOLD, 80));
            turnCounterR.setStroke(Color.BLACK);
            turnCounterR.setStrokeWidth(3);
            root.getChildren().add(turnCounterR);



            playerTurn.setText( "RED");
            playerTurn.setFill(Color.RED);
        }

        // output text

    Rectangle highlight4 = new Rectangle(50,970,900,80);
    highlight4.setFill(Color.rgb(33, 74, 15));
    root.getChildren().add(highlight4);




        outputText.setText(text);
        outputText.setFont(Font.font("Arial", FontWeight.BOLD, 50));
        outputText.setFill(Color.WHITESMOKE);
        outputText.setStroke(Color.BLACK);
        outputText.setStrokeWidth(3);
        root.getChildren().add(outputText);



        // adds tokens
        for (int y = 0; y <8; y++) {
        for (int x = 0; x < 8; x++) {
            //these 2 add the troop tokens
            if (!(myTroops.getUnits2(x, y)<=0)){
                if (myTroops.getExist2(x, y) && myTroops.getSide2(x, y)) {
                    unit = new Circle(100 * (x + 1), 100 * (y + 1), 35);
                    root.getChildren().add(unit);
                    unit.setFill(Color.BLUE);
                    unit.setStroke(Color.BLACK);

                    //adds token text
                    Text unitNum = new Text(100 * (x + 1) - 14, 100 * (y + 1) + 17, "" + myTroops.getUnits2(x, y));
                    unitNum.setFont(Font.font("Arial", 50));
                    root.getChildren().add(unitNum);
                }


                if (myTroops.getExist2(x, y) && (!myTroops.getSide2(x, y))) {

                    //adds token
                    unit = new Circle(100 * (x + 1), 100 * (y + 1), 35);
                    root.getChildren().add(unit);
                    unit.setFill(Color.RED);
                    unit.setStroke(Color.BLACK);

                    //adds token text
                    Text unitNum = new Text(100 * (x + 1) - 14, 100 * (y + 1) + 17, "" + myTroops.getUnits2(x, y));
                    unitNum.setFont(Font.font("Arial", 50));
                    root.getChildren().add(unitNum);


                }
                if (myTroops.getSelect2(x, y))
                    unit.setFill(Color.YELLOW);


                if (!myTroops.getExist2(x, y)) {


                }


            }
        }}

        int RTotal=0;
        int BTotal=0;
        for (int y = 0; y <8; y++) {
            for (int x = 0; x < 8; x++) {
                if ((myTroops.getUnits2(x, y) !=0)){
                    if(myTroops.getSide2(x,y)){
                        BTotal+=myTroops.getUnits2(x, y);
                    }
                    if(!myTroops.getSide2(x,y)){
                        RTotal+=myTroops.getUnits2(x, y);
                    }
                }

            }
        }
        //System.out.println("red: " +BTotal);
        //System.out.println("blue: "+RTotal);

        Text totals = new Text(1350, 950,"Red total: "+RTotal + "\n"+"Blue total: "+ BTotal);
        totals.setFill(Color.WHITESMOKE);
        totals.setFont(Font.font("Arial", FontWeight.BOLD, 50));
        totals.setStroke(Color.BLACK);
        totals.setStrokeWidth(1.5);
        root.getChildren().add(totals);

        if (BTotal==0||RTotal==0){
            //System.out.println("GAME OVER");

            Polygon gameEnder = new Polygon(
                    0,700,
                    1920,800,
                    1920,300,
                    0,200
            );



            winner.setX(50);
            winner.setY(570);
            winner.setFill(Color.WHITESMOKE);
            winner.setFont(Font.font("Arial", FontWeight.BOLD, 240));
            winner.setStroke(Color.BLACK);
            winner.setStrokeWidth(4);


            if (RTotal==0){
        gameEnder.setFill(Color.rgb(0,106,186));
        root.getChildren().add(gameEnder);

        winner.setText("BLUE VICTORY!");
        winner.setFill(Color.BLUE);
        root.getChildren().add(winner);


            }
            else if (BTotal==0){
                gameEnder.setFill(Color.rgb(246,39,39));
                root.getChildren().add(gameEnder);
                winner.setText("RED VICTORY!");
                winner.setFill(Color.RED);
               root.getChildren().add(winner);
            }

        }



    }



    public updater (Group root,int bRoll, int aRoll, boolean outcome){
        Rectangle cover= new Rectangle(870, 280, 450,300);
        cover.setFill(Color.rgb(33, 74, 15));
        root.getChildren().add(cover);





        bRollText.setText(""+bRoll);


        bRollText.setFont(Font.font("Arial", FontWeight.BOLD, 80));
        bRollText.setStroke(Color.BLACK);
        bRollText.setStrokeWidth(3);
        root.getChildren().add(bRollText);




        VS.setText("VS");

        VS.setFill(Color.WHITESMOKE);
        VS.setFont(Font.font("Arial", FontWeight.BOLD, 80));
        VS.setStroke(Color.BLACK);
        VS.setStrokeWidth(3);
        root.getChildren().add(VS);





        aRollText.setText(""+aRoll);


        aRollText.setFont(Font.font("Arial", FontWeight.BOLD, 80));
        aRollText.setStroke(Color.BLACK);
        aRollText.setStrokeWidth(3);
        root.getChildren().add(aRollText);




        if (outcome) {
            resultText.setText("Blue wins!");

            resultText.setFill(Color.BLUE);

            aRollText.setFill(Color.RED);
            bRollText.setFill(Color.BLUE);
        }

        else {
            resultText.setText("Red wins!");

            resultText.setFill(Color.RED);

            aRollText.setFill(Color.BLUE);
            bRollText.setFill(Color.RED);

        }
        resultText.setFont(Font.font("Arial", FontWeight.BOLD, 80));
        resultText.setStroke(Color.BLACK);
        resultText.setStrokeWidth(3);
        root.getChildren().add(resultText);







    }

}

