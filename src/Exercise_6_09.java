public class Exercise_6_09 {
    public static void main(String[] args) {
        // Table header
        System.out.printf("%-15s%-15s%15s%-15s%-15s\n", "Kilograms", "Pounds", "     |         ", "Pounds", "Kilograms");

        // Table body
        int kilograms = 1;
        int pounds = 20;
        while (kilograms <= 199){
            System.out.printf("%-15d%-15.3f%15s%-15d%-15.3f\n", kilograms, kilogramToPound(kilograms), "     |         ", pounds, poundToKilogram(pounds));
            kilograms++;
            pounds = pounds+5;
        }
    }

    /** Convert from pounds to kilograms */
    public static double poundToKilogram(double pound){
        return pound * 0.453;
    }
    /** Convert from kilograms to pounds */
    public static double kilogramToPound(double kilogram){
        return kilogram * 2.204;

    }
}
