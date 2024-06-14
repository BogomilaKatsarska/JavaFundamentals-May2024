package DataTypesAndVariables;

import java.util.Scanner;

public class P07_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();

//        System.out.println(firstName + delimiter + secondName);
        System.out.printf("%s%s%s", firstName, delimiter, secondName);
    }
}
