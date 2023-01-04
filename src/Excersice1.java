
    import java.util.Scanner;
    public class Excersice1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            float a, b, c;
            double solution1, solution2;
            System.out.println("Please enter the A");
            a = scanner.nextFloat();
            System.out.println("Please enter the B");
            b = scanner.nextFloat();
            System.out.println("Please enter the C");
            c = scanner.nextFloat();
            double d = ((b * b) - 4 * a * c);
            if (d < 0) {
                System.out.println("There is no solution for the equation");
            } else {
                solution1 = (-b + Math.sqrt((d))) / (2 * a);
                solution2 = (-b - Math.sqrt((d))) / (2 * a);
                if (solution1 != solution2) {
                    System.out.println("Solution 1 is: " + solution1 + ", Solution 2 is: " + solution2);
                } else {
                    System.out.println("There is only 1 answer " + solution1);
                }
            }
        }


        }
