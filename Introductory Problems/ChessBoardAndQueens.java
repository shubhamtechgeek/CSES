import java.io.*;

public class ChessBoardAndQueens {

    private static boolean isSafe(String[][] chessboard, int row, int col) {
     
        for (int i = 0; i < row; i++) {
            if (chessboard[i][col].equals("q")) {
                return false;
            }
        }


        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j].equals("q")) {
                return false;
            }
        }

     
        for (int i = row, j = col; i >= 0 && j < chessboard.length; i--, j++) {
            if (chessboard[i][j].equals("q")) {
                return false;
            }
        }

        return true;
    }

    private static int placeQueen(String[][] chessBoard, int row, int queensRemaining) {

        if (queensRemaining == 0) {
            return 1;
        }

        int ways = 0;
        

        for (int col = 0; col < chessBoard.length; col++) {
            if (chessBoard[row][col].equals(".") && isSafe(chessBoard, row, col)) {
        
                chessBoard[row][col] = "q";

  
                ways += placeQueen(chessBoard, row + 1, queensRemaining - 1);

         
                chessBoard[row][col] = ".";
            }
        }

        return ways;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] chessboard = new String[8][8];

        // Read the chessboard configuration
        for (int i = 0; i < 8; i++) {
            chessboard[i] = br.readLine().split("");
        }

        int totalWays = placeQueen(chessboard, 0, 8);

        System.out.println(totalWays);
    }
}
