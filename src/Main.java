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
            int consecutive = Integer.parseInt(parts[2]);
            int jumps = Integer.parseInt(parts[3]);

            TileType[][] map = new TileType[row][col];

            for (int j = 0; j < row; j++) {
                String[] parts2 = in.readLine().split(" ");

                for (int k = 0; k < col; k++) {
                    map[j][k] = TileType.valueOf(parts2[k]);
                }
            }

            game.addAva(row, col, consecutive, jumps, map);

        }
    }
}