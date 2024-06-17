package Arrays;

import java.util.Scanner;

public class P00_Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int n = Integer.parseInt(scanner.nextLine());
//        int[] numbers = new int[n];
        int[] numbers = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        //for each
        for (int num: numbers){
            System.out.println(num);
        }
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int position = 0; position < array.length; position++) {
            array[position] = Integer.parseInt(scanner.nextLine());
        }
    }
}
