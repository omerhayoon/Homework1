
public class Excersice7 {
    public static void main(String[] args) {
        final int RUNNINGTILLNUM = 1000;
        int counter, number;
        int isNarcissistic = 0;
        int totalDigits = 0;
        System.out.println("All Narcissistic numbers between 1 to 1000: ");
        for (int i = 1; i <= RUNNINGTILLNUM; i++) {
            counter = i;
            totalDigits = i;
            int powNum = 0;
            while (totalDigits > 0) {
                powNum++;
                totalDigits /= 10;
            }
            while (counter > 0) {
                number = counter % 10;
                isNarcissistic = (int) (isNarcissistic + (Math.pow(number, powNum)));
                counter = counter / 10;
            }
            if (isNarcissistic == i) {
                System.out.print(i + " ");
            }
            isNarcissistic = 0;
        }
    }
}

