public class Exercise_6_11 {
    public static void main(String[] args) {
        System.out.printf("%-15s%15s\n", "Sales Amount", "Comission");
        int salesAmount = 10000;
        while (salesAmount <= 100000){
            System.out.printf("%-15d%15.2f\n", salesAmount, computeCommission(salesAmount));
            salesAmount += 5000;
        }
    }

    public static double computeCommission(double salesAmount){
        double commission = 0;
        double balance = 0;
        if (salesAmount > 10000)
                commission += (balance = salesAmount - 10000) * 0.10;

            if (salesAmount > 5000)
                commission += (balance -= balance - 5000) * 0.08;

            if (salesAmount > 0)
                commission += balance * 0.06;

        return commission;
    }

    }

