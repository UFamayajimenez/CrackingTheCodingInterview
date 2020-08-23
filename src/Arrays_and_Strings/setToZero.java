package Arrays_and_Strings;

import java.util.Arrays;

public class setToZero {



    //The Problem: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0

    static void setToZero(char[][] board) {


        int numRows = board.length;
        int numCol = board[0].length;

        boolean[] rows = new boolean[numRows];
        boolean[] columns = new boolean[numCol];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {

                if (board[row][col] == '0'){

                    rows[row] = true;
                    columns[col] = true;
                }
            }
        }

        for (int i = 0; i < rows.length; i++){

            if(rows[i]){
                char[][] newBoard = setRowToZero(board, i);
                board = newBoard;
            }

        }


        for (int i = 0; i < columns.length; i++){

            if(columns[i]){
                char[][] newBoard = setColumnToZero(board, i);
                board = newBoard;
            }

        }

        System.out.println(Arrays.deepToString(board));

    }


    public static char[][] setRowToZero(char[][] board, int row){


        for(int i = 0; i < board[0].length; i++){

            board[row][i] = 0;

        }

        return board;

    }


    public static char[][] setColumnToZero(char[][] board, int col){

        for(int i = 0; i < board.length; i++){

            board[i][col] = 0;

        }

        return board;

    }


    public static void main (String args[]){


        char[][] board = {{'1', '2', '0'}, {'4', '5', '6'}, {'0', '8', '9'}};


        setToZero(board);

    }
}


/*


            1 2 0                             0 0 0
            4 5 6                ---->        0 5 0
            0 8 9                             0 0 0


 */
