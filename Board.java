import java.util.Scanner;

public class Board {

    private static String[][] board = new String[3][3];
    private static Scanner in = new Scanner(System.in);

    public static void displayBoard() {

        System.out.println("  1:  2:  3:");
        System.out.println("  ----------");

        for (int x = 0; x < board.length; x++) {
            System.out.print(x + 1 + ": ");

            for (int y = 0; y < board[x].length; y++) {
                System.out.print(board[x][y]);
                if (y < 2) {
                    System.out.print(" | ");
                }
            }
            if (x < 2) {
                System.out.println();
                System.out.println("  ----------");
            }

        }
        System.out.println();

    }

    public static void makeBoard() {

        for (int x = 0; x < board.length; x++) {

            for (int y = 0; y < board[x].length; y++) {
                board[x][y] = " ";
            }
        }
    }

    public void addX(int x, int y) {
        if (board[x - 1][y - 1] == "O" || board[x - 1][y - 1] == "X") {
            System.out.println("FILLED...Select another position");
            System.out.println("Select: ");
            x = in.nextInt();
            y = in.nextInt();
            addX(x, y);

        } else {
            board[x - 1][y - 1] = "X";
            displayBoard();
        }
    }

    public void addO(int x, int y) {
        if (board[x - 1][y - 1] == "O" || board[x - 1][y - 1] == "X") {
            System.out.println("FILLED...Select another position");
            System.out.println("Select: ");
            x = in.nextInt();
            y = in.nextInt();
            addO(x, y);

        } else {
            board[x - 1][y - 1] = "O";
            displayBoard();
            System.out.println("Next turn...");
        }
    }

    public boolean checkRow1() {
        boolean check = true;

        if (board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X")) {
            check = false;
            return check;

        } else if (board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O")) {
            check = false;
            return check;
        } else {
            check = true;
            return check;
        }

    }

    public boolean checkRow2() {

        boolean check = true;

        if (board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X")) {
            check = false;
            return check;

        } else if (board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O")) {
            check = false;
            return check;
        } else {
            check = true;
            return check;
        }

    }

    public boolean checkRow3() {

        boolean check = true;

        if (board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X")) {
            check = false;
            return check;

        } else if (board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O")) {
            check = false;
            return check;
        } else {
            check = true;
            return check;
        }

    }

    public boolean checkColumn1() {

        boolean check = true;

        if (board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X")) {
            check = false;
            return check;

        } else if (board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O")) {
            check = false;
            return check;
        } else {
            check = true;
            return check;
        }

    }

    public boolean checkColumn2() {
        boolean check = true;

        if (board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X")) {
            check = false;
            return check;

        } else if (board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O")) {
            check = false;
            return check;
        } else {
            check = true;
            return check;
        }

    }

    public boolean checkColumn3() {

        boolean check = true;

        if (board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")) {
            check = false;
            return check;

        } else if (board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O")) {
            check = false;
            return check;
        } else {
            check = true;
            return check;
        }

    }

    public boolean checkDiagonal1() {
        boolean check = true;

        if (board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")) {
            check = false;
            return check;

        } else if (board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")) {
            check = false;
            return check;
        } else {
            check = true;
            return check;
        }

    }

    public boolean checkDiagonal2() {

        boolean check = true;

        if (board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) {
            check = false;
            return check;

        } else if (board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")) {
            check = false;
            return check;
        } else {
            check = true;
            return check;
        }
    }

    public boolean check() {

        boolean checkRow1 = checkRow1();
        boolean checkRow2 = checkRow2();
        boolean checkRow3 = checkRow3();
        boolean checkColumn1 = checkColumn1();
        boolean checkColumn2 = checkColumn2();
        boolean checkColumn3 = checkColumn3();
        boolean checkDiagonal1 = checkDiagonal1();
        boolean checkDiagonal2 = checkDiagonal2();

        if (checkRow1 == false || checkRow2 == false || checkRow3 == false) {
            return false;
        } else if (checkColumn1 == false || checkColumn2 == false || checkColumn3 == false) {
            return false;
        } else if (checkDiagonal1 == false || checkDiagonal2 == false) {
            return false;
        } else {
            return true;
        }

    }

}
