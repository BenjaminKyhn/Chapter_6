public class Exercise_6_26 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int numberOfPrimesDisplayed = 1;
        int count = 2;
        while (numberOfPrimesDisplayed < 121) {
            if (isPalindrome(count) && isPrime(count) && isPrime(reverse(count))){
                if (numberOfPrimesDisplayed % NUMBER_OF_PRIMES_PER_LINE == 0)
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
