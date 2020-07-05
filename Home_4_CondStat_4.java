import java.util.Scanner;

public class Home_4_CondStat_4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        int n = console.nextInt();
        double result = 0;

        switch (n) {
            case 1: result = a + b; break;
            case 2: result = a - b; break;
            case 3: result = b - 1; break;
            case 4: result = a * b; break;
            case 5: result = a / b; break;
            case 6: result = b / a; break;
            default: System.out.println("Input n again");
            }
        System.out.println(result);
    }
}
