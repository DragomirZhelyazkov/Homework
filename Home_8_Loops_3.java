import java.util.Scanner;

public class Home_8_Loops_3 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int n = console.nextInt();
        String triangle = getSnowflakeTriangle(n);
        System.out.println(triangle);
    }

    public static String getSnowflakeTriangle(int n) {
        String result = "\n";
        int a = -1;

        for (int rowIndex = 1; rowIndex <= n; rowIndex++) {
            for (int spaceIndex = n - rowIndex; spaceIndex > 0; spaceIndex--) {
                result = result + " ";
            }
            a = a + 2;
            for (int charIndex = 1; charIndex <= a; charIndex++) {
                result = result + "*";
            }
            result = result + "\n";
        }
        return result;
    }


}
