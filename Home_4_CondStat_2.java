import java.util.Scanner;

public class Home_4_CondStat_2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        if((n - 21) > 21) {
            System.out.println(Math.abs(n-21)*2);
        } else {
            System.out.println(Math.abs(n-21));
        }
    }
}
