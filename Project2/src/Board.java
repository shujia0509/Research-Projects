/**
 * Created by shaowenyuan on 20/02/2018.
 */
public class Board {
    public int[][] board;
    public int size;
    public int m;

    public Board() {

    }

    public Board(int size, int m) {
        this.board = new int[size][size];
        this.size = size;
        this.m = m;
    }

    public int[][] getBoard() {
        return this.board;
    }

}
