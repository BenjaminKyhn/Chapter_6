public class Exercise_6_12 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        printNumbers(1,100, NUMBERS_PER_LINE);
    }

    public static void printNumbers(int num1, int num2, int numberPerLine){
        for (int i = num1, count = 1; i <= num2; i++, count++) {
            if (count % numberPerLine == 0)
                System.out.println(i + " ");
            else
                System.out.print(i + " ");

        }
    }
}
