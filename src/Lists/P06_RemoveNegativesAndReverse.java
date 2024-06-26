package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++){
            int currentNumber = numbers.get(i);
            if (currentNumber < 0){
                numbers.remove(Integer.valueOf(currentNumber));
                i--;
            }
        }

//        numbers.removeIf(n -> n < 0);

        Collections.sort(numbers);
        Collections.reverse(numbers);

        if(numbers.isEmpty()){
            System.out.println("empty");
        } else {
            System.out.println(numbers.toString().replace("[", "").replace("]", "").replaceAll(",", ""));
        }
    }
}
