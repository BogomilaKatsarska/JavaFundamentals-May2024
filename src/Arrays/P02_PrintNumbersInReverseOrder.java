package Arrays;

import java.util.Scanner;

public class P02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[countNumbers];
        for (int i = 0; i <= numbers.length -1; i++){
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
