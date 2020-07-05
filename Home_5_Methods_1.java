import java.util.Scanner;

public class Home_5_Methods_1 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double number = Double.parseDouble(console.nextLine());
        isNumberPositive(number);
    }

    private static void isNumberPositive(double number) {
        if ( number >= 0) {
        System.out.println("Числото е положително");
        } else System.out.println("Числото е отрицателно");
    }
}

