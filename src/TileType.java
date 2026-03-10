public enum TileType {
    // '.' - A tile with no constraints
    NORMAL,

    // 'X' - Diagonal jumps (LD or RD) are forbidden
    NO_DIAGONAL_JUMP,

    // 'J' - All jumps (LD, DD, RD) are forbidden
    NO_JUMP,

    // '#' - A tile that cannot be stepped on
    QUICKSAND
}
