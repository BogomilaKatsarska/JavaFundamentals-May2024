package ProgrammingBasicsOverview;

import java.util.Scanner;

public class E05_Login {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length() - 1; position >= 0; position--){
            char symbol = username.charAt(position);
            password += symbol;
        }

        String enteredPassword = scanner.nextLine();
        int countWrongAttempts = 0;

        while (!enteredPassword.equals(password)) {
            countWrongAttempts++;
            if (countWrongAttempts == 4){
                System.out.printf("User %s blocked!", username);
                return; // ends the whole program
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);

//        System.out.println(username.length());
//        System.out.println(username.charAt(0));
//        System.out.println(username.charAt(username.length() - 1));
    }
}
