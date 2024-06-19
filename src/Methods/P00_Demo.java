package Methods;

import java.util.Scanner;

public class P00_Demo {
    public static void main(String[] args) {
//        (public/private) - access modifier
//        (static/) - can be called directly through its name in the class in which it has been created
//        (void/) - method type in which we do not expect to return anything
        Scanner scanner = new Scanner(System.in);
        printHeaderPart();
        String courseName = scanner.nextLine();
        double coursePrice = Double.parseDouble(scanner.nextLine());
        printMiddlePart(courseName, coursePrice);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        printFooterPart();
    }
    public static void printHeaderPart(){
        System.out.println("SoftUni Address Str. 32");
    }

    public static void printFooterPart(){
        System.out.println("05-June-2024");
    }
    public static void printMiddlePart(String courseName, double price){
        System.out.printf("%s: %.2flv.", courseName, price);
    }
}
