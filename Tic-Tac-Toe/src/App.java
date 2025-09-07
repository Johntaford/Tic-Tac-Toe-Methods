import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int col;
    int row;

    Scanner input = new Scanner(System.in);

    String[][] board = {{" - ", " - ", " - "},
                        {" - ", " - ", " - "},
                        {" - ", " - ", " - "}};  

    System.out.println("\t" + Arrays.deepToString(board[0]));
    System.out.println("\t" + Arrays.deepToString(board[1]));
    System.out.println("\t" + Arrays.deepToString(board[2]) + "\n");

    System.out.println("X - Select row  (1-3) & select column (1 -3 )");
    System.out.println("separated by a space: ");

    col = input.nextInt();
    row = input.nextInt();

   if (board[row - 1][col - 1].equals("-"))
        board[row - 1][col - 1] = " x ";

        else { 
            System.out.println(" Sorry this spot is taken.");
        }

    System.out.println("\t" + Arrays.deepToString(board[0]));
    System.out.println("\t" + Arrays.deepToString(board[1]));
    System.out.println("\t" + Arrays.deepToString(board[2]) + "\n");

    // O's 1st turn
    System.out.print("O - Select row (1-3) & select column (1-3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " O ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
    
    // X's 2nd turn
    System.out.print("X - Select row (1 - 3) & select column (1 - 3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " X ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
  
 
    // O's 2nd turn
    System.out.print("O - Select row (1-3) & select column (1-3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " O ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");  
 
    // X's 3rd turn
    System.out.print("X - Select row (1 - 3) & select column (1 - 3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " X ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
        
    // O's 3rd turn
    System.out.print("O - Select row (1-3) & select column (1-3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " O ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
    
    // X's 4th turn
    System.out.print("X - Select row (1 - 3) & select column (1 - 3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " X ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
 
    // O's 4th turn
    System.out.print("O - Select row (1-3) & select column (1-3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " O ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");  
 
    // X's 5th turn
    System.out.print("X - Select row (1 - 3) & select column (1 - 3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " X ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
  


    }
}
