public class Exercise_6_16 {
    public static void main(String[] args) {
        System.out.printf("%-12s%-12s", "Year", "Days in year\n");
        for (int i = 2014; i <= 2034; i++) {
            System.out.printf("%-12d%-12d\n", i, numberOfDaysInAYears(i));
        }
    }

    public static int numberOfDaysInAYears(int year){
        if (isLeapYear(year))
            return 366;
        else
            return 365;
    }

    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
