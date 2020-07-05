import java.util.Scanner;

public class Home_4_CondStat_3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int points = console.nextInt();

        if(points >= 1 && points <= 3) {
            System.out.println(points * 10);
            } else if (points >= 4 && points <= 6) {
            System.out.println(points * 100);
            } else if (points >= 6 && points <= 9) {
            System.out.println(points * 1000);
            } else { System.out.println("Wrong input"); }
    }
}
