import java.util.Scanner;

public class Exercise_6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = input.nextLine();
        System.out.println((isValidPassword(password) ? "Valid " : "Invalid ") + "password");
    }

    public static boolean isValidPassword (String password){
        final int PASSWORD_LENGTH = 10;
        final int MINIMUM_NUMBERS_OF_CHARS = 3;

        boolean validPassword = isLengthValid(password, PASSWORD_LENGTH) && isOnlyLettersAndDigits(password) && hasNDigits(password, MINIMUM_NUMBERS_OF_CHARS);
        return validPassword;
    }

    //Returns true if password has more characters than the required length
    public static boolean isLengthValid(String password, int validLength){
        return password.length() >= validLength;
    }

    //Returns false if one of the characters is not a letter or number
    public static boolean isOnlyLettersAndDigits(String password){
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))){
                return false;
            }
        }
        return true;
    }

    //Returns true if password has at least n digits
    public static boolean hasNDigits(String password, int n){
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))){
                numberOfDigits++;
            }
            if (numberOfDigits >= n){
                return true;
            }
            
        }
        return false;
    }
}
