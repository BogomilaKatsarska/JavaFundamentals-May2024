//
//public class Main {
//  public static void main(String[] args){
//    System.out.printf("Hello and welcome!");
//
//    for (int i=1; i <= 5; i++){
//      System.out.println("i = " + i);
//    }
//  }
//}

import java.util.Scanner;

public class Demo {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

//    int number = 10;
    int age = Integer.parseInt(scanner.nextLine());
//    double grade = 5.50;
    double grade = Double.parseDouble(scanner.nextLine());
//    String name = "Bogomila";
    String name = scanner.nextLine();
//    char symbol = '@';
//    boolean isTrue = true;

//    sout
    System.out.println(name);
//    in the below exaple cursor stays on the same line
    System.out.print(age);

//    souf

//    %s - String
//    %d - int
//    %f - double
//    %c - char
//    %n n - new line

    System.out.printf("%f, grade");

  }
}
