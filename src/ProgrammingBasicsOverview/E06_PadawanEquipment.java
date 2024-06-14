package ProgrammingBasicsOverview;

import java.util.Map;
import java.util.Scanner;

public class E06_PadawanEquipment {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceSaver = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double countSaber = Math.ceil(1.1 * countStudents);
        int countBelts = countStudents - countStudents / 6;

        double totalSum = (priceBelts * countBelts)
                + (priceSaver * countSaber)
                + (priceRobes * countStudents);

        if (budget >= totalSum){
            System.out.printf("The money is enough - it will cost %.2f lv.", totalSum);
        } else {
            double neededMoney = totalSum - budget;
            System.out.printf("George Lucas will need  %2flv more.", neededMoney);
        }
    }


}
