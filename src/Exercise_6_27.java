public class Exercise_6_27 {
    public static void main(String[] args) {
        final int NUMBER_OF_EMIRPS_PER_LINE = 10;
        int numberOfPrimesDisplayed = 1;
        int count = 0;
        while (numberOfPrimesDisplayed < 101) {
            if (!isPalindrome(count) && isPrime(count) && isPrime(reverse(count))){
                if (numberOfPrimesDisplayed % NUMBER_OF_EMIRPS_PER_LINE == 0)
                    System.out.println(count + " ");
                else
                    System.out.print(count + " ");
                numberOfPrimesDisplayed++;
            }
            count++;
        }
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

    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number/2; divisor++) {
            if (number % divisor == 0){
                return false; // Number is not a prime
            }
        }
        return true; // Number is a prime
    }
}
