import java.util.Scanner;

public class Exercise_6_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();

        System.out.println(format(number, width));
    }

    public static String format(int number, int width){
        //Convert the number to string
        String num = number + "";

        //If the number is shorter than width, format it
        if (num.length() < width){
            for (int i = width - num.length(); i > 0; i--) {
                num = 0 + num;
            }
        }
        //Else return the number as it was input
        return num;
    }
}
