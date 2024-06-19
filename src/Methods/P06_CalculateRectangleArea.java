package Methods;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = getRectangleArea(width, length);
        System.out.println(area);
    }

    public static double getRectangleArea(double width, double height){
        return width * height;
    }
}
