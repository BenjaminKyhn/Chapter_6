import java.util.Scanner;

public class Exercise_6_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int numberOfRows = input.nextInt();

        //Display pattern
        displayPattern(numberOfRows);
    }

    //Method for the pattern
    public static void displayPattern(int n){
        int padding = n - 1; //Holds number of white space
        for (int i = 1; i <= n; i++) {
            //Print padding
            for (int j = 0; j < padding; j++) {
                System.out.print("  ");
            }

            //Print numbers
            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
            padding--;

        }

    }
}
