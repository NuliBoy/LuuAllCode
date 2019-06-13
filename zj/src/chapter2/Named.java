package chapter2;

import java.util.ArrayList;
import java.util.List;

public class Named {


    //三段代码比较


//1
    public List<int []>  getThem(){

        List<int []> list1 = new ArrayList<>();
        for (int [] x: theList
             ) {
            if(x[0] == 4){
                list1.add(x);
            }
        }
        return theList;
    }


//2

    static  private final int STATUS_VALUE = 0;
    static  private final int FLAGGED =4;
    public List<int []>  getFlaggedCells(){

        List<int []> flaggedCells = new ArrayList<>();
        for (int [] x: gameBoard
                ) {
            if(x[STATUS_VALUE] == FLAGGED){
                flaggedCells.add(x);
            }
        }
        return flaggedCells;
    }
 //3
 public List<Cell>  getFlaggedCells1(){

        StringBuffer
     List<Cell> flaggedCells = new ArrayList<>();
     for (Cell cell: gameBoard
             ) {
         if(cell.isFlagged()){
             flaggedCells.add(cell);
         }
     }
     return flaggedCells;
 }




}
