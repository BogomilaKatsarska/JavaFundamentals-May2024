package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P00_Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> ages = new ArrayList<>();

        for (int i = 1; i <= n; i++){

            int currentAge = Integer.parseInt(scanner.nextLine());
            ages.add(currentAge);

        }
        double[] arraySalaries = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        List<Double> salaries = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
    }
}
