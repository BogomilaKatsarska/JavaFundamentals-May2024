package DataTypesAndVariables;

import java.util.Scanner;

public class E04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;

        for(int line = 1; line <= numberOfLines; line++){
            char symbol = scanner.nextLine().charAt(0);
            totalSum += (int) symbol;
        }
        System.out.println(totalSum);
    }
}
