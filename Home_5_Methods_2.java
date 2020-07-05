import java.util.Scanner;

public class Home_5_Methods_2 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Въведи число от 1 до 7");
        int number = console.nextInt();
        getDayOfWeek(number);
    }
    private static void getDayOfWeek(int number) {
        String dayOfWeek = "";

        switch (number) {
                case 1 : dayOfWeek = "Monday"; break;
                case 2 : dayOfWeek = "Tuesday"; break;
                case 3 : dayOfWeek = "Wednesday"; break;
                case 4 : dayOfWeek = "Thursday"; break;
                case 5 : dayOfWeek = "Friday"; break;
                case 6 : dayOfWeek = "Saturday"; break;
                case 7 : dayOfWeek = "Saturday"; break;
                default: System.out.println("грешно въвеждане");
            }
            System.out.println(dayOfWeek);
    }
}
