public enum TileType {
    // '.' - A tile with no constraints
    NORMAL('.'),

    // 'X' - Diagonal jumps (LD or RD) are forbidden
    NO_DIAGONAL_JUMP('X'),

    // 'J' - All jumps (LD, DD, RD) are forbidden
    NO_JUMP('J'),

    // '#' - A tile that cannot be stepped on
    QUICKSAND('#');

    private final char c;

    TileType(char c) {
        this.c = c;
    }

    public static TileType toTType(char c) throws  IllegalArgumentException {
        for (TileType t : values()) {
            if (t.c == c)
                return t;
        }
        throw new IllegalArgumentException("No such tile type: " + c);
    }
}
