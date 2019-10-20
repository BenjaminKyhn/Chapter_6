import java.util.Random;

public class Exercise_6_38 {
    /** Main method */
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 200;
        final int CHARS_PER_LINE = 10;

        //Print random uppercase characters between 'a' and 'z', 10 chars per line
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = getRandomUpperCaseLetter();
            if ((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }

        System.out.println();

        //Print random digits between 0 and 9, 10 digits per line
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = getRandomDigitCharacter();
            if ((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }

    /** Generate a random character between ch1 and ch2 */
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** Generate a random uppercase letter */
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A', 'Z');
    }

    /** Generate a random digit character */
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0', '9');
    }
}
