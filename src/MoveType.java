enum MoveType {

    RIGHT(0, 1, false, false),
    DOWN(1, 0, false, false),

    LEFT_DOWN(1, -1, true, true),
    RIGHT_DOWN(1, 1, true, true),
    DOUBLE_DOWN(2, 0, true, false);

    private final int dRows;
    private final int dCols;
    private final boolean isJump;
    private final boolean isDiagonal;

    MoveType(int dRows, int dCols, boolean isJump, boolean isDiagonal) {
        this.dRows = dRows;
        this.dCols = dCols;
        this.isJump = isJump;
        this.isDiagonal = isDiagonal;
    }

    public int getDRows() {
        return dRows;
    }

    public int getDCols() {
        return dCols;
    }

    public boolean isJump() {
        return isJump;
    }

    public boolean isDiagonal() {
        return isDiagonal;
    }
}