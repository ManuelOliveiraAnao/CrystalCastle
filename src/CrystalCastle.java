public class CrystalCastle {
    private final Ava[] avas;
    private int index;

    public CrystalCastle(int t) {
        this.avas = new Ava[t];
        this.index = 0;
    }

    private int  getIndex(){
        return index;
    }

    public void addAva(int nRows, int nCols, int nJumps,  int consecutiveJumps, TileType[][] map) {
        Ava ava = new Ava(nRows, nCols, nJumps, consecutiveJumps, map);
        this.avas[this.index] = ava;
        index++;
    }

    //int function to resolve the problem
    public int[] solve(){
        int[] res = new int[getIndex()];

        for (int i = 0; i < this.getIndex(); i++) {
            res[i] = avas[i].solve();
        }
        return res;
    }
}
