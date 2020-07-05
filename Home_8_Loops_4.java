import java.util.Scanner;

public class Home_8_Loops_4 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int n = console.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1 + (i - 1); j <= n + (i - 1); j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
