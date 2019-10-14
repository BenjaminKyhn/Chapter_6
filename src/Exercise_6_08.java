public class Exercise_6_08 {
    public static void main(String[] args) {
        // Table header
        System.out.printf("%-15s%-15s%15s%-15s%-15s\n", "Miles", "Kilometers", "     |         ", "Kilometers", "Miles");

        // Table body
        int miles = 1;
        int kilometers = 20;
        while (miles <= 10){
            System.out.printf("%-15d%-15.3f%15s%-15d%-15.3f\n", miles, mileToKilometer(miles), "     |         ", kilometers, kilometerToMile(kilometers));
            miles++;
            kilometers = kilometers+5;
        }
    }

    /** Convert from Mile to Kilometer */
    public static double mileToKilometer(double mile){
        return mile * 1.609344;
    }
    /** Convert from Kilometer to Mile */
    public static double kilometerToMile(double kilometer){
        return kilometer/1.609344;
    }
}
