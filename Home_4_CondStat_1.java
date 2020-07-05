import java.util.Scanner;

public class Home_4_CondStat_1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        double x1 = 0;
        double x2 = 0;
        int discrim = b * b - 4 * a * c;

        if(discrim > 0) {
            x1 = (-b + Math.sqrt(discrim)) / (2 * a);
            x2 = (-b - Math.sqrt(discrim)) / (2 * a);
            System.out.println(x1 + ", " + x2 );
        } else if (discrim == 0) {
            x1 = x2 = (-b + Math.sqrt(discrim)) / 2 / a;
            System.out.println(x1 + ", " + x2 );
        } else { System.out.println("No real solutions"); }
    }
}
