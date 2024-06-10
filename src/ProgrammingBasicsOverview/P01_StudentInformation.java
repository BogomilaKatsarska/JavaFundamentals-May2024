package ProgrammingBasicsOverview;

import java.util.Scanner;

public class P01_StudentInformation {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String studentName = scanner.nextLine();
    String name = scanner.nextLine();
    int age = Integer.parseInt(scanner.nextLine());
    double grade = Double.parseDouble(scanner.nextLine());
// %f -> %.2f
    System.out.printf("Name: %s, Age: %d, Grade: %.2f", studentName, age, grade);
    String result = String.format("Name: %s, Age: %d", name, age);
    System.out.println(result);
  }
}


//Comparison operators:
//Equals        ==
//Not equals    !=
//GT            >
//GTE           >+
//LT            <
//LTE           <=