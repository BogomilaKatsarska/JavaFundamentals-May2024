package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P01_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).toList();

        while (!command.get(0).equals("end")){
            String firstElement = command.get(0);
            int secondElement = Integer.parseInt(command.get(1));
            switch (firstElement){
                case "Add" -> numbers.add(secondElement);
                case "Remove" -> numbers.remove(Integer.valueOf(secondElement));
                case "RemoveAt" -> numbers.remove(secondElement);
                case "Insert" -> {
                    int index = Integer.parseInt(command.get(2));
                    numbers.add(index, secondElement);
                }
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).toList();
        }
        for (Integer number: numbers){
            System.out.print(number + " ");
        }
    }
}
