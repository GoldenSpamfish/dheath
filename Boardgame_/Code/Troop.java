
/**
 * Write a description of class Troop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Troop
{
    private boolean exist;
    private boolean side;
    private int units;
    private boolean selected;
    private boolean moved;

    public Troop (boolean isTroop, boolean alliance, int count, boolean isSelected){
        exist=isTroop;
        side=alliance;
        units=count;
        selected=isSelected;

    }
    public Troop (boolean isTroop, boolean alliance, int count, boolean isSelected, boolean hasMoved){
        exist=isTroop;
        side=alliance;
        units=count;
        selected=isSelected;
        moved=hasMoved;

    }

    public void setTroop (boolean isTroop, boolean alliance, int count, boolean isSelected){
    exist=isTroop;
    side=alliance;
    units=count;
    selected=isSelected;

    }
public void setSelected (boolean isSelected) {
selected=isSelected;
}

    public void setMoved(boolean moved) {
        this.moved = moved;
    }

    public boolean isMoved() {
        return moved;
    }

    public boolean getExist (){

        return exist;
}


public int getUnits () {
return  units;


}

public boolean getSelect(){
return  selected;

}
 public boolean getSide () {
        return side;
 }


    public String toString() {
        return " "+ units + " ";
    }
}
