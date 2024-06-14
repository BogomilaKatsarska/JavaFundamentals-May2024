package DataTypesAndVariables;

import java.util.Scanner;

public class P02_GbpToUsd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gbp = Double.parseDouble(scanner.nextLine());
        double usd = gbp * 1.36;

        System.out.printf("%.3f", usd);
    }
}
