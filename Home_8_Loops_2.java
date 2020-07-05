import java.util.Scanner;

public class Home_8_Loops_2 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int number = 1;
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        System.out.println("Input numbers:");
        while (true) {
            number = console.nextInt();
            if ( number == 0) { break;
            }
            if (number <= minNumber) {
                minNumber = number;
            } else if (number >= maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println(minNumber + ", " + maxNumber);
    }
}
