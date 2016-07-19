import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Test1 {

	boolean board[][];
    Set<Integer> occupiedColumns = new HashSet<Integer>();

    Test1(int n) {
        board = new boolean[n][n];
    }

    Test1() {
    }

    void setBoard(boolean[][] board) {
        this.board = board;
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board.length; ++j) {
                if (board[i][j]) {
                    occupiedColumns.add(j);
                }
            }
        }
    }

    int waysToPlace(int k) {
        if (k == board.length - 1) {
            return 1;
        }
        int totalWays = 0;
        for (int pos = 0; pos < board.length; ++pos) {
            int ways = 1;
            if (!isAttack(k + 1, pos)) {
                board[k + 1][pos] = true;
                occupiedColumns.add(pos);
                ways *= waysToPlace(k + 1);
                board[k + 1][pos] = false;
                occupiedColumns.remove(pos);
            } else {
                ways = 0;
            }
            totalWays += ways;
        }
        return totalWays;
    }

    boolean isAttack(int row, int col) {
        if (occupiedColumns.contains(col)) {
            return true;
        }
        if ((col > 0 && row > 0 && board[row - 1][col - 1]) || (col < board.length - 1 && row > 0 && board[row - 1][col + 1])) {
            return true;
        }
        return false;
    }

    void printArray() {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board.length; ++j) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        //Test1 sol = new Test1(5);        
        // System.out.println(sol.waysToPlace(-1));
        //sol.printArray();
        readInput();
    }

    static void readInput() {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; ++i) {
            int n = scan.nextInt();
            //System.out.println(" n "+n );            
            int k = scan.nextInt();
            // System.out.println(" k "+k );
            boolean board[][] = new boolean[n][n];
            for (int row = 0; row < k; ++row) {
                int col = scan.nextInt();
                board[row][col] = true;
            }
            Test1 s = new Test1();
            s.setBoard(board);
            int ways = s.waysToPlace(k - 1);
            System.out.println(ways);
        }
    }

}
