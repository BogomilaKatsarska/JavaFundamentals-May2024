package Lists;

import java.util.*;

public class P05_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfProducts = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 1; i <= numberOfProducts; i++){
            String currentProduct = scanner.nextLine();
            products.add(currentProduct);
        }

        Collections.sort(products);

        for (int index = 0; index < products.size(); index++){
            System.out.printf("%d.%s%n", (index + 1), products.get(index));
        }
    }
}
