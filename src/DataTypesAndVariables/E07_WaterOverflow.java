package DataTypesAndVariables;

import java.util.Scanner;

public class E07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int totalLitres = 0;

        for(int pour=1; pour <=count; pour++){
            int pouredLitres = Integer.parseInt(scanner.nextLine());
            totalLitres += pouredLitres;
            if (totalLitres > 255){
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(totalLitres);
    }
}
