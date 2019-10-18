public class Exercise_6_13 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "i", "m(i)");
        for (int i = 1; i <= 901; i = i+100) {
            System.out.printf("%-15d%-15.4f\n", i, sumSeries(10));
        }
    }

    public static double sumSeries(double n){
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += i / (i +2);
        }
        return sum;
    }
}
