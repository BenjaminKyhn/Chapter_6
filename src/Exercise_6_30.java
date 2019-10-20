public class Exercise_6_30 {
    public static void main(String[] args) {
        //Roll 2 dice and display the sum
        int point = rollTwoDice();
        int result = getResult(point);
        System.out.println("Point is " + point);

        //If natural or craps, print the result
        if (isNaturalOrCraps(result))
            printResult(result);
        else {
            rollTillWinOrLose(result);
        }
    }

    public static int rollDice(){
        return (int)(Math.random()*6+1);
    }

    public static int rollTwoDice(){
        int dice1 = rollDice();
        int dice2 = rollDice();
        int sum = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
        return sum;
    }

    public static int getResult(int point){
        switch (point){
            case 2:
            case 3:
            case 12: point = 0; break;
            case 7:
            case 11: point = 1; break;
        }
        return point;
    }

    public static void printResult(int result){
        if (result == 0)
            System.out.println("You lose");
        else if (result == 1)
            System.out.println("You win");
    }

    public static boolean isNaturalOrCraps(int result){
        return result == 0 || result == 1;
    }

    //Keep rolling until craps, natural or the same point is rolled
    public static void rollTillWinOrLose(int point){
        int result;

        do {
            result = rollTwoDice();
        } while (result != point && result != 7);

        //You lose if you roll a 7
        if (result == 7)
            printResult(0);
        if (result == point)
            printResult(1);
    }
}
