
public class Troops {
    // array of data

public int turns;
boolean tempSide;
int tempUnits;
boolean stillExist;
    public Troop[][] troops = new Troop[8][8];

    /**
     * Constructor for objects of class NumberData
     *
     * @return
     */
    public void Troops() {

    }

    public void moveTroop(int x, int y, int newX, int newY){

            if (troops[x][y].getExist()) {

                tempSide = troops[x][y].getSide();
                tempUnits = troops[x][y].getUnits();

                troops[x][y].setTroop(false, false, 0, false);

                troops[newX][newY] = new Troop(true, tempSide, tempUnits, false);
            }

    }
public int getAiTokens(){
    int ct=0;
        for (int y = 0; y <8; y++) {
        for (int x = 0; x < 8; x++) {
            if (troops[x][y].getExist()&& !troops[x][y].getSide()) {
                ct++;
            }

        }
    }
        return ct;
}
    public int getMovedAiTokens(){
        int ct=0;
        for (int y = 0; y <8; y++) {
            for (int x = 0; x < 8; x++) {
                if (troops[x][y].getExist()&& !troops[x][y].getSide() && troops[x][y].isMoved()) {
                    ct++;
                }

            }
        }
        return ct;
    }

    public void deselect (){

        for (int y = 0; y <8; y++) {
            for (int x = 0; x < 8; x++) {
                troops[x][y].setMoved(false);


            }
        }
    }

    public void moveOneTroop(int x, int y, int newX, int newY) {

            if (troops[x][y].getExist()) {

                tempSide = troops[x][y].getSide();
                tempUnits = 1;


                if ((troops[x][y].getUnits() - 1) > 0)
                    stillExist = true;
                else stillExist = false;

                troops[x][y].setTroop(stillExist, troops[x][y].getSide(), troops[x][y].getUnits() - 1, false);

                troops[newX][newY] = new Troop(true, tempSide, tempUnits, false);
            }


    }


    public void setTroop2(int x, int y, boolean isTroop, boolean alliance, int count){
    troops[x][y].setTroop(isTroop,alliance,count, false);



    }

    public void removeTroop(int x, int y){
        troops[x][y].setTroop(false,false,0, false);



    }


public void setSelected2 (int x, int y,boolean sel){
    troops[x][y].setSelected(sel);

}

    public void setMoved2 (int x, int y,boolean mov){
        troops[x][y].setMoved(mov);

    }

public boolean getMoved2 (int x, int y){
return troops[x][y].isMoved() ;

}

    public boolean getExist2 (int x, int y){
    return troops[x][y].getExist() ;

    }

    public boolean getSide2 (int x, int y){
        return troops[x][y].getSide() ;

    }

    public int getUnits2 (int x, int y){
        return troops[x][y].getUnits() ;

    }

    public boolean getSelect2 (int x, int y){
    return troops[x][y].getSelect();

    }

    public void fillTroops (){



        for (int y = 0; y <8; y++) {
            for (int x = 0; x < 8; x++) {


                troops[x][y]=new Troop(false,false,0,false);

                if (y==1)
                troops[x][y].setTroop(true, false, 4, false);

                if (y==6)
                    troops[x][y].setTroop(true, true, 4, false);
            }


        }
    }

       public String testing (){
       System.out.println(troops[1][1].toString());
        return troops[1][1].toString();
       }





        public String toString ()
        {
            String battlefield = "";

            for (int y = 0; y < 8; y++) {
                battlefield += ("\n \n");

                for (int x = 0; x < 8; x++) {
                    battlefield += " ";

                    if (troops[x][y].getExist() && troops[x][y].getSide())
                        battlefield +=  " 2,";

                    if (troops[x][y].getExist() && (!troops[x][y].getSide()))
                        battlefield +=  " 1,";

                    if (!troops[x][y].getExist())
                        battlefield +=  " 0,";


                    battlefield += troops[x][y].getUnits(); ;




                }
            }
            return battlefield;
        }

}