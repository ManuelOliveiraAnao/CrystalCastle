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
                String line = in.readLine();
                for (int k = 0; k < col; k++) {
                    map[j][k] = TileType.fromC(line.charAt(k));
                }
            }
            game.addAva(row, col, consecutiveJps, totalJps, map);
        }

        int[] result = game.solve();
        for (int i : result) {
            System.out.println(i);
        }
    }
}