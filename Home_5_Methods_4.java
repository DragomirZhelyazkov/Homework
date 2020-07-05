import java.util.Scanner;

public class Home_5_Methods_4 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int year = console.nextInt();
        isYearHigh(year);
    }

    private static void isYearHigh(int year) {
        int yearHigh = 2020;
        if (Math.abs(yearHigh - year) % 4 == 0 ) {
            System.out.println("Въведената година е високосна");
        } else System.out.println("Въведената година не е високосна");
    }
}
