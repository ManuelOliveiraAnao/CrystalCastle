public class Ava {
    //current row
    int row;
    //current column
    int col;
    int nJumps;
    int consecutiveJumps;
    //total number of rows
    int nRows;
    //total number of columns
    int nCols;
    TileType[][] map;

    public Ava(int nRows, int nCols, int nJumps,  int consecutiveJumps, TileType[][] map) {
        this.row = 0;
        this.col = 0;
        this.nJumps = nJumps;
        this.consecutiveJumps = consecutiveJumps;
        this.nRows = nRows;
        this.nCols = nCols;

        this.map = map;
    }

    public int solve(){
        return 0;
    }
}
