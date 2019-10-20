import java.util.Scanner;

public class Exercise_6_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        System.out.println("Enter a character to check for: ");
        String characterToCheckFor = input.next();
        char ch = characterToCheckFor.charAt(0);

        System.out.println(ch + " occurs " + count(s, ch) + " times in " + s);
    }

    public static int count(String str, char a){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a)
                count++;
        }
        return count;
    }
}
