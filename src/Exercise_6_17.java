import java.util.Scanner;

public class Exercise_6_17 {
    public static void main(String[] args) {
        System.out.println("Enter n as an integer: ");
        Scanner input = new Scanner(System.in);
        printMatrix(input.nextInt());
    }

    public static void printMatrix(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n; j++) {
                int randomNumber = (int)(Math.random()*2);
                System.out.print(randomNumber + " ");
            }
            System.out.println();

        }
    }
}
