import java.util.Scanner;

public class Game {
    public static Board board = new Board();
    public static SlowPrint printer = new SlowPrint();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        String player1 = "";
        String player2 = "";
        int row;
        int column;
        boolean isWinner = true; // true = not over; false = game over
        int turns = 0;

        board.makeBoard();

        printer.slowDisplay("WELCOME TO \"Tic Tac Toe\" ");
        printer.slowDisplay("What is the name of player one?");
        player1 = in.nextLine();
        System.out.println();
        printer.slowDisplay("What is the name of player two?");
        player2 = in.nextLine();
        System.out.println();

        do {
            printer.slowDisplay(player1 + " , it's your move");
            board.displayBoard();
            printer.slowDisplay("Enter Row and Column coordinates (respectively)");
            row = in.nextInt();
            column = in.nextInt();
            board.addX(row, column);
            System.out.println();
            isWinner = board.check();
            ++turns;

            if (isWinner == false) {
                printer.slowDisplay("GAME OVER " + player1 + " wins!");
                break;

            }

            printer.slowDisplay(player2 + " , it's your move");
            printer.slowDisplay("Enter Row and Column coordinates (respectively)");
            row = in.nextInt();
            column = in.nextInt();
            board.addO(row, column);
            isWinner = board.check();
            ++turns;
            if (isWinner == false) {
                printer.slowDisplay("GAME OVER " + player2 + " wins!");
                break;
            }

        } while (turns < 10);

        System.out.println("GAME OVER");

    }
}