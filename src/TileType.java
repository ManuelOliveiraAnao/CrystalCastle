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
        return switch (c) {
            case '.' -> NORMAL;
            case 'X' -> NO_DIAGONAL_JUMP;
            case 'J' -> NO_JUMP;
            case '#' -> QUICKSAND;
            default -> throw new IllegalArgumentException("No such tile type: " + c);
        };
    }
}
