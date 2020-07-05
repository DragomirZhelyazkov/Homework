import java.util.Scanner;

public class Home_8_Loops_1 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Input number:");
        int m = console.nextInt();
        System.out.println("Input number:");
        int n = console.nextInt();

        int result = 1;
        if ( m < n) {
            for (int i = m; i <= n; i++) {
                result = result * i;
            }
        } else {
            for (int i = n; i <= m; i++) {
                    result = result * i;
            }
        }
        System.out.println(result);
    }

}
