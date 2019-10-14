import java.util.Scanner;

public class Exercise_6_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Total amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.printf("%-12s%-12s\n", "Years", "Future Value");
        int years = 1;
        while (years <= 30){
            System.out.printf("%-10d%10.2f\n", years, futureInvestmentValue(investmentAmount, annualInterestRate/100/12, years));
            years++;
        }
    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate,int years){
                return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
