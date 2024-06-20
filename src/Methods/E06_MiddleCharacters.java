package Methods;

import java.util.Scanner;

public class E06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
    }
    public static void printMiddleCharacter(String text){
        int length = text.length();
        if (length % 2 != 0){
            int positionMiddleSymbol = length / 2 ;
            System.out.println(text.charAt(positionMiddleSymbol));
        } else {
            int positionFirstMiddleCharacter = length / 2 - 1;
            int positionSecondMiddleCharacter = length / 2;

            System.out.print(text.charAt(positionFirstMiddleCharacter));
            System.out.print(text.charAt(positionSecondMiddleCharacter));
        }
    }
}
