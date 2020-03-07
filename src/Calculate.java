import java.util.Scanner;

public class Calculate {

    public int calculate() {
        Scanner readInput = new Scanner(System.in);
        System.out.println("Enter what operation you want to do:");
        String operator = readInput.next();
        if (operator.equals("+")) {
            System.out.println("Enter the first number you want to add:");
            double addNum1 = readInput.nextDouble();
            System.out.println("Enter the second number you want to add:");
            double addNum2 = readInput.nextDouble();
            double addResult = addNum1 + addNum2;
            System.out.println("The result of your addition is: " + addResult);
        }
        if (operator.equals("-")) {
            System.out.println("Enter the first number you want to subtract:");
            double subNum1 = readInput.nextDouble();
            System.out.println("Enter the second number you want to subtract:");
            double subNum2 = readInput.nextDouble();
            double subResult = subNum1 - subNum2;
            System.out.println("The result of your subtraction is: " + subResult);
        }
        if (operator.equals("*")) {
            System.out.println("Enter the first number you want to multiply:");
            double timesNum1 = readInput.nextDouble();
            System.out.println("Enter the second number you want to multiply:");
            double timesNum2 = readInput.nextDouble();
            double timesResult = timesNum1 * timesNum2;
            System.out.println("The result of your multiplication is: " + timesResult);
        }
        if (operator.equals("/")) {
            System.out.println("Enter the first number you want to divide:");
            double divNum1 = readInput.nextDouble();
            System.out.println("Enter the second number you want to divide:");
            double divNum2 = readInput.nextDouble();
            double divResultFlat = divNum1 / divNum2;
            System.out.println("The result of your division is: " + divResultFlat);
        }
        return -1;
    }

    public void continueMath() {
        Scanner readContinue = new Scanner(System.in);
        System.out.println("Do you want to continue? true or false");
        boolean keepGoing = readContinue.nextBoolean();
        if (keepGoing == true){
            calculate();
        }
    }
}