package ProgrammingBasicsOverview;
import java.util.Scanner;

public class E00_DoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = 6;

//        while loop може да не се изпълни въобще
        while (number > 10){
            System.out.println("Bogomila");
        }

        int age = 7;
//        do-while поне веднъж изпълнява блока от код
        do{
            System.out.println("Bogomila");
        } while (age > 10);
    }
}
