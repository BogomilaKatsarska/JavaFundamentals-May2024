package Methods;

import java.util.Scanner;

public class E01_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        System.out.println(getVowelsCount(text));
    }
    public static int getVowelsCount(String text){
        int count = 0;
        // A a E e O o U u I i
        for (char symbol: text.toCharArray()){
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        return count;
    }
}
