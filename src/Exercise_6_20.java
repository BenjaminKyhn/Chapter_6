import java.util.Scanner;

public class Exercise_6_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        System.out.println("The string " + s + " has " + countLetters(s) + " letters");
    }

    public static int countLetters(String s){
        int numberOfLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
            numberOfLetters++;
        }
        return numberOfLetters;
    }
}
