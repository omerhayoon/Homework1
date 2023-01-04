
import java.util.Scanner;

public class Excersice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber;
        do {
            System.out.println("Please enter a number");
            userNumber = scanner.nextInt();
        }
        while (userNumber < 0);
        int counter = 0;
        int i = 2;
        while (counter < userNumber) {
            if (isPrime(i)) {
                counter++;
                System.out.print(i + " ");
            }
            i++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
