import java.util.Scanner;

public class Exercise_6_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides in a regular polygon: ");
        int numberOfSides = input.nextInt();
        System.out.println("Enter the side length of each side: ");
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is " + area(numberOfSides,side));
    }

    public static double area(int n, double side){
        return (n*Math.pow(side, 2)) / (4*Math.tan(Math.PI/5));
    }
}
