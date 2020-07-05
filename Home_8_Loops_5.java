import java.util.Scanner;

public class Home_8_Loops_5 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int n = console.nextInt();

        // dano sam razbral pravilno uslovieto, da otpechatwame chisla deliashti se na 3 ili 5
        //ako ne - prerabotva se mnogo lesno

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
