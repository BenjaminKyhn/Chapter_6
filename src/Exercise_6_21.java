import java.util.Scanner;

public class Exercise_6_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phone number as a string: ");
        String phoneNumber = input.nextLine();

        for (int i = 0; i < phoneNumber.length(); i++) {
            if (Character.isLetter(phoneNumber.charAt(i)))
                System.out.print(getNumber(Character.toUpperCase(phoneNumber.charAt(i))));
            else
                System.out.print(phoneNumber.charAt(i));
        }
        System.out.println();
    }

    public static int getNumber(char uppercaseLetter){
        if (uppercaseLetter >= 'W')
            return 9;
        else if (uppercaseLetter >= 'T')
            return 8;
        else if (uppercaseLetter >= 'P')
            return 7;
        else if (uppercaseLetter >= 'M')
            return 6;
        else if (uppercaseLetter >= 'J')
            return 5;
        else if (uppercaseLetter >= 'G')
            return 4;
        else if (uppercaseLetter >= 'D')
            return 3;
        else
            return 2;
    }
}
