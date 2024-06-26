package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P00_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();

//        List<String> names2 = new ArrayList<>(Arrays.asList("Ivan", "Petur", "Georgi"));

        names.add("Ivan");
        names.add("Georgi");
        names.add("Peter");

        names.remove("Georgi"); //removes only the first occurrence
//        numbers.remove(INDEX for integer value)
//        numbers.remove(Integer.valueOf(3))
//        doubleList.remove(0) - removes the el at index 0
//        doubleList.remove(15.8) - removes the el 15.8
        System.out.println(names.size()); // .size() not .length()
        names.add(0, "Krasi");
        names.set(0, "Bogomila");

        for (String name: names){
            System.out.println(name);
        }
        for (int position = 0; position < names.size(); position ++){
            System.out.println(names.get(position));
        }
//        System.out.println(numbers.toString());
//        System.out.println(String.join(", ", names));

//        System.out.println(numbers.contains(100));
//        System.out.println(numbers.isEmpty());
//        numbers.clear();
//        numbers.indexOf(20) -> returns on which index is located element of 20
     }
}
//Advantages:
//1.Not fixed size - do not need to know how many els inside
//3. More functional and easy to modify