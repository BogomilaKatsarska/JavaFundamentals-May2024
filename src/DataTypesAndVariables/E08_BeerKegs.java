package DataTypesAndVariables;

import java.util.Map;
import java.util.Scanner;

public class E08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine());
        String maxModel = "";
        double maxVolume = 0;

        for (int keg=0; keg <= countKegs; keg++){
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume){
                maxModel = model;
                maxVolume = volume;
            }
        }
        System.out.println(maxModel);
    }
}
