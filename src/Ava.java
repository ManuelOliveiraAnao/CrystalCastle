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

    private void processMove(int r, int c, int jumps, int consecutiveJumps, MoveType move, int[][][][] state) {
        int nextR = r + move.getDr();
        int nextC = c + move.getDc();

        if (nextR < 0 || nextR >= nRows || nextC < 0 || nextC >= nCols || map[nextR][nextC] == TileType.QUICKSAND)
            return;

        TileType currentTile = map[r][c];
        if (currentTile == TileType.NO_JUMP && move.isJump()) return;
        if (currentTile == TileType.NO_DIAGONAL_JUMP && move.isDiagonal()) return;

        int nextJumps = jumps;
        int nextConsec = 0;

        if (move.isJump()) {
            if (jumps + 1 > maxTotalJumps || consecutiveJumps + 1 > maxConsecutiveJumps)
                return;

            nextJumps = jumps + 1;
            nextConsec = consecutiveJumps + 1;
        }

        state[nextR][nextC][nextJumps][nextConsec] += state[r][c][jumps][consecutiveJumps];
        state[nextR][nextC][nextJumps][nextConsec] %= MOD;
    }


    public int solve() {
        int[][][][] state = new int[nRows][nCols][maxTotalJumps + 1][maxConsecutiveJumps + 1];
        state[0][0][0][0] = 1;

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                if (map[i][j] == TileType.QUICKSAND) continue;

                for (int jmps = 0; jmps <= maxTotalJumps; jmps++) {
                    for (int cons = 0; cons <= maxConsecutiveJumps; cons++) {

                        if (state[i][j][jmps][cons] > 0) {
                            for (MoveType moveType : MoveType.values()) {
                                processMove(i, j, jmps, cons, moveType, state);
                            }
                        }
                    }
                }
            }
        }

        int total = 0;
        for (int k = 0; k <= maxTotalJumps; k++) {
            for (int l = 0; l <= maxConsecutiveJumps; l++) {
                total = (total + state[nRows - 1][nCols - 1][k][l]) % MOD;
            }
        }
        return total;
    }
}