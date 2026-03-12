public class Ava {
    private final int nRows;
    private final int nCols;

    private final int maxConsecutiveJumps;
    private final int maxTotalJumps;

    private final TileType[][] map;

    private static final int MOD = 1000000007;

    public Ava(int nRows, int nCols, int maxConsecutiveJumps, int maxTotalJumps, TileType[][] map) {
        this.nRows = nRows;
        this.nCols = nCols;
        this.maxConsecutiveJumps = maxConsecutiveJumps;
        this.maxTotalJumps = maxTotalJumps;
        this.map = map;
    }


    public int solve() {

        long[][][][] dp = new long[nRows][nCols][maxTotalJumps + 1][maxConsecutiveJumps + 1];

        return 0;
    }
}