public class Exercise_6_10 {
    public static void main(String[] args) {
        System.out.println(numberOfPrimes(10000));
    }
public static int numberOfPrimes(int number){
        int numberOfPrimes = 0;
        int count = 2;
    while (count < number){
        if (isPrime(count))
            numberOfPrimes++;
        count++;
    }
    return numberOfPrimes;
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
