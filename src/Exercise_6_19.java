import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise_6_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of 3 sides in a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println(isValid(side1, side2, side3) ? "The area of the triangle is " + area(side1, side2, side3)
                : "Input does not match a triangle");
    }

    /** Return true if the sum of every two sides is
     * greater than the third side. */
    public static boolean isValid(
            double side1, double side2, double side3){
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1))
            return true;
        return false;
    }

    /** Return the area of the triangle using Heron's Formula */
    public static double area(
            double side1, double side2, double side3){
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
