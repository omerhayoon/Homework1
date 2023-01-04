
import java.util.Scanner;

public class Excersice2 {
    public static void main(String[] args) {
        int firstElement, difference, totalElements;
        int printNum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the first element in the series:");
        firstElement = scanner.nextInt();
        System.out.println("Insert the difference:");
        difference = scanner.nextInt();
        printNum = firstElement;
        do {
            System.out.println("Please enter total elements of the series:");
            totalElements = scanner.nextInt();
        } while (totalElements < 1);

        for (int i = 0; i < totalElements; i++) {
            System.out.print(printNum + ",");
            printNum = difference + printNum;

        }
    }
}

