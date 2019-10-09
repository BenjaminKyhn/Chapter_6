public class Listing_6_07 {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes){
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        //Repeatedly find prime numbers
        while (count < numberOfPrimes){
            // Print the prime number and increase the count
            if (isPrime(number)){
                count++; // increase the count

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0){
                    // Print the number and advance to the new line
                    System.out.printf("%-5d\n", number);
                }
                else
                    System.out.printf("%-5d", number);
            }

            // Check whether the number is prime
            number++;
        }
    }

    /** Check whether the number is prime */
    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number/2; divisor++) {
            if (number % divisor == 0){
                return false; // Number is not a prime
            }
        }
        return true; // Number is a prime
    }
}
