package Methods;

import java.util.Scanner;

public class E08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long factorialFirstNum = calculateFactorial(firstNumber);
        long factorialSecondNum = calculateFactorial(secondNumber);

        double result = factorialFirstNum * 1.0 / factorialSecondNum;
        System.out.printf("%.2f", result);
    }
    public static long calculateFactorial (int number){
        long fact = 1;
        for( int i = 1; i <= number; i++){
            fact = fact * i;
        }
        return fact;
    }
}
