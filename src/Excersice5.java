
import java.util.Scanner;

public class Excersice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter Number Please");
        number = scanner.nextInt();
        isFib(number);
    }

    public static void isFib(int number) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        if (number >= 0) {
            do {
                num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
            }
            while (num3 < number);
            if ((num3 == number) || (number == 0)) {
                System.out.println("Your Number is in Fibonacci series");
            } else {
                System.out.println("Your Number is not in Fibonacci series");
            }
        }
    }
}

