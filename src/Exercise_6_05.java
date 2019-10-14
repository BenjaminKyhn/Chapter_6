public class Exercise_6_05 {
    public static void main(String[] args) {
        displaySortedNumbers(1,2,3);
    }

    public static void displaySortedNumbers(
            double num1, double num2, double num3) {
        double temp; // Hold number to swap

        if (num2 < num1 && num2 < num3){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num3 < num1 && num3 < num2) {
            temp = num1; // temp is 1                     EXPLAIN!!!
            num1 = num3; // num1 is 3
            num3 = temp; // num3 is 1
        }
        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Display result
        System.out.println(num3 + " " + num2 + " " + num1);
    }
}

