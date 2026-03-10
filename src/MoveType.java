enum MoveType {
    RIGHT(0, 1, false, false),
    DOWN(1, 0, false, false),

    LEFT_DOWN(1, -1, true, true),
    DOUBLE_DOWN(2, 0, true, false),
    RIGHT_DOWN(1, 1, true, true);

    private final int dr;
    private final int dc;
    private final boolean isJump;
    private final boolean isDiagonal;

    MoveType(int dr, int dc, boolean isJump, boolean isDiagonal) {
        this.dr = dr;
        this.dc = dc;
        this.isJump = isJump;
        this.isDiagonal = isDiagonal;
    }

    public int getDr() { return dr; }
    public int getDc() { return dc; }
    public boolean isJump() { return isJump; }
    public boolean isDiagonal() { return isDiagonal; }
}