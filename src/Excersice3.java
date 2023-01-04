
import java.util.Scanner;

public class Excersice3 {
    public static void main(String[] args) {
        int number, space;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter a number that is higher than 3 and is odd");
            number = scanner.nextInt();
        } while ((number % 2 == 0) || (number < 3));
        space = number / 2;
        for (int i = 0; i < space + 1; i++) {
            for (int j = 0; j < space - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((2 * i) + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < space; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 2; k < (number - 2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
