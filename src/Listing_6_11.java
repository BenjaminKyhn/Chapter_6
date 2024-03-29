import java.util.Random;

public class Listing_6_11 {
    /** Main method */
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        //Print random characters between 'a' and 'z', 25 chars per line
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = getRandomLowerCaseLetter();
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

    /** Generate a random lowercase letter */
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a', 'z');
    }
}
