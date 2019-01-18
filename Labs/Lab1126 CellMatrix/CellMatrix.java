
/**
 * 
 * CellMatrix
 * @author (eettlin) 
 * @version (11-26-18)
 */
public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */

    private Cell[][] cells;
    private int neighborNum = 0;
    
    /**
     * +++++++++++++++++++++Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
        cells = new Cell[a][b];

    }

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++methods
     */
    //Print each row and column of nums to the console
    public void printMatrix(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                if(cells[i][j].getInt() == 10){
                    System.out.print(cells[i][j].getInt() + " ");  
                }
                else{
                    System.out.print(cells[i][j].getInt() + "  ");
                }
            }
            System.out.println();
        }
    }
    //  load nums with random with numbers between 1 and 10 inclusive
    public void loadMatrix(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell((int)(Math.random() * 10 + 1));
            }
        }
    }
    //  Findis the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(int a, int b){
        int bigNum = 0;
        if(a - 1 != -1){
            if(cells[a - 1][b].getInt() > bigNum){
                bigNum = cells[a - 1][b].getInt();
            }
            neighborNum++;
        }
        if(a + 1 != cells.length){
            if(cells[a + 1][b].getInt() > bigNum){
                bigNum = cells[a + 1][b].getInt();
            }
            neighborNum++;
        }
        if(b - 1 != -1){
            if(cells[a][b - 1].getInt() > bigNum){
                bigNum = cells[a][b - 1].getInt();
            }
            neighborNum++;
        }
        if(b + 1 != cells[a].length){
            if(cells[a][b + 1].getInt() > bigNum){
                bigNum = cells[a][b + 1].getInt();
            }
            neighborNum++;
        }
        System.out.println(bigNum);
        return bigNum;
    }

    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(int x){
        
    }
}
