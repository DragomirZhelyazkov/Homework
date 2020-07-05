import java.util.Scanner;

public class Home_8_loops_6 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = 1; i <= 1000000; i++) {
            if (i % 4 == 0) {
                System.out.println(i + ", ");
            }
        }
    }
}
