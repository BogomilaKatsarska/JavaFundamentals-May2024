package Arrays;

public class P00_Demo {
    public static void main(String[] args) {
        //static collection
        int[] numbers = new int[4]; //default value of each el == 0;

        numbers[0] = 22;
        numbers[1] = 13;
        numbers[2] = 6;
        numbers[3] = 100;
        System.out.println(numbers.length);
        System.out.println(numbers[numbers.length -1]);
        System.out.println(numbers[3]);

        String[] daysOfWeek = new String[5]; //default value is null
        daysOfWeek[0] = "Monday";
        daysOfWeek[1] = "Tuesday";
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[3] = "Thursday";
        daysOfWeek[4] = "Friday";

        String name = "Bogomila";
        char[] letters = name.toCharArray();
    }
}
