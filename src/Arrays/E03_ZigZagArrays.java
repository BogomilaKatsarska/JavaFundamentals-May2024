package Arrays;

import java.util.Scanner;

public class E03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int row = 1; row <= n; row++){
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");
            int firstNumber = Integer.parseInt(numbers[0]);
            int secondNumber = Integer.parseInt(numbers[1]);

            if (row % 2 != 0){
                firstArray[row - 1] = firstNumber;
                secondArray[row - 1] = secondNumber;
            } else {
                secondArray[row - 1] = firstNumber;
                firstArray[row - 1] = secondNumber;
            }
        }

        for (int number: firstArray){
            System.out.print(number + " ");
        }
        for (int number: secondArray){
            System.out.print(number);
        }
    }
}
