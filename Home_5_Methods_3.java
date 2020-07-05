import java.util.Scanner;

public class Home_5_Methods_3 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int number1 = console.nextInt();
        int number2 = console.nextInt();
        int number3 = console.nextInt();
        canDevideNumber(number1, number2, number3);
    }

    private static void canDevideNumber(int number1, int number2,int number3) {
        if ( number1 % number2 == 0 && number1 % number3 == 0) {
            System.out.println("Първото число се дели на второто и третото");
        } else System.out.println("Първото число не се дели на второто и третото");
    }
}
