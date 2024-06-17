package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P00_Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                //.mapToInt(e -> Integer.parseInt(e))
                .toArray();
        for (int number : numbers){
            System.out.println(number);

        }
    }
}
