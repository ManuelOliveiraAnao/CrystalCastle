import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());
        CrystalCastle game = new CrystalCastle(t);

        for (int i = 0; i < t; i++) {
            String[] parts = in.readLine().split(" ");
            int row = Integer.parseInt(parts[0]);
            int col = Integer.parseInt(parts[1]);
            int consecutiveJps = Integer.parseInt(parts[2]);
            int totalJps = Integer.parseInt(parts[3]);

            TileType[][] map = new TileType[row][col];

            for (int j = 0; j < row; j++) {
                String[] parts2 = in.readLine().split(" ");

                for (int k = 0; k < col; k++) {
                    //is it necessary to be case-insensitive? if so, .toUpperCase()
                    map[j][k] = TileType.fromC(parts2[k].charAt(0));
                }
            }
            game.addAva(row, col, consecutiveJps, totalJps, map);
        }

        long[] result = game.solve();
        for (long i : result) {
            System.out.println(i);
        }
    }
}