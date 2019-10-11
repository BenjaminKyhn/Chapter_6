public class Exercise_6_03 {
    public static void main(String[] args) {
        int number = 101;

        System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome");
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static int reverse(int number){
        String reverse = "";
        String n = number + "";

        for (int i = n.length()-1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
}
