import java.util.Scanner;

public class Home_12_Strings_2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        countSumNumbersInWord();
    }
    private static void countSumNumbersInWord() {
        String inputText = scanner.nextLine();
        int sumNumbers = 0;
        String number = "0";
        boolean isItNumber;
        for (int i = 0; i < inputText.length(); i++) {
            switch (inputText.charAt(i)) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9': isItNumber = true; break;
                default: isItNumber = false;
            }
            if(isItNumber) {
                number = number + inputText.charAt(i);
                if( i == inputText.length() - 1) {
                    sumNumbers = sumNumbers + Integer.parseInt(number);
                }
            } else {
                sumNumbers = sumNumbers + Integer.parseInt(number);
                number = "0";
            }
        }
        System.out.println(sumNumbers);
    }
}

