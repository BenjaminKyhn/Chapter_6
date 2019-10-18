public class Exercise_6_14 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "i", "m(i)");
        for (int i = 1; i <= 901; i = i+100) {
            System.out.printf("%-15d%-15.4f\n", i, estimatePI(i));
        }
    }

    public static double estimatePI(double n){
        double pi = 0;
        for (double i = 1; i <= n; i++) {
            pi += Math.pow(-1, i+1)/(2 * i - 1);
        }
        pi *= 4;
        return pi;
    }
}