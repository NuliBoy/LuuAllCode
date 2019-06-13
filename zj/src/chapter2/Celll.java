package chapter2;

public class Cell {

    private boolean flagged;
    private  int []cell;
    private final int STATUS_VALUE = 0;
    private final int FLAGGED =4;
    public   boolean isFlagged(){

        if (cell[STATUS_VALUE] == FLAGGED){
            flagged = true;
        }

        return flagged;
    }

}
