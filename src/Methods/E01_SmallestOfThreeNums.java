package Methods;

import java.util.Scanner;

public class E01_SmallestOfThreeNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNum, secondNum, thirdNum);
    }
    private static void printSmallestNumber(int n1, int n2, int n3){
        int smallerBetweenFirstAndSecond = Math.min(n1, n2);
        System.out.println(Math.min(smallerBetweenFirstAndSecond, n3));
    }
}
