package Methods;

import java.util.Scanner;

public class P04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (action){
            case "add" -> actionAdd(firstNumber, secondNumber);
            case "multiply" -> actionMultiply(firstNumber, secondNumber);
            case "subtract" -> actionSubtract(firstNumber, secondNumber);
            case "divide" -> actionDivide(firstNumber, secondNumber);
        }
    }

    public static void actionDivide(int num1, int num2){
        System.out.println(num1 / num2);
    }

    public static void actionMultiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static void actionAdd(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public static void actionSubtract(int num1, int num2){
        System.out.println(num1 - num2);
    }
}
