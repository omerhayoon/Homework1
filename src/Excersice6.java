
import java.util.Scanner;

public class Excersice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Please enter a number");
        int userNumber = scanner.nextInt();
        int sum = 0;
        while (userNumber > 0) {
            sum += userNumber % 10;
            userNumber /= 10;
        }
        System.out.println("The sum of your digits are: " + sum);
    }
}

